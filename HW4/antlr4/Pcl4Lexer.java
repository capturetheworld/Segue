// Generated from c:\Users\mcnan\Documents\SJSU\Fall 2020\CS 153\CS153-Compiler-Design\HW4\Pcl4.g4 by ANTLR 4.8

    package antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pcl4Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		PROGRAM=18, CONST=19, TYPE=20, ARRAY=21, OF=22, RECORD=23, VAR=24, BEGIN=25, 
		END=26, DIV=27, MOD=28, AND=29, OR=30, NOT=31, IF=32, THEN=33, ELSE=34, 
		CASE=35, REPEAT=36, UNTIL=37, WHILE=38, DO=39, FOR=40, TO=41, DOWNTO=42, 
		WRITE=43, WRITELN=44, READ=45, READLN=46, PROCEDURE=47, FUNCTION=48, IDENTIFIER=49, 
		INTEGER=50, REAL=51, NEWLINE=52, WS=53, QUOTE=54, CHARACTER=55, STRING=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "PROGRAM", 
			"CONST", "TYPE", "ARRAY", "OF", "RECORD", "VAR", "BEGIN", "END", "DIV", 
			"MOD", "AND", "OR", "NOT", "IF", "THEN", "ELSE", "CASE", "REPEAT", "UNTIL", 
			"WHILE", "DO", "FOR", "TO", "DOWNTO", "WRITE", "WRITELN", "READ", "READLN", 
			"PROCEDURE", "FUNCTION", "IDENTIFIER", "INTEGER", "REAL", "NEWLINE", 
			"WS", "QUOTE", "CHARACTER", "STRING", "CHARACTER_CHAR", "STRING_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'('", "','", "')'", "':='", "':'", "'-'", "'+'", 
			"'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "PROGRAM", "CONST", "TYPE", "ARRAY", 
			"OF", "RECORD", "VAR", "BEGIN", "END", "DIV", "MOD", "AND", "OR", "NOT", 
			"IF", "THEN", "ELSE", "CASE", "REPEAT", "UNTIL", "WHILE", "DO", "FOR", 
			"TO", "DOWNTO", "WRITE", "WRITELN", "READ", "READLN", "PROCEDURE", "FUNCTION", 
			"IDENTIFIER", "INTEGER", "REAL", "NEWLINE", "WS", "QUOTE", "CHARACTER", 
			"STRING"
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


	public Pcl4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pcl4.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3."+
		"\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3"+
		"=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3"+
		"A\3A\3A\3A\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3"+
		"F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3"+
		"I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\7L\u01af"+
		"\nL\fL\16L\u01b2\13L\3M\6M\u01b5\nM\rM\16M\u01b6\3N\3N\3N\3N\3N\3N\3N"+
		"\5N\u01c0\nN\3N\3N\3N\3N\3N\3N\3N\5N\u01c9\nN\3N\3N\5N\u01cd\nN\3O\5O"+
		"\u01d0\nO\3O\3O\3O\3O\3P\6P\u01d7\nP\rP\16P\u01d8\3P\3P\3Q\3Q\3R\3R\3"+
		"R\3R\3S\3S\7S\u01e5\nS\fS\16S\u01e8\13S\3S\3S\3T\3T\3U\3U\3U\3U\5U\u01f2"+
		"\nU\2\2V\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?"+
		"\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\24[\25]\26_\27a\30c\31e\32g\33"+
		"i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089"+
		",\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b"+
		"\65\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7\2\u00a9\2\3\2\"\4\2C"+
		"Ccc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4"+
		"\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTt"+
		"t\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4"+
		"\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2--//\4\2\13\13\"\"\3\2))\2\u01e0\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\3\u00ab\3\2\2\2\5\u00ad\3\2\2\2\7\u00af"+
		"\3\2\2\2\t\u00b1\3\2\2\2\13\u00b3\3\2\2\2\r\u00b5\3\2\2\2\17\u00b8\3\2"+
		"\2\2\21\u00ba\3\2\2\2\23\u00bc\3\2\2\2\25\u00be\3\2\2\2\27\u00c0\3\2\2"+
		"\2\31\u00c3\3\2\2\2\33\u00c5\3\2\2\2\35\u00c8\3\2\2\2\37\u00ca\3\2\2\2"+
		"!\u00cd\3\2\2\2#\u00cf\3\2\2\2%\u00d1\3\2\2\2\'\u00d3\3\2\2\2)\u00d5\3"+
		"\2\2\2+\u00d7\3\2\2\2-\u00d9\3\2\2\2/\u00db\3\2\2\2\61\u00dd\3\2\2\2\63"+
		"\u00df\3\2\2\2\65\u00e1\3\2\2\2\67\u00e3\3\2\2\29\u00e5\3\2\2\2;\u00e7"+
		"\3\2\2\2=\u00e9\3\2\2\2?\u00eb\3\2\2\2A\u00ed\3\2\2\2C\u00ef\3\2\2\2E"+
		"\u00f1\3\2\2\2G\u00f3\3\2\2\2I\u00f5\3\2\2\2K\u00f7\3\2\2\2M\u00f9\3\2"+
		"\2\2O\u00fb\3\2\2\2Q\u00fd\3\2\2\2S\u00ff\3\2\2\2U\u0101\3\2\2\2W\u0103"+
		"\3\2\2\2Y\u0105\3\2\2\2[\u010d\3\2\2\2]\u0113\3\2\2\2_\u0118\3\2\2\2a"+
		"\u011e\3\2\2\2c\u0121\3\2\2\2e\u0128\3\2\2\2g\u012c\3\2\2\2i\u0132\3\2"+
		"\2\2k\u0136\3\2\2\2m\u013a\3\2\2\2o\u013e\3\2\2\2q\u0142\3\2\2\2s\u0145"+
		"\3\2\2\2u\u0149\3\2\2\2w\u014c\3\2\2\2y\u0151\3\2\2\2{\u0156\3\2\2\2}"+
		"\u015b\3\2\2\2\177\u0162\3\2\2\2\u0081\u0168\3\2\2\2\u0083\u016e\3\2\2"+
		"\2\u0085\u0171\3\2\2\2\u0087\u0175\3\2\2\2\u0089\u0178\3\2\2\2\u008b\u017f"+
		"\3\2\2\2\u008d\u0185\3\2\2\2\u008f\u018d\3\2\2\2\u0091\u0192\3\2\2\2\u0093"+
		"\u0199\3\2\2\2\u0095\u01a3\3\2\2\2\u0097\u01ac\3\2\2\2\u0099\u01b4\3\2"+
		"\2\2\u009b\u01cc\3\2\2\2\u009d\u01cf\3\2\2\2\u009f\u01d6\3\2\2\2\u00a1"+
		"\u01dc\3\2\2\2\u00a3\u01de\3\2\2\2\u00a5\u01e2\3\2\2\2\u00a7\u01eb\3\2"+
		"\2\2\u00a9\u01f1\3\2\2\2\u00ab\u00ac\7\60\2\2\u00ac\4\3\2\2\2\u00ad\u00ae"+
		"\7=\2\2\u00ae\6\3\2\2\2\u00af\u00b0\7*\2\2\u00b0\b\3\2\2\2\u00b1\u00b2"+
		"\7.\2\2\u00b2\n\3\2\2\2\u00b3\u00b4\7+\2\2\u00b4\f\3\2\2\2\u00b5\u00b6"+
		"\7<\2\2\u00b6\u00b7\7?\2\2\u00b7\16\3\2\2\2\u00b8\u00b9\7<\2\2\u00b9\20"+
		"\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb\22\3\2\2\2\u00bc\u00bd\7-\2\2\u00bd"+
		"\24\3\2\2\2\u00be\u00bf\7?\2\2\u00bf\26\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1"+
		"\u00c2\7@\2\2\u00c2\30\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\32\3\2\2\2\u00c5"+
		"\u00c6\7>\2\2\u00c6\u00c7\7?\2\2\u00c7\34\3\2\2\2\u00c8\u00c9\7@\2\2\u00c9"+
		"\36\3\2\2\2\u00ca\u00cb\7@\2\2\u00cb\u00cc\7?\2\2\u00cc \3\2\2\2\u00cd"+
		"\u00ce\7,\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7\61\2\2\u00d0$\3\2\2\2\u00d1"+
		"\u00d2\t\2\2\2\u00d2&\3\2\2\2\u00d3\u00d4\t\3\2\2\u00d4(\3\2\2\2\u00d5"+
		"\u00d6\t\4\2\2\u00d6*\3\2\2\2\u00d7\u00d8\t\5\2\2\u00d8,\3\2\2\2\u00d9"+
		"\u00da\t\6\2\2\u00da.\3\2\2\2\u00db\u00dc\t\7\2\2\u00dc\60\3\2\2\2\u00dd"+
		"\u00de\t\b\2\2\u00de\62\3\2\2\2\u00df\u00e0\t\t\2\2\u00e0\64\3\2\2\2\u00e1"+
		"\u00e2\t\n\2\2\u00e2\66\3\2\2\2\u00e3\u00e4\t\13\2\2\u00e48\3\2\2\2\u00e5"+
		"\u00e6\t\f\2\2\u00e6:\3\2\2\2\u00e7\u00e8\t\r\2\2\u00e8<\3\2\2\2\u00e9"+
		"\u00ea\t\16\2\2\u00ea>\3\2\2\2\u00eb\u00ec\t\17\2\2\u00ec@\3\2\2\2\u00ed"+
		"\u00ee\t\20\2\2\u00eeB\3\2\2\2\u00ef\u00f0\t\21\2\2\u00f0D\3\2\2\2\u00f1"+
		"\u00f2\t\22\2\2\u00f2F\3\2\2\2\u00f3\u00f4\t\23\2\2\u00f4H\3\2\2\2\u00f5"+
		"\u00f6\t\24\2\2\u00f6J\3\2\2\2\u00f7\u00f8\t\25\2\2\u00f8L\3\2\2\2\u00f9"+
		"\u00fa\t\26\2\2\u00faN\3\2\2\2\u00fb\u00fc\t\27\2\2\u00fcP\3\2\2\2\u00fd"+
		"\u00fe\t\30\2\2\u00feR\3\2\2\2\u00ff\u0100\t\31\2\2\u0100T\3\2\2\2\u0101"+
		"\u0102\t\32\2\2\u0102V\3\2\2\2\u0103\u0104\t\33\2\2\u0104X\3\2\2\2\u0105"+
		"\u0106\5C\"\2\u0106\u0107\5G$\2\u0107\u0108\5A!\2\u0108\u0109\5\61\31"+
		"\2\u0109\u010a\5G$\2\u010a\u010b\5%\23\2\u010b\u010c\5=\37\2\u010cZ\3"+
		"\2\2\2\u010d\u010e\5)\25\2\u010e\u010f\5A!\2\u010f\u0110\5? \2\u0110\u0111"+
		"\5I%\2\u0111\u0112\5K&\2\u0112\\\3\2\2\2\u0113\u0114\5K&\2\u0114\u0115"+
		"\5U+\2\u0115\u0116\5C\"\2\u0116\u0117\5-\27\2\u0117^\3\2\2\2\u0118\u0119"+
		"\5%\23\2\u0119\u011a\5G$\2\u011a\u011b\5G$\2\u011b\u011c\5%\23\2\u011c"+
		"\u011d\5U+\2\u011d`\3\2\2\2\u011e\u011f\5A!\2\u011f\u0120\5/\30\2\u0120"+
		"b\3\2\2\2\u0121\u0122\5G$\2\u0122\u0123\5-\27\2\u0123\u0124\5)\25\2\u0124"+
		"\u0125\5A!\2\u0125\u0126\5G$\2\u0126\u0127\5+\26\2\u0127d\3\2\2\2\u0128"+
		"\u0129\5O(\2\u0129\u012a\5%\23\2\u012a\u012b\5G$\2\u012bf\3\2\2\2\u012c"+
		"\u012d\5\'\24\2\u012d\u012e\5-\27\2\u012e\u012f\5\61\31\2\u012f\u0130"+
		"\5\65\33\2\u0130\u0131\5? \2\u0131h\3\2\2\2\u0132\u0133\5-\27\2\u0133"+
		"\u0134\5? \2\u0134\u0135\5+\26\2\u0135j\3\2\2\2\u0136\u0137\5+\26\2\u0137"+
		"\u0138\5\65\33\2\u0138\u0139\5O(\2\u0139l\3\2\2\2\u013a\u013b\5=\37\2"+
		"\u013b\u013c\5A!\2\u013c\u013d\5+\26\2\u013dn\3\2\2\2\u013e\u013f\5%\23"+
		"\2\u013f\u0140\5? \2\u0140\u0141\5+\26\2\u0141p\3\2\2\2\u0142\u0143\5"+
		"A!\2\u0143\u0144\5G$\2\u0144r\3\2\2\2\u0145\u0146\5? \2\u0146\u0147\5"+
		"A!\2\u0147\u0148\5K&\2\u0148t\3\2\2\2\u0149\u014a\5\65\33\2\u014a\u014b"+
		"\5/\30\2\u014bv\3\2\2\2\u014c\u014d\5K&\2\u014d\u014e\5\63\32\2\u014e"+
		"\u014f\5-\27\2\u014f\u0150\5? \2\u0150x\3\2\2\2\u0151\u0152\5-\27\2\u0152"+
		"\u0153\5;\36\2\u0153\u0154\5I%\2\u0154\u0155\5-\27\2\u0155z\3\2\2\2\u0156"+
		"\u0157\5)\25\2\u0157\u0158\5%\23\2\u0158\u0159\5I%\2\u0159\u015a\5-\27"+
		"\2\u015a|\3\2\2\2\u015b\u015c\5G$\2\u015c\u015d\5-\27\2\u015d\u015e\5"+
		"C\"\2\u015e\u015f\5-\27\2\u015f\u0160\5%\23\2\u0160\u0161\5K&\2\u0161"+
		"~\3\2\2\2\u0162\u0163\5M\'\2\u0163\u0164\5? \2\u0164\u0165\5K&\2\u0165"+
		"\u0166\5\65\33\2\u0166\u0167\5;\36\2\u0167\u0080\3\2\2\2\u0168\u0169\5"+
		"Q)\2\u0169\u016a\5\63\32\2\u016a\u016b\5\65\33\2\u016b\u016c\5;\36\2\u016c"+
		"\u016d\5-\27\2\u016d\u0082\3\2\2\2\u016e\u016f\5+\26\2\u016f\u0170\5A"+
		"!\2\u0170\u0084\3\2\2\2\u0171\u0172\5/\30\2\u0172\u0173\5A!\2\u0173\u0174"+
		"\5G$\2\u0174\u0086\3\2\2\2\u0175\u0176\5K&\2\u0176\u0177\5A!\2\u0177\u0088"+
		"\3\2\2\2\u0178\u0179\5+\26\2\u0179\u017a\5A!\2\u017a\u017b\5Q)\2\u017b"+
		"\u017c\5? \2\u017c\u017d\5K&\2\u017d\u017e\5A!\2\u017e\u008a\3\2\2\2\u017f"+
		"\u0180\5Q)\2\u0180\u0181\5G$\2\u0181\u0182\5\65\33\2\u0182\u0183\5K&\2"+
		"\u0183\u0184\5-\27\2\u0184\u008c\3\2\2\2\u0185\u0186\5Q)\2\u0186\u0187"+
		"\5G$\2\u0187\u0188\5\65\33\2\u0188\u0189\5K&\2\u0189\u018a\5-\27\2\u018a"+
		"\u018b\5;\36\2\u018b\u018c\5? \2\u018c\u008e\3\2\2\2\u018d\u018e\5G$\2"+
		"\u018e\u018f\5-\27\2\u018f\u0190\5%\23\2\u0190\u0191\5+\26\2\u0191\u0090"+
		"\3\2\2\2\u0192\u0193\5G$\2\u0193\u0194\5-\27\2\u0194\u0195\5%\23\2\u0195"+
		"\u0196\5+\26\2\u0196\u0197\5;\36\2\u0197\u0198\5? \2\u0198\u0092\3\2\2"+
		"\2\u0199\u019a\5C\"\2\u019a\u019b\5G$\2\u019b\u019c\5A!\2\u019c\u019d"+
		"\5)\25\2\u019d\u019e\5-\27\2\u019e\u019f\5+\26\2\u019f\u01a0\5M\'\2\u01a0"+
		"\u01a1\5G$\2\u01a1\u01a2\5-\27\2\u01a2\u0094\3\2\2\2\u01a3\u01a4\5/\30"+
		"\2\u01a4\u01a5\5M\'\2\u01a5\u01a6\5? \2\u01a6\u01a7\5)\25\2\u01a7\u01a8"+
		"\5K&\2\u01a8\u01a9\5\65\33\2\u01a9\u01aa\5A!\2\u01aa\u01ab\5? \2\u01ab"+
		"\u0096\3\2\2\2\u01ac\u01b0\t\34\2\2\u01ad\u01af\t\35\2\2\u01ae\u01ad\3"+
		"\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u0098\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\t\36\2\2\u01b4\u01b3\3"+
		"\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u009a\3\2\2\2\u01b8\u01b9\5\u0099M\2\u01b9\u01ba\7\60\2\2\u01ba\u01bb"+
		"\5\u0099M\2\u01bb\u01cd\3\2\2\2\u01bc\u01bd\5\u0099M\2\u01bd\u01bf\t\6"+
		"\2\2\u01be\u01c0\t\37\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\5\u0099M\2\u01c2\u01cd\3\2\2\2\u01c3\u01c4"+
		"\5\u0099M\2\u01c4\u01c5\7\60\2\2\u01c5\u01c6\5\u0099M\2\u01c6\u01c8\t"+
		"\6\2\2\u01c7\u01c9\t\37\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01cb\5\u0099M\2\u01cb\u01cd\3\2\2\2\u01cc\u01b8"+
		"\3\2\2\2\u01cc\u01bc\3\2\2\2\u01cc\u01c3\3\2\2\2\u01cd\u009c\3\2\2\2\u01ce"+
		"\u01d0\7\17\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3"+
		"\2\2\2\u01d1\u01d2\7\f\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\bO\2\2\u01d4"+
		"\u009e\3\2\2\2\u01d5\u01d7\t \2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\bP\2\2\u01db\u00a0\3\2\2\2\u01dc\u01dd\7)\2\2\u01dd\u00a2\3\2\2"+
		"\2\u01de\u01df\5\u00a1Q\2\u01df\u01e0\5\u00a7T\2\u01e0\u01e1\5\u00a1Q"+
		"\2\u01e1\u00a4\3\2\2\2\u01e2\u01e6\5\u00a1Q\2\u01e3\u01e5\5\u00a9U\2\u01e4"+
		"\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\5\u00a1Q\2\u01ea"+
		"\u00a6\3\2\2\2\u01eb\u01ec\n!\2\2\u01ec\u00a8\3\2\2\2\u01ed\u01ee\5\u00a1"+
		"Q\2\u01ee\u01ef\5\u00a1Q\2\u01ef\u01f2\3\2\2\2\u01f0\u01f2\n!\2\2\u01f1"+
		"\u01ed\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u00aa\3\2\2\2\f\2\u01b0\u01b6"+
		"\u01bf\u01c8\u01cc\u01cf\u01d8\u01e6\u01f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}