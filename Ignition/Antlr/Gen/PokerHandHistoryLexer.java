// Generated from C:/Users/yeahb/Projects/Bink/Library/Bink.Core/Parsers/Ignition/Antlr\PokerHandHistoryLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PokerHandHistoryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IGNITION=1, HAND=2, HASH_TAG=3, TABLE_ID=4, GAME_TYPE=5, DASH=6, COLON=7, 
		PLUS=8, OPEN_BRACKET=9, CLOSE_BRACKET=10, OPEN_PAREN=11, CLOSE_PAREN=12, 
		DOLLAR=13, STAR=14, DOT=15, AND=16, SEAT=17, UTG=18, UTG1=19, UTG2=20, 
		UTG3=21, UTG4=22, UTG5=23, DEALER=24, SMALL_BLIND=25, BIG_BLIND=26, SET_DEALER=27, 
		HOLE_CARDS=28, WITH=29, BEFORE=30, THE=31, IN_CHIPS=32, ME=33, TO=34, 
		ON=35, SHOWDOWN=36, BOARD=37, FLOP=38, TURN=39, RIVER=40, TABLE=41, SIT=42, 
		OUT=43, SITOUT=44, DOWN=45, SITDOWN=46, ENTER=47, USER=48, STAND=49, LEAVE=50, 
		TIMEOUT=51, DISCONNECT=52, SIDE_POT=53, DOES_NOT_SHOW=54, DEPOSIT=55, 
		CARD_DEALT_TO_SPOT=56, RETURN_UNCALLED_PORTION_OF_BET=57, RETURN_UNCALLED_BLIND=58, 
		POSTS_CHIP=59, POSTS_DEAD_CHIP=60, AUTH=61, TOTAL_POT=62, HAND_RESULT=63, 
		SUMMARY=64, FOLDS=65, FOLDED=66, CALLS=67, CHECKS=68, BETS=69, RAISES=70, 
		RAISE=71, MUCKS=72, MUCKED=73, ALL_IN=74, RE_JOIN=75, WAIT_FOR_BB=76, 
		SHOWS=77, LOST_WITH=78, THREE_OF_A_KIND=79, CARD=80, YEAR=81, DIGIT=82, 
		DIGITS=83, MONEY=84, WS=85, ANY=86;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IGNITION", "HAND", "HASH_TAG", "TABLE_ID", "GAME_TYPE", "DASH", "COLON", 
			"PLUS", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PAREN", "CLOSE_PAREN", 
			"DOLLAR", "STAR", "DOT", "AND", "SEAT", "UTG", "UTG1", "UTG2", "UTG3", 
			"UTG4", "UTG5", "DEALER", "SMALL_BLIND", "BIG_BLIND", "SET_DEALER", "HOLE_CARDS", 
			"WITH", "BEFORE", "THE", "IN_CHIPS", "ME", "TO", "ON", "SHOWDOWN", "BOARD", 
			"FLOP", "TURN", "RIVER", "TABLE", "SIT", "OUT", "SITOUT", "DOWN", "SITDOWN", 
			"ENTER", "USER", "STAND", "LEAVE", "TIMEOUT", "DISCONNECT", "SIDE_POT", 
			"DOES_NOT_SHOW", "DEPOSIT", "CARD_DEALT_TO_SPOT", "RETURN_UNCALLED_PORTION_OF_BET", 
			"RETURN_UNCALLED_BLIND", "POSTS_CHIP", "POSTS_DEAD_CHIP", "AUTH", "TOTAL_POT", 
			"HAND_RESULT", "SUMMARY", "FOLDS", "FOLDED", "CALLS", "CHECKS", "BETS", 
			"RAISES", "RAISE", "MUCKS", "MUCKED", "ALL_IN", "RE_JOIN", "WAIT_FOR_BB", 
			"SHOWS", "LOST_WITH", "THREE_OF_A_KIND", "CARD", "YEAR", "DIGIT", "DIGITS", 
			"MONEY", "WS", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Ignition'", "'Hand'", "'#'", "'TBL'", "'HOLDEM No Limit'", "'-'", 
			"':'", "'+'", "'['", "']'", "'('", "')'", "'$'", "'*'", "'.'", "'&'", 
			"'Seat'", "'UTG'", null, null, null, null, null, "'Dealer'", null, null, 
			"'Set dealer'", "'HOLE CARDS'", "'with'", "'before'", "'the'", "'in chips'", 
			"'ME'", "'to'", "'on'", "'Showdown'", "'Board'", "'FLOP'", "'TURN'", 
			"'RIVER'", "'Table'", "'sit'", "'out'", null, "'down'", "'sit down'", 
			"'enter'", "'user'", "'stand'", "'leave'", "'timeout'", "'disconnect'", 
			"'Side pot'", "'Does not show'", "'deposit'", "'Card dealt to a spot'", 
			"'Return uncalled portion of bet'", "'Return uncalled blind'", "'Posts chip'", 
			"'Posts dead chip'", "'auth'", "'Total Pot'", "'Hand result'", "'SUMMARY'", 
			"'Folds'", "'Folded'", "'Calls'", "'Checks'", "'Bets'", "'Raises'", null, 
			"'Mucks'", "'Mucked'", "'All-in'", "'re-join'", "'wait for bb'", "'shows'", 
			"'lost with'", "'Three of a kind'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IGNITION", "HAND", "HASH_TAG", "TABLE_ID", "GAME_TYPE", "DASH", 
			"COLON", "PLUS", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PAREN", "CLOSE_PAREN", 
			"DOLLAR", "STAR", "DOT", "AND", "SEAT", "UTG", "UTG1", "UTG2", "UTG3", 
			"UTG4", "UTG5", "DEALER", "SMALL_BLIND", "BIG_BLIND", "SET_DEALER", "HOLE_CARDS", 
			"WITH", "BEFORE", "THE", "IN_CHIPS", "ME", "TO", "ON", "SHOWDOWN", "BOARD", 
			"FLOP", "TURN", "RIVER", "TABLE", "SIT", "OUT", "SITOUT", "DOWN", "SITDOWN", 
			"ENTER", "USER", "STAND", "LEAVE", "TIMEOUT", "DISCONNECT", "SIDE_POT", 
			"DOES_NOT_SHOW", "DEPOSIT", "CARD_DEALT_TO_SPOT", "RETURN_UNCALLED_PORTION_OF_BET", 
			"RETURN_UNCALLED_BLIND", "POSTS_CHIP", "POSTS_DEAD_CHIP", "AUTH", "TOTAL_POT", 
			"HAND_RESULT", "SUMMARY", "FOLDS", "FOLDED", "CALLS", "CHECKS", "BETS", 
			"RAISES", "RAISE", "MUCKS", "MUCKED", "ALL_IN", "RE_JOIN", "WAIT_FOR_BB", 
			"SHOWS", "LOST_WITH", "THREE_OF_A_KIND", "CARD", "YEAR", "DIGIT", "DIGITS", 
			"MONEY", "WS", "ANY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PokerHandHistoryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PokerHandHistoryLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2X\u032c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0124"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0138\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01ac\n-\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D"+
		"\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\5H\u02bd\nH\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J"+
		"\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3Q\5Q\u0308\nQ\3Q\3Q\3R"+
		"\3R\3R\3R\3R\3S\3S\3T\6T\u0314\nT\rT\16T\u0315\3U\3U\3U\5U\u031b\nU\3"+
		"U\3U\3U\5U\u0320\nU\3U\3U\3U\5U\u0325\nU\3V\3V\3V\3V\3W\3W\2\2X\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\3\2\6\7\2\63;CCLMSSVV\5\2efjjuu\3"+
		"\2\62;\5\2\13\f\17\17\"\"\2\u0333\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\3\u00af\3\2\2\2\5\u00b8\3\2\2\2\7\u00bd\3\2\2\2\t\u00bf\3\2\2"+
		"\2\13\u00c3\3\2\2\2\r\u00d3\3\2\2\2\17\u00d5\3\2\2\2\21\u00d7\3\2\2\2"+
		"\23\u00d9\3\2\2\2\25\u00db\3\2\2\2\27\u00dd\3\2\2\2\31\u00df\3\2\2\2\33"+
		"\u00e1\3\2\2\2\35\u00e3\3\2\2\2\37\u00e5\3\2\2\2!\u00e7\3\2\2\2#\u00e9"+
		"\3\2\2\2%\u00ee\3\2\2\2\'\u00f2\3\2\2\2)\u00f6\3\2\2\2+\u00fa\3\2\2\2"+
		"-\u00fe\3\2\2\2/\u0102\3\2\2\2\61\u0106\3\2\2\2\63\u0123\3\2\2\2\65\u0137"+
		"\3\2\2\2\67\u0139\3\2\2\29\u0144\3\2\2\2;\u014f\3\2\2\2=\u0154\3\2\2\2"+
		"?\u015b\3\2\2\2A\u015f\3\2\2\2C\u0168\3\2\2\2E\u016b\3\2\2\2G\u016e\3"+
		"\2\2\2I\u0171\3\2\2\2K\u017a\3\2\2\2M\u0180\3\2\2\2O\u0185\3\2\2\2Q\u018a"+
		"\3\2\2\2S\u0190\3\2\2\2U\u0196\3\2\2\2W\u019a\3\2\2\2Y\u01ab\3\2\2\2["+
		"\u01ad\3\2\2\2]\u01b2\3\2\2\2_\u01bb\3\2\2\2a\u01c1\3\2\2\2c\u01c6\3\2"+
		"\2\2e\u01cc\3\2\2\2g\u01d2\3\2\2\2i\u01da\3\2\2\2k\u01e5\3\2\2\2m\u01ee"+
		"\3\2\2\2o\u01fc\3\2\2\2q\u0204\3\2\2\2s\u0219\3\2\2\2u\u0238\3\2\2\2w"+
		"\u024e\3\2\2\2y\u0259\3\2\2\2{\u0269\3\2\2\2}\u026e\3\2\2\2\177\u0278"+
		"\3\2\2\2\u0081\u0284\3\2\2\2\u0083\u028c\3\2\2\2\u0085\u0292\3\2\2\2\u0087"+
		"\u0299\3\2\2\2\u0089\u029f\3\2\2\2\u008b\u02a6\3\2\2\2\u008d\u02ab\3\2"+
		"\2\2\u008f\u02bc\3\2\2\2\u0091\u02be\3\2\2\2\u0093\u02c4\3\2\2\2\u0095"+
		"\u02cb\3\2\2\2\u0097\u02d2\3\2\2\2\u0099\u02da\3\2\2\2\u009b\u02e6\3\2"+
		"\2\2\u009d\u02ec\3\2\2\2\u009f\u02f6\3\2\2\2\u00a1\u0307\3\2\2\2\u00a3"+
		"\u030b\3\2\2\2\u00a5\u0310\3\2\2\2\u00a7\u0313\3\2\2\2\u00a9\u0324\3\2"+
		"\2\2\u00ab\u0326\3\2\2\2\u00ad\u032a\3\2\2\2\u00af\u00b0\7K\2\2\u00b0"+
		"\u00b1\7i\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7v\2\2"+
		"\u00b4\u00b5\7k\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7p\2\2\u00b7\4\3\2"+
		"\2\2\u00b8\u00b9\7J\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc"+
		"\7f\2\2\u00bc\6\3\2\2\2\u00bd\u00be\7%\2\2\u00be\b\3\2\2\2\u00bf\u00c0"+
		"\7V\2\2\u00c0\u00c1\7D\2\2\u00c1\u00c2\7N\2\2\u00c2\n\3\2\2\2\u00c3\u00c4"+
		"\7J\2\2\u00c4\u00c5\7Q\2\2\u00c5\u00c6\7N\2\2\u00c6\u00c7\7F\2\2\u00c7"+
		"\u00c8\7G\2\2\u00c8\u00c9\7O\2\2\u00c9\u00ca\7\"\2\2\u00ca\u00cb\7P\2"+
		"\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce\7N\2\2\u00ce\u00cf"+
		"\7k\2\2\u00cf\u00d0\7o\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"\f\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4\16\3\2\2\2\u00d5\u00d6\7<\2\2\u00d6"+
		"\20\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8\22\3\2\2\2\u00d9\u00da\7]\2\2\u00da"+
		"\24\3\2\2\2\u00db\u00dc\7_\2\2\u00dc\26\3\2\2\2\u00dd\u00de\7*\2\2\u00de"+
		"\30\3\2\2\2\u00df\u00e0\7+\2\2\u00e0\32\3\2\2\2\u00e1\u00e2\7&\2\2\u00e2"+
		"\34\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4\36\3\2\2\2\u00e5\u00e6\7\60\2\2\u00e6"+
		" \3\2\2\2\u00e7\u00e8\7(\2\2\u00e8\"\3\2\2\2\u00e9\u00ea\7U\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7v\2\2\u00ed$\3\2\2\2\u00ee"+
		"\u00ef\7W\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f1\7I\2\2\u00f1&\3\2\2\2\u00f2"+
		"\u00f3\5%\23\2\u00f3\u00f4\5\21\t\2\u00f4\u00f5\7\63\2\2\u00f5(\3\2\2"+
		"\2\u00f6\u00f7\5%\23\2\u00f7\u00f8\5\21\t\2\u00f8\u00f9\7\64\2\2\u00f9"+
		"*\3\2\2\2\u00fa\u00fb\5%\23\2\u00fb\u00fc\5\21\t\2\u00fc\u00fd\7\65\2"+
		"\2\u00fd,\3\2\2\2\u00fe\u00ff\5%\23\2\u00ff\u0100\5\21\t\2\u0100\u0101"+
		"\7\66\2\2\u0101.\3\2\2\2\u0102\u0103\5%\23\2\u0103\u0104\5\21\t\2\u0104"+
		"\u0105\7\67\2\2\u0105\60\3\2\2\2\u0106\u0107\7F\2\2\u0107\u0108\7g\2\2"+
		"\u0108\u0109\7c\2\2\u0109\u010a\7n\2\2\u010a\u010b\7g\2\2\u010b\u010c"+
		"\7t\2\2\u010c\62\3\2\2\2\u010d\u010e\7U\2\2\u010e\u010f\7o\2\2\u010f\u0110"+
		"\7c\2\2\u0110\u0111\7n\2\2\u0111\u0112\7n\2\2\u0112\u0113\7\"\2\2\u0113"+
		"\u0114\7D\2\2\u0114\u0115\7n\2\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2"+
		"\u0117\u0124\7f\2\2\u0118\u0119\7U\2\2\u0119\u011a\7o\2\2\u011a\u011b"+
		"\7c\2\2\u011b\u011c\7n\2\2\u011c\u011d\7n\2\2\u011d\u011e\7\"\2\2\u011e"+
		"\u011f\7d\2\2\u011f\u0120\7n\2\2\u0120\u0121\7k\2\2\u0121\u0122\7p\2\2"+
		"\u0122\u0124\7f\2\2\u0123\u010d\3\2\2\2\u0123\u0118\3\2\2\2\u0124\64\3"+
		"\2\2\2\u0125\u0126\7D\2\2\u0126\u0127\7k\2\2\u0127\u0128\7i\2\2\u0128"+
		"\u0129\7\"\2\2\u0129\u012a\7D\2\2\u012a\u012b\7n\2\2\u012b\u012c\7k\2"+
		"\2\u012c\u012d\7p\2\2\u012d\u0138\7f\2\2\u012e\u012f\7D\2\2\u012f\u0130"+
		"\7k\2\2\u0130\u0131\7i\2\2\u0131\u0132\7\"\2\2\u0132\u0133\7d\2\2\u0133"+
		"\u0134\7n\2\2\u0134\u0135\7k\2\2\u0135\u0136\7p\2\2\u0136\u0138\7f\2\2"+
		"\u0137\u0125\3\2\2\2\u0137\u012e\3\2\2\2\u0138\66\3\2\2\2\u0139\u013a"+
		"\7U\2\2\u013a\u013b\7g\2\2\u013b\u013c\7v\2\2\u013c\u013d\7\"\2\2\u013d"+
		"\u013e\7f\2\2\u013e\u013f\7g\2\2\u013f\u0140\7c\2\2\u0140\u0141\7n\2\2"+
		"\u0141\u0142\7g\2\2\u0142\u0143\7t\2\2\u01438\3\2\2\2\u0144\u0145\7J\2"+
		"\2\u0145\u0146\7Q\2\2\u0146\u0147\7N\2\2\u0147\u0148\7G\2\2\u0148\u0149"+
		"\7\"\2\2\u0149\u014a\7E\2\2\u014a\u014b\7C\2\2\u014b\u014c\7T\2\2\u014c"+
		"\u014d\7F\2\2\u014d\u014e\7U\2\2\u014e:\3\2\2\2\u014f\u0150\7y\2\2\u0150"+
		"\u0151\7k\2\2\u0151\u0152\7v\2\2\u0152\u0153\7j\2\2\u0153<\3\2\2\2\u0154"+
		"\u0155\7d\2\2\u0155\u0156\7g\2\2\u0156\u0157\7h\2\2\u0157\u0158\7q\2\2"+
		"\u0158\u0159\7t\2\2\u0159\u015a\7g\2\2\u015a>\3\2\2\2\u015b\u015c\7v\2"+
		"\2\u015c\u015d\7j\2\2\u015d\u015e\7g\2\2\u015e@\3\2\2\2\u015f\u0160\7"+
		"k\2\2\u0160\u0161\7p\2\2\u0161\u0162\7\"\2\2\u0162\u0163\7e\2\2\u0163"+
		"\u0164\7j\2\2\u0164\u0165\7k\2\2\u0165\u0166\7r\2\2\u0166\u0167\7u\2\2"+
		"\u0167B\3\2\2\2\u0168\u0169\7O\2\2\u0169\u016a\7G\2\2\u016aD\3\2\2\2\u016b"+
		"\u016c\7v\2\2\u016c\u016d\7q\2\2\u016dF\3\2\2\2\u016e\u016f\7q\2\2\u016f"+
		"\u0170\7p\2\2\u0170H\3\2\2\2\u0171\u0172\7U\2\2\u0172\u0173\7j\2\2\u0173"+
		"\u0174\7q\2\2\u0174\u0175\7y\2\2\u0175\u0176\7f\2\2\u0176\u0177\7q\2\2"+
		"\u0177\u0178\7y\2\2\u0178\u0179\7p\2\2\u0179J\3\2\2\2\u017a\u017b\7D\2"+
		"\2\u017b\u017c\7q\2\2\u017c\u017d\7c\2\2\u017d\u017e\7t\2\2\u017e\u017f"+
		"\7f\2\2\u017fL\3\2\2\2\u0180\u0181\7H\2\2\u0181\u0182\7N\2\2\u0182\u0183"+
		"\7Q\2\2\u0183\u0184\7R\2\2\u0184N\3\2\2\2\u0185\u0186\7V\2\2\u0186\u0187"+
		"\7W\2\2\u0187\u0188\7T\2\2\u0188\u0189\7P\2\2\u0189P\3\2\2\2\u018a\u018b"+
		"\7T\2\2\u018b\u018c\7K\2\2\u018c\u018d\7X\2\2\u018d\u018e\7G\2\2\u018e"+
		"\u018f\7T\2\2\u018fR\3\2\2\2\u0190\u0191\7V\2\2\u0191\u0192\7c\2\2\u0192"+
		"\u0193\7d\2\2\u0193\u0194\7n\2\2\u0194\u0195\7g\2\2\u0195T\3\2\2\2\u0196"+
		"\u0197\7u\2\2\u0197\u0198\7k\2\2\u0198\u0199\7v\2\2\u0199V\3\2\2\2\u019a"+
		"\u019b\7q\2\2\u019b\u019c\7w\2\2\u019c\u019d\7v\2\2\u019dX\3\2\2\2\u019e"+
		"\u019f\7u\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7v\2\2\u01a1\u01a2\7\"\2"+
		"\2\u01a2\u01a3\7q\2\2\u01a3\u01a4\7w\2\2\u01a4\u01ac\7v\2\2\u01a5\u01a6"+
		"\7U\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7v\2\2\u01a8\u01a9\7q\2\2\u01a9"+
		"\u01aa\7w\2\2\u01aa\u01ac\7v\2\2\u01ab\u019e\3\2\2\2\u01ab\u01a5\3\2\2"+
		"\2\u01acZ\3\2\2\2\u01ad\u01ae\7f\2\2\u01ae\u01af\7q\2\2\u01af\u01b0\7"+
		"y\2\2\u01b0\u01b1\7p\2\2\u01b1\\\3\2\2\2\u01b2\u01b3\7u\2\2\u01b3\u01b4"+
		"\7k\2\2\u01b4\u01b5\7v\2\2\u01b5\u01b6\7\"\2\2\u01b6\u01b7\7f\2\2\u01b7"+
		"\u01b8\7q\2\2\u01b8\u01b9\7y\2\2\u01b9\u01ba\7p\2\2\u01ba^\3\2\2\2\u01bb"+
		"\u01bc\7g\2\2\u01bc\u01bd\7p\2\2\u01bd\u01be\7v\2\2\u01be\u01bf\7g\2\2"+
		"\u01bf\u01c0\7t\2\2\u01c0`\3\2\2\2\u01c1\u01c2\7w\2\2\u01c2\u01c3\7u\2"+
		"\2\u01c3\u01c4\7g\2\2\u01c4\u01c5\7t\2\2\u01c5b\3\2\2\2\u01c6\u01c7\7"+
		"u\2\2\u01c7\u01c8\7v\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb"+
		"\7f\2\2\u01cbd\3\2\2\2\u01cc\u01cd\7n\2\2\u01cd\u01ce\7g\2\2\u01ce\u01cf"+
		"\7c\2\2\u01cf\u01d0\7x\2\2\u01d0\u01d1\7g\2\2\u01d1f\3\2\2\2\u01d2\u01d3"+
		"\7v\2\2\u01d3\u01d4\7k\2\2\u01d4\u01d5\7o\2\2\u01d5\u01d6\7g\2\2\u01d6"+
		"\u01d7\7q\2\2\u01d7\u01d8\7w\2\2\u01d8\u01d9\7v\2\2\u01d9h\3\2\2\2\u01da"+
		"\u01db\7f\2\2\u01db\u01dc\7k\2\2\u01dc\u01dd\7u\2\2\u01dd\u01de\7e\2\2"+
		"\u01de\u01df\7q\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7p\2\2\u01e1\u01e2"+
		"\7g\2\2\u01e2\u01e3\7e\2\2\u01e3\u01e4\7v\2\2\u01e4j\3\2\2\2\u01e5\u01e6"+
		"\7U\2\2\u01e6\u01e7\7k\2\2\u01e7\u01e8\7f\2\2\u01e8\u01e9\7g\2\2\u01e9"+
		"\u01ea\7\"\2\2\u01ea\u01eb\7r\2\2\u01eb\u01ec\7q\2\2\u01ec\u01ed\7v\2"+
		"\2\u01edl\3\2\2\2\u01ee\u01ef\7F\2\2\u01ef\u01f0\7q\2\2\u01f0\u01f1\7"+
		"g\2\2\u01f1\u01f2\7u\2\2\u01f2\u01f3\7\"\2\2\u01f3\u01f4\7p\2\2\u01f4"+
		"\u01f5\7q\2\2\u01f5\u01f6\7v\2\2\u01f6\u01f7\7\"\2\2\u01f7\u01f8\7u\2"+
		"\2\u01f8\u01f9\7j\2\2\u01f9\u01fa\7q\2\2\u01fa\u01fb\7y\2\2\u01fbn\3\2"+
		"\2\2\u01fc\u01fd\7f\2\2\u01fd\u01fe\7g\2\2\u01fe\u01ff\7r\2\2\u01ff\u0200"+
		"\7q\2\2\u0200\u0201\7u\2\2\u0201\u0202\7k\2\2\u0202\u0203\7v\2\2\u0203"+
		"p\3\2\2\2\u0204\u0205\7E\2\2\u0205\u0206\7c\2\2\u0206\u0207\7t\2\2\u0207"+
		"\u0208\7f\2\2\u0208\u0209\7\"\2\2\u0209\u020a\7f\2\2\u020a\u020b\7g\2"+
		"\2\u020b\u020c\7c\2\2\u020c\u020d\7n\2\2\u020d\u020e\7v\2\2\u020e\u020f"+
		"\7\"\2\2\u020f\u0210\7v\2\2\u0210\u0211\7q\2\2\u0211\u0212\7\"\2\2\u0212"+
		"\u0213\7c\2\2\u0213\u0214\7\"\2\2\u0214\u0215\7u\2\2\u0215\u0216\7r\2"+
		"\2\u0216\u0217\7q\2\2\u0217\u0218\7v\2\2\u0218r\3\2\2\2\u0219\u021a\7"+
		"T\2\2\u021a\u021b\7g\2\2\u021b\u021c\7v\2\2\u021c\u021d\7w\2\2\u021d\u021e"+
		"\7t\2\2\u021e\u021f\7p\2\2\u021f\u0220\7\"\2\2\u0220\u0221\7w\2\2\u0221"+
		"\u0222\7p\2\2\u0222\u0223\7e\2\2\u0223\u0224\7c\2\2\u0224\u0225\7n\2\2"+
		"\u0225\u0226\7n\2\2\u0226\u0227\7g\2\2\u0227\u0228\7f\2\2\u0228\u0229"+
		"\7\"\2\2\u0229\u022a\7r\2\2\u022a\u022b\7q\2\2\u022b\u022c\7t\2\2\u022c"+
		"\u022d\7v\2\2\u022d\u022e\7k\2\2\u022e\u022f\7q\2\2\u022f\u0230\7p\2\2"+
		"\u0230\u0231\7\"\2\2\u0231\u0232\7q\2\2\u0232\u0233\7h\2\2\u0233\u0234"+
		"\7\"\2\2\u0234\u0235\7d\2\2\u0235\u0236\7g\2\2\u0236\u0237\7v\2\2\u0237"+
		"t\3\2\2\2\u0238\u0239\7T\2\2\u0239\u023a\7g\2\2\u023a\u023b\7v\2\2\u023b"+
		"\u023c\7w\2\2\u023c\u023d\7t\2\2\u023d\u023e\7p\2\2\u023e\u023f\7\"\2"+
		"\2\u023f\u0240\7w\2\2\u0240\u0241\7p\2\2\u0241\u0242\7e\2\2\u0242\u0243"+
		"\7c\2\2\u0243\u0244\7n\2\2\u0244\u0245\7n\2\2\u0245\u0246\7g\2\2\u0246"+
		"\u0247\7f\2\2\u0247\u0248\7\"\2\2\u0248\u0249\7d\2\2\u0249\u024a\7n\2"+
		"\2\u024a\u024b\7k\2\2\u024b\u024c\7p\2\2\u024c\u024d\7f\2\2\u024dv\3\2"+
		"\2\2\u024e\u024f\7R\2\2\u024f\u0250\7q\2\2\u0250\u0251\7u\2\2\u0251\u0252"+
		"\7v\2\2\u0252\u0253\7u\2\2\u0253\u0254\7\"\2\2\u0254\u0255\7e\2\2\u0255"+
		"\u0256\7j\2\2\u0256\u0257\7k\2\2\u0257\u0258\7r\2\2\u0258x\3\2\2\2\u0259"+
		"\u025a\7R\2\2\u025a\u025b\7q\2\2\u025b\u025c\7u\2\2\u025c\u025d\7v\2\2"+
		"\u025d\u025e\7u\2\2\u025e\u025f\7\"\2\2\u025f\u0260\7f\2\2\u0260\u0261"+
		"\7g\2\2\u0261\u0262\7c\2\2\u0262\u0263\7f\2\2\u0263\u0264\7\"\2\2\u0264"+
		"\u0265\7e\2\2\u0265\u0266\7j\2\2\u0266\u0267\7k\2\2\u0267\u0268\7r\2\2"+
		"\u0268z\3\2\2\2\u0269\u026a\7c\2\2\u026a\u026b\7w\2\2\u026b\u026c\7v\2"+
		"\2\u026c\u026d\7j\2\2\u026d|\3\2\2\2\u026e\u026f\7V\2\2\u026f\u0270\7"+
		"q\2\2\u0270\u0271\7v\2\2\u0271\u0272\7c\2\2\u0272\u0273\7n\2\2\u0273\u0274"+
		"\7\"\2\2\u0274\u0275\7R\2\2\u0275\u0276\7q\2\2\u0276\u0277\7v\2\2\u0277"+
		"~\3\2\2\2\u0278\u0279\7J\2\2\u0279\u027a\7c\2\2\u027a\u027b\7p\2\2\u027b"+
		"\u027c\7f\2\2\u027c\u027d\7\"\2\2\u027d\u027e\7t\2\2\u027e\u027f\7g\2"+
		"\2\u027f\u0280\7u\2\2\u0280\u0281\7w\2\2\u0281\u0282\7n\2\2\u0282\u0283"+
		"\7v\2\2\u0283\u0080\3\2\2\2\u0284\u0285\7U\2\2\u0285\u0286\7W\2\2\u0286"+
		"\u0287\7O\2\2\u0287\u0288\7O\2\2\u0288\u0289\7C\2\2\u0289\u028a\7T\2\2"+
		"\u028a\u028b\7[\2\2\u028b\u0082\3\2\2\2\u028c\u028d\7H\2\2\u028d\u028e"+
		"\7q\2\2\u028e\u028f\7n\2\2\u028f\u0290\7f\2\2\u0290\u0291\7u\2\2\u0291"+
		"\u0084\3\2\2\2\u0292\u0293\7H\2\2\u0293\u0294\7q\2\2\u0294\u0295\7n\2"+
		"\2\u0295\u0296\7f\2\2\u0296\u0297\7g\2\2\u0297\u0298\7f\2\2\u0298\u0086"+
		"\3\2\2\2\u0299\u029a\7E\2\2\u029a\u029b\7c\2\2\u029b\u029c\7n\2\2\u029c"+
		"\u029d\7n\2\2\u029d\u029e\7u\2\2\u029e\u0088\3\2\2\2\u029f\u02a0\7E\2"+
		"\2\u02a0\u02a1\7j\2\2\u02a1\u02a2\7g\2\2\u02a2\u02a3\7e\2\2\u02a3\u02a4"+
		"\7m\2\2\u02a4\u02a5\7u\2\2\u02a5\u008a\3\2\2\2\u02a6\u02a7\7D\2\2\u02a7"+
		"\u02a8\7g\2\2\u02a8\u02a9\7v\2\2\u02a9\u02aa\7u\2\2\u02aa\u008c\3\2\2"+
		"\2\u02ab\u02ac\7T\2\2\u02ac\u02ad\7c\2\2\u02ad\u02ae\7k\2\2\u02ae\u02af"+
		"\7u\2\2\u02af\u02b0\7g\2\2\u02b0\u02b1\7u\2\2\u02b1\u008e\3\2\2\2\u02b2"+
		"\u02b3\7T\2\2\u02b3\u02b4\7c\2\2\u02b4\u02b5\7k\2\2\u02b5\u02b6\7u\2\2"+
		"\u02b6\u02bd\7g\2\2\u02b7\u02b8\7t\2\2\u02b8\u02b9\7c\2\2\u02b9\u02ba"+
		"\7k\2\2\u02ba\u02bb\7u\2\2\u02bb\u02bd\7g\2\2\u02bc\u02b2\3\2\2\2\u02bc"+
		"\u02b7\3\2\2\2\u02bd\u0090\3\2\2\2\u02be\u02bf\7O\2\2\u02bf\u02c0\7w\2"+
		"\2\u02c0\u02c1\7e\2\2\u02c1\u02c2\7m\2\2\u02c2\u02c3\7u\2\2\u02c3\u0092"+
		"\3\2\2\2\u02c4\u02c5\7O\2\2\u02c5\u02c6\7w\2\2\u02c6\u02c7\7e\2\2\u02c7"+
		"\u02c8\7m\2\2\u02c8\u02c9\7g\2\2\u02c9\u02ca\7f\2\2\u02ca\u0094\3\2\2"+
		"\2\u02cb\u02cc\7C\2\2\u02cc\u02cd\7n\2\2\u02cd\u02ce\7n\2\2\u02ce\u02cf"+
		"\7/\2\2\u02cf\u02d0\7k\2\2\u02d0\u02d1\7p\2\2\u02d1\u0096\3\2\2\2\u02d2"+
		"\u02d3\7t\2\2\u02d3\u02d4\7g\2\2\u02d4\u02d5\7/\2\2\u02d5\u02d6\7l\2\2"+
		"\u02d6\u02d7\7q\2\2\u02d7\u02d8\7k\2\2\u02d8\u02d9\7p\2\2\u02d9\u0098"+
		"\3\2\2\2\u02da\u02db\7y\2\2\u02db\u02dc\7c\2\2\u02dc\u02dd\7k\2\2\u02dd"+
		"\u02de\7v\2\2\u02de\u02df\7\"\2\2\u02df\u02e0\7h\2\2\u02e0\u02e1\7q\2"+
		"\2\u02e1\u02e2\7t\2\2\u02e2\u02e3\7\"\2\2\u02e3\u02e4\7d\2\2\u02e4\u02e5"+
		"\7d\2\2\u02e5\u009a\3\2\2\2\u02e6\u02e7\7u\2\2\u02e7\u02e8\7j\2\2\u02e8"+
		"\u02e9\7q\2\2\u02e9\u02ea\7y\2\2\u02ea\u02eb\7u\2\2\u02eb\u009c\3\2\2"+
		"\2\u02ec\u02ed\7n\2\2\u02ed\u02ee\7q\2\2\u02ee\u02ef\7u\2\2\u02ef\u02f0"+
		"\7v\2\2\u02f0\u02f1\7\"\2\2\u02f1\u02f2\7y\2\2\u02f2\u02f3\7k\2\2\u02f3"+
		"\u02f4\7v\2\2\u02f4\u02f5\7j\2\2\u02f5\u009e\3\2\2\2\u02f6\u02f7\7V\2"+
		"\2\u02f7\u02f8\7j\2\2\u02f8\u02f9\7t\2\2\u02f9\u02fa\7g\2\2\u02fa\u02fb"+
		"\7g\2\2\u02fb\u02fc\7\"\2\2\u02fc\u02fd\7q\2\2\u02fd\u02fe\7h\2\2\u02fe"+
		"\u02ff\7\"\2\2\u02ff\u0300\7c\2\2\u0300\u0301\7\"\2\2\u0301\u0302\7m\2"+
		"\2\u0302\u0303\7k\2\2\u0303\u0304\7p\2\2\u0304\u0305\7f\2\2\u0305\u00a0"+
		"\3\2\2\2\u0306\u0308\t\2\2\2\u0307\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u030a\t\3\2\2\u030a\u00a2\3\2\2\2\u030b\u030c\4\63\64\2\u030c\u030d\5"+
		"\u00a5S\2\u030d\u030e\5\u00a5S\2\u030e\u030f\5\u00a5S\2\u030f\u00a4\3"+
		"\2\2\2\u0310\u0311\t\4\2\2\u0311\u00a6\3\2\2\2\u0312\u0314\t\4\2\2\u0313"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u0316\u00a8\3\2\2\2\u0317\u031a\5\33\16\2\u0318\u031b\5\u00a7T\2"+
		"\u0319\u031b\5\u00a5S\2\u031a\u0318\3\2\2\2\u031a\u0319\3\2\2\2\u031b"+
		"\u0325\3\2\2\2\u031c\u031f\5\33\16\2\u031d\u0320\5\u00a7T\2\u031e\u0320"+
		"\5\u00a5S\2\u031f\u031d\3\2\2\2\u031f\u031e\3\2\2\2\u0320\u0321\3\2\2"+
		"\2\u0321\u0322\5\37\20\2\u0322\u0323\5\u00a7T\2\u0323\u0325\3\2\2\2\u0324"+
		"\u0317\3\2\2\2\u0324\u031c\3\2\2\2\u0325\u00aa\3\2\2\2\u0326\u0327\t\5"+
		"\2\2\u0327\u0328\3\2\2\2\u0328\u0329\bV\2\2\u0329\u00ac\3\2\2\2\u032a"+
		"\u032b\13\2\2\2\u032b\u00ae\3\2\2\2\f\2\u0123\u0137\u01ab\u02bc\u0307"+
		"\u0315\u031a\u031f\u0324\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}