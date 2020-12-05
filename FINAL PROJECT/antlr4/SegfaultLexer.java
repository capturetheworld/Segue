// Generated from /Users/ian/Documents/Github/CS153-Compiler-Design/FINAL PROJECT/Segfault.g4 by ANTLR 4.8

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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		IF=32, THEN=33, ELSE=34, TRUE=35, FALSE=36, PRINT=37, WHILE=38, SYNTH=39, 
		SET=40, CHANNEL=41, NOTE=42, LERP=43, START=44, COMMENT=45, IDENTIFIER=46, 
		LETTER=47, INTEGER=48, DOUBLE=49, BR=50, WS=51;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "A", "B", "C", 
			"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "IF", "THEN", "ELSE", "TRUE", 
			"FALSE", "PRINT", "WHILE", "SYNTH", "SET", "CHANNEL", "NOTE", "LERP", 
			"START", "COMMENT", "COMMENT_CHARACTER", "IDENTIFIER", "LETTER", "INTEGER", 
			"DOUBLE", "BR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'='", "'.'", "'@'", "','", "'++'", 
			"'--'", "'#'", "'!'", "'$'", "'['", "']'", "'m'", "'v'", "'a'", "'f'", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&'", "'|'", "'+'", "'-'", 
			"'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IF", "THEN", "ELSE", 
			"TRUE", "FALSE", "PRINT", "WHILE", "SYNTH", "SET", "CHANNEL", "NOTE", 
			"LERP", "START", "COMMENT", "IDENTIFIER", "LETTER", "INTEGER", "DOUBLE", 
			"BR", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0191\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3"+
		"<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3"+
		"@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\7H\u0160"+
		"\nH\fH\16H\u0163\13H\3H\3H\3I\3I\3J\3J\7J\u016b\nJ\fJ\16J\u016e\13J\3"+
		"K\6K\u0171\nK\rK\16K\u0172\3L\6L\u0176\nL\rL\16L\u0177\3M\7M\u017b\nM"+
		"\fM\16M\u017e\13M\3M\3M\6M\u0182\nM\rM\16M\u0183\3N\6N\u0187\nN\rN\16"+
		"N\u0188\3O\6O\u018c\nO\rO\16O\u018d\3O\3O\2\2P\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C\2E\2G\2I\2K\2"+
		"M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\"w#y${%"+
		"}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091"+
		"\2\u0093\60\u0095\61\u0097\62\u0099\63\u009b\64\u009d\65\3\2!\4\2CCcc"+
		"\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2L"+
		"Lll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2\f"+
		"\f\17\17\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\13\13\"\"\2\u017d\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\3\u009f\3\2\2\2\5\u00a1\3\2\2\2\7\u00a3\3\2\2"+
		"\2\t\u00a5\3\2\2\2\13\u00a7\3\2\2\2\r\u00a9\3\2\2\2\17\u00ab\3\2\2\2\21"+
		"\u00ad\3\2\2\2\23\u00af\3\2\2\2\25\u00b2\3\2\2\2\27\u00b5\3\2\2\2\31\u00b7"+
		"\3\2\2\2\33\u00b9\3\2\2\2\35\u00bb\3\2\2\2\37\u00bd\3\2\2\2!\u00bf\3\2"+
		"\2\2#\u00c1\3\2\2\2%\u00c3\3\2\2\2\'\u00c5\3\2\2\2)\u00c7\3\2\2\2+\u00ca"+
		"\3\2\2\2-\u00cd\3\2\2\2/\u00cf\3\2\2\2\61\u00d2\3\2\2\2\63\u00d4\3\2\2"+
		"\2\65\u00d7\3\2\2\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u00dd\3\2\2\2=\u00df"+
		"\3\2\2\2?\u00e1\3\2\2\2A\u00e3\3\2\2\2C\u00e5\3\2\2\2E\u00e7\3\2\2\2G"+
		"\u00e9\3\2\2\2I\u00eb\3\2\2\2K\u00ed\3\2\2\2M\u00ef\3\2\2\2O\u00f1\3\2"+
		"\2\2Q\u00f3\3\2\2\2S\u00f5\3\2\2\2U\u00f7\3\2\2\2W\u00f9\3\2\2\2Y\u00fb"+
		"\3\2\2\2[\u00fd\3\2\2\2]\u00ff\3\2\2\2_\u0101\3\2\2\2a\u0103\3\2\2\2c"+
		"\u0105\3\2\2\2e\u0107\3\2\2\2g\u0109\3\2\2\2i\u010b\3\2\2\2k\u010d\3\2"+
		"\2\2m\u010f\3\2\2\2o\u0111\3\2\2\2q\u0113\3\2\2\2s\u0115\3\2\2\2u\u0117"+
		"\3\2\2\2w\u011a\3\2\2\2y\u011f\3\2\2\2{\u0124\3\2\2\2}\u0129\3\2\2\2\177"+
		"\u012f\3\2\2\2\u0081\u0135\3\2\2\2\u0083\u013b\3\2\2\2\u0085\u0141\3\2"+
		"\2\2\u0087\u0145\3\2\2\2\u0089\u014d\3\2\2\2\u008b\u0152\3\2\2\2\u008d"+
		"\u0157\3\2\2\2\u008f\u015d\3\2\2\2\u0091\u0166\3\2\2\2\u0093\u0168\3\2"+
		"\2\2\u0095\u0170\3\2\2\2\u0097\u0175\3\2\2\2\u0099\u017c\3\2\2\2\u009b"+
		"\u0186\3\2\2\2\u009d\u018b\3\2\2\2\u009f\u00a0\7*\2\2\u00a0\4\3\2\2\2"+
		"\u00a1\u00a2\7+\2\2\u00a2\6\3\2\2\2\u00a3\u00a4\7}\2\2\u00a4\b\3\2\2\2"+
		"\u00a5\u00a6\7\177\2\2\u00a6\n\3\2\2\2\u00a7\u00a8\7?\2\2\u00a8\f\3\2"+
		"\2\2\u00a9\u00aa\7\60\2\2\u00aa\16\3\2\2\2\u00ab\u00ac\7B\2\2\u00ac\20"+
		"\3\2\2\2\u00ad\u00ae\7.\2\2\u00ae\22\3\2\2\2\u00af\u00b0\7-\2\2\u00b0"+
		"\u00b1\7-\2\2\u00b1\24\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b4\7/\2\2\u00b4"+
		"\26\3\2\2\2\u00b5\u00b6\7%\2\2\u00b6\30\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8"+
		"\32\3\2\2\2\u00b9\u00ba\7&\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7]\2\2\u00bc"+
		"\36\3\2\2\2\u00bd\u00be\7_\2\2\u00be \3\2\2\2\u00bf\u00c0\7o\2\2\u00c0"+
		"\"\3\2\2\2\u00c1\u00c2\7x\2\2\u00c2$\3\2\2\2\u00c3\u00c4\7c\2\2\u00c4"+
		"&\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6(\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8\u00c9"+
		"\7?\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\7?\2\2\u00cc,\3"+
		"\2\2\2\u00cd\u00ce\7>\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0\u00d1"+
		"\7?\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7@\2\2\u00d3\62\3\2\2\2\u00d4\u00d5"+
		"\7@\2\2\u00d5\u00d6\7?\2\2\u00d6\64\3\2\2\2\u00d7\u00d8\7(\2\2\u00d8\66"+
		"\3\2\2\2\u00d9\u00da\7~\2\2\u00da8\3\2\2\2\u00db\u00dc\7-\2\2\u00dc:\3"+
		"\2\2\2\u00dd\u00de\7/\2\2\u00de<\3\2\2\2\u00df\u00e0\7,\2\2\u00e0>\3\2"+
		"\2\2\u00e1\u00e2\7\61\2\2\u00e2@\3\2\2\2\u00e3\u00e4\t\2\2\2\u00e4B\3"+
		"\2\2\2\u00e5\u00e6\t\3\2\2\u00e6D\3\2\2\2\u00e7\u00e8\t\4\2\2\u00e8F\3"+
		"\2\2\2\u00e9\u00ea\t\5\2\2\u00eaH\3\2\2\2\u00eb\u00ec\t\6\2\2\u00ecJ\3"+
		"\2\2\2\u00ed\u00ee\t\7\2\2\u00eeL\3\2\2\2\u00ef\u00f0\t\b\2\2\u00f0N\3"+
		"\2\2\2\u00f1\u00f2\t\t\2\2\u00f2P\3\2\2\2\u00f3\u00f4\t\n\2\2\u00f4R\3"+
		"\2\2\2\u00f5\u00f6\t\13\2\2\u00f6T\3\2\2\2\u00f7\u00f8\t\f\2\2\u00f8V"+
		"\3\2\2\2\u00f9\u00fa\t\r\2\2\u00faX\3\2\2\2\u00fb\u00fc\t\16\2\2\u00fc"+
		"Z\3\2\2\2\u00fd\u00fe\t\17\2\2\u00fe\\\3\2\2\2\u00ff\u0100\t\20\2\2\u0100"+
		"^\3\2\2\2\u0101\u0102\t\21\2\2\u0102`\3\2\2\2\u0103\u0104\t\22\2\2\u0104"+
		"b\3\2\2\2\u0105\u0106\t\23\2\2\u0106d\3\2\2\2\u0107\u0108\t\24\2\2\u0108"+
		"f\3\2\2\2\u0109\u010a\t\25\2\2\u010ah\3\2\2\2\u010b\u010c\t\26\2\2\u010c"+
		"j\3\2\2\2\u010d\u010e\t\27\2\2\u010el\3\2\2\2\u010f\u0110\t\30\2\2\u0110"+
		"n\3\2\2\2\u0111\u0112\t\31\2\2\u0112p\3\2\2\2\u0113\u0114\t\32\2\2\u0114"+
		"r\3\2\2\2\u0115\u0116\t\33\2\2\u0116t\3\2\2\2\u0117\u0118\5Q)\2\u0118"+
		"\u0119\5K&\2\u0119v\3\2\2\2\u011a\u011b\5g\64\2\u011b\u011c\5O(\2\u011c"+
		"\u011d\5I%\2\u011d\u011e\5[.\2\u011ex\3\2\2\2\u011f\u0120\5I%\2\u0120"+
		"\u0121\5W,\2\u0121\u0122\5e\63\2\u0122\u0123\5I%\2\u0123z\3\2\2\2\u0124"+
		"\u0125\5g\64\2\u0125\u0126\5c\62\2\u0126\u0127\5i\65\2\u0127\u0128\5I"+
		"%\2\u0128|\3\2\2\2\u0129\u012a\5K&\2\u012a\u012b\5A!\2\u012b\u012c\5W"+
		",\2\u012c\u012d\5e\63\2\u012d\u012e\5I%\2\u012e~\3\2\2\2\u012f\u0130\5"+
		"_\60\2\u0130\u0131\5c\62\2\u0131\u0132\5Q)\2\u0132\u0133\5[.\2\u0133\u0134"+
		"\5g\64\2\u0134\u0080\3\2\2\2\u0135\u0136\5m\67\2\u0136\u0137\5O(\2\u0137"+
		"\u0138\5Q)\2\u0138\u0139\5W,\2\u0139\u013a\5I%\2\u013a\u0082\3\2\2\2\u013b"+
		"\u013c\5e\63\2\u013c\u013d\5q9\2\u013d\u013e\5[.\2\u013e\u013f\5g\64\2"+
		"\u013f\u0140\5O(\2\u0140\u0084\3\2\2\2\u0141\u0142\5e\63\2\u0142\u0143"+
		"\5I%\2\u0143\u0144\5g\64\2\u0144\u0086\3\2\2\2\u0145\u0146\5E#\2\u0146"+
		"\u0147\5O(\2\u0147\u0148\5A!\2\u0148\u0149\5[.\2\u0149\u014a\5[.\2\u014a"+
		"\u014b\5I%\2\u014b\u014c\5W,\2\u014c\u0088\3\2\2\2\u014d\u014e\5[.\2\u014e"+
		"\u014f\5]/\2\u014f\u0150\5g\64\2\u0150\u0151\5I%\2\u0151\u008a\3\2\2\2"+
		"\u0152\u0153\5W,\2\u0153\u0154\5I%\2\u0154\u0155\5c\62\2\u0155\u0156\5"+
		"_\60\2\u0156\u008c\3\2\2\2\u0157\u0158\5e\63\2\u0158\u0159\5g\64\2\u0159"+
		"\u015a\5A!\2\u015a\u015b\5c\62\2\u015b\u015c\5g\64\2\u015c\u008e\3\2\2"+
		"\2\u015d\u0161\7\u0080\2\2\u015e\u0160\5\u0091I\2\u015f\u015e\3\2\2\2"+
		"\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\bH\2\2\u0165\u0090\3\2\2\2\u0166"+
		"\u0167\n\34\2\2\u0167\u0092\3\2\2\2\u0168\u016c\t\35\2\2\u0169\u016b\t"+
		"\36\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u0094\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\t\35"+
		"\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0096\3\2\2\2\u0174\u0176\t\37\2\2\u0175\u0174\3"+
		"\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0098\3\2\2\2\u0179\u017b\t\37\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3"+
		"\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0181\7\60\2\2\u0180\u0182\t\37\2\2\u0181\u0180\3"+
		"\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u009a\3\2\2\2\u0185\u0187\t\34\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3"+
		"\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u009c\3\2\2\2\u018a"+
		"\u018c\t \2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\bO\2\2\u0190"+
		"\u009e\3\2\2\2\13\2\u0161\u016c\u0172\u0177\u017c\u0183\u0188\u018d\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}