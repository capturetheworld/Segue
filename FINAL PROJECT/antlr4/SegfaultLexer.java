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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, TYPE=31, OF=32, 
		VAR=33, AND=34, OR=35, NOT=36, IF=37, THEN=38, ELSE=39, UNTIL=40, TRUE=41, 
		FALSE=42, PRINT=43, FUNC=44, WHILE=45, SYNTH=46, SET=47, CHANNEL=48, NOTE=49, 
		LERP=50, START=51, COMMENT=52, IDENTIFIER=53, LETTER=54, INTEGER=55, DOUBLE=56, 
		BR=57, WS=58;
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
			"T__25", "T__26", "T__27", "T__28", "T__29", "A", "B", "C", "D", "E", 
			"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
			"T", "U", "V", "W", "X", "Y", "Z", "TYPE", "OF", "VAR", "AND", "OR", 
			"NOT", "IF", "THEN", "ELSE", "UNTIL", "TRUE", "FALSE", "PRINT", "FUNC", 
			"WHILE", "SYNTH", "SET", "CHANNEL", "NOTE", "LERP", "START", "COMMENT", 
			"COMMENT_CHARACTER", "IDENTIFIER", "LETTER", "INTEGER", "DOUBLE", "BR", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'{'", "'}'", "'.'", "'++'", "'--'", "'#'", 
			"'!'", "'$'", "'['", "']'", "','", "'m'", "'v'", "'a'", "'f'", "'=='", 
			"'<>'", "'<'", "'<='", "'>'", "'>='", "'&'", "'|'", "'+'", "'-'", "'*'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TYPE", "OF", "VAR", "AND", 
			"OR", "NOT", "IF", "THEN", "ELSE", "UNTIL", "TRUE", "FALSE", "PRINT", 
			"FUNC", "WHILE", "SYNTH", "SET", "CHANNEL", "NOTE", "LERP", "START", 
			"COMMENT", "IDENTIFIER", "LETTER", "INTEGER", "DOUBLE", "BR", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01c3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3"+
		"=\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3"+
		"C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3"+
		"G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3O\3O\7O\u018e"+
		"\nO\fO\16O\u0191\13O\3O\3O\5O\u0195\nO\3O\3O\3P\3P\3Q\3Q\7Q\u019d\nQ\f"+
		"Q\16Q\u01a0\13Q\3R\6R\u01a3\nR\rR\16R\u01a4\3S\6S\u01a8\nS\rS\16S\u01a9"+
		"\3T\7T\u01ad\nT\fT\16T\u01b0\13T\3T\3T\6T\u01b4\nT\rT\16T\u01b5\3U\6U"+
		"\u01b9\nU\rU\16U\u01ba\3V\6V\u01be\nV\rV\16V\u01bf\3V\3V\2\2W\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?\2A\2"+
		"C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2"+
		"q\2s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d"+
		".\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65\u009d\66"+
		"\u009f\2\u00a1\67\u00a38\u00a59\u00a7:\u00a9;\u00ab<\3\2!\4\2CCcc\4\2"+
		"DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4"+
		"\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUu"+
		"u\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2\f\f\17"+
		"\17\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\13\13\"\"\2\u01b0\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\3\u00ad"+
		"\3\2\2\2\5\u00af\3\2\2\2\7\u00b1\3\2\2\2\t\u00b3\3\2\2\2\13\u00b5\3\2"+
		"\2\2\r\u00b7\3\2\2\2\17\u00b9\3\2\2\2\21\u00bc\3\2\2\2\23\u00bf\3\2\2"+
		"\2\25\u00c1\3\2\2\2\27\u00c3\3\2\2\2\31\u00c5\3\2\2\2\33\u00c7\3\2\2\2"+
		"\35\u00c9\3\2\2\2\37\u00cb\3\2\2\2!\u00cd\3\2\2\2#\u00cf\3\2\2\2%\u00d1"+
		"\3\2\2\2\'\u00d3\3\2\2\2)\u00d6\3\2\2\2+\u00d9\3\2\2\2-\u00db\3\2\2\2"+
		"/\u00de\3\2\2\2\61\u00e0\3\2\2\2\63\u00e3\3\2\2\2\65\u00e5\3\2\2\2\67"+
		"\u00e7\3\2\2\29\u00e9\3\2\2\2;\u00eb\3\2\2\2=\u00ed\3\2\2\2?\u00ef\3\2"+
		"\2\2A\u00f1\3\2\2\2C\u00f3\3\2\2\2E\u00f5\3\2\2\2G\u00f7\3\2\2\2I\u00f9"+
		"\3\2\2\2K\u00fb\3\2\2\2M\u00fd\3\2\2\2O\u00ff\3\2\2\2Q\u0101\3\2\2\2S"+
		"\u0103\3\2\2\2U\u0105\3\2\2\2W\u0107\3\2\2\2Y\u0109\3\2\2\2[\u010b\3\2"+
		"\2\2]\u010d\3\2\2\2_\u010f\3\2\2\2a\u0111\3\2\2\2c\u0113\3\2\2\2e\u0115"+
		"\3\2\2\2g\u0117\3\2\2\2i\u0119\3\2\2\2k\u011b\3\2\2\2m\u011d\3\2\2\2o"+
		"\u011f\3\2\2\2q\u0121\3\2\2\2s\u0123\3\2\2\2u\u0128\3\2\2\2w\u012b\3\2"+
		"\2\2y\u012f\3\2\2\2{\u0133\3\2\2\2}\u0136\3\2\2\2\177\u013a\3\2\2\2\u0081"+
		"\u013d\3\2\2\2\u0083\u0142\3\2\2\2\u0085\u0147\3\2\2\2\u0087\u014d\3\2"+
		"\2\2\u0089\u0152\3\2\2\2\u008b\u0158\3\2\2\2\u008d\u015e\3\2\2\2\u008f"+
		"\u0163\3\2\2\2\u0091\u0169\3\2\2\2\u0093\u016f\3\2\2\2\u0095\u0173\3\2"+
		"\2\2\u0097\u017b\3\2\2\2\u0099\u0180\3\2\2\2\u009b\u0185\3\2\2\2\u009d"+
		"\u018b\3\2\2\2\u009f\u0198\3\2\2\2\u00a1\u019a\3\2\2\2\u00a3\u01a2\3\2"+
		"\2\2\u00a5\u01a7\3\2\2\2\u00a7\u01ae\3\2\2\2\u00a9\u01b8\3\2\2\2\u00ab"+
		"\u01bd\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\4\3\2\2\2\u00af\u00b0\7*\2\2\u00b0"+
		"\6\3\2\2\2\u00b1\u00b2\7+\2\2\u00b2\b\3\2\2\2\u00b3\u00b4\7}\2\2\u00b4"+
		"\n\3\2\2\2\u00b5\u00b6\7\177\2\2\u00b6\f\3\2\2\2\u00b7\u00b8\7\60\2\2"+
		"\u00b8\16\3\2\2\2\u00b9\u00ba\7-\2\2\u00ba\u00bb\7-\2\2\u00bb\20\3\2\2"+
		"\2\u00bc\u00bd\7/\2\2\u00bd\u00be\7/\2\2\u00be\22\3\2\2\2\u00bf\u00c0"+
		"\7%\2\2\u00c0\24\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2\26\3\2\2\2\u00c3\u00c4"+
		"\7&\2\2\u00c4\30\3\2\2\2\u00c5\u00c6\7]\2\2\u00c6\32\3\2\2\2\u00c7\u00c8"+
		"\7_\2\2\u00c8\34\3\2\2\2\u00c9\u00ca\7.\2\2\u00ca\36\3\2\2\2\u00cb\u00cc"+
		"\7o\2\2\u00cc \3\2\2\2\u00cd\u00ce\7x\2\2\u00ce\"\3\2\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0$\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2&\3\2\2\2\u00d3\u00d4\7"+
		"?\2\2\u00d4\u00d5\7?\2\2\u00d5(\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7\u00d8"+
		"\7@\2\2\u00d8*\3\2\2\2\u00d9\u00da\7>\2\2\u00da,\3\2\2\2\u00db\u00dc\7"+
		">\2\2\u00dc\u00dd\7?\2\2\u00dd.\3\2\2\2\u00de\u00df\7@\2\2\u00df\60\3"+
		"\2\2\2\u00e0\u00e1\7@\2\2\u00e1\u00e2\7?\2\2\u00e2\62\3\2\2\2\u00e3\u00e4"+
		"\7(\2\2\u00e4\64\3\2\2\2\u00e5\u00e6\7~\2\2\u00e6\66\3\2\2\2\u00e7\u00e8"+
		"\7-\2\2\u00e88\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea:\3\2\2\2\u00eb\u00ec\7"+
		",\2\2\u00ec<\3\2\2\2\u00ed\u00ee\7\61\2\2\u00ee>\3\2\2\2\u00ef\u00f0\t"+
		"\2\2\2\u00f0@\3\2\2\2\u00f1\u00f2\t\3\2\2\u00f2B\3\2\2\2\u00f3\u00f4\t"+
		"\4\2\2\u00f4D\3\2\2\2\u00f5\u00f6\t\5\2\2\u00f6F\3\2\2\2\u00f7\u00f8\t"+
		"\6\2\2\u00f8H\3\2\2\2\u00f9\u00fa\t\7\2\2\u00faJ\3\2\2\2\u00fb\u00fc\t"+
		"\b\2\2\u00fcL\3\2\2\2\u00fd\u00fe\t\t\2\2\u00feN\3\2\2\2\u00ff\u0100\t"+
		"\n\2\2\u0100P\3\2\2\2\u0101\u0102\t\13\2\2\u0102R\3\2\2\2\u0103\u0104"+
		"\t\f\2\2\u0104T\3\2\2\2\u0105\u0106\t\r\2\2\u0106V\3\2\2\2\u0107\u0108"+
		"\t\16\2\2\u0108X\3\2\2\2\u0109\u010a\t\17\2\2\u010aZ\3\2\2\2\u010b\u010c"+
		"\t\20\2\2\u010c\\\3\2\2\2\u010d\u010e\t\21\2\2\u010e^\3\2\2\2\u010f\u0110"+
		"\t\22\2\2\u0110`\3\2\2\2\u0111\u0112\t\23\2\2\u0112b\3\2\2\2\u0113\u0114"+
		"\t\24\2\2\u0114d\3\2\2\2\u0115\u0116\t\25\2\2\u0116f\3\2\2\2\u0117\u0118"+
		"\t\26\2\2\u0118h\3\2\2\2\u0119\u011a\t\27\2\2\u011aj\3\2\2\2\u011b\u011c"+
		"\t\30\2\2\u011cl\3\2\2\2\u011d\u011e\t\31\2\2\u011en\3\2\2\2\u011f\u0120"+
		"\t\32\2\2\u0120p\3\2\2\2\u0121\u0122\t\33\2\2\u0122r\3\2\2\2\u0123\u0124"+
		"\5e\63\2\u0124\u0125\5o8\2\u0125\u0126\5]/\2\u0126\u0127\5G$\2\u0127t"+
		"\3\2\2\2\u0128\u0129\5[.\2\u0129\u012a\5I%\2\u012av\3\2\2\2\u012b\u012c"+
		"\5i\65\2\u012c\u012d\5? \2\u012d\u012e\5a\61\2\u012ex\3\2\2\2\u012f\u0130"+
		"\5? \2\u0130\u0131\5Y-\2\u0131\u0132\5E#\2\u0132z\3\2\2\2\u0133\u0134"+
		"\5[.\2\u0134\u0135\5a\61\2\u0135|\3\2\2\2\u0136\u0137\5Y-\2\u0137\u0138"+
		"\5[.\2\u0138\u0139\5e\63\2\u0139~\3\2\2\2\u013a\u013b\5O(\2\u013b\u013c"+
		"\5I%\2\u013c\u0080\3\2\2\2\u013d\u013e\5e\63\2\u013e\u013f\5M\'\2\u013f"+
		"\u0140\5G$\2\u0140\u0141\5Y-\2\u0141\u0082\3\2\2\2\u0142\u0143\5G$\2\u0143"+
		"\u0144\5U+\2\u0144\u0145\5c\62\2\u0145\u0146\5G$\2\u0146\u0084\3\2\2\2"+
		"\u0147\u0148\5g\64\2\u0148\u0149\5Y-\2\u0149\u014a\5e\63\2\u014a\u014b"+
		"\5O(\2\u014b\u014c\5U+\2\u014c\u0086\3\2\2\2\u014d\u014e\5e\63\2\u014e"+
		"\u014f\5a\61\2\u014f\u0150\5g\64\2\u0150\u0151\5G$\2\u0151\u0088\3\2\2"+
		"\2\u0152\u0153\5I%\2\u0153\u0154\5? \2\u0154\u0155\5U+\2\u0155\u0156\5"+
		"c\62\2\u0156\u0157\5G$\2\u0157\u008a\3\2\2\2\u0158\u0159\5]/\2\u0159\u015a"+
		"\5a\61\2\u015a\u015b\5O(\2\u015b\u015c\5Y-\2\u015c\u015d\5e\63\2\u015d"+
		"\u008c\3\2\2\2\u015e\u015f\5I%\2\u015f\u0160\5g\64\2\u0160\u0161\5Y-\2"+
		"\u0161\u0162\5C\"\2\u0162\u008e\3\2\2\2\u0163\u0164\5k\66\2\u0164\u0165"+
		"\5M\'\2\u0165\u0166\5O(\2\u0166\u0167\5U+\2\u0167\u0168\5G$\2\u0168\u0090"+
		"\3\2\2\2\u0169\u016a\5c\62\2\u016a\u016b\5o8\2\u016b\u016c\5Y-\2\u016c"+
		"\u016d\5e\63\2\u016d\u016e\5M\'\2\u016e\u0092\3\2\2\2\u016f\u0170\5c\62"+
		"\2\u0170\u0171\5G$\2\u0171\u0172\5e\63\2\u0172\u0094\3\2\2\2\u0173\u0174"+
		"\5C\"\2\u0174\u0175\5M\'\2\u0175\u0176\5? \2\u0176\u0177\5Y-\2\u0177\u0178"+
		"\5Y-\2\u0178\u0179\5G$\2\u0179\u017a\5U+\2\u017a\u0096\3\2\2\2\u017b\u017c"+
		"\5Y-\2\u017c\u017d\5[.\2\u017d\u017e\5e\63\2\u017e\u017f\5G$\2\u017f\u0098"+
		"\3\2\2\2\u0180\u0181\5U+\2\u0181\u0182\5G$\2\u0182\u0183\5a\61\2\u0183"+
		"\u0184\5]/\2\u0184\u009a\3\2\2\2\u0185\u0186\5c\62\2\u0186\u0187\5e\63"+
		"\2\u0187\u0188\5? \2\u0188\u0189\5a\61\2\u0189\u018a\5e\63\2\u018a\u009c"+
		"\3\2\2\2\u018b\u018f\7\u0080\2\2\u018c\u018e\5\u009fP\2\u018d\u018c\3"+
		"\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0194\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0195\5\u00a9U\2\u0193\u0195"+
		"\7\2\2\3\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\bO\2\2\u0197\u009e\3\2\2\2\u0198\u0199\n\34\2\2\u0199\u00a0\3\2"+
		"\2\2\u019a\u019e\t\35\2\2\u019b\u019d\t\36\2\2\u019c\u019b\3\2\2\2\u019d"+
		"\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u00a2\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\t\35\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u00a4\3\2"+
		"\2\2\u01a6\u01a8\t\37\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u00a6\3\2\2\2\u01ab\u01ad\t\37"+
		"\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b3\7\60"+
		"\2\2\u01b2\u01b4\t\37\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u00a8\3\2\2\2\u01b7\u01b9\t\34"+
		"\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u00aa\3\2\2\2\u01bc\u01be\t \2\2\u01bd\u01bc\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\bV\2\2\u01c2\u00ac\3\2\2\2\f\2\u018f\u0194"+
		"\u019e\u01a4\u01a9\u01ae\u01b5\u01ba\u01bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}