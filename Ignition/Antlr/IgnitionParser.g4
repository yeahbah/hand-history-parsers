parser grammar IgnitionParser;

options
{
    tokenVocab=PokerHandHistoryLexer;
}

hands: hand+ EOF;

hand: handHeader=header players hole_cards? playerHoleCards=player_hole_cards? preflopActions=preflop_action? flopActions=flop_action? turnActions=turn_action? riverActions=river_action? closingActions=closing_actions? handSummary=summary #HandHistory
    ;

//hand: header players summary
    

// header
header: pokerSite=IGNITION HAND HASH_TAG handId=DIGITS+ TABLE_ID (HASH_TAG)tableId=DIGITS+ gameType=GAME_TYPE (DASH) timeStamp=timestamp
    | pokerSite=IGNITION HAND HASH_TAG handId=DIGITS+ ZONE_POKER ID HASH_TAG tableId=DIGITS  gameType=GAME_TYPE DASH timeStamp=timestamp
    ;
        
date:   (DIGITS)(DASH)(DIGITS)(DASH)(DIGITS);
        
time : (DIGITS)(COLON)(DIGITS)(COLON)(DIGITS);

timestamp: (date)(time);

preflop_action: player_action+;

// street action
street: FLOP | TURN | RIVER;
flop_action: STAR STAR STAR FLOP STAR STAR STAR flop_cards player_action+
    | STAR STAR STAR FLOP STAR STAR STAR flop_cards
    ;
turn_action: STAR STAR STAR TURN STAR STAR STAR turn_cards player_action+
    | STAR STAR STAR TURN STAR STAR STAR turn_cards
    ;
river_action: STAR STAR STAR RIVER STAR STAR STAR river_cards player_action+
    | STAR STAR STAR RIVER STAR STAR STAR river_cards
    ;

closing_action: (player_does_not_show | player_mucks);
closing_actions: closing_action+
    | closing_action+ hand_result+
    | closing_action+ optional_actions+ closing_actions+ hand_result+    
    | hand_result+
    ;

//(table_deposit? | player_stand? | player_leave? | sit_out? | player_enter? | sit_down?)
optional_actions: 
    player_enter_no_player 
    | sit_down 
    | table_deposit
    | sit_out
    | player_mucks
    | TABLE LEAVE USER    
    | TABLE ENTER USER                 
    | SEAT RE_JOIN    
    | SEAT STAND    
    | SEAT SITDOWN
    | LEAVE
    | ENTER
    | position COLON playerAction=RETURN_UNCALLED_PORTION_OF_BET actionAmount=MONEY
    | position COLON playerAction=RETURN_UNCALLED_BLIND actionAmount=MONEY
    | position COLON playerAction=POSTS_CHIP actionAmount=MONEY
    | position COLON playerAction=POSTS_DEAD_CHIP actionAmount=MONEY
    | position COLON SEAT playerAction=RE_JOIN     
    | position COLON FOLDS disconnect
    | position COLON CHECKS disconnect
    | position COLON SEAT playerAction=STAND
    | position COLON TABLE playerAction=LEAVE USER
    | position COLON TABLE playerAction=ENTER USER
    | position COLON LEAVE
    | position COLON ENTER
    ;

// showdown
//showdown: 
//    position COLON playerAction=SHOWDOWN player_hand_with_board OPEN_PAREN player_hand_description CLOSE_PAREN
//    | position COLON playerAction=SHOWDOWN OPEN_PAREN player_hand_description CLOSE_PAREN
//    ;
hand_result: 
    position COLON HAND_RESULT MONEY
    | position me COLON HAND_RESULT MONEY
    | position COLON HAND_RESULT DASH SIDE_POT MONEY
    | position me COLON HAND_RESULT DASH SIDE_POT MONEY
    | optional_actions
    ;
player_does_not_show: position COLON DOES_NOT_SHOW OPEN_BRACKET hole_card CLOSE_BRACKET OPEN_PAREN player_hand_description CLOSE_PAREN;
//return_uncalled_bet: position COLON playerAction=RETURN_UNCALLED_PORTION_OF_BET actionAmount=MONEY;
player_mucks: position COLON MUCKS OPEN_BRACKET hole_card CLOSE_BRACKET OPEN_PAREN player_hand_description CLOSE_PAREN; 

// summary
summary: summary_header total_pot finalBoard=board? summary_item+
    | summary_header
    ;
summary_header: STAR STAR STAR SUMMARY STAR STAR STAR;
total_pot: TOTAL_POT OPEN_PAREN totalPot=MONEY CLOSE_PAREN;
board: BOARD OPEN_BRACKET (CARD+) CLOSE_BRACKET;    
summary_item: 
    seat COLON position FOLDED BEFORE THE (FLOP | TURN | RIVER)    
    | seat COLON position FOLDED ON THE (FLOP | TURN | RIVER)
    | seat COLON position LOST_WITH handDescription=player_hand_description playerHandWithBoard=player_hand_with_board
    | seat COLON position winAmount=MONEY WITH handDescription=player_hand_description playerHandWithBoard=player_hand_with_board
    | seat COLON position winAmount=MONEY OPEN_BRACKET DOES_NOT_SHOW CLOSE_BRACKET
    | seat COLON position mucked OPEN_BRACKET hole_card CLOSE_BRACKET
    | seat COLON position OPEN_BRACKET DOES_NOT_SHOW CLOSE_BRACKET    
    ;
mucked: OPEN_BRACKET MUCKED CLOSE_BRACKET;

player_action:     
    position COLON playerAction=(FOLDS | CHECKS) (timeout? | auth?)
    | position COLON playerAction=FOLDS AND SHOWS OPEN_BRACKET CARD+ CLOSE_BRACKET
    | position COLON playerAction=RAISES MONEY TO actionAmount=MONEY
    | position COLON playerAction=CALLS actionAmount=MONEY
    | position COLON playerAction=BETS actionAmount=MONEY
    | position COLON playerAction=ALL_IN OPEN_PAREN RAISE CLOSE_PAREN MONEY TO actionAmount=MONEY
    | position COLON playerAction=ALL_IN actionAmount=MONEY       
    | position COLON SEAT playerAction=STAND
    | position COLON TABLE playerAction=LEAVE USER
    | position COLON TABLE playerAction=DEPOSIT actionAmount=MONEY
    | position COLON SEAT playerAction=SITOUT
    | position COLON playerAction=SHOWDOWN player_hand_with_board OPEN_PAREN player_hand_description CLOSE_PAREN
    | position COLON playerAction=SHOWDOWN OPEN_PAREN player_hand_description CLOSE_PAREN         
    | optional_actions+       
    ;
table_deposit: TABLE playerAction=DEPOSIT actionAmount=MONEY
    | position COLON TABLE playerAction=DEPOSIT actionAmount=MONEY
    ;
new_player: TABLE ENTER USER SEAT playerAction=SITDOWN;
sit_out: position COLON SEAT SITOUT
    | position COLON SITOUT OPEN_PAREN WAIT_FOR_BB CLOSE_PAREN
    | SEAT SITOUT
    ;
sit_down: 
    SEAT SITDOWN
    | position COLON SEAT SITDOWN
    ;
player_enter_no_player: TABLE ENTER USER;
timeout: OPEN_PAREN TIMEOUT CLOSE_PAREN;
action: FOLDS | CALLS | RAISES | CHECKS | BETS;
auth: OPEN_PAREN AUTH CLOSE_PAREN;
disconnect: OPEN_PAREN DISCONNECT CLOSE_PAREN;

// player setup
players: player+ dealer+ small_blind_post big_blind_post    
    | player+ dealer+ small_blind_post big_blind_post optional_actions+
    | player+ dealer+ small_blind_post optional_actions+
    | player+ dealer+ small_blind_post optional_actions+ big_blind_post
    | player+ dealer+ big_blind_post
    | player+ dealer+ big_blind_post optional_actions+     
    | player+ dealer+ optional_actions+ small_blind_post big_blind_post
    | player+ dealer+ optional_actions+ big_blind_post        
    | player+ dealer+ optional_actions+
    | player+ dealer+ optional_actions+ dealer big_blind_post 
    | player+ dealer+ optional_actions+ small_blind_post optional_actions+ big_blind_post    
    | player+ dealer+ optional_actions+ small_blind_post optional_actions+ big_blind_post optional_actions+
    | player+ small_blind_post big_blind_post        
    | player+ small_blind_post big_blind_post optional_actions+
    | player+ small_blind_post optional_actions+ big_blind_post    
    | player+ dealer+ small_blind_post optional_actions+ big_blind_post optional_actions+
    | player+ optional_actions+ small_blind_post big_blind_post
    | player+ optional_actions+ small_blind_post big_blind_post optional_actions+
    | player+ big_blind_post
    | player+ big_blind_post optional_actions+
    | player+ optional_actions+ big_blind_post
    | player+ dealer+ optional_actions+ small_blind_post big_blind_post optional_actions+
    | player+ optional_actions+ small_blind_post optional_actions+ big_blind_post
    | player+ small_blind_post+ big_blind_post optional_actions+                                 
    ;    

player: playerSeat=seat COLON position_with_start_stack;

seat: (SEAT) (DIGIT) 
    | SEAT PLUS DIGIT
    ;
//seat_with_plus: ;

position_with_start_stack: position OPEN_PAREN starting_stack=MONEY IN_CHIPS CLOSE_PAREN; 

position: positionName=position_name isMe=me? 
    | positionName=position_name
    ;

position_name: SMALL_BLIND | BIG_BLIND | UTG | UTG1 | UTG2 | UTG3 | UTG4 | UTG5 | DEALER;

dealer: DEALER isMe=me? COLON SET_DEALER OPEN_BRACKET DIGIT CLOSE_BRACKET
    | SET_DEALER
    //| DEALER isMe=me? COLON SMALL_BLIND MONEY
    | position COLON SET_DEALER OPEN_BRACKET DIGIT CLOSE_BRACKET    
    ;

small_blind_post: 
    position_name isMe=me? COLON SMALL_BLIND MONEY
    | position_name isMe=me? COLON optional_actions+        
    ;
    
big_blind_post: 
    position_name isMe=me? COLON BIG_BLIND MONEY
    ; 

// hole cards
hole_cards: STAR STAR STAR HOLE_CARDS STAR STAR STAR;
card_dealt: position COLON CARD_DEALT_TO_SPOT OPEN_BRACKET pocketCards=hole_card CLOSE_BRACKET;
player_hole_cards: card_dealt+;

hole_card: CARD CARD;
flop_cards: OPEN_BRACKET cards=three_cards CLOSE_BRACKET;
turn_cards: flop_cards OPEN_BRACKET turnCard=CARD CLOSE_BRACKET;
river_cards: OPEN_BRACKET (CARD CARD CARD) (CARD) CLOSE_BRACKET OPEN_BRACKET riverCard=CARD CLOSE_BRACKET;
player_hand_with_board: 
    OPEN_BRACKET five_cards CLOSE_BRACKET
    | OPEN_BRACKET hole_card (DASH?) five_cards CLOSE_BRACKET
    | OPEN_BRACKET hole_card CLOSE_BRACKET
    ;
five_cards: CARD CARD CARD CARD CARD;
four_cards: CARD CARD CARD CARD;
three_cards: CARD CARD CARD;
player_hand_description: ANY+|THREE_OF_A_KIND;

me: OPEN_BRACKET ME CLOSE_BRACKET;