// Generated from /Users/ian/Documents/GitHub/CS153-Compiler-Design/FINAL PROJECT/Segfault.g4 by ANTLR 4.8

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, STARTPGM=17, 
		ENDPGM=18, PROGRAM=19, CONST=20, TYPE=21, OF=22, VAR=23, BEGIN=24, END=25, 
		DIV=26, AND=27, OR=28, NOT=29, THEN=30, UNTIL=31, DO=32, PROCEDURE=33, 
		FUNCTION=34, WHILE=35, IDENTIFIER=36, DOUBLE=37, COMMENT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "STARTPGM", 
			"ENDPGM", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
			"PROGRAM", "CONST", "TYPE", "OF", "VAR", "BEGIN", "END", "DIV", "AND", 
			"OR", "NOT", "THEN", "UNTIL", "DO", "PROCEDURE", "FUNCTION", "WHILE", 
			"IDENTIFIER", "DOUBLE", "COMMENT", "COMMENT_CHARACTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "':='", "'$'", "'='", "'<>'", "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "STARTPGM", "ENDPGM", "PROGRAM", "CONST", 
			"TYPE", "OF", "VAR", "BEGIN", "END", "DIV", "AND", "OR", "NOT", "THEN", 
			"UNTIL", "DO", "PROCEDURE", "FUNCTION", "WHILE", "IDENTIFIER", "DOUBLE", 
			"COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0154\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38"+
		"\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\7?\u013e\n?"+
		"\f?\16?\u0141\13?\3@\6@\u0144\n@\r@\16@\u0145\3A\3A\7A\u014a\nA\fA\16"+
		"A\u014d\13A\3A\3A\3A\3A\3B\3B\2\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\2-\2/\2\61"+
		"\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2["+
		"\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081"+
		"(\u0083\2\3\2 \4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIi"+
		"i\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\4\2C\\c|\5\2\62;C\\c|\4\2\60\60\62;\3\2\177\177\2\u013b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0085\3\2\2\2\5\u0087\3\2\2\2\7\u0089"+
		"\3\2\2\2\t\u008b\3\2\2\2\13\u008d\3\2\2\2\r\u0090\3\2\2\2\17\u0092\3\2"+
		"\2\2\21\u0094\3\2\2\2\23\u0097\3\2\2\2\25\u0099\3\2\2\2\27\u009c\3\2\2"+
		"\2\31\u009e\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2\37\u00a5\3\2\2\2"+
		"!\u00a7\3\2\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3"+
		"\2\2\2+\u00b1\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61\u00b7\3\2\2\2\63"+
		"\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00bf\3\2\2\2;\u00c1"+
		"\3\2\2\2=\u00c3\3\2\2\2?\u00c5\3\2\2\2A\u00c7\3\2\2\2C\u00c9\3\2\2\2E"+
		"\u00cb\3\2\2\2G\u00cd\3\2\2\2I\u00cf\3\2\2\2K\u00d1\3\2\2\2M\u00d3\3\2"+
		"\2\2O\u00d5\3\2\2\2Q\u00d7\3\2\2\2S\u00d9\3\2\2\2U\u00db\3\2\2\2W\u00dd"+
		"\3\2\2\2Y\u00df\3\2\2\2[\u00e1\3\2\2\2]\u00e9\3\2\2\2_\u00ef\3\2\2\2a"+
		"\u00f4\3\2\2\2c\u00f7\3\2\2\2e\u00fb\3\2\2\2g\u0101\3\2\2\2i\u0105\3\2"+
		"\2\2k\u0109\3\2\2\2m\u010d\3\2\2\2o\u0110\3\2\2\2q\u0114\3\2\2\2s\u0119"+
		"\3\2\2\2u\u011f\3\2\2\2w\u0122\3\2\2\2y\u012c\3\2\2\2{\u0135\3\2\2\2}"+
		"\u013b\3\2\2\2\177\u0143\3\2\2\2\u0081\u0147\3\2\2\2\u0083\u0152\3\2\2"+
		"\2\u0085\u0086\7=\2\2\u0086\4\3\2\2\2\u0087\u0088\7*\2\2\u0088\6\3\2\2"+
		"\2\u0089\u008a\7.\2\2\u008a\b\3\2\2\2\u008b\u008c\7+\2\2\u008c\n\3\2\2"+
		"\2\u008d\u008e\7<\2\2\u008e\u008f\7?\2\2\u008f\f\3\2\2\2\u0090\u0091\7"+
		"&\2\2\u0091\16\3\2\2\2\u0092\u0093\7?\2\2\u0093\20\3\2\2\2\u0094\u0095"+
		"\7>\2\2\u0095\u0096\7@\2\2\u0096\22\3\2\2\2\u0097\u0098\7>\2\2\u0098\24"+
		"\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7?\2\2\u009b\26\3\2\2\2\u009c"+
		"\u009d\7@\2\2\u009d\30\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0"+
		"\32\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4"+
		"\36\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8"+
		"\"\3\2\2\2\u00a9\u00aa\7}\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7\177\2\2\u00ac"+
		"&\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae(\3\2\2\2\u00af\u00b0\t\3\2\2\u00b0"+
		"*\3\2\2\2\u00b1\u00b2\t\4\2\2\u00b2,\3\2\2\2\u00b3\u00b4\t\5\2\2\u00b4"+
		".\3\2\2\2\u00b5\u00b6\t\6\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\t\7\2\2\u00b8"+
		"\62\3\2\2\2\u00b9\u00ba\t\b\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\t\t\2\2\u00bc"+
		"\66\3\2\2\2\u00bd\u00be\t\n\2\2\u00be8\3\2\2\2\u00bf\u00c0\t\13\2\2\u00c0"+
		":\3\2\2\2\u00c1\u00c2\t\f\2\2\u00c2<\3\2\2\2\u00c3\u00c4\t\r\2\2\u00c4"+
		">\3\2\2\2\u00c5\u00c6\t\16\2\2\u00c6@\3\2\2\2\u00c7\u00c8\t\17\2\2\u00c8"+
		"B\3\2\2\2\u00c9\u00ca\t\20\2\2\u00caD\3\2\2\2\u00cb\u00cc\t\21\2\2\u00cc"+
		"F\3\2\2\2\u00cd\u00ce\t\22\2\2\u00ceH\3\2\2\2\u00cf\u00d0\t\23\2\2\u00d0"+
		"J\3\2\2\2\u00d1\u00d2\t\24\2\2\u00d2L\3\2\2\2\u00d3\u00d4\t\25\2\2\u00d4"+
		"N\3\2\2\2\u00d5\u00d6\t\26\2\2\u00d6P\3\2\2\2\u00d7\u00d8\t\27\2\2\u00d8"+
		"R\3\2\2\2\u00d9\u00da\t\30\2\2\u00daT\3\2\2\2\u00db\u00dc\t\31\2\2\u00dc"+
		"V\3\2\2\2\u00dd\u00de\t\32\2\2\u00deX\3\2\2\2\u00df\u00e0\t\33\2\2\u00e0"+
		"Z\3\2\2\2\u00e1\u00e2\5E#\2\u00e2\u00e3\5I%\2\u00e3\u00e4\5C\"\2\u00e4"+
		"\u00e5\5\63\32\2\u00e5\u00e6\5I%\2\u00e6\u00e7\5\'\24\2\u00e7\u00e8\5"+
		"? \2\u00e8\\\3\2\2\2\u00e9\u00ea\5+\26\2\u00ea\u00eb\5C\"\2\u00eb\u00ec"+
		"\5A!\2\u00ec\u00ed\5K&\2\u00ed\u00ee\5M\'\2\u00ee^\3\2\2\2\u00ef\u00f0"+
		"\5M\'\2\u00f0\u00f1\5W,\2\u00f1\u00f2\5E#\2\u00f2\u00f3\5/\30\2\u00f3"+
		"`\3\2\2\2\u00f4\u00f5\5C\"\2\u00f5\u00f6\5\61\31\2\u00f6b\3\2\2\2\u00f7"+
		"\u00f8\5Q)\2\u00f8\u00f9\5\'\24\2\u00f9\u00fa\5I%\2\u00fad\3\2\2\2\u00fb"+
		"\u00fc\5)\25\2\u00fc\u00fd\5/\30\2\u00fd\u00fe\5\63\32\2\u00fe\u00ff\5"+
		"\67\34\2\u00ff\u0100\5A!\2\u0100f\3\2\2\2\u0101\u0102\5/\30\2\u0102\u0103"+
		"\5A!\2\u0103\u0104\5-\27\2\u0104h\3\2\2\2\u0105\u0106\5-\27\2\u0106\u0107"+
		"\5\67\34\2\u0107\u0108\5Q)\2\u0108j\3\2\2\2\u0109\u010a\5\'\24\2\u010a"+
		"\u010b\5A!\2\u010b\u010c\5-\27\2\u010cl\3\2\2\2\u010d\u010e\5C\"\2\u010e"+
		"\u010f\5I%\2\u010fn\3\2\2\2\u0110\u0111\5A!\2\u0111\u0112\5C\"\2\u0112"+
		"\u0113\5M\'\2\u0113p\3\2\2\2\u0114\u0115\5M\'\2\u0115\u0116\5\65\33\2"+
		"\u0116\u0117\5/\30\2\u0117\u0118\5A!\2\u0118r\3\2\2\2\u0119\u011a\5O("+
		"\2\u011a\u011b\5A!\2\u011b\u011c\5M\'\2\u011c\u011d\5\67\34\2\u011d\u011e"+
		"\5=\37\2\u011et\3\2\2\2\u011f\u0120\5-\27\2\u0120\u0121\5C\"\2\u0121v"+
		"\3\2\2\2\u0122\u0123\5E#\2\u0123\u0124\5I%\2\u0124\u0125\5C\"\2\u0125"+
		"\u0126\5+\26\2\u0126\u0127\5/\30\2\u0127\u0128\5-\27\2\u0128\u0129\5O"+
		"(\2\u0129\u012a\5I%\2\u012a\u012b\5/\30\2\u012bx\3\2\2\2\u012c\u012d\5"+
		"\61\31\2\u012d\u012e\5O(\2\u012e\u012f\5A!\2\u012f\u0130\5+\26\2\u0130"+
		"\u0131\5M\'\2\u0131\u0132\5\67\34\2\u0132\u0133\5C\"\2\u0133\u0134\5A"+
		"!\2\u0134z\3\2\2\2\u0135\u0136\5S*\2\u0136\u0137\5\65\33\2\u0137\u0138"+
		"\5\67\34\2\u0138\u0139\5=\37\2\u0139\u013a\5/\30\2\u013a|\3\2\2\2\u013b"+
		"\u013f\t\34\2\2\u013c\u013e\t\35\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3"+
		"\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140~\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0142\u0144\t\36\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2"+
		"\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0080\3\2\2\2\u0147\u014b"+
		"\7}\2\2\u0148\u014a\5\u0083B\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014e\u014f\7\177\2\2\u014f\u0150\3\2\2\2\u0150\u0151\bA\2\2"+
		"\u0151\u0082\3\2\2\2\u0152\u0153\n\37\2\2\u0153\u0084\3\2\2\2\6\2\u013f"+
		"\u0145\u014b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}