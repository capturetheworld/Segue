// Generated from /Users/ian/Documents/Github/CS153-Compiler-Design/FINAL PROJECT/Segue.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SegueParser extends Parser {
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
		SET=40, CHANNEL=41, NOTE=42, LERP=43, START=44, RETURN=45, COMMENT=46, 
		IDENTIFIER=47, LETTER=48, INTEGER=49, DOUBLE=50, BR=51, WS=52;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_lineList = 2, RULE_statement = 3, 
		RULE_functiondef = 4, RULE_functioncall = 5, RULE_assignmentStatement = 6, 
		RULE_ifStatement = 7, RULE_whileStatement = 8, RULE_printStatement = 9, 
		RULE_synthStatement = 10, RULE_synthFunction = 11, RULE_returnStatement = 12, 
		RULE_functionID = 13, RULE_functionSymbol = 14, RULE_paramList = 15, RULE_param = 16, 
		RULE_argList = 17, RULE_arg = 18, RULE_numericalExpression = 19, RULE_term = 20, 
		RULE_factor = 21, RULE_prefixOp = 22, RULE_suffixOp = 23, RULE_numIdentifier = 24, 
		RULE_numSymbol = 25, RULE_booleanExpression = 26, RULE_booleanTerm = 27, 
		RULE_booleanSingleton = 28, RULE_notStatement = 29, RULE_notSymbol = 30, 
		RULE_boolIdentifier = 31, RULE_boolSymbol = 32, RULE_synthSetFunction = 33, 
		RULE_synthChannelFunction = 34, RULE_synthNoteFunction = 35, RULE_synthStartFunction = 36, 
		RULE_synthNoteSet = 37, RULE_synthNoteLerp = 38, RULE_synthPointStatement = 39, 
		RULE_synthMidiPitch = 40, RULE_synthVolume = 41, RULE_synthVibratoAmplitude = 42, 
		RULE_synthVibratoFrequency = 43, RULE_relOp = 44, RULE_boolOp = 45, RULE_addOp = 46, 
		RULE_mulOp = 47, RULE_booleanConstant = 48, RULE_numberConstant = 49, 
		RULE_unsignedNumber = 50, RULE_unsignedintegerConstant = 51, RULE_unsigneddoubleConstant = 52, 
		RULE_sign = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "lineList", "statement", "functiondef", "functioncall", 
			"assignmentStatement", "ifStatement", "whileStatement", "printStatement", 
			"synthStatement", "synthFunction", "returnStatement", "functionID", "functionSymbol", 
			"paramList", "param", "argList", "arg", "numericalExpression", "term", 
			"factor", "prefixOp", "suffixOp", "numIdentifier", "numSymbol", "booleanExpression", 
			"booleanTerm", "booleanSingleton", "notStatement", "notSymbol", "boolIdentifier", 
			"boolSymbol", "synthSetFunction", "synthChannelFunction", "synthNoteFunction", 
			"synthStartFunction", "synthNoteSet", "synthNoteLerp", "synthPointStatement", 
			"synthMidiPitch", "synthVolume", "synthVibratoAmplitude", "synthVibratoFrequency", 
			"relOp", "boolOp", "addOp", "mulOp", "booleanConstant", "numberConstant", 
			"unsignedNumber", "unsignedintegerConstant", "unsigneddoubleConstant", 
			"sign"
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
			"LERP", "START", "RETURN", "COMMENT", "IDENTIFIER", "LETTER", "INTEGER", 
			"DOUBLE", "BR", "WS"
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

	@Override
	public String getGrammarFileName() { return "Segue.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SegueParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SegueParser.EOF, 0); }
		public List<TerminalNode> BR() { return getTokens(SegueParser.BR); }
		public TerminalNode BR(int i) {
			return getToken(SegueParser.BR, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(108);
				match(BR);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					line();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(120);
			statement();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(121);
				match(BR);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> BR() { return getTokens(SegueParser.BR); }
		public TerminalNode BR(int i) {
			return getToken(SegueParser.BR, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			statement();
			setState(131); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(130);
					match(BR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(133); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineListContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public LineListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitLineList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineListContext lineList() throws RecognitionException {
		LineListContext _localctx = new LineListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lineList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				line();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << SYNTH) | (1L << RETURN))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public SynthStatementContext synthStatement() {
			return getRuleContext(SynthStatementContext.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public SuffixOpContext suffixOp() {
			return getRuleContext(SuffixOpContext.class,0);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				printStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				synthStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				prefixOp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				suffixOp();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				functiondef();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(148);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(149);
				functioncall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondefContext extends ParserRuleContext {
		public FunctionIDContext functionID() {
			return getRuleContext(FunctionIDContext.class,0);
		}
		public LineListContext lineList() {
			return getRuleContext(LineListContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<TerminalNode> BR() { return getTokens(SegueParser.BR); }
		public TerminalNode BR(int i) {
			return getToken(SegueParser.BR, i);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitFunctiondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functiondef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			functionID();
			setState(153);
			match(T__0);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__12) {
				{
				setState(154);
				paramList();
				}
			}

			setState(157);
			match(T__1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(158);
				match(BR);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(164);
			match(T__2);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(165);
				match(BR);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			lineList();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(172);
				match(BR);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public FunctionIDContext functionID() {
			return getRuleContext(FunctionIDContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			functionID();
			setState(181);
			match(T__0);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__28) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DOUBLE))) != 0)) {
				{
				setState(182);
				argList();
				}
			}

			setState(185);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public BoolIdentifierContext boolIdentifier() {
			return getRuleContext(BoolIdentifierContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NumIdentifierContext numIdentifier() {
			return getRuleContext(NumIdentifierContext.class,0);
		}
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignmentStatement);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				boolIdentifier();
				setState(188);
				match(T__4);
				setState(189);
				booleanExpression();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				numIdentifier();
				setState(192);
				match(T__4);
				setState(193);
				numericalExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SegueParser.IF, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public List<LineListContext> lineList() {
			return getRuleContexts(LineListContext.class);
		}
		public LineListContext lineList(int i) {
			return getRuleContext(LineListContext.class,i);
		}
		public List<TerminalNode> BR() { return getTokens(SegueParser.BR); }
		public TerminalNode BR(int i) {
			return getToken(SegueParser.BR, i);
		}
		public TerminalNode ELSE() { return getToken(SegueParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IF);
			setState(198);
			match(T__0);
			setState(199);
			booleanExpression();
			setState(200);
			match(T__1);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(201);
				match(BR);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(T__2);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(208);
				match(BR);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			lineList();
			setState(215);
			match(T__3);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					match(BR);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(222);
				match(ELSE);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BR) {
					{
					{
					setState(223);
					match(BR);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(T__2);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BR) {
					{
					{
					setState(230);
					match(BR);
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				lineList();
				setState(237);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SegueParser.WHILE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LineListContext lineList() {
			return getRuleContext(LineListContext.class,0);
		}
		public List<TerminalNode> BR() { return getTokens(SegueParser.BR); }
		public TerminalNode BR(int i) {
			return getToken(SegueParser.BR, i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(WHILE);
			setState(242);
			match(T__0);
			setState(243);
			booleanExpression();
			setState(244);
			match(T__1);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(245);
				match(BR);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(T__2);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(252);
				match(BR);
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			lineList();
			setState(259);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SegueParser.PRINT, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(PRINT);
			setState(262);
			match(T__0);
			setState(263);
			arg();
			setState(264);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthStatementContext extends ParserRuleContext {
		public TerminalNode SYNTH() { return getToken(SegueParser.SYNTH, 0); }
		public SynthFunctionContext synthFunction() {
			return getRuleContext(SynthFunctionContext.class,0);
		}
		public SynthStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthStatementContext synthStatement() throws RecognitionException {
		SynthStatementContext _localctx = new SynthStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_synthStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(SYNTH);
			setState(267);
			match(T__5);
			setState(268);
			synthFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthFunctionContext extends ParserRuleContext {
		public SynthSetFunctionContext synthSetFunction() {
			return getRuleContext(SynthSetFunctionContext.class,0);
		}
		public SynthChannelFunctionContext synthChannelFunction() {
			return getRuleContext(SynthChannelFunctionContext.class,0);
		}
		public SynthNoteFunctionContext synthNoteFunction() {
			return getRuleContext(SynthNoteFunctionContext.class,0);
		}
		public SynthStartFunctionContext synthStartFunction() {
			return getRuleContext(SynthStartFunctionContext.class,0);
		}
		public SynthFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthFunctionContext synthFunction() throws RecognitionException {
		SynthFunctionContext _localctx = new SynthFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_synthFunction);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				synthSetFunction();
				}
				break;
			case CHANNEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				synthChannelFunction();
				}
				break;
			case NOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				synthNoteFunction();
				}
				break;
			case START:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				synthStartFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SegueParser.RETURN, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(RETURN);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(277);
				numericalExpression();
				}
				break;
			case 2:
				{
				setState(278);
				booleanExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIDContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public FunctionSymbolContext functionSymbol() {
			return getRuleContext(FunctionSymbolContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SegueParser.IDENTIFIER, 0); }
		public FunctionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitFunctionID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIDContext functionID() throws RecognitionException {
		FunctionIDContext _localctx = new FunctionIDContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			functionSymbol();
			setState(282);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSymbolContext extends ParserRuleContext {
		public FunctionSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitFunctionSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSymbolContext functionSymbol() throws RecognitionException {
		FunctionSymbolContext _localctx = new FunctionSymbolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			param();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(287);
				match(T__7);
				setState(288);
				param();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public BoolIdentifierContext boolIdentifier() {
			return getRuleContext(BoolIdentifierContext.class,0);
		}
		public NumIdentifierContext numIdentifier() {
			return getRuleContext(NumIdentifierContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_param);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				boolIdentifier();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				numIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			arg();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(299);
				match(T__7);
				setState(300);
				arg();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				booleanExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				numericalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericalExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public NumericalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitNumericalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalExpressionContext numericalExpression() throws RecognitionException {
		NumericalExpressionContext _localctx = new NumericalExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numericalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			term();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==T__28) {
				{
				{
				setState(311);
				addOp();
				setState(312);
				term();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public MulOpContext mulOp(int i) {
			return getRuleContext(MulOpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			factor();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__30) {
				{
				{
				setState(320);
				mulOp();
				setState(321);
				factor();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public NumberConstantContext numberConstant() {
			return getRuleContext(NumberConstantContext.class,0);
		}
		public NumIdentifierContext numIdentifier() {
			return getRuleContext(NumIdentifierContext.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public SuffixOpContext suffixOp() {
			return getRuleContext(SuffixOpContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(T__0);
				setState(329);
				numericalExpression();
				setState(330);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				numberConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				numIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				prefixOp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				suffixOp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOpContext extends ParserRuleContext {
		public NumIdentifierContext numIdentifier() {
			return getRuleContext(NumIdentifierContext.class,0);
		}
		public PrefixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitPrefixOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(339);
			numIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuffixOpContext extends ParserRuleContext {
		public NumIdentifierContext numIdentifier() {
			return getRuleContext(NumIdentifierContext.class,0);
		}
		public SuffixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffixOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSuffixOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuffixOpContext suffixOp() throws RecognitionException {
		SuffixOpContext _localctx = new SuffixOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_suffixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			numIdentifier();
			setState(342);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumIdentifierContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public NumSymbolContext numSymbol() {
			return getRuleContext(NumSymbolContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SegueParser.IDENTIFIER, 0); }
		public NumIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitNumIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumIdentifierContext numIdentifier() throws RecognitionException {
		NumIdentifierContext _localctx = new NumIdentifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_numIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			numSymbol();
			setState(345);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumSymbolContext extends ParserRuleContext {
		public NumSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitNumSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumSymbolContext numSymbol() throws RecognitionException {
		NumSymbolContext _localctx = new NumSymbolContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public List<BooleanTermContext> booleanTerm() {
			return getRuleContexts(BooleanTermContext.class);
		}
		public BooleanTermContext booleanTerm(int i) {
			return getRuleContext(BooleanTermContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public List<NumericalExpressionContext> numericalExpression() {
			return getRuleContexts(NumericalExpressionContext.class);
		}
		public NumericalExpressionContext numericalExpression(int i) {
			return getRuleContext(NumericalExpressionContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_booleanExpression);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				booleanTerm();
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(350);
					boolOp();
					setState(351);
					booleanTerm();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				numericalExpression();
				setState(356);
				relOp();
				setState(357);
				numericalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanTermContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BooleanSingletonContext booleanSingleton() {
			return getRuleContext(BooleanSingletonContext.class,0);
		}
		public BooleanTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitBooleanTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTermContext booleanTerm() throws RecognitionException {
		BooleanTermContext _localctx = new BooleanTermContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleanTerm);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(T__0);
				setState(362);
				booleanExpression();
				setState(363);
				match(T__1);
				}
				break;
			case T__11:
			case T__12:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				booleanSingleton();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanSingletonContext extends ParserRuleContext {
		public NotStatementContext notStatement() {
			return getRuleContext(NotStatementContext.class,0);
		}
		public BoolIdentifierContext boolIdentifier() {
			return getRuleContext(BoolIdentifierContext.class,0);
		}
		public BooleanConstantContext booleanConstant() {
			return getRuleContext(BooleanConstantContext.class,0);
		}
		public BooleanSingletonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanSingleton; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitBooleanSingleton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanSingletonContext booleanSingleton() throws RecognitionException {
		BooleanSingletonContext _localctx = new BooleanSingletonContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanSingleton);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				notStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				boolIdentifier();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				booleanConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotStatementContext extends ParserRuleContext {
		public NotSymbolContext notSymbol() {
			return getRuleContext(NotSymbolContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitNotStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotStatementContext notStatement() throws RecognitionException {
		NotStatementContext _localctx = new NotStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_notStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			notSymbol();
			setState(374);
			booleanExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotSymbolContext extends ParserRuleContext {
		public NotSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitNotSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotSymbolContext notSymbol() throws RecognitionException {
		NotSymbolContext _localctx = new NotSymbolContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_notSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolIdentifierContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public BoolSymbolContext boolSymbol() {
			return getRuleContext(BoolSymbolContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SegueParser.IDENTIFIER, 0); }
		public BoolIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitBoolIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolIdentifierContext boolIdentifier() throws RecognitionException {
		BoolIdentifierContext _localctx = new BoolIdentifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_boolIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			boolSymbol();
			setState(379);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolSymbolContext extends ParserRuleContext {
		public BoolSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitBoolSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolSymbolContext boolSymbol() throws RecognitionException {
		BoolSymbolContext _localctx = new BoolSymbolContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_boolSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthSetFunctionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SegueParser.SET, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthSetFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthSetFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthSetFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthSetFunctionContext synthSetFunction() throws RecognitionException {
		SynthSetFunctionContext _localctx = new SynthSetFunctionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_synthSetFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(SET);
			setState(384);
			match(T__0);
			setState(385);
			numericalExpression();
			setState(386);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthChannelFunctionContext extends ParserRuleContext {
		public TerminalNode CHANNEL() { return getToken(SegueParser.CHANNEL, 0); }
		public List<NumericalExpressionContext> numericalExpression() {
			return getRuleContexts(NumericalExpressionContext.class);
		}
		public NumericalExpressionContext numericalExpression(int i) {
			return getRuleContext(NumericalExpressionContext.class,i);
		}
		public TerminalNode SET() { return getToken(SegueParser.SET, 0); }
		public SynthChannelFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthChannelFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthChannelFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthChannelFunctionContext synthChannelFunction() throws RecognitionException {
		SynthChannelFunctionContext _localctx = new SynthChannelFunctionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_synthChannelFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(CHANNEL);
			setState(389);
			match(T__13);
			setState(390);
			numericalExpression();
			setState(391);
			match(T__14);
			setState(392);
			match(T__5);
			setState(393);
			match(SET);
			setState(394);
			match(T__0);
			setState(395);
			numericalExpression();
			setState(396);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthNoteFunctionContext extends ParserRuleContext {
		public TerminalNode NOTE() { return getToken(SegueParser.NOTE, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthNoteSetContext synthNoteSet() {
			return getRuleContext(SynthNoteSetContext.class,0);
		}
		public SynthNoteLerpContext synthNoteLerp() {
			return getRuleContext(SynthNoteLerpContext.class,0);
		}
		public SynthNoteFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthNoteFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthNoteFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthNoteFunctionContext synthNoteFunction() throws RecognitionException {
		SynthNoteFunctionContext _localctx = new SynthNoteFunctionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_synthNoteFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(NOTE);
			setState(399);
			match(T__13);
			setState(400);
			numericalExpression();
			setState(401);
			match(T__14);
			setState(402);
			match(T__5);
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(403);
				synthNoteSet();
				}
				break;
			case LERP:
				{
				setState(404);
				synthNoteLerp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthStartFunctionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(SegueParser.START, 0); }
		public SynthStartFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthStartFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthStartFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthStartFunctionContext synthStartFunction() throws RecognitionException {
		SynthStartFunctionContext _localctx = new SynthStartFunctionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_synthStartFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(START);
			setState(408);
			match(T__0);
			setState(409);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthNoteSetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SegueParser.SET, 0); }
		public List<NumericalExpressionContext> numericalExpression() {
			return getRuleContexts(NumericalExpressionContext.class);
		}
		public NumericalExpressionContext numericalExpression(int i) {
			return getRuleContext(NumericalExpressionContext.class,i);
		}
		public SynthPointStatementContext synthPointStatement() {
			return getRuleContext(SynthPointStatementContext.class,0);
		}
		public SynthNoteSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthNoteSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthNoteSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthNoteSetContext synthNoteSet() throws RecognitionException {
		SynthNoteSetContext _localctx = new SynthNoteSetContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_synthNoteSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(SET);
			setState(412);
			match(T__0);
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(413);
				numericalExpression();
				setState(414);
				match(T__7);
				}
				break;
			}
			setState(418);
			numericalExpression();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(419);
				match(T__7);
				setState(420);
				synthPointStatement();
				}
			}

			setState(423);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthNoteLerpContext extends ParserRuleContext {
		public TerminalNode LERP() { return getToken(SegueParser.LERP, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthPointStatementContext synthPointStatement() {
			return getRuleContext(SynthPointStatementContext.class,0);
		}
		public SynthNoteLerpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthNoteLerp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthNoteLerp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthNoteLerpContext synthNoteLerp() throws RecognitionException {
		SynthNoteLerpContext _localctx = new SynthNoteLerpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_synthNoteLerp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(LERP);
			setState(426);
			match(T__0);
			setState(427);
			numericalExpression();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(428);
				match(T__7);
				setState(429);
				synthPointStatement();
				}
			}

			setState(432);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthPointStatementContext extends ParserRuleContext {
		public SynthMidiPitchContext synthMidiPitch() {
			return getRuleContext(SynthMidiPitchContext.class,0);
		}
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthVolumeContext synthVolume() {
			return getRuleContext(SynthVolumeContext.class,0);
		}
		public SynthVibratoAmplitudeContext synthVibratoAmplitude() {
			return getRuleContext(SynthVibratoAmplitudeContext.class,0);
		}
		public SynthVibratoFrequencyContext synthVibratoFrequency() {
			return getRuleContext(SynthVibratoFrequencyContext.class,0);
		}
		public SynthPointStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthPointStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthPointStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthPointStatementContext synthPointStatement() throws RecognitionException {
		SynthPointStatementContext _localctx = new SynthPointStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_synthPointStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__2);
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(435);
				synthMidiPitch();
				}
				break;
			case T__0:
			case T__8:
			case T__9:
			case T__10:
			case T__28:
			case INTEGER:
			case DOUBLE:
				{
				setState(436);
				numericalExpression();
				}
				break;
			case T__3:
			case T__7:
				break;
			default:
				break;
			}
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(439);
				match(T__7);
				setState(440);
				synthVolume();
				}
				break;
			}
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(443);
				match(T__7);
				setState(444);
				synthVibratoAmplitude();
				}
				break;
			}
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(447);
				match(T__7);
				setState(448);
				synthVibratoFrequency();
				}
			}

			setState(451);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthMidiPitchContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthMidiPitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthMidiPitch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthMidiPitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthMidiPitchContext synthMidiPitch() throws RecognitionException {
		SynthMidiPitchContext _localctx = new SynthMidiPitchContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_synthMidiPitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__15);
			setState(454);
			numericalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthVolumeContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthVolumeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthVolume; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthVolume(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthVolumeContext synthVolume() throws RecognitionException {
		SynthVolumeContext _localctx = new SynthVolumeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_synthVolume);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__16);
			setState(457);
			numericalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthVibratoAmplitudeContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthVibratoAmplitudeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthVibratoAmplitude; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthVibratoAmplitude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthVibratoAmplitudeContext synthVibratoAmplitude() throws RecognitionException {
		SynthVibratoAmplitudeContext _localctx = new SynthVibratoAmplitudeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_synthVibratoAmplitude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(T__17);
			setState(460);
			numericalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthVibratoFrequencyContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthVibratoFrequencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthVibratoFrequency; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSynthVibratoFrequency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthVibratoFrequencyContext synthVibratoFrequency() throws RecognitionException {
		SynthVibratoFrequencyContext _localctx = new SynthVibratoFrequencyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_synthVibratoFrequency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__18);
			setState(463);
			numericalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolOpContext extends ParserRuleContext {
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulOpContext extends ParserRuleContext {
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanConstantContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SegueParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SegueParser.FALSE, 0); }
		public BooleanConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConstantContext booleanConstant() throws RecognitionException {
		BooleanConstantContext _localctx = new BooleanConstantContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_booleanConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitNumberConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberConstantContext numberConstant() throws RecognitionException {
		NumberConstantContext _localctx = new NumberConstantContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_numberConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(475);
				sign();
				}
			}

			setState(478);
			unsignedNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedintegerConstantContext unsignedintegerConstant() {
			return getRuleContext(UnsignedintegerConstantContext.class,0);
		}
		public UnsigneddoubleConstantContext unsigneddoubleConstant() {
			return getRuleContext(UnsigneddoubleConstantContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unsignedNumber);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				unsignedintegerConstant();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				unsigneddoubleConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedintegerConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SegueParser.INTEGER, 0); }
		public UnsignedintegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedintegerConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitUnsignedintegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedintegerConstantContext unsignedintegerConstant() throws RecognitionException {
		UnsignedintegerConstantContext _localctx = new UnsignedintegerConstantContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unsignedintegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsigneddoubleConstantContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(SegueParser.DOUBLE, 0); }
		public UnsigneddoubleConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigneddoubleConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitUnsigneddoubleConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsigneddoubleConstantContext unsigneddoubleConstant() throws RecognitionException {
		UnsigneddoubleConstantContext _localctx = new UnsigneddoubleConstantContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unsigneddoubleConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(DOUBLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegueVisitor ) return ((SegueVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u01ed\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\7\2"+
		"v\n\2\f\2\16\2y\13\2\3\2\3\2\7\2}\n\2\f\2\16\2\u0080\13\2\3\2\3\2\3\3"+
		"\3\3\6\3\u0086\n\3\r\3\16\3\u0087\3\4\6\4\u008b\n\4\r\4\16\4\u008c\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0099\n\5\3\6\3\6\3\6\5\6\u009e"+
		"\n\6\3\6\3\6\7\6\u00a2\n\6\f\6\16\6\u00a5\13\6\3\6\3\6\7\6\u00a9\n\6\f"+
		"\6\16\6\u00ac\13\6\3\6\3\6\7\6\u00b0\n\6\f\6\16\6\u00b3\13\6\3\6\3\6\3"+
		"\7\3\7\3\7\5\7\u00ba\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c6"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00cd\n\t\f\t\16\t\u00d0\13\t\3\t\3\t\7\t"+
		"\u00d4\n\t\f\t\16\t\u00d7\13\t\3\t\3\t\3\t\7\t\u00dc\n\t\f\t\16\t\u00df"+
		"\13\t\3\t\3\t\7\t\u00e3\n\t\f\t\16\t\u00e6\13\t\3\t\3\t\7\t\u00ea\n\t"+
		"\f\t\16\t\u00ed\13\t\3\t\3\t\3\t\5\t\u00f2\n\t\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00f9\n\n\f\n\16\n\u00fc\13\n\3\n\3\n\7\n\u0100\n\n\f\n\16\n\u0103\13"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\5\r\u0115\n\r\3\16\3\16\3\16\5\16\u011a\n\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\7\21\u0124\n\21\f\21\16\21\u0127\13\21\3\22\3\22\5"+
		"\22\u012b\n\22\3\23\3\23\3\23\7\23\u0130\n\23\f\23\16\23\u0133\13\23\3"+
		"\24\3\24\5\24\u0137\n\24\3\25\3\25\3\25\3\25\7\25\u013d\n\25\f\25\16\25"+
		"\u0140\13\25\3\26\3\26\3\26\3\26\7\26\u0146\n\26\f\26\16\26\u0149\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0153\n\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u0164"+
		"\n\34\3\34\3\34\3\34\3\34\5\34\u016a\n\34\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0171\n\35\3\36\3\36\3\36\5\36\u0176\n\36\3\37\3\37\3\37\3 \3 \3!\3!"+
		"\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u0198\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u01a3\n\'\3\'"+
		"\3\'\3\'\5\'\u01a8\n\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u01b1\n(\3(\3(\3)\3)"+
		"\3)\5)\u01b8\n)\3)\3)\5)\u01bc\n)\3)\3)\5)\u01c0\n)\3)\3)\5)\u01c4\n)"+
		"\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\5\63\u01df\n\63\3\63\3\63\3\64\3\64\5\64\u01e5\n"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\2\28\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\b\3\2"+
		"\13\f\3\2\26\33\4\2\26\27\34\35\3\2\36\37\3\2 !\3\2%&\2\u01f0\2q\3\2\2"+
		"\2\4\u0083\3\2\2\2\6\u008a\3\2\2\2\b\u0098\3\2\2\2\n\u009a\3\2\2\2\f\u00b6"+
		"\3\2\2\2\16\u00c5\3\2\2\2\20\u00c7\3\2\2\2\22\u00f3\3\2\2\2\24\u0107\3"+
		"\2\2\2\26\u010c\3\2\2\2\30\u0114\3\2\2\2\32\u0116\3\2\2\2\34\u011b\3\2"+
		"\2\2\36\u011e\3\2\2\2 \u0120\3\2\2\2\"\u012a\3\2\2\2$\u012c\3\2\2\2&\u0136"+
		"\3\2\2\2(\u0138\3\2\2\2*\u0141\3\2\2\2,\u0152\3\2\2\2.\u0154\3\2\2\2\60"+
		"\u0157\3\2\2\2\62\u015a\3\2\2\2\64\u015d\3\2\2\2\66\u0169\3\2\2\28\u0170"+
		"\3\2\2\2:\u0175\3\2\2\2<\u0177\3\2\2\2>\u017a\3\2\2\2@\u017c\3\2\2\2B"+
		"\u017f\3\2\2\2D\u0181\3\2\2\2F\u0186\3\2\2\2H\u0190\3\2\2\2J\u0199\3\2"+
		"\2\2L\u019d\3\2\2\2N\u01ab\3\2\2\2P\u01b4\3\2\2\2R\u01c7\3\2\2\2T\u01ca"+
		"\3\2\2\2V\u01cd\3\2\2\2X\u01d0\3\2\2\2Z\u01d3\3\2\2\2\\\u01d5\3\2\2\2"+
		"^\u01d7\3\2\2\2`\u01d9\3\2\2\2b\u01db\3\2\2\2d\u01de\3\2\2\2f\u01e4\3"+
		"\2\2\2h\u01e6\3\2\2\2j\u01e8\3\2\2\2l\u01ea\3\2\2\2np\7\65\2\2on\3\2\2"+
		"\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rw\3\2\2\2sq\3\2\2\2tv\5\4\3\2ut\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z~\5\b\5\2{}\7\65"+
		"\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2"+
		"\u0080~\3\2\2\2\u0081\u0082\7\2\2\3\u0082\3\3\2\2\2\u0083\u0085\5\b\5"+
		"\2\u0084\u0086\7\65\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\5\3\2\2\2\u0089\u008b\5\4\3\2"+
		"\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\7\3\2\2\2\u008e\u0099\5\16\b\2\u008f\u0099\5\20\t\2\u0090"+
		"\u0099\5\22\n\2\u0091\u0099\5\24\13\2\u0092\u0099\5\26\f\2\u0093\u0099"+
		"\5.\30\2\u0094\u0099\5\60\31\2\u0095\u0099\5\n\6\2\u0096\u0099\5\32\16"+
		"\2\u0097\u0099\5\f\7\2\u0098\u008e\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0090"+
		"\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0093\3\2\2\2\u0098"+
		"\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2"+
		"\2\2\u0099\t\3\2\2\2\u009a\u009b\5\34\17\2\u009b\u009d\7\3\2\2\u009c\u009e"+
		"\5 \21\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a3\7\4\2\2\u00a0\u00a2\7\65\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00aa\7\5\2\2\u00a7\u00a9\7\65\2\2\u00a8\u00a7\3"+
		"\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\5\6\4\2\u00ae\u00b0\7\65"+
		"\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\6"+
		"\2\2\u00b5\13\3\2\2\2\u00b6\u00b7\5\34\17\2\u00b7\u00b9\7\3\2\2\u00b8"+
		"\u00ba\5$\23\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bc\7\4\2\2\u00bc\r\3\2\2\2\u00bd\u00be\5@!\2\u00be\u00bf"+
		"\7\7\2\2\u00bf\u00c0\5\66\34\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\5\62\32"+
		"\2\u00c2\u00c3\7\7\2\2\u00c3\u00c4\5(\25\2\u00c4\u00c6\3\2\2\2\u00c5\u00bd"+
		"\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\17\3\2\2\2\u00c7\u00c8\7\"\2\2\u00c8"+
		"\u00c9\7\3\2\2\u00c9\u00ca\5\66\34\2\u00ca\u00ce\7\4\2\2\u00cb\u00cd\7"+
		"\65\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\7\5"+
		"\2\2\u00d2\u00d4\7\65\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00d9\5\6\4\2\u00d9\u00dd\7\6\2\2\u00da\u00dc\7\65\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00f1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e4\7$\2\2\u00e1"+
		"\u00e3\7\65\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00eb\7\5\2\2\u00e8\u00ea\7\65\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\5\6\4\2\u00ef\u00f0\7\6\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00e0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\21\3\2\2\2\u00f3\u00f4"+
		"\7(\2\2\u00f4\u00f5\7\3\2\2\u00f5\u00f6\5\66\34\2\u00f6\u00fa\7\4\2\2"+
		"\u00f7\u00f9\7\65\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u0101\7\5\2\2\u00fe\u0100\7\65\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3"+
		"\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0105\5\6\4\2\u0105\u0106\7\6\2\2\u0106\23\3\2\2"+
		"\2\u0107\u0108\7\'\2\2\u0108\u0109\7\3\2\2\u0109\u010a\5&\24\2\u010a\u010b"+
		"\7\4\2\2\u010b\25\3\2\2\2\u010c\u010d\7)\2\2\u010d\u010e\7\b\2\2\u010e"+
		"\u010f\5\30\r\2\u010f\27\3\2\2\2\u0110\u0115\5D#\2\u0111\u0115\5F$\2\u0112"+
		"\u0115\5H%\2\u0113\u0115\5J&\2\u0114\u0110\3\2\2\2\u0114\u0111\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\31\3\2\2\2\u0116\u0119"+
		"\7/\2\2\u0117\u011a\5(\25\2\u0118\u011a\5\66\34\2\u0119\u0117\3\2\2\2"+
		"\u0119\u0118\3\2\2\2\u011a\33\3\2\2\2\u011b\u011c\5\36\20\2\u011c\u011d"+
		"\7\61\2\2\u011d\35\3\2\2\2\u011e\u011f\7\t\2\2\u011f\37\3\2\2\2\u0120"+
		"\u0125\5\"\22\2\u0121\u0122\7\n\2\2\u0122\u0124\5\"\22\2\u0123\u0121\3"+
		"\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"!\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012b\5@!\2\u0129\u012b\5\62\32\2"+
		"\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b#\3\2\2\2\u012c\u0131\5"+
		"&\24\2\u012d\u012e\7\n\2\2\u012e\u0130\5&\24\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132%\3\2\2\2"+
		"\u0133\u0131\3\2\2\2\u0134\u0137\5\66\34\2\u0135\u0137\5(\25\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0135\3\2\2\2\u0137\'\3\2\2\2\u0138\u013e\5*\26\2\u0139"+
		"\u013a\5^\60\2\u013a\u013b\5*\26\2\u013b\u013d\3\2\2\2\u013c\u0139\3\2"+
		"\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		")\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0147\5,\27\2\u0142\u0143\5`\61\2"+
		"\u0143\u0144\5,\27\2\u0144\u0146\3\2\2\2\u0145\u0142\3\2\2\2\u0146\u0149"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148+\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014b\7\3\2\2\u014b\u014c\5(\25\2\u014c\u014d\7\4"+
		"\2\2\u014d\u0153\3\2\2\2\u014e\u0153\5d\63\2\u014f\u0153\5\62\32\2\u0150"+
		"\u0153\5.\30\2\u0151\u0153\5\60\31\2\u0152\u014a\3\2\2\2\u0152\u014e\3"+
		"\2\2\2\u0152\u014f\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"-\3\2\2\2\u0154\u0155\t\2\2\2\u0155\u0156\5\62\32\2\u0156/\3\2\2\2\u0157"+
		"\u0158\5\62\32\2\u0158\u0159\t\2\2\2\u0159\61\3\2\2\2\u015a\u015b\5\64"+
		"\33\2\u015b\u015c\7\61\2\2\u015c\63\3\2\2\2\u015d\u015e\7\r\2\2\u015e"+
		"\65\3\2\2\2\u015f\u0163\58\35\2\u0160\u0161\5\\/\2\u0161\u0162\58\35\2"+
		"\u0162\u0164\3\2\2\2\u0163\u0160\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u016a"+
		"\3\2\2\2\u0165\u0166\5(\25\2\u0166\u0167\5Z.\2\u0167\u0168\5(\25\2\u0168"+
		"\u016a\3\2\2\2\u0169\u015f\3\2\2\2\u0169\u0165\3\2\2\2\u016a\67\3\2\2"+
		"\2\u016b\u016c\7\3\2\2\u016c\u016d\5\66\34\2\u016d\u016e\7\4\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u0171\5:\36\2\u0170\u016b\3\2\2\2\u0170\u016f\3\2"+
		"\2\2\u01719\3\2\2\2\u0172\u0176\5<\37\2\u0173\u0176\5@!\2\u0174\u0176"+
		"\5b\62\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176"+
		";\3\2\2\2\u0177\u0178\5> \2\u0178\u0179\5\66\34\2\u0179=\3\2\2\2\u017a"+
		"\u017b\7\16\2\2\u017b?\3\2\2\2\u017c\u017d\5B\"\2\u017d\u017e\7\61\2\2"+
		"\u017eA\3\2\2\2\u017f\u0180\7\17\2\2\u0180C\3\2\2\2\u0181\u0182\7*\2\2"+
		"\u0182\u0183\7\3\2\2\u0183\u0184\5(\25\2\u0184\u0185\7\4\2\2\u0185E\3"+
		"\2\2\2\u0186\u0187\7+\2\2\u0187\u0188\7\20\2\2\u0188\u0189\5(\25\2\u0189"+
		"\u018a\7\21\2\2\u018a\u018b\7\b\2\2\u018b\u018c\7*\2\2\u018c\u018d\7\3"+
		"\2\2\u018d\u018e\5(\25\2\u018e\u018f\7\4\2\2\u018fG\3\2\2\2\u0190\u0191"+
		"\7,\2\2\u0191\u0192\7\20\2\2\u0192\u0193\5(\25\2\u0193\u0194\7\21\2\2"+
		"\u0194\u0197\7\b\2\2\u0195\u0198\5L\'\2\u0196\u0198\5N(\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0196\3\2\2\2\u0198I\3\2\2\2\u0199\u019a\7.\2\2\u019a\u019b"+
		"\7\3\2\2\u019b\u019c\7\4\2\2\u019cK\3\2\2\2\u019d\u019e\7*\2\2\u019e\u01a2"+
		"\7\3\2\2\u019f\u01a0\5(\25\2\u01a0\u01a1\7\n\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u019f\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a7\5("+
		"\25\2\u01a5\u01a6\7\n\2\2\u01a6\u01a8\5P)\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7\4\2\2\u01aaM\3\2\2\2"+
		"\u01ab\u01ac\7-\2\2\u01ac\u01ad\7\3\2\2\u01ad\u01b0\5(\25\2\u01ae\u01af"+
		"\7\n\2\2\u01af\u01b1\5P)\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\7\4\2\2\u01b3O\3\2\2\2\u01b4\u01b7\7\5\2\2"+
		"\u01b5\u01b8\5R*\2\u01b6\u01b8\5(\25\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01ba\7\n\2\2\u01ba"+
		"\u01bc\5T+\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2\2"+
		"\2\u01bd\u01be\7\n\2\2\u01be\u01c0\5V,\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01c2\7\n\2\2\u01c2\u01c4\5X-\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\7\6"+
		"\2\2\u01c6Q\3\2\2\2\u01c7\u01c8\7\22\2\2\u01c8\u01c9\5(\25\2\u01c9S\3"+
		"\2\2\2\u01ca\u01cb\7\23\2\2\u01cb\u01cc\5(\25\2\u01ccU\3\2\2\2\u01cd\u01ce"+
		"\7\24\2\2\u01ce\u01cf\5(\25\2\u01cfW\3\2\2\2\u01d0\u01d1\7\25\2\2\u01d1"+
		"\u01d2\5(\25\2\u01d2Y\3\2\2\2\u01d3\u01d4\t\3\2\2\u01d4[\3\2\2\2\u01d5"+
		"\u01d6\t\4\2\2\u01d6]\3\2\2\2\u01d7\u01d8\t\5\2\2\u01d8_\3\2\2\2\u01d9"+
		"\u01da\t\6\2\2\u01daa\3\2\2\2\u01db\u01dc\t\7\2\2\u01dcc\3\2\2\2\u01dd"+
		"\u01df\5l\67\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0\u01e1\5f\64\2\u01e1e\3\2\2\2\u01e2\u01e5\5h\65\2\u01e3\u01e5"+
		"\5j\66\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5g\3\2\2\2\u01e6"+
		"\u01e7\7\63\2\2\u01e7i\3\2\2\2\u01e8\u01e9\7\64\2\2\u01e9k\3\2\2\2\u01ea"+
		"\u01eb\7\37\2\2\u01ebm\3\2\2\2-qw~\u0087\u008c\u0098\u009d\u00a3\u00aa"+
		"\u00b1\u00b9\u00c5\u00ce\u00d5\u00dd\u00e4\u00eb\u00f1\u00fa\u0101\u0114"+
		"\u0119\u0125\u012a\u0131\u0136\u013e\u0147\u0152\u0163\u0169\u0170\u0175"+
		"\u0197\u01a2\u01a7\u01b0\u01b7\u01bb\u01bf\u01c3\u01de\u01e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}