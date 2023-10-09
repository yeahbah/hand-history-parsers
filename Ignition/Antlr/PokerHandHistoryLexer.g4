lexer grammar PokerHandHistoryLexer;

IGNITION: 'Ignition';
HAND: 'Hand';
HASH_TAG: '#';
TABLE_ID: 'TBL';
ID: 'ID';
ZONE_POKER: 'Zone Poker';
GAME_TYPE: 'HOLDEM No Limit' | 'HOLDEMZonePoker No Limit';
DASH: '-';
COLON: ':';
PLUS: '+';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
DOLLAR: '$';
STAR: '*';
DOT: '.';
AND: '&';

// Positions
SEAT: 'Seat';
UTG: 'UTG';
UTG1: UTG PLUS '1';
UTG2: UTG PLUS '2';
UTG3: UTG PLUS '3';
UTG4: UTG PLUS '4';
UTG5: UTG PLUS '5';
DEALER: 'Dealer';
SMALL_BLIND: 'Small Blind' | 'Small blind';
BIG_BLIND: ('Big Blind' | 'Big blind');
SET_DEALER: 'Set dealer';

HOLE_CARDS: 'HOLE CARDS';
WITH: 'with';
BEFORE: 'before';
THE: 'the';
IN_CHIPS: 'in chips';
ME: 'ME';
TO: 'to';
ON: 'on';
SHOWDOWN: 'Showdown';
BOARD: 'Board';
FLOP: 'FLOP';
TURN: 'TURN';
RIVER: 'RIVER';
TABLE: 'Table';
SIT: 'sit';
OUT: 'out';
SITOUT: 'sit out' | 'Sitout';
DOWN: 'down';
SITDOWN: 'sit down';
ENTER: 'enter' | 'Enter(Auto)';
USER: 'user';
STAND: 'stand';
LEAVE: 'leave' | 'Leave(Auto)';
TIMEOUT: 'timeout';
DISCONNECT: 'disconnect';
SIDE_POT: 'Side pot';

DOES_NOT_SHOW: 'Does not show';
DEPOSIT: 'deposit';
CARD_DEALT_TO_SPOT: 'Card dealt to a spot';
RETURN_UNCALLED_PORTION_OF_BET: 'Return uncalled portion of bet';
RETURN_UNCALLED_BLIND: 'Return uncalled blind';
POSTS_CHIP: 'Posts chip';
POSTS_DEAD_CHIP: 'Posts dead chip';
AUTH: 'auth';

TOTAL_POT: 'Total Pot';
HAND_RESULT: 'Hand result';
SUMMARY: 'SUMMARY';

// Actions
FOLDS: 'Folds';
FOLDED: 'Folded';
CALLS: 'Calls';
CHECKS: 'Checks';
BETS: 'Bets';
RAISES: 'Raises';
RAISE: 'Raise'|'raise';
MUCKS: 'Mucks';
MUCKED: 'Mucked';
ALL_IN: 'All-in';
RE_JOIN: 're-join';
WAIT_FOR_BB: 'wait for bb';
SHOWS: 'shows';


LOST_WITH: 'lost with';
THREE_OF_A_KIND: 'Three of a kind';

CARD: ([1-9]|'T'|'J'|'Q'|'K'|'A')('h'|'c'|'s'|'d');

//YEAR:   (DIGIT DIGIT DIGIT DIGIT);
        
DIGIT:   [0-9];          
DIGITS: [0-9]+;
MONEY: 
    (DOLLAR)(DIGITS|DIGIT)
    | (DOLLAR)(DIGITS|DIGIT)(DOT)(DIGITS)
    ;

WS: [ \t\n\r] -> skip;
ANY: .;