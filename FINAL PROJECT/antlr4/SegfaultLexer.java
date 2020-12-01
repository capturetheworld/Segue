// Generated from c:\Users\mcnan\Documents\SJSU\Fall 2020\CS 153\CS153-Compiler-Design\FINAL PROJECT\Segfault.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SegfaultLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, PROGRAM=21, CONST=22, TYPE=23, OF=24, VAR=25, 
		BEGIN=26, END=27, DIV=28, AND=29, OR=30, NOT=31, IF=32, THEN=33, ELSE=34, 
		UNTIL=35, TRUE=36, FALSE=37, DO=38, PRINTLN=39, PROCEDURE=40, FUNCTION=41, 
		WHILE=42, COMMENT=43, IDENTIFIER=44, LETTER=45, INTEGER=46, DOUBLE=47, 
		NEWLINE=48, WS=49;
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
			"T__17", "T__18", "T__19", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
			"X", "Y", "Z", "PROGRAM", "CONST", "TYPE", "OF", "VAR", "BEGIN", "END", 
			"DIV", "AND", "OR", "NOT", "IF", "THEN", "ELSE", "UNTIL", "TRUE", "FALSE", 
			"DO", "PRINTLN", "PROCEDURE", "FUNCTION", "WHILE", "COMMENT", "COMMENT_CHARACTER", 
			"IDENTIFIER", "LETTER", "INTEGER", "DOUBLE", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'{'", "'}'", "'#'", "'$'", "'!'", "'|'", 
			"'&'", "'=='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "PROGRAM", "CONST", 
			"TYPE", "OF", "VAR", "BEGIN", "END", "DIV", "AND", "OR", "NOT", "IF", 
			"THEN", "ELSE", "UNTIL", "TRUE", "FALSE", "DO", "PRINTLN", "PROCEDURE", 
			"FUNCTION", "WHILE", "COMMENT", "IDENTIFIER", "LETTER", "INTEGER", "DOUBLE", 
			"NEWLINE", "WS"
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


	public SegfaultLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Segfault.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u01a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3"+
		">\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3E\3E\3E\3E\3E\3E\3F\3F\7F\u0173\nF\fF\16F\u0176\13F\3F\3F\3F\3F\3G"+
		"\3G\3H\3H\7H\u0180\nH\fH\16H\u0183\13H\3I\6I\u0186\nI\rI\16I\u0187\3J"+
		"\6J\u018b\nJ\rJ\16J\u018c\3K\7K\u0190\nK\fK\16K\u0193\13K\3K\3K\6K\u0197"+
		"\nK\rK\16K\u0198\3L\5L\u019c\nL\3L\3L\3M\6M\u01a1\nM\rM\16M\u01a2\3M\3"+
		"M\2\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2="+
		"\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\27a\30c\31e\32g\33"+
		"i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089"+
		",\u008b-\u008d\2\u008f.\u0091/\u0093\60\u0095\61\u0097\62\u0099\63\3\2"+
		"!\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2"+
		"KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\3\2\177\177\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\13\13\"\"\2\u0192\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009b"+
		"\3\2\2\2\5\u009d\3\2\2\2\7\u009f\3\2\2\2\t\u00a1\3\2\2\2\13\u00a3\3\2"+
		"\2\2\r\u00a5\3\2\2\2\17\u00a7\3\2\2\2\21\u00a9\3\2\2\2\23\u00ab\3\2\2"+
		"\2\25\u00ad\3\2\2\2\27\u00af\3\2\2\2\31\u00b2\3\2\2\2\33\u00b5\3\2\2\2"+
		"\35\u00b7\3\2\2\2\37\u00ba\3\2\2\2!\u00bc\3\2\2\2#\u00bf\3\2\2\2%\u00c1"+
		"\3\2\2\2\'\u00c3\3\2\2\2)\u00c5\3\2\2\2+\u00c7\3\2\2\2-\u00c9\3\2\2\2"+
		"/\u00cb\3\2\2\2\61\u00cd\3\2\2\2\63\u00cf\3\2\2\2\65\u00d1\3\2\2\2\67"+
		"\u00d3\3\2\2\29\u00d5\3\2\2\2;\u00d7\3\2\2\2=\u00d9\3\2\2\2?\u00db\3\2"+
		"\2\2A\u00dd\3\2\2\2C\u00df\3\2\2\2E\u00e1\3\2\2\2G\u00e3\3\2\2\2I\u00e5"+
		"\3\2\2\2K\u00e7\3\2\2\2M\u00e9\3\2\2\2O\u00eb\3\2\2\2Q\u00ed\3\2\2\2S"+
		"\u00ef\3\2\2\2U\u00f1\3\2\2\2W\u00f3\3\2\2\2Y\u00f5\3\2\2\2[\u00f7\3\2"+
		"\2\2]\u00f9\3\2\2\2_\u00fb\3\2\2\2a\u0103\3\2\2\2c\u0109\3\2\2\2e\u010e"+
		"\3\2\2\2g\u0111\3\2\2\2i\u0115\3\2\2\2k\u011b\3\2\2\2m\u011f\3\2\2\2o"+
		"\u0123\3\2\2\2q\u0127\3\2\2\2s\u012a\3\2\2\2u\u012e\3\2\2\2w\u0131\3\2"+
		"\2\2y\u0136\3\2\2\2{\u013b\3\2\2\2}\u0141\3\2\2\2\177\u0146\3\2\2\2\u0081"+
		"\u014c\3\2\2\2\u0083\u014f\3\2\2\2\u0085\u0157\3\2\2\2\u0087\u0161\3\2"+
		"\2\2\u0089\u016a\3\2\2\2\u008b\u0170\3\2\2\2\u008d\u017b\3\2\2\2\u008f"+
		"\u017d\3\2\2\2\u0091\u0185\3\2\2\2\u0093\u018a\3\2\2\2\u0095\u0191\3\2"+
		"\2\2\u0097\u019b\3\2\2\2\u0099\u01a0\3\2\2\2\u009b\u009c\7?\2\2\u009c"+
		"\4\3\2\2\2\u009d\u009e\7*\2\2\u009e\6\3\2\2\2\u009f\u00a0\7+\2\2\u00a0"+
		"\b\3\2\2\2\u00a1\u00a2\7}\2\2\u00a2\n\3\2\2\2\u00a3\u00a4\7\177\2\2\u00a4"+
		"\f\3\2\2\2\u00a5\u00a6\7%\2\2\u00a6\16\3\2\2\2\u00a7\u00a8\7&\2\2\u00a8"+
		"\20\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa\22\3\2\2\2\u00ab\u00ac\7~\2\2\u00ac"+
		"\24\3\2\2\2\u00ad\u00ae\7(\2\2\u00ae\26\3\2\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"\u00b1\7?\2\2\u00b1\30\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4\7@\2\2\u00b4"+
		"\32\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8"+
		"\u00b9\7?\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb \3\2\2\2\u00bc"+
		"\u00bd\7@\2\2\u00bd\u00be\7?\2\2\u00be\"\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0"+
		"$\3\2\2\2\u00c1\u00c2\7/\2\2\u00c2&\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4("+
		"\3\2\2\2\u00c5\u00c6\7\61\2\2\u00c6*\3\2\2\2\u00c7\u00c8\t\2\2\2\u00c8"+
		",\3\2\2\2\u00c9\u00ca\t\3\2\2\u00ca.\3\2\2\2\u00cb\u00cc\t\4\2\2\u00cc"+
		"\60\3\2\2\2\u00cd\u00ce\t\5\2\2\u00ce\62\3\2\2\2\u00cf\u00d0\t\6\2\2\u00d0"+
		"\64\3\2\2\2\u00d1\u00d2\t\7\2\2\u00d2\66\3\2\2\2\u00d3\u00d4\t\b\2\2\u00d4"+
		"8\3\2\2\2\u00d5\u00d6\t\t\2\2\u00d6:\3\2\2\2\u00d7\u00d8\t\n\2\2\u00d8"+
		"<\3\2\2\2\u00d9\u00da\t\13\2\2\u00da>\3\2\2\2\u00db\u00dc\t\f\2\2\u00dc"+
		"@\3\2\2\2\u00dd\u00de\t\r\2\2\u00deB\3\2\2\2\u00df\u00e0\t\16\2\2\u00e0"+
		"D\3\2\2\2\u00e1\u00e2\t\17\2\2\u00e2F\3\2\2\2\u00e3\u00e4\t\20\2\2\u00e4"+
		"H\3\2\2\2\u00e5\u00e6\t\21\2\2\u00e6J\3\2\2\2\u00e7\u00e8\t\22\2\2\u00e8"+
		"L\3\2\2\2\u00e9\u00ea\t\23\2\2\u00eaN\3\2\2\2\u00eb\u00ec\t\24\2\2\u00ec"+
		"P\3\2\2\2\u00ed\u00ee\t\25\2\2\u00eeR\3\2\2\2\u00ef\u00f0\t\26\2\2\u00f0"+
		"T\3\2\2\2\u00f1\u00f2\t\27\2\2\u00f2V\3\2\2\2\u00f3\u00f4\t\30\2\2\u00f4"+
		"X\3\2\2\2\u00f5\u00f6\t\31\2\2\u00f6Z\3\2\2\2\u00f7\u00f8\t\32\2\2\u00f8"+
		"\\\3\2\2\2\u00f9\u00fa\t\33\2\2\u00fa^\3\2\2\2\u00fb\u00fc\5I%\2\u00fc"+
		"\u00fd\5M\'\2\u00fd\u00fe\5G$\2\u00fe\u00ff\5\67\34\2\u00ff\u0100\5M\'"+
		"\2\u0100\u0101\5+\26\2\u0101\u0102\5C\"\2\u0102`\3\2\2\2\u0103\u0104\5"+
		"/\30\2\u0104\u0105\5G$\2\u0105\u0106\5E#\2\u0106\u0107\5O(\2\u0107\u0108"+
		"\5Q)\2\u0108b\3\2\2\2\u0109\u010a\5Q)\2\u010a\u010b\5[.\2\u010b\u010c"+
		"\5I%\2\u010c\u010d\5\63\32\2\u010dd\3\2\2\2\u010e\u010f\5G$\2\u010f\u0110"+
		"\5\65\33\2\u0110f\3\2\2\2\u0111\u0112\5U+\2\u0112\u0113\5+\26\2\u0113"+
		"\u0114\5M\'\2\u0114h\3\2\2\2\u0115\u0116\5-\27\2\u0116\u0117\5\63\32\2"+
		"\u0117\u0118\5\67\34\2\u0118\u0119\5;\36\2\u0119\u011a\5E#\2\u011aj\3"+
		"\2\2\2\u011b\u011c\5\63\32\2\u011c\u011d\5E#\2\u011d\u011e\5\61\31\2\u011e"+
		"l\3\2\2\2\u011f\u0120\5\61\31\2\u0120\u0121\5;\36\2\u0121\u0122\5U+\2"+
		"\u0122n\3\2\2\2\u0123\u0124\5+\26\2\u0124\u0125\5E#\2\u0125\u0126\5\61"+
		"\31\2\u0126p\3\2\2\2\u0127\u0128\5G$\2\u0128\u0129\5M\'\2\u0129r\3\2\2"+
		"\2\u012a\u012b\5E#\2\u012b\u012c\5G$\2\u012c\u012d\5Q)\2\u012dt\3\2\2"+
		"\2\u012e\u012f\5;\36\2\u012f\u0130\5\65\33\2\u0130v\3\2\2\2\u0131\u0132"+
		"\5Q)\2\u0132\u0133\59\35\2\u0133\u0134\5\63\32\2\u0134\u0135\5E#\2\u0135"+
		"x\3\2\2\2\u0136\u0137\5\63\32\2\u0137\u0138\5A!\2\u0138\u0139\5O(\2\u0139"+
		"\u013a\5\63\32\2\u013az\3\2\2\2\u013b\u013c\5S*\2\u013c\u013d\5E#\2\u013d"+
		"\u013e\5Q)\2\u013e\u013f\5;\36\2\u013f\u0140\5A!\2\u0140|\3\2\2\2\u0141"+
		"\u0142\5Q)\2\u0142\u0143\5M\'\2\u0143\u0144\5S*\2\u0144\u0145\5\63\32"+
		"\2\u0145~\3\2\2\2\u0146\u0147\5\65\33\2\u0147\u0148\5+\26\2\u0148\u0149"+
		"\5A!\2\u0149\u014a\5O(\2\u014a\u014b\5\63\32\2\u014b\u0080\3\2\2\2\u014c"+
		"\u014d\5\61\31\2\u014d\u014e\5G$\2\u014e\u0082\3\2\2\2\u014f\u0150\5I"+
		"%\2\u0150\u0151\5M\'\2\u0151\u0152\5;\36\2\u0152\u0153\5E#\2\u0153\u0154"+
		"\5Q)\2\u0154\u0155\5A!\2\u0155\u0156\5E#\2\u0156\u0084\3\2\2\2\u0157\u0158"+
		"\5I%\2\u0158\u0159\5M\'\2\u0159\u015a\5G$\2\u015a\u015b\5/\30\2\u015b"+
		"\u015c\5\63\32\2\u015c\u015d\5\61\31\2\u015d\u015e\5S*\2\u015e\u015f\5"+
		"M\'\2\u015f\u0160\5\63\32\2\u0160\u0086\3\2\2\2\u0161\u0162\5\65\33\2"+
		"\u0162\u0163\5S*\2\u0163\u0164\5E#\2\u0164\u0165\5/\30\2\u0165\u0166\5"+
		"Q)\2\u0166\u0167\5;\36\2\u0167\u0168\5G$\2\u0168\u0169\5E#\2\u0169\u0088"+
		"\3\2\2\2\u016a\u016b\5W,\2\u016b\u016c\59\35\2\u016c\u016d\5;\36\2\u016d"+
		"\u016e\5A!\2\u016e\u016f\5\63\32\2\u016f\u008a\3\2\2\2\u0170\u0174\7}"+
		"\2\2\u0171\u0173\5\u008dG\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0177\u0178\7\177\2\2\u0178\u0179\3\2\2\2\u0179\u017a\bF\2\2\u017a"+
		"\u008c\3\2\2\2\u017b\u017c\n\34\2\2\u017c\u008e\3\2\2\2\u017d\u0181\t"+
		"\35\2\2\u017e\u0180\t\36\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0090\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0184\u0186\t\35\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0092\3\2\2\2\u0189\u018b\t\37"+
		"\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u0094\3\2\2\2\u018e\u0190\t\37\2\2\u018f\u018e\3"+
		"\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0196\7\60\2\2\u0195\u0197\t"+
		"\37\2\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u0096\3\2\2\2\u019a\u019c\7\17\2\2\u019b\u019a\3"+
		"\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7\f\2\2\u019e"+
		"\u0098\3\2\2\2\u019f\u01a1\t \2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a5\bM\2\2\u01a5\u009a\3\2\2\2\13\2\u0174\u0181\u0187\u018c\u0191\u0198"+
		"\u019b\u01a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}