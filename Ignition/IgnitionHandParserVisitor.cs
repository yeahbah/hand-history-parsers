using Antlr4.Runtime.Tree;
using Bink.Core.Parsers.Ignition.Antlr;
using Bink.Core.Parsers.Models;

namespace Bink.Core.Parsers.Ignition;

public class IgnitionHandParserVisitor : IgnitionParserBaseVisitor<object>
{
    public List<HandHistoryParserModel> HandHistories { get; set; } = new();
    private HandHistoryParserModel? _currentHandHistory;

    public override object VisitHandHistory(IgnitionParser.HandHistoryContext context)
    {
        var handHeader = context.handHeader;
        _currentHandHistory = new HandHistoryParserModel
        {
            GameType = GameTypeEnum.FromName(handHeader.gameType.Text),
            HandId = long.Parse(handHeader.handId.Text),
            HandTimestamp = (DateTime)Visit(handHeader.timeStamp),
            PokerSite = handHeader.pokerSite.Text,
            TableId = handHeader.tableId.Text
        };
        
        var seats = Visit(context.players()) as IEnumerable<SeatModel>;
        if (seats == null) throw new InvalidOperationException("Unable to parse seats");
        
        var pocketCards = new List<(string, string)>(); 
        if (context.playerHoleCards != null)
        {
            if (Visit(context.playerHoleCards) is IEnumerable<(string, string)> holeCards)
            {
                pocketCards.AddRange(holeCards.ToArray());
            }
        }

        var seatModels = seats as SeatModel[] ?? seats.ToArray();
        if (seatModels.Any())
            _currentHandHistory = _currentHandHistory with { 
                Seats = seatModels
                    .Select(s => new SeatModel
                    {
                        IsMe = s.IsMe,
                        PlayerPosition = s.PlayerPosition,
                        SeatNumber = s.SeatNumber,
                        PocketCards = (pocketCards ?? throw new InvalidOperationException()).SingleOrDefault(p => p.Item1 == s.PlayerPosition?.Name).Item2,
                        StartingStack = s.StartingStack,
                        IsBigBlind = s.IsBigBlind,
                        IsSmallBlind = s.IsSmallBlind,
                        PostBlindAmount = s.PostBlindAmount
                    })
                    .ToList()
            };

        if (context.preflopActions != null)
        {
            _currentHandHistory = _currentHandHistory with
            {
                PreFlop = (StreetModel) Visit(context.preflopActions)
            };
        }

        if (context.flopActions != null)
        {
            _currentHandHistory = _currentHandHistory with
            {
                Flop = (StreetModel) Visit(context.flopActions)
            };
        }

        if (context.turnActions != null)
        {
            _currentHandHistory = _currentHandHistory with
            {
                Turn = (StreetModel) Visit(context.turnActions)
            };
        }

        if (context.riverActions != null)
        {
            _currentHandHistory = _currentHandHistory with
            {
                River = (StreetModel) Visit(context.riverActions)
            };
        }

        if (context.handSummary != null)
        {
            _currentHandHistory = _currentHandHistory with
            {
                Summary = (SummaryModel) Visit(context.handSummary)
            };
        }

        HandHistories.Add(_currentHandHistory);        
        return _currentHandHistory;
    }

    public override object VisitSummary(IgnitionParser.SummaryContext context)
    {
        var board = "";
        if (context.finalBoard != null)
        {
            foreach (var card in context.finalBoard.CARD())
            {
                board += card;
            }
        }

        var totalPot = context.total_pot()?.totalPot.Text.Replace("$", "") ?? "0";
        if (!decimal.TryParse(totalPot, out var totalPotAmount))
        {
            throw new InvalidOperationException("Unable to parse total pot amount.");
        }

        var handResults = new List<SummaryModel.HandResultModel>();
        var result = new SummaryModel
        {
            FinalBoard = board,
            TotalPot = totalPotAmount,
            HandResults = handResults
        };
        
        foreach (var summaryItem in context.summary_item())
        {
            if (summaryItem.winAmount != null)
            {
                if (!decimal.TryParse(summaryItem.winAmount.Text.Replace("$", ""),  out var winAmount))
                {
                    throw new InvalidOperationException("Unable to parse win amount");
                }

                var playerPosition = summaryItem.position();
                var handResult = new SummaryModel.HandResultModel
                {
                    Hand = summaryItem.playerHandWithBoard?.GetText(),
                    HandDescription = summaryItem.handDescription?.GetText(),
                    PlayerPosition = PlayerPosition.FromName(playerPosition.positionName.GetText()),
                    WinAmount = winAmount,
                    IsMe = playerPosition.isMe != null
                };
                handResults.Add(handResult);
            }
        }

        return result;
    }
    
    public override object VisitTimestamp(IgnitionParser.TimestampContext context)
    {
        var date = context.date().GetText();
        var time = context.time().GetText();
        return DateTime.Parse(date + " " + time);
    }
    
    public override object VisitRiver_action(IgnitionParser.River_actionContext context)
    {
        var riverCard = context.river_cards().riverCard.Text;
        var riverActions = new List<StreetActionModel>();
        foreach (var playerAction in context.player_action())
        {
            //var optional = playerAction.optional_actions();
            if (playerAction.playerAction != null)
            {
                var actionAmountText = playerAction.actionAmount?.Text.Replace("$", "");
                if (!decimal.TryParse(actionAmountText, out var actionAmount))
                {
                    actionAmount = 0;
                };
                var playerPosition = playerAction.position();
                var actionName = ActionNameEnum.FromName(playerAction.playerAction.Text);
                var riverAction = new StreetActionModel
                {
                    ActionAmount = actionAmount,
                    ActionName = actionName,
                    PlayerPosition = PlayerPosition.FromName(playerPosition.positionName.GetText()),
                    IsMe = playerPosition.isMe?.GetText() != null
                };
                riverActions.Add(riverAction);
            }
            else 
            {
                var optionalActions = ParseOptionalActions(playerAction.optional_actions())
                    .ToArray();
                if (optionalActions.Any())
                {
                    riverActions.AddRange(optionalActions);
                }
            }
        }
        return new StreetModel
        {
            Cards = riverCard,
            StreetActions = riverActions,
            StreetType = StreetEnum.Turn
        };
    }

    public override object VisitTurn_action(IgnitionParser.Turn_actionContext context)
    {
        var turnCard = context.turn_cards().turnCard.Text;
        var turnActions = new List<StreetActionModel>();
        foreach (var playerAction in context.player_action())
        {
            if (playerAction.playerAction != null)
            {
                var actionAmountText = playerAction.actionAmount?.Text.Replace("$", "");
                if (!decimal.TryParse(actionAmountText, out var actionAmount))
                {
                    actionAmount = 0;
                };
                var playerPosition = playerAction.position();
                var actionName = ActionNameEnum.FromName(playerAction.playerAction.Text);
                var turnAction = new StreetActionModel
                {
                    ActionAmount = actionAmount,
                    ActionName = actionName,
                    PlayerPosition = PlayerPosition.FromName(playerPosition.positionName.GetText()),
                    IsMe = playerPosition.isMe?.GetText() != null
                };
                turnActions.Add(turnAction);                
            }
            else
            {
                var optionalActions = ParseOptionalActions(playerAction.optional_actions())
                    .ToArray();
                if (optionalActions.Any())
                {
                    turnActions.AddRange(optionalActions);
                }                            
            }
        }
        return new StreetModel
        {
            Cards = turnCard,
            StreetActions = turnActions,
            StreetType = StreetEnum.Turn
        };
    }

    public override object VisitPreflop_action(IgnitionParser.Preflop_actionContext context)
    {
        var preFlopActions = new List<StreetActionModel>();
        
        var smallBlind = _currentHandHistory?.Seats
            .SingleOrDefault(seat => seat.IsSmallBlind);

        if (smallBlind != null)
        {
            preFlopActions.Add(new StreetActionModel
                {
                    ActionAmount = smallBlind.PostBlindAmount ?? 0,
                    ActionName = ActionNameEnum.PostChip,
                    IsMe = smallBlind.IsMe,
                    PlayerPosition = smallBlind.PlayerPosition
                });
        }   
        
        var bigBlind = _currentHandHistory?.Seats
            .SingleOrDefault(seat => seat.IsBigBlind);

        if (bigBlind != null)
        {
            preFlopActions.Add(new StreetActionModel
                {
                    ActionAmount = bigBlind.PostBlindAmount ?? 0,
                    ActionName = ActionNameEnum.PostChip,
                    IsMe = bigBlind.IsMe,
                    PlayerPosition = bigBlind.PlayerPosition
                });   
        }        
        
        foreach (var flopAction in context.player_action())
        {
            if (flopAction.playerAction != null)
            {
                var actionAmountText = flopAction.actionAmount?.Text.Replace("$", "");
                if (!decimal.TryParse(actionAmountText, out var actionAmount))
                {
                    actionAmount = 0;
                }
                var playerPosition = flopAction.position();
                var actionName = ActionNameEnum.FromName(flopAction.playerAction.Text);
                var streetAction = new StreetActionModel
                {
                    ActionAmount = actionAmount,
                    ActionName = actionName,
                    PlayerPosition = PlayerPosition.FromName(playerPosition.positionName.GetText()),
                    IsMe = playerPosition.isMe?.GetText() != null
                };
                preFlopActions.Add(streetAction);
            } 
            else
            {
                var optionalActions = ParseOptionalActions(flopAction.optional_actions())
                    .ToArray();
                if (optionalActions.Any())
                {
                    preFlopActions.AddRange(optionalActions);
                }
            }
        }

        return new StreetModel
        {
            Cards = null,
            StreetActions = preFlopActions,
            StreetType = StreetEnum.PreFlop
        };
    }

    private IEnumerable<StreetActionModel> ParseOptionalActions(IgnitionParser.Optional_actionsContext[] optionalActions)
    {
        var result = new List<StreetActionModel>();
        foreach (var optionalAction in optionalActions)
        {
            if (optionalAction.playerAction == null) continue;
                
            var actionAmountText = optionalAction.actionAmount?.Text.Replace("$", "");
            if (!decimal.TryParse(actionAmountText, out var actionAmount))
            {
                actionAmount = 0;
            };
                
            var playerPosition = optionalAction.position();
            var actionName = ActionNameEnum.FromName(optionalAction.playerAction.Text);
            if (actionName == ActionNameEnum.ReturnUncalledBlind ||
                actionName == ActionNameEnum.ReturnUncalledPortion)
            {
                actionAmount *= -1;
            }
            var streetAction = new StreetActionModel
            {
                ActionAmount = actionAmount,
                ActionName = actionName,
                PlayerPosition = PlayerPosition.FromName(playerPosition.positionName.GetText()),
                IsMe = playerPosition.isMe?.GetText() != null
            };
            result.Add(streetAction);
        }

        return result;
    }

    public override object VisitFlop_action(IgnitionParser.Flop_actionContext context)
    {
        var flopCards = context.flop_cards().cards.GetText();
        var flopActions = new List<StreetActionModel>();
        foreach (var flopAction in context.player_action())
        {
            if (flopAction.playerAction != null)
            {
                var actionAmountText = flopAction.actionAmount?.Text.Replace("$", "");
                if (!decimal.TryParse(actionAmountText, out var actionAmount))
                {
                    actionAmount = 0;
                };
                var playerPosition = flopAction.position();
                var actionName = ActionNameEnum.FromName(flopAction.playerAction.Text);
                
                var streetAction = new StreetActionModel
                {
                    ActionAmount = actionAmount,
                    ActionName = actionName,
                    PlayerPosition = PlayerPosition.FromName(playerPosition.positionName.GetText()),
                    IsMe = playerPosition.isMe?.GetText() != null
                };
                flopActions.Add(streetAction);                
            }
            else
            {
                // optional actions
                var optionalActions = ParseOptionalActions(flopAction.optional_actions())
                    .ToArray();
                if (optionalActions.Any())
                {
                    flopActions.AddRange(optionalActions);
                }   
            }
        }
        
        return new StreetModel
        {
            Cards = flopCards,
            StreetActions = flopActions,
            StreetType = StreetEnum.Flop
        };
    }
    
    public override object VisitPlayers(IgnitionParser.PlayersContext context)
    {
        var result = new List<SeatModel>();
        var players = context.player();

        var smallBlind = context.small_blind_post()
            .FirstOrDefault(s => s.MONEY()?.GetText() != null);
        var bigBlind = context.big_blind_post();
        
        decimal.TryParse(smallBlind?.MONEY()?.GetText()?.Replace("$", ""), out var smallBlindAmount);
        decimal.TryParse(bigBlind?.MONEY()?.GetText()?.Replace("$", ""), out var bigBlindAmount);
        var smallBlindPosition = smallBlind?.position_name().GetText();
        var bigBlindPosition = bigBlind?.position_name().GetText();
        
        foreach (var p in players)
        {
            var seatNumber = (int)VisitSeat(p.playerSeat);
            (PlayerPosition PlayerPosition, decimal StartingStackAmount, bool IsMe) playerPosition = (ValueTuple<PlayerPosition, decimal, bool>)VisitPosition_with_start_stack(p.position_with_start_stack());

            decimal? postBlindAmount = null;
            bool isSmallBlind = false;
            bool isBigBlind = false;
            if (smallBlindPosition != null && playerPosition.PlayerPosition == PlayerPosition.FromName(smallBlindPosition))
            {
                postBlindAmount = smallBlindAmount;
                isSmallBlind = true;
            }
            else if (bigBlindPosition != null && playerPosition.PlayerPosition == PlayerPosition.FromName(bigBlindPosition))
            {
                postBlindAmount = bigBlindAmount;
                isBigBlind = true;
            }
            
            var seatModel = new SeatModel
            {
                IsMe = playerPosition.IsMe,
                PlayerPosition = playerPosition.PlayerPosition,
                SeatNumber = seatNumber,
                StartingStack = playerPosition.StartingStackAmount,
                PocketCards = "",
                PostBlindAmount = postBlindAmount,
                IsSmallBlind = isSmallBlind,
                IsBigBlind = isBigBlind
            };
            result.Add(seatModel);
        }

        return result.AsEnumerable();
    }
    
    public override object VisitPlayer_hole_cards(IgnitionParser.Player_hole_cardsContext context)
    {
        var result = new List<ValueTuple<string, string>>();
        foreach(var card in context.card_dealt())
        {
            var pocketCards = card.pocketCards.GetText();
            var position = card.position().positionName.GetText();
            var resultItem = (position, pocketCards);
            result.Add(resultItem);
        }

        return result;
    }

    public override object VisitPosition_with_start_stack(IgnitionParser.Position_with_start_stackContext context)
    {
        var positionName = context.position().positionName.GetText();
        if (positionName == null) throw new InvalidOperationException("Unable to parse position name");
        
        var startingStack = context.starting_stack.Text;
        if (startingStack == null) throw new InvalidOperationException("Unable to parse starting stack value.");
        
        startingStack = startingStack.Replace("$", "");
        if (!decimal.TryParse(startingStack, out decimal startingStackAmount))
        {
            throw new InvalidOperationException("Unable to parse starting amount value.");
        }
        
        var isMe = context.position().isMe != null;

        var playerInfo = (PlayerPosition.FromName(positionName), startingStackAmount, isMe);
        return playerInfo;
    }

    public override object VisitSeat(IgnitionParser.SeatContext context)
    {
        return int.Parse(context.DIGIT().GetText());
    }
}

public class IgnitionHandListener : IgnitionParserBaseListener, IParseTreeListener
{
    private readonly Action<long?> onReadHandId;
    public IgnitionHandListener(Action<long?> onReadHandId)
    {
        this.onReadHandId = onReadHandId;
    }
    
    public override void ExitHeader(IgnitionParser.HeaderContext context)
    {
        //if (string.IsNullOrEmpty(context.handId?.Text));
    
        if (long.TryParse(context.handId?.Text, out var handId))
        {
    
        }
        
        onReadHandId.Invoke(null);
       
    }
}