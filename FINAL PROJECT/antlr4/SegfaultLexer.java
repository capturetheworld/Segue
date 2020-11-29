// Generated from /Users/tony/CS153/proj-repository/CS153-Compiler-Design/FINAL PROJECT/Segfault.g4 by ANTLR 4.8

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, PROGRAM=17, 
		CONST=18, TYPE=19, OF=20, VAR=21, BEGIN=22, END=23, DIV=24, AND=25, OR=26, 
		NOT=27, IF=28, THEN=29, ELSE=30, UNTIL=31, TRUE=32, FALSE=33, DO=34, PROCEDURE=35, 
		FUNCTION=36, WHILE=37, COMMENT=38, IDENTIFIER=39, LETTER=40, INTEGER=41, 
		DOUBLE=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "A", "B", 
			"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "PROGRAM", "CONST", 
			"TYPE", "OF", "VAR", "BEGIN", "END", "DIV", "AND", "OR", "NOT", "IF", 
			"THEN", "ELSE", "UNTIL", "TRUE", "FALSE", "DO", "PROCEDURE", "FUNCTION", 
			"WHILE", "COMMENT", "COMMENT_CHARACTER", "IDENTIFIER", "LETTER", "INTEGER", 
			"DOUBLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'{'", "'}'", "'$'", "'#'", "'<>'", "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "PROGRAM", "CONST", "TYPE", "OF", "VAR", 
			"BEGIN", "END", "DIV", "AND", "OR", "NOT", "IF", "THEN", "ELSE", "UNTIL", 
			"TRUE", "FALSE", "DO", "PROCEDURE", "FUNCTION", "WHILE", "COMMENT", "IDENTIFIER", 
			"LETTER", "INTEGER", "DOUBLE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u017b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;"+
		"\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\7A\u0154\nA\fA\16"+
		"A\u0157\13A\3A\3A\3A\3A\3B\3B\3C\3C\7C\u0161\nC\fC\16C\u0164\13C\3D\6"+
		"D\u0167\nD\rD\16D\u0168\3E\6E\u016c\nE\rE\16E\u016d\3F\7F\u0171\nF\fF"+
		"\16F\u0174\13F\3F\3F\6F\u0178\nF\rF\16F\u0179\2\2G\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\2\'\2"+
		")\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q"+
		"\2S\2U\2W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#"+
		"y${%}&\177\'\u0081(\u0083\2\u0085)\u0087*\u0089+\u008b,\3\2 \4\2CCcc\4"+
		"\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLl"+
		"l\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2"+
		"UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\177"+
		"\177\4\2C\\c|\5\2\62;C\\c|\3\2\62;\2\u0165\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3"+
		"\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2"+
		"\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0091\3\2\2\2\t\u0093\3\2\2\2\13\u0095"+
		"\3\2\2\2\r\u0097\3\2\2\2\17\u0099\3\2\2\2\21\u009b\3\2\2\2\23\u009e\3"+
		"\2\2\2\25\u00a0\3\2\2\2\27\u00a3\3\2\2\2\31\u00a5\3\2\2\2\33\u00a8\3\2"+
		"\2\2\35\u00aa\3\2\2\2\37\u00ac\3\2\2\2!\u00ae\3\2\2\2#\u00b0\3\2\2\2%"+
		"\u00b2\3\2\2\2\'\u00b4\3\2\2\2)\u00b6\3\2\2\2+\u00b8\3\2\2\2-\u00ba\3"+
		"\2\2\2/\u00bc\3\2\2\2\61\u00be\3\2\2\2\63\u00c0\3\2\2\2\65\u00c2\3\2\2"+
		"\2\67\u00c4\3\2\2\29\u00c6\3\2\2\2;\u00c8\3\2\2\2=\u00ca\3\2\2\2?\u00cc"+
		"\3\2\2\2A\u00ce\3\2\2\2C\u00d0\3\2\2\2E\u00d2\3\2\2\2G\u00d4\3\2\2\2I"+
		"\u00d6\3\2\2\2K\u00d8\3\2\2\2M\u00da\3\2\2\2O\u00dc\3\2\2\2Q\u00de\3\2"+
		"\2\2S\u00e0\3\2\2\2U\u00e2\3\2\2\2W\u00e4\3\2\2\2Y\u00ec\3\2\2\2[\u00f2"+
		"\3\2\2\2]\u00f7\3\2\2\2_\u00fa\3\2\2\2a\u00fe\3\2\2\2c\u0104\3\2\2\2e"+
		"\u0108\3\2\2\2g\u010c\3\2\2\2i\u0110\3\2\2\2k\u0113\3\2\2\2m\u0117\3\2"+
		"\2\2o\u011a\3\2\2\2q\u011f\3\2\2\2s\u0124\3\2\2\2u\u012a\3\2\2\2w\u012f"+
		"\3\2\2\2y\u0135\3\2\2\2{\u0138\3\2\2\2}\u0142\3\2\2\2\177\u014b\3\2\2"+
		"\2\u0081\u0151\3\2\2\2\u0083\u015c\3\2\2\2\u0085\u015e\3\2\2\2\u0087\u0166"+
		"\3\2\2\2\u0089\u016b\3\2\2\2\u008b\u0172\3\2\2\2\u008d\u008e\7?\2\2\u008e"+
		"\4\3\2\2\2\u008f\u0090\7*\2\2\u0090\6\3\2\2\2\u0091\u0092\7+\2\2\u0092"+
		"\b\3\2\2\2\u0093\u0094\7}\2\2\u0094\n\3\2\2\2\u0095\u0096\7\177\2\2\u0096"+
		"\f\3\2\2\2\u0097\u0098\7&\2\2\u0098\16\3\2\2\2\u0099\u009a\7%\2\2\u009a"+
		"\20\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7@\2\2\u009d\22\3\2\2\2\u009e"+
		"\u009f\7>\2\2\u009f\24\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1\u00a2\7?\2\2\u00a2"+
		"\26\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7@\2\2\u00a6"+
		"\u00a7\7?\2\2\u00a7\32\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\34\3\2\2\2\u00aa"+
		"\u00ab\7/\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\7,\2\2\u00ad \3\2\2\2\u00ae"+
		"\u00af\7\61\2\2\u00af\"\3\2\2\2\u00b0\u00b1\t\2\2\2\u00b1$\3\2\2\2\u00b2"+
		"\u00b3\t\3\2\2\u00b3&\3\2\2\2\u00b4\u00b5\t\4\2\2\u00b5(\3\2\2\2\u00b6"+
		"\u00b7\t\5\2\2\u00b7*\3\2\2\2\u00b8\u00b9\t\6\2\2\u00b9,\3\2\2\2\u00ba"+
		"\u00bb\t\7\2\2\u00bb.\3\2\2\2\u00bc\u00bd\t\b\2\2\u00bd\60\3\2\2\2\u00be"+
		"\u00bf\t\t\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\t\n\2\2\u00c1\64\3\2\2\2\u00c2"+
		"\u00c3\t\13\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\t\f\2\2\u00c58\3\2\2\2\u00c6"+
		"\u00c7\t\r\2\2\u00c7:\3\2\2\2\u00c8\u00c9\t\16\2\2\u00c9<\3\2\2\2\u00ca"+
		"\u00cb\t\17\2\2\u00cb>\3\2\2\2\u00cc\u00cd\t\20\2\2\u00cd@\3\2\2\2\u00ce"+
		"\u00cf\t\21\2\2\u00cfB\3\2\2\2\u00d0\u00d1\t\22\2\2\u00d1D\3\2\2\2\u00d2"+
		"\u00d3\t\23\2\2\u00d3F\3\2\2\2\u00d4\u00d5\t\24\2\2\u00d5H\3\2\2\2\u00d6"+
		"\u00d7\t\25\2\2\u00d7J\3\2\2\2\u00d8\u00d9\t\26\2\2\u00d9L\3\2\2\2\u00da"+
		"\u00db\t\27\2\2\u00dbN\3\2\2\2\u00dc\u00dd\t\30\2\2\u00ddP\3\2\2\2\u00de"+
		"\u00df\t\31\2\2\u00dfR\3\2\2\2\u00e0\u00e1\t\32\2\2\u00e1T\3\2\2\2\u00e2"+
		"\u00e3\t\33\2\2\u00e3V\3\2\2\2\u00e4\u00e5\5A!\2\u00e5\u00e6\5E#\2\u00e6"+
		"\u00e7\5? \2\u00e7\u00e8\5/\30\2\u00e8\u00e9\5E#\2\u00e9\u00ea\5#\22\2"+
		"\u00ea\u00eb\5;\36\2\u00ebX\3\2\2\2\u00ec\u00ed\5\'\24\2\u00ed\u00ee\5"+
		"? \2\u00ee\u00ef\5=\37\2\u00ef\u00f0\5G$\2\u00f0\u00f1\5I%\2\u00f1Z\3"+
		"\2\2\2\u00f2\u00f3\5I%\2\u00f3\u00f4\5S*\2\u00f4\u00f5\5A!\2\u00f5\u00f6"+
		"\5+\26\2\u00f6\\\3\2\2\2\u00f7\u00f8\5? \2\u00f8\u00f9\5-\27\2\u00f9^"+
		"\3\2\2\2\u00fa\u00fb\5M\'\2\u00fb\u00fc\5#\22\2\u00fc\u00fd\5E#\2\u00fd"+
		"`\3\2\2\2\u00fe\u00ff\5%\23\2\u00ff\u0100\5+\26\2\u0100\u0101\5/\30\2"+
		"\u0101\u0102\5\63\32\2\u0102\u0103\5=\37\2\u0103b\3\2\2\2\u0104\u0105"+
		"\5+\26\2\u0105\u0106\5=\37\2\u0106\u0107\5)\25\2\u0107d\3\2\2\2\u0108"+
		"\u0109\5)\25\2\u0109\u010a\5\63\32\2\u010a\u010b\5M\'\2\u010bf\3\2\2\2"+
		"\u010c\u010d\5#\22\2\u010d\u010e\5=\37\2\u010e\u010f\5)\25\2\u010fh\3"+
		"\2\2\2\u0110\u0111\5? \2\u0111\u0112\5E#\2\u0112j\3\2\2\2\u0113\u0114"+
		"\5=\37\2\u0114\u0115\5? \2\u0115\u0116\5I%\2\u0116l\3\2\2\2\u0117\u0118"+
		"\5\63\32\2\u0118\u0119\5-\27\2\u0119n\3\2\2\2\u011a\u011b\5I%\2\u011b"+
		"\u011c\5\61\31\2\u011c\u011d\5+\26\2\u011d\u011e\5=\37\2\u011ep\3\2\2"+
		"\2\u011f\u0120\5+\26\2\u0120\u0121\59\35\2\u0121\u0122\5G$\2\u0122\u0123"+
		"\5+\26\2\u0123r\3\2\2\2\u0124\u0125\5K&\2\u0125\u0126\5=\37\2\u0126\u0127"+
		"\5I%\2\u0127\u0128\5\63\32\2\u0128\u0129\59\35\2\u0129t\3\2\2\2\u012a"+
		"\u012b\5I%\2\u012b\u012c\5E#\2\u012c\u012d\5K&\2\u012d\u012e\5+\26\2\u012e"+
		"v\3\2\2\2\u012f\u0130\5-\27\2\u0130\u0131\5#\22\2\u0131\u0132\59\35\2"+
		"\u0132\u0133\5G$\2\u0133\u0134\5+\26\2\u0134x\3\2\2\2\u0135\u0136\5)\25"+
		"\2\u0136\u0137\5? \2\u0137z\3\2\2\2\u0138\u0139\5A!\2\u0139\u013a\5E#"+
		"\2\u013a\u013b\5? \2\u013b\u013c\5\'\24\2\u013c\u013d\5+\26\2\u013d\u013e"+
		"\5)\25\2\u013e\u013f\5K&\2\u013f\u0140\5E#\2\u0140\u0141\5+\26\2\u0141"+
		"|\3\2\2\2\u0142\u0143\5-\27\2\u0143\u0144\5K&\2\u0144\u0145\5=\37\2\u0145"+
		"\u0146\5\'\24\2\u0146\u0147\5I%\2\u0147\u0148\5\63\32\2\u0148\u0149\5"+
		"? \2\u0149\u014a\5=\37\2\u014a~\3\2\2\2\u014b\u014c\5O(\2\u014c\u014d"+
		"\5\61\31\2\u014d\u014e\5\63\32\2\u014e\u014f\59\35\2\u014f\u0150\5+\26"+
		"\2\u0150\u0080\3\2\2\2\u0151\u0155\7}\2\2\u0152\u0154\5\u0083B\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\177\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\bA\2\2\u015b\u0082\3\2\2\2\u015c\u015d\n\34"+
		"\2\2\u015d\u0084\3\2\2\2\u015e\u0162\t\35\2\2\u015f\u0161\t\36\2\2\u0160"+
		"\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0086\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\t\35\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u0088\3\2\2\2\u016a\u016c\t\37\2\2\u016b\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u008a\3\2"+
		"\2\2\u016f\u0171\t\37\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0175\u0177\7\60\2\2\u0176\u0178\t\37\2\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u008c\3\2"+
		"\2\2\t\2\u0155\u0162\u0168\u016d\u0172\u0179\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}