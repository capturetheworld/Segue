// Generated from /Users/ian/Documents/Github/CS153-Compiler-Design/FINAL PROJECT/Segue.g4 by ANTLR 4.8

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
public class SegueLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		IF=39, THEN=40, ELSE=41, TRUE=42, FALSE=43, PRINT=44, WHILE=45, SYNTH=46, 
		SET=47, CHANNEL=48, NOTE=49, LERP=50, START=51, RETURN=52, COMMENT=53, 
		IDENTIFIER=54, LETTER=55, INTEGER=56, DOUBLE=57, BR=58, WS=59;
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
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "A", "B", "C", "D", "E", 
			"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
			"T", "U", "V", "W", "X", "Y", "Z", "IF", "THEN", "ELSE", "TRUE", "FALSE", 
			"PRINT", "WHILE", "SYNTH", "SET", "CHANNEL", "NOTE", "LERP", "START", 
			"RETURN", "COMMENT", "COMMENT_CHARACTER", "IDENTIFIER", "LETTER", "INTEGER", 
			"DOUBLE", "BR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'='", "'.'", "'@'", "','", "'++'", 
			"'--'", "'%'", "'r'", "'R'", "'#'", "'!'", "'$'", "'['", "']'", "'m'", 
			"'M'", "'v'", "'V'", "'a'", "'A'", "'f'", "'F'", "'=='", "'!='", "'<'", 
			"'<='", "'>'", "'>='", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IF", "THEN", "ELSE", "TRUE", "FALSE", "PRINT", "WHILE", 
			"SYNTH", "SET", "CHANNEL", "NOTE", "LERP", "START", "RETURN", "COMMENT", 
			"IDENTIFIER", "LETTER", "INTEGER", "DOUBLE", "BR", "WS"
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


	public SegueLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Segue.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@"+
		"\3A\3A\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F"+
		"\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J"+
		"\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N"+
		"\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3P\3P\7P\u0185\nP\fP\16P\u0188\13P\3P\3"+
		"P\3Q\3Q\3R\3R\7R\u0190\nR\fR\16R\u0193\13R\3S\6S\u0196\nS\rS\16S\u0197"+
		"\3T\6T\u019b\nT\rT\16T\u019c\3U\7U\u01a0\nU\fU\16U\u01a3\13U\3U\3U\6U"+
		"\u01a7\nU\rU\16U\u01a8\3V\6V\u01ac\nV\rV\16V\u01ad\3W\6W\u01b1\nW\rW\16"+
		"W\u01b2\3W\3W\2\2X\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2"+
		"c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083)\u0085"+
		"*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097"+
		"\63\u0099\64\u009b\65\u009d\66\u009f\67\u00a1\2\u00a38\u00a59\u00a7:\u00a9"+
		";\u00ab<\u00ad=\3\2!\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4"+
		"\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq"+
		"q\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2"+
		"ZZzz\4\2[[{{\4\2\\\\||\4\2\f\f\17\17\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2"+
		"\13\13\"\"\2\u01a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2\u0083\3\2\2\2\2"+
		"\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\3\u00af\3\2\2\2\5\u00b1\3\2\2\2\7\u00b3"+
		"\3\2\2\2\t\u00b5\3\2\2\2\13\u00b7\3\2\2\2\r\u00b9\3\2\2\2\17\u00bb\3\2"+
		"\2\2\21\u00bd\3\2\2\2\23\u00bf\3\2\2\2\25\u00c2\3\2\2\2\27\u00c5\3\2\2"+
		"\2\31\u00c7\3\2\2\2\33\u00c9\3\2\2\2\35\u00cb\3\2\2\2\37\u00cd\3\2\2\2"+
		"!\u00cf\3\2\2\2#\u00d1\3\2\2\2%\u00d3\3\2\2\2\'\u00d5\3\2\2\2)\u00d7\3"+
		"\2\2\2+\u00d9\3\2\2\2-\u00db\3\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2\63"+
		"\u00e1\3\2\2\2\65\u00e3\3\2\2\2\67\u00e5\3\2\2\29\u00e8\3\2\2\2;\u00eb"+
		"\3\2\2\2=\u00ed\3\2\2\2?\u00f0\3\2\2\2A\u00f2\3\2\2\2C\u00f5\3\2\2\2E"+
		"\u00f7\3\2\2\2G\u00f9\3\2\2\2I\u00fb\3\2\2\2K\u00fd\3\2\2\2M\u00ff\3\2"+
		"\2\2O\u0101\3\2\2\2Q\u0103\3\2\2\2S\u0105\3\2\2\2U\u0107\3\2\2\2W\u0109"+
		"\3\2\2\2Y\u010b\3\2\2\2[\u010d\3\2\2\2]\u010f\3\2\2\2_\u0111\3\2\2\2a"+
		"\u0113\3\2\2\2c\u0115\3\2\2\2e\u0117\3\2\2\2g\u0119\3\2\2\2i\u011b\3\2"+
		"\2\2k\u011d\3\2\2\2m\u011f\3\2\2\2o\u0121\3\2\2\2q\u0123\3\2\2\2s\u0125"+
		"\3\2\2\2u\u0127\3\2\2\2w\u0129\3\2\2\2y\u012b\3\2\2\2{\u012d\3\2\2\2}"+
		"\u012f\3\2\2\2\177\u0131\3\2\2\2\u0081\u0133\3\2\2\2\u0083\u0135\3\2\2"+
		"\2\u0085\u0138\3\2\2\2\u0087\u013d\3\2\2\2\u0089\u0142\3\2\2\2\u008b\u0147"+
		"\3\2\2\2\u008d\u014d\3\2\2\2\u008f\u0153\3\2\2\2\u0091\u0159\3\2\2\2\u0093"+
		"\u015f\3\2\2\2\u0095\u0163\3\2\2\2\u0097\u016b\3\2\2\2\u0099\u0170\3\2"+
		"\2\2\u009b\u0175\3\2\2\2\u009d\u017b\3\2\2\2\u009f\u0182\3\2\2\2\u00a1"+
		"\u018b\3\2\2\2\u00a3\u018d\3\2\2\2\u00a5\u0195\3\2\2\2\u00a7\u019a\3\2"+
		"\2\2\u00a9\u01a1\3\2\2\2\u00ab\u01ab\3\2\2\2\u00ad\u01b0\3\2\2\2\u00af"+
		"\u00b0\7*\2\2\u00b0\4\3\2\2\2\u00b1\u00b2\7+\2\2\u00b2\6\3\2\2\2\u00b3"+
		"\u00b4\7}\2\2\u00b4\b\3\2\2\2\u00b5\u00b6\7\177\2\2\u00b6\n\3\2\2\2\u00b7"+
		"\u00b8\7?\2\2\u00b8\f\3\2\2\2\u00b9\u00ba\7\60\2\2\u00ba\16\3\2\2\2\u00bb"+
		"\u00bc\7B\2\2\u00bc\20\3\2\2\2\u00bd\u00be\7.\2\2\u00be\22\3\2\2\2\u00bf"+
		"\u00c0\7-\2\2\u00c0\u00c1\7-\2\2\u00c1\24\3\2\2\2\u00c2\u00c3\7/\2\2\u00c3"+
		"\u00c4\7/\2\2\u00c4\26\3\2\2\2\u00c5\u00c6\7\'\2\2\u00c6\30\3\2\2\2\u00c7"+
		"\u00c8\7t\2\2\u00c8\32\3\2\2\2\u00c9\u00ca\7T\2\2\u00ca\34\3\2\2\2\u00cb"+
		"\u00cc\7%\2\2\u00cc\36\3\2\2\2\u00cd\u00ce\7#\2\2\u00ce \3\2\2\2\u00cf"+
		"\u00d0\7&\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7]\2\2\u00d2$\3\2\2\2\u00d3"+
		"\u00d4\7_\2\2\u00d4&\3\2\2\2\u00d5\u00d6\7o\2\2\u00d6(\3\2\2\2\u00d7\u00d8"+
		"\7O\2\2\u00d8*\3\2\2\2\u00d9\u00da\7x\2\2\u00da,\3\2\2\2\u00db\u00dc\7"+
		"X\2\2\u00dc.\3\2\2\2\u00dd\u00de\7c\2\2\u00de\60\3\2\2\2\u00df\u00e0\7"+
		"C\2\2\u00e0\62\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\64\3\2\2\2\u00e3\u00e4"+
		"\7H\2\2\u00e4\66\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6\u00e7\7?\2\2\u00e78"+
		"\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\7?\2\2\u00ea:\3\2\2\2\u00eb\u00ec"+
		"\7>\2\2\u00ec<\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\u00ef\7?\2\2\u00ef>\3"+
		"\2\2\2\u00f0\u00f1\7@\2\2\u00f1@\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3\u00f4"+
		"\7?\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7(\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7"+
		"~\2\2\u00f8F\3\2\2\2\u00f9\u00fa\7-\2\2\u00faH\3\2\2\2\u00fb\u00fc\7/"+
		"\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7,\2\2\u00feL\3\2\2\2\u00ff\u0100\7\61"+
		"\2\2\u0100N\3\2\2\2\u0101\u0102\t\2\2\2\u0102P\3\2\2\2\u0103\u0104\t\3"+
		"\2\2\u0104R\3\2\2\2\u0105\u0106\t\4\2\2\u0106T\3\2\2\2\u0107\u0108\t\5"+
		"\2\2\u0108V\3\2\2\2\u0109\u010a\t\6\2\2\u010aX\3\2\2\2\u010b\u010c\t\7"+
		"\2\2\u010cZ\3\2\2\2\u010d\u010e\t\b\2\2\u010e\\\3\2\2\2\u010f\u0110\t"+
		"\t\2\2\u0110^\3\2\2\2\u0111\u0112\t\n\2\2\u0112`\3\2\2\2\u0113\u0114\t"+
		"\13\2\2\u0114b\3\2\2\2\u0115\u0116\t\f\2\2\u0116d\3\2\2\2\u0117\u0118"+
		"\t\r\2\2\u0118f\3\2\2\2\u0119\u011a\t\16\2\2\u011ah\3\2\2\2\u011b\u011c"+
		"\t\17\2\2\u011cj\3\2\2\2\u011d\u011e\t\20\2\2\u011el\3\2\2\2\u011f\u0120"+
		"\t\21\2\2\u0120n\3\2\2\2\u0121\u0122\t\22\2\2\u0122p\3\2\2\2\u0123\u0124"+
		"\t\23\2\2\u0124r\3\2\2\2\u0125\u0126\t\24\2\2\u0126t\3\2\2\2\u0127\u0128"+
		"\t\25\2\2\u0128v\3\2\2\2\u0129\u012a\t\26\2\2\u012ax\3\2\2\2\u012b\u012c"+
		"\t\27\2\2\u012cz\3\2\2\2\u012d\u012e\t\30\2\2\u012e|\3\2\2\2\u012f\u0130"+
		"\t\31\2\2\u0130~\3\2\2\2\u0131\u0132\t\32\2\2\u0132\u0080\3\2\2\2\u0133"+
		"\u0134\t\33\2\2\u0134\u0082\3\2\2\2\u0135\u0136\5_\60\2\u0136\u0137\5"+
		"Y-\2\u0137\u0084\3\2\2\2\u0138\u0139\5u;\2\u0139\u013a\5]/\2\u013a\u013b"+
		"\5W,\2\u013b\u013c\5i\65\2\u013c\u0086\3\2\2\2\u013d\u013e\5W,\2\u013e"+
		"\u013f\5e\63\2\u013f\u0140\5s:\2\u0140\u0141\5W,\2\u0141\u0088\3\2\2\2"+
		"\u0142\u0143\5u;\2\u0143\u0144\5q9\2\u0144\u0145\5w<\2\u0145\u0146\5W"+
		",\2\u0146\u008a\3\2\2\2\u0147\u0148\5Y-\2\u0148\u0149\5O(\2\u0149\u014a"+
		"\5e\63\2\u014a\u014b\5s:\2\u014b\u014c\5W,\2\u014c\u008c\3\2\2\2\u014d"+
		"\u014e\5m\67\2\u014e\u014f\5q9\2\u014f\u0150\5_\60\2\u0150\u0151\5i\65"+
		"\2\u0151\u0152\5u;\2\u0152\u008e\3\2\2\2\u0153\u0154\5{>\2\u0154\u0155"+
		"\5]/\2\u0155\u0156\5_\60\2\u0156\u0157\5e\63\2\u0157\u0158\5W,\2\u0158"+
		"\u0090\3\2\2\2\u0159\u015a\5s:\2\u015a\u015b\5\177@\2\u015b\u015c\5i\65"+
		"\2\u015c\u015d\5u;\2\u015d\u015e\5]/\2\u015e\u0092\3\2\2\2\u015f\u0160"+
		"\5s:\2\u0160\u0161\5W,\2\u0161\u0162\5u;\2\u0162\u0094\3\2\2\2\u0163\u0164"+
		"\5S*\2\u0164\u0165\5]/\2\u0165\u0166\5O(\2\u0166\u0167\5i\65\2\u0167\u0168"+
		"\5i\65\2\u0168\u0169\5W,\2\u0169\u016a\5e\63\2\u016a\u0096\3\2\2\2\u016b"+
		"\u016c\5i\65\2\u016c\u016d\5k\66\2\u016d\u016e\5u;\2\u016e\u016f\5W,\2"+
		"\u016f\u0098\3\2\2\2\u0170\u0171\5e\63\2\u0171\u0172\5W,\2\u0172\u0173"+
		"\5q9\2\u0173\u0174\5m\67\2\u0174\u009a\3\2\2\2\u0175\u0176\5s:\2\u0176"+
		"\u0177\5u;\2\u0177\u0178\5O(\2\u0178\u0179\5q9\2\u0179\u017a\5u;\2\u017a"+
		"\u009c\3\2\2\2\u017b\u017c\5q9\2\u017c\u017d\5W,\2\u017d\u017e\5u;\2\u017e"+
		"\u017f\5w<\2\u017f\u0180\5q9\2\u0180\u0181\5i\65\2\u0181\u009e\3\2\2\2"+
		"\u0182\u0186\7\u0080\2\2\u0183\u0185\5\u00a1Q\2\u0184\u0183\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u018a\bP\2\2\u018a\u00a0\3\2\2\2\u018b"+
		"\u018c\n\34\2\2\u018c\u00a2\3\2\2\2\u018d\u0191\t\35\2\2\u018e\u0190\t"+
		"\36\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u00a4\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0196\t\35"+
		"\2\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u00a6\3\2\2\2\u0199\u019b\t\37\2\2\u019a\u0199\3"+
		"\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u00a8\3\2\2\2\u019e\u01a0\t\37\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3"+
		"\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u01a6\7\60\2\2\u01a5\u01a7\t\37\2\2\u01a6\u01a5\3"+
		"\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u00aa\3\2\2\2\u01aa\u01ac\t\34\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3"+
		"\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u00ac\3\2\2\2\u01af"+
		"\u01b1\t \2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\bW\2\2\u01b5"+
		"\u00ae\3\2\2\2\13\2\u0186\u0191\u0197\u019c\u01a1\u01a8\u01ad\u01b2\3"+
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