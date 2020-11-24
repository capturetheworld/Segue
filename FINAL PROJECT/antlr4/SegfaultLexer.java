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
		T__9=10, T__10=11, T__11=12, IDENTIFIER=13, LETTER=14, INTEGER=15, DOUBLE=16, 
		BOOLEAN=17, PROGRAM=18, CONST=19, TYPE=20, OF=21, VAR=22, BEGIN=23, END=24, 
		DIV=25, AND=26, OR=27, NOT=28, THEN=29, UNTIL=30, DO=31, PROCEDURE=32, 
		FUNCTION=33, WHILE=34, COMMENT=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "IDENTIFIER", "LETTER", "INTEGER", "DOUBLE", 
			"BOOLEAN", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
			"PROGRAM", "CONST", "TYPE", "OF", "VAR", "BEGIN", "END", "DIV", "AND", 
			"OR", "NOT", "THEN", "UNTIL", "DO", "PROCEDURE", "FUNCTION", "WHILE", 
			"COMMENT", "COMMENT_CHARACTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'$'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", 
			"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IDENTIFIER", "LETTER", "INTEGER", "DOUBLE", "BOOLEAN", "PROGRAM", 
			"CONST", "TYPE", "OF", "VAR", "BEGIN", "END", "DIV", "AND", "OR", "NOT", 
			"THEN", "UNTIL", "DO", "PROCEDURE", "FUNCTION", "WHILE", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u014f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\7\16"+
		"\u009e\n\16\f\16\16\16\u00a1\13\16\3\17\7\17\u00a4\n\17\f\17\16\17\u00a7"+
		"\13\17\3\20\6\20\u00aa\n\20\r\20\16\20\u00ab\3\21\6\21\u00af\n\21\r\21"+
		"\16\21\u00b0\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\3:"+
		"\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3="+
		"\3=\3=\3=\3=\3>\3>\7>\u0145\n>\f>\16>\u0148\13>\3>\3>\3>\3>\3?\3?\2\2"+
		"@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C"+
		"\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\24[\25]\26_\27a\30c\31e\32g\33i\34k"+
		"\35m\36o\37q s!u\"w#y${%}\2\3\2\"\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\60"+
		"\60\62;\7\2ccghnntw~~\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh"+
		"\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2Q"+
		"Qqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\3\2\177\177\2\u0138\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3\177\3\2\2\2\5\u0082\3\2\2\2\7"+
		"\u0084\3\2\2\2\t\u0086\3\2\2\2\13\u0089\3\2\2\2\r\u008b\3\2\2\2\17\u008e"+
		"\3\2\2\2\21\u0090\3\2\2\2\23\u0093\3\2\2\2\25\u0095\3\2\2\2\27\u0097\3"+
		"\2\2\2\31\u0099\3\2\2\2\33\u009b\3\2\2\2\35\u00a5\3\2\2\2\37\u00a9\3\2"+
		"\2\2!\u00ae\3\2\2\2#\u00b2\3\2\2\2%\u00b4\3\2\2\2\'\u00b6\3\2\2\2)\u00b8"+
		"\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2\2\2\61\u00c0\3\2\2\2"+
		"\63\u00c2\3\2\2\2\65\u00c4\3\2\2\2\67\u00c6\3\2\2\29\u00c8\3\2\2\2;\u00ca"+
		"\3\2\2\2=\u00cc\3\2\2\2?\u00ce\3\2\2\2A\u00d0\3\2\2\2C\u00d2\3\2\2\2E"+
		"\u00d4\3\2\2\2G\u00d6\3\2\2\2I\u00d8\3\2\2\2K\u00da\3\2\2\2M\u00dc\3\2"+
		"\2\2O\u00de\3\2\2\2Q\u00e0\3\2\2\2S\u00e2\3\2\2\2U\u00e4\3\2\2\2W\u00e6"+
		"\3\2\2\2Y\u00e8\3\2\2\2[\u00f0\3\2\2\2]\u00f6\3\2\2\2_\u00fb\3\2\2\2a"+
		"\u00fe\3\2\2\2c\u0102\3\2\2\2e\u0108\3\2\2\2g\u010c\3\2\2\2i\u0110\3\2"+
		"\2\2k\u0114\3\2\2\2m\u0117\3\2\2\2o\u011b\3\2\2\2q\u0120\3\2\2\2s\u0126"+
		"\3\2\2\2u\u0129\3\2\2\2w\u0133\3\2\2\2y\u013c\3\2\2\2{\u0142\3\2\2\2}"+
		"\u014d\3\2\2\2\177\u0080\7<\2\2\u0080\u0081\7?\2\2\u0081\4\3\2\2\2\u0082"+
		"\u0083\7&\2\2\u0083\6\3\2\2\2\u0084\u0085\7?\2\2\u0085\b\3\2\2\2\u0086"+
		"\u0087\7>\2\2\u0087\u0088\7@\2\2\u0088\n\3\2\2\2\u0089\u008a\7>\2\2\u008a"+
		"\f\3\2\2\2\u008b\u008c\7>\2\2\u008c\u008d\7?\2\2\u008d\16\3\2\2\2\u008e"+
		"\u008f\7@\2\2\u008f\20\3\2\2\2\u0090\u0091\7@\2\2\u0091\u0092\7?\2\2\u0092"+
		"\22\3\2\2\2\u0093\u0094\7-\2\2\u0094\24\3\2\2\2\u0095\u0096\7/\2\2\u0096"+
		"\26\3\2\2\2\u0097\u0098\7,\2\2\u0098\30\3\2\2\2\u0099\u009a\7\61\2\2\u009a"+
		"\32\3\2\2\2\u009b\u009f\t\2\2\2\u009c\u009e\t\3\2\2\u009d\u009c\3\2\2"+
		"\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\34"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\36\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\t\4\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac \3\2\2\2\u00ad"+
		"\u00af\t\5\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\t\6\2\2\u00b3$\3"+
		"\2\2\2\u00b4\u00b5\t\7\2\2\u00b5&\3\2\2\2\u00b6\u00b7\t\b\2\2\u00b7(\3"+
		"\2\2\2\u00b8\u00b9\t\t\2\2\u00b9*\3\2\2\2\u00ba\u00bb\t\n\2\2\u00bb,\3"+
		"\2\2\2\u00bc\u00bd\t\13\2\2\u00bd.\3\2\2\2\u00be\u00bf\t\f\2\2\u00bf\60"+
		"\3\2\2\2\u00c0\u00c1\t\r\2\2\u00c1\62\3\2\2\2\u00c2\u00c3\t\16\2\2\u00c3"+
		"\64\3\2\2\2\u00c4\u00c5\t\17\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\t\20\2\2"+
		"\u00c78\3\2\2\2\u00c8\u00c9\t\21\2\2\u00c9:\3\2\2\2\u00ca\u00cb\t\22\2"+
		"\2\u00cb<\3\2\2\2\u00cc\u00cd\t\23\2\2\u00cd>\3\2\2\2\u00ce\u00cf\t\24"+
		"\2\2\u00cf@\3\2\2\2\u00d0\u00d1\t\25\2\2\u00d1B\3\2\2\2\u00d2\u00d3\t"+
		"\26\2\2\u00d3D\3\2\2\2\u00d4\u00d5\t\27\2\2\u00d5F\3\2\2\2\u00d6\u00d7"+
		"\t\30\2\2\u00d7H\3\2\2\2\u00d8\u00d9\t\31\2\2\u00d9J\3\2\2\2\u00da\u00db"+
		"\t\32\2\2\u00dbL\3\2\2\2\u00dc\u00dd\t\33\2\2\u00ddN\3\2\2\2\u00de\u00df"+
		"\t\34\2\2\u00dfP\3\2\2\2\u00e0\u00e1\t\35\2\2\u00e1R\3\2\2\2\u00e2\u00e3"+
		"\t\36\2\2\u00e3T\3\2\2\2\u00e4\u00e5\t\37\2\2\u00e5V\3\2\2\2\u00e6\u00e7"+
		"\t \2\2\u00e7X\3\2\2\2\u00e8\u00e9\5C\"\2\u00e9\u00ea\5G$\2\u00ea\u00eb"+
		"\5A!\2\u00eb\u00ec\5\61\31\2\u00ec\u00ed\5G$\2\u00ed\u00ee\5%\23\2\u00ee"+
		"\u00ef\5=\37\2\u00efZ\3\2\2\2\u00f0\u00f1\5)\25\2\u00f1\u00f2\5A!\2\u00f2"+
		"\u00f3\5? \2\u00f3\u00f4\5I%\2\u00f4\u00f5\5K&\2\u00f5\\\3\2\2\2\u00f6"+
		"\u00f7\5K&\2\u00f7\u00f8\5U+\2\u00f8\u00f9\5C\"\2\u00f9\u00fa\5-\27\2"+
		"\u00fa^\3\2\2\2\u00fb\u00fc\5A!\2\u00fc\u00fd\5/\30\2\u00fd`\3\2\2\2\u00fe"+
		"\u00ff\5O(\2\u00ff\u0100\5%\23\2\u0100\u0101\5G$\2\u0101b\3\2\2\2\u0102"+
		"\u0103\5\'\24\2\u0103\u0104\5-\27\2\u0104\u0105\5\61\31\2\u0105\u0106"+
		"\5\65\33\2\u0106\u0107\5? \2\u0107d\3\2\2\2\u0108\u0109\5-\27\2\u0109"+
		"\u010a\5? \2\u010a\u010b\5+\26\2\u010bf\3\2\2\2\u010c\u010d\5+\26\2\u010d"+
		"\u010e\5\65\33\2\u010e\u010f\5O(\2\u010fh\3\2\2\2\u0110\u0111\5%\23\2"+
		"\u0111\u0112\5? \2\u0112\u0113\5+\26\2\u0113j\3\2\2\2\u0114\u0115\5A!"+
		"\2\u0115\u0116\5G$\2\u0116l\3\2\2\2\u0117\u0118\5? \2\u0118\u0119\5A!"+
		"\2\u0119\u011a\5K&\2\u011an\3\2\2\2\u011b\u011c\5K&\2\u011c\u011d\5\63"+
		"\32\2\u011d\u011e\5-\27\2\u011e\u011f\5? \2\u011fp\3\2\2\2\u0120\u0121"+
		"\5M\'\2\u0121\u0122\5? \2\u0122\u0123\5K&\2\u0123\u0124\5\65\33\2\u0124"+
		"\u0125\5;\36\2\u0125r\3\2\2\2\u0126\u0127\5+\26\2\u0127\u0128\5A!\2\u0128"+
		"t\3\2\2\2\u0129\u012a\5C\"\2\u012a\u012b\5G$\2\u012b\u012c\5A!\2\u012c"+
		"\u012d\5)\25\2\u012d\u012e\5-\27\2\u012e\u012f\5+\26\2\u012f\u0130\5M"+
		"\'\2\u0130\u0131\5G$\2\u0131\u0132\5-\27\2\u0132v\3\2\2\2\u0133\u0134"+
		"\5/\30\2\u0134\u0135\5M\'\2\u0135\u0136\5? \2\u0136\u0137\5)\25\2\u0137"+
		"\u0138\5K&\2\u0138\u0139\5\65\33\2\u0139\u013a\5A!\2\u013a\u013b\5? \2"+
		"\u013bx\3\2\2\2\u013c\u013d\5Q)\2\u013d\u013e\5\63\32\2\u013e\u013f\5"+
		"\65\33\2\u013f\u0140\5;\36\2\u0140\u0141\5-\27\2\u0141z\3\2\2\2\u0142"+
		"\u0146\7}\2\2\u0143\u0145\5}?\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2"+
		"\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0149\u014a\7\177\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b>\2\2"+
		"\u014c|\3\2\2\2\u014d\u014e\n!\2\2\u014e~\3\2\2\2\b\2\u009f\u00a5\u00ab"+
		"\u00b0\u0146\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}