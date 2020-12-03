// Generated from /Users/tony/CS153/proj-repository/CS153-Compiler-Design/FINAL PROJECT/Segfault.g4 by ANTLR 4.8

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
public class SegfaultParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, TYPE=29, OF=30, VAR=31, AND=32, 
		OR=33, NOT=34, IF=35, THEN=36, ELSE=37, UNTIL=38, TRUE=39, FALSE=40, PRINT=41, 
		FUNC=42, WHILE=43, SYNTH=44, SET=45, CHANNEL=46, NOTE=47, LERP=48, START=49, 
		COMMENT=50, IDENTIFIER=51, LETTER=52, INTEGER=53, DOUBLE=54, NEWLINE=55, 
		WS=56;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignmentStatement = 2, RULE_ifStatement = 3, 
		RULE_whileStatement = 4, RULE_printStatement = 5, RULE_printArguments = 6, 
		RULE_synthStatement = 7, RULE_synthFunction = 8, RULE_numericalExpression = 9, 
		RULE_term = 10, RULE_factor = 11, RULE_numIdentifier = 12, RULE_numSymbol = 13, 
		RULE_booleanExpression = 14, RULE_booleanTerm = 15, RULE_booleanSingleton = 16, 
		RULE_boolIdentifier = 17, RULE_boolSymbol = 18, RULE_notSymbol = 19, RULE_orSymbol = 20, 
		RULE_andSymbol = 21, RULE_synthSetFunction = 22, RULE_synthChannelFunction = 23, 
		RULE_synthNoteFunction = 24, RULE_synthStartFunction = 25, RULE_synthNoteSet = 26, 
		RULE_synthNoteLerp = 27, RULE_synthPointStatement = 28, RULE_synthMidiPitch = 29, 
		RULE_synthVolume = 30, RULE_synthVibratoAmplitude = 31, RULE_synthVibratoFrequency = 32, 
		RULE_relOp = 33, RULE_boolOp = 34, RULE_addOp = 35, RULE_mulOp = 36, RULE_booleanConstant = 37, 
		RULE_numberConstant = 38, RULE_unsignedNumber = 39, RULE_unsignedintegerConstant = 40, 
		RULE_unsigneddoubleConstant = 41, RULE_sign = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignmentStatement", "ifStatement", "whileStatement", 
			"printStatement", "printArguments", "synthStatement", "synthFunction", 
			"numericalExpression", "term", "factor", "numIdentifier", "numSymbol", 
			"booleanExpression", "booleanTerm", "booleanSingleton", "boolIdentifier", 
			"boolSymbol", "notSymbol", "orSymbol", "andSymbol", "synthSetFunction", 
			"synthChannelFunction", "synthNoteFunction", "synthStartFunction", "synthNoteSet", 
			"synthNoteLerp", "synthPointStatement", "synthMidiPitch", "synthVolume", 
			"synthVibratoAmplitude", "synthVibratoFrequency", "relOp", "boolOp", 
			"addOp", "mulOp", "booleanConstant", "numberConstant", "unsignedNumber", 
			"unsignedintegerConstant", "unsigneddoubleConstant", "sign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'{'", "'}'", "'.'", "'#'", "'$'", "'!'", 
			"'|'", "'&'", "'['", "']'", "','", "'m'", "'v'", "'a'", "'f'", "'=='", 
			"'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "TYPE", "OF", "VAR", "AND", "OR", "NOT", 
			"IF", "THEN", "ELSE", "UNTIL", "TRUE", "FALSE", "PRINT", "FUNC", "WHILE", 
			"SYNTH", "SET", "CHANNEL", "NOTE", "LERP", "START", "COMMENT", "IDENTIFIER", 
			"LETTER", "INTEGER", "DOUBLE", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Segfault.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SegfaultParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				statement();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << IF) | (1L << PRINT) | (1L << WHILE))) != 0) );
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				assignmentStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				whileStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				printStatement();
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignmentStatement);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				boolIdentifier();
				setState(98);
				match(T__0);
				setState(99);
				booleanExpression();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				numIdentifier();
				setState(102);
				match(T__0);
				setState(103);
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
		public TerminalNode IF() { return getToken(SegfaultParser.IF, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SegfaultParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IF);
			setState(108);
			match(T__1);
			setState(109);
			booleanExpression();
			setState(110);
			match(T__2);
			setState(111);
			match(T__3);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				statement();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << IF) | (1L << PRINT) | (1L << WHILE))) != 0) );
			setState(117);
			match(T__4);
			setState(118);
			match(ELSE);
			setState(119);
			match(T__3);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				statement();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << IF) | (1L << PRINT) | (1L << WHILE))) != 0) );
			setState(125);
			match(T__4);
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
		public TerminalNode WHILE() { return getToken(SegfaultParser.WHILE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(WHILE);
			setState(128);
			match(T__1);
			setState(129);
			booleanExpression();
			setState(130);
			match(T__2);
			setState(131);
			match(T__3);
			setState(132);
			statement();
			setState(133);
			match(T__4);
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
		public TerminalNode PRINT() { return getToken(SegfaultParser.PRINT, 0); }
		public PrintArgumentsContext printArguments() {
			return getRuleContext(PrintArgumentsContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(PRINT);
			setState(136);
			printArguments();
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

	public static class PrintArgumentsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public PrintArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitPrintArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintArgumentsContext printArguments() throws RecognitionException {
		PrintArgumentsContext _localctx = new PrintArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__1);
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				statement();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << IF) | (1L << PRINT) | (1L << WHILE))) != 0) );
			setState(144);
			match(T__2);
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
		public TerminalNode SYNTH() { return getToken(SegfaultParser.SYNTH, 0); }
		public SynthFunctionContext synthFunction() {
			return getRuleContext(SynthFunctionContext.class,0);
		}
		public SynthStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthStatementContext synthStatement() throws RecognitionException {
		SynthStatementContext _localctx = new SynthStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_synthStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(SYNTH);
			setState(147);
			match(T__5);
			setState(148);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthFunctionContext synthFunction() throws RecognitionException {
		SynthFunctionContext _localctx = new SynthFunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_synthFunction);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				synthSetFunction();
				}
				break;
			case CHANNEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				synthChannelFunction();
				}
				break;
			case NOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				synthNoteFunction();
				}
				break;
			case START:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitNumericalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalExpressionContext numericalExpression() throws RecognitionException {
		NumericalExpressionContext _localctx = new NumericalExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numericalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			term();
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					addOp();
					setState(158);
					term();
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			factor();
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					mulOp();
					setState(167);
					factor();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__1);
				setState(175);
				numericalExpression();
				setState(176);
				match(T__2);
				}
				break;
			case T__25:
			case INTEGER:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				numberConstant();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
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

	public static class NumIdentifierContext extends ParserRuleContext {
		public NumSymbolContext numSymbol() {
			return getRuleContext(NumSymbolContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SegfaultParser.IDENTIFIER, 0); }
		public NumIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitNumIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumIdentifierContext numIdentifier() throws RecognitionException {
		NumIdentifierContext _localctx = new NumIdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			numSymbol();
			setState(183);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitNumSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumSymbolContext numSymbol() throws RecognitionException {
		NumSymbolContext _localctx = new NumSymbolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_booleanExpression);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				booleanTerm();
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(188);
					boolOp();
					setState(189);
					booleanTerm();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				numericalExpression();
				setState(194);
				relOp();
				setState(195);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBooleanTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTermContext booleanTerm() throws RecognitionException {
		BooleanTermContext _localctx = new BooleanTermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_booleanTerm);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(T__1);
				setState(200);
				booleanExpression();
				setState(201);
				match(T__2);
				}
				break;
			case T__7:
			case T__8:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
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
		public NotSymbolContext notSymbol() {
			return getRuleContext(NotSymbolContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBooleanSingleton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanSingletonContext booleanSingleton() throws RecognitionException {
		BooleanSingletonContext _localctx = new BooleanSingletonContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_booleanSingleton);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				notSymbol();
				setState(207);
				booleanExpression();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				boolIdentifier();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
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

	public static class BoolIdentifierContext extends ParserRuleContext {
		public BoolSymbolContext boolSymbol() {
			return getRuleContext(BoolSymbolContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SegfaultParser.IDENTIFIER, 0); }
		public BoolIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBoolIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolIdentifierContext boolIdentifier() throws RecognitionException {
		BoolIdentifierContext _localctx = new BoolIdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			boolSymbol();
			setState(214);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBoolSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolSymbolContext boolSymbol() throws RecognitionException {
		BoolSymbolContext _localctx = new BoolSymbolContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__7);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitNotSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotSymbolContext notSymbol() throws RecognitionException {
		NotSymbolContext _localctx = new NotSymbolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_notSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__8);
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

	public static class OrSymbolContext extends ParserRuleContext {
		public OrSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitOrSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrSymbolContext orSymbol() throws RecognitionException {
		OrSymbolContext _localctx = new OrSymbolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_orSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__9);
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

	public static class AndSymbolContext extends ParserRuleContext {
		public AndSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitAndSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndSymbolContext andSymbol() throws RecognitionException {
		AndSymbolContext _localctx = new AndSymbolContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_andSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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

	public static class SynthSetFunctionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SegfaultParser.SET, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthSetFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthSetFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthSetFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthSetFunctionContext synthSetFunction() throws RecognitionException {
		SynthSetFunctionContext _localctx = new SynthSetFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_synthSetFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(SET);
			setState(225);
			match(T__1);
			setState(226);
			numericalExpression();
			setState(227);
			match(T__2);
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
		public TerminalNode CHANNEL() { return getToken(SegfaultParser.CHANNEL, 0); }
		public List<NumericalExpressionContext> numericalExpression() {
			return getRuleContexts(NumericalExpressionContext.class);
		}
		public NumericalExpressionContext numericalExpression(int i) {
			return getRuleContext(NumericalExpressionContext.class,i);
		}
		public TerminalNode SET() { return getToken(SegfaultParser.SET, 0); }
		public SynthChannelFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthChannelFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthChannelFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthChannelFunctionContext synthChannelFunction() throws RecognitionException {
		SynthChannelFunctionContext _localctx = new SynthChannelFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_synthChannelFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(CHANNEL);
			setState(230);
			match(T__11);
			setState(231);
			numericalExpression();
			setState(232);
			match(T__12);
			setState(233);
			match(T__5);
			setState(234);
			match(SET);
			setState(235);
			match(T__1);
			setState(236);
			numericalExpression();
			setState(237);
			match(T__2);
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
		public TerminalNode NOTE() { return getToken(SegfaultParser.NOTE, 0); }
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthNoteFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthNoteFunctionContext synthNoteFunction() throws RecognitionException {
		SynthNoteFunctionContext _localctx = new SynthNoteFunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_synthNoteFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(NOTE);
			setState(240);
			match(T__11);
			setState(241);
			numericalExpression();
			setState(242);
			match(T__12);
			setState(243);
			match(T__5);
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(244);
				synthNoteSet();
				}
				break;
			case LERP:
				{
				setState(245);
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
		public TerminalNode START() { return getToken(SegfaultParser.START, 0); }
		public SynthStartFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthStartFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthStartFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthStartFunctionContext synthStartFunction() throws RecognitionException {
		SynthStartFunctionContext _localctx = new SynthStartFunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_synthStartFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(START);
			setState(249);
			match(T__1);
			setState(250);
			match(T__2);
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
		public TerminalNode SET() { return getToken(SegfaultParser.SET, 0); }
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthNoteSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthNoteSetContext synthNoteSet() throws RecognitionException {
		SynthNoteSetContext _localctx = new SynthNoteSetContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_synthNoteSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(SET);
			setState(253);
			match(T__1);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(254);
				numericalExpression();
				setState(255);
				match(T__13);
				}
				break;
			}
			setState(259);
			numericalExpression();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(260);
				match(T__13);
				setState(261);
				synthPointStatement();
				}
			}

			setState(264);
			match(T__2);
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
		public TerminalNode LERP() { return getToken(SegfaultParser.LERP, 0); }
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthNoteLerp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthNoteLerpContext synthNoteLerp() throws RecognitionException {
		SynthNoteLerpContext _localctx = new SynthNoteLerpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_synthNoteLerp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(LERP);
			setState(267);
			match(T__1);
			setState(268);
			numericalExpression();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(269);
				match(T__13);
				setState(270);
				synthPointStatement();
				}
			}

			setState(273);
			match(T__2);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthPointStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthPointStatementContext synthPointStatement() throws RecognitionException {
		SynthPointStatementContext _localctx = new SynthPointStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_synthPointStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__3);
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(276);
				synthMidiPitch();
				}
				break;
			case T__1:
			case T__6:
			case T__25:
			case INTEGER:
			case DOUBLE:
				{
				setState(277);
				numericalExpression();
				}
				break;
			case T__4:
			case T__13:
				break;
			default:
				break;
			}
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(280);
				match(T__13);
				setState(281);
				synthVolume();
				}
				break;
			}
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(284);
				match(T__13);
				setState(285);
				synthVibratoAmplitude();
				}
				break;
			}
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(288);
				match(T__13);
				setState(289);
				synthVibratoFrequency();
				}
			}

			setState(292);
			match(T__4);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthMidiPitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthMidiPitchContext synthMidiPitch() throws RecognitionException {
		SynthMidiPitchContext _localctx = new SynthMidiPitchContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_synthMidiPitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__14);
			setState(295);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthVolume(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthVolumeContext synthVolume() throws RecognitionException {
		SynthVolumeContext _localctx = new SynthVolumeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_synthVolume);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__15);
			setState(298);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthVibratoAmplitude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthVibratoAmplitudeContext synthVibratoAmplitude() throws RecognitionException {
		SynthVibratoAmplitudeContext _localctx = new SynthVibratoAmplitudeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_synthVibratoAmplitude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__16);
			setState(301);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthVibratoFrequency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthVibratoFrequencyContext synthVibratoFrequency() throws RecognitionException {
		SynthVibratoFrequencyContext _localctx = new SynthVibratoFrequencyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_synthVibratoFrequency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__17);
			setState(304);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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
		public AndSymbolContext andSymbol() {
			return getRuleContext(AndSymbolContext.class,0);
		}
		public OrSymbolContext orSymbol() {
			return getRuleContext(OrSymbolContext.class,0);
		}
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_boolOp);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				andSymbol();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				orSymbol();
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

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_addOp);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(T__25);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class MulOpContext extends ParserRuleContext {
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mulOp);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(T__27);
				}
				break;
			case T__1:
			case T__6:
			case T__25:
			case INTEGER:
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class BooleanConstantContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SegfaultParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SegfaultParser.FALSE, 0); }
		public BooleanConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConstantContext booleanConstant() throws RecognitionException {
		BooleanConstantContext _localctx = new BooleanConstantContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_booleanConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitNumberConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberConstantContext numberConstant() throws RecognitionException {
		NumberConstantContext _localctx = new NumberConstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_numberConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(324);
				sign();
				}
			}

			setState(327);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_unsignedNumber);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				unsignedintegerConstant();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
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
		public TerminalNode INTEGER() { return getToken(SegfaultParser.INTEGER, 0); }
		public UnsignedintegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedintegerConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitUnsignedintegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedintegerConstantContext unsignedintegerConstant() throws RecognitionException {
		UnsignedintegerConstantContext _localctx = new UnsignedintegerConstantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unsignedintegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		public TerminalNode DOUBLE() { return getToken(SegfaultParser.DOUBLE, 0); }
		public UnsigneddoubleConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigneddoubleConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitUnsigneddoubleConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsigneddoubleConstantContext unsigneddoubleConstant() throws RecognitionException {
		UnsigneddoubleConstantContext _localctx = new UnsigneddoubleConstantContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unsigneddoubleConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__25);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\6\2Z\n\2\r\2\16\2[\3\3\3\3\3\3\3\3\5\3b\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5t\n\5\r\5\16\5u\3\5"+
		"\3\5\3\5\3\5\6\5|\n\5\r\5\16\5}\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\6\b\u008f\n\b\r\b\16\b\u0090\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\5\n\u009d\n\n\3\13\3\13\3\13\3\13\7\13\u00a3\n"+
		"\13\f\13\16\13\u00a6\13\13\3\f\3\f\3\f\3\f\7\f\u00ac\n\f\f\f\16\f\u00af"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b7\n\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\5\20\u00c2\n\20\3\20\3\20\3\20\3\20\5\20\u00c8\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00cf\n\21\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00d6\n\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f9\n\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0104\n\34\3\34\3\34\3\34\5\34\u0109\n"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0112\n\35\3\35\3\35\3\36"+
		"\3\36\3\36\5\36\u0119\n\36\3\36\3\36\5\36\u011d\n\36\3\36\3\36\5\36\u0121"+
		"\n\36\3\36\3\36\5\36\u0125\n\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3$\3$\5$\u0139\n$\3%\3%\3%\5%\u013e\n%\3&\3&\3"+
		"&\5&\u0143\n&\3\'\3\'\3(\5(\u0148\n(\3(\3(\3)\3)\5)\u014e\n)\3*\3*\3+"+
		"\3+\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTV\2\4\3\2\25\32\3\2)*\2\u014e\2Y\3\2\2\2\4a\3\2\2"+
		"\2\6k\3\2\2\2\bm\3\2\2\2\n\u0081\3\2\2\2\f\u0089\3\2\2\2\16\u008c\3\2"+
		"\2\2\20\u0094\3\2\2\2\22\u009c\3\2\2\2\24\u009e\3\2\2\2\26\u00a7\3\2\2"+
		"\2\30\u00b6\3\2\2\2\32\u00b8\3\2\2\2\34\u00bb\3\2\2\2\36\u00c7\3\2\2\2"+
		" \u00ce\3\2\2\2\"\u00d5\3\2\2\2$\u00d7\3\2\2\2&\u00da\3\2\2\2(\u00dc\3"+
		"\2\2\2*\u00de\3\2\2\2,\u00e0\3\2\2\2.\u00e2\3\2\2\2\60\u00e7\3\2\2\2\62"+
		"\u00f1\3\2\2\2\64\u00fa\3\2\2\2\66\u00fe\3\2\2\28\u010c\3\2\2\2:\u0115"+
		"\3\2\2\2<\u0128\3\2\2\2>\u012b\3\2\2\2@\u012e\3\2\2\2B\u0131\3\2\2\2D"+
		"\u0134\3\2\2\2F\u0138\3\2\2\2H\u013d\3\2\2\2J\u0142\3\2\2\2L\u0144\3\2"+
		"\2\2N\u0147\3\2\2\2P\u014d\3\2\2\2R\u014f\3\2\2\2T\u0151\3\2\2\2V\u0153"+
		"\3\2\2\2XZ\5\4\3\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\3\3\2\2"+
		"\2]b\5\6\4\2^b\5\b\5\2_b\5\n\6\2`b\5\f\7\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2"+
		"\2a`\3\2\2\2b\5\3\2\2\2cd\5$\23\2de\7\3\2\2ef\5\36\20\2fl\3\2\2\2gh\5"+
		"\32\16\2hi\7\3\2\2ij\5\24\13\2jl\3\2\2\2kc\3\2\2\2kg\3\2\2\2l\7\3\2\2"+
		"\2mn\7%\2\2no\7\4\2\2op\5\36\20\2pq\7\5\2\2qs\7\6\2\2rt\5\4\3\2sr\3\2"+
		"\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\7\2\2xy\7\'\2\2y{\7\6"+
		"\2\2z|\5\4\3\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\7\7\2\2\u0080\t\3\2\2\2\u0081\u0082\7-\2\2\u0082\u0083\7\4\2\2"+
		"\u0083\u0084\5\36\20\2\u0084\u0085\7\5\2\2\u0085\u0086\7\6\2\2\u0086\u0087"+
		"\5\4\3\2\u0087\u0088\7\7\2\2\u0088\13\3\2\2\2\u0089\u008a\7+\2\2\u008a"+
		"\u008b\5\16\b\2\u008b\r\3\2\2\2\u008c\u008e\7\4\2\2\u008d\u008f\5\4\3"+
		"\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\5\2\2\u0093\17\3\2\2\2\u0094"+
		"\u0095\7.\2\2\u0095\u0096\7\b\2\2\u0096\u0097\5\22\n\2\u0097\21\3\2\2"+
		"\2\u0098\u009d\5.\30\2\u0099\u009d\5\60\31\2\u009a\u009d\5\62\32\2\u009b"+
		"\u009d\5\64\33\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009b\3\2\2\2\u009d\23\3\2\2\2\u009e\u00a4\5\26\f\2\u009f"+
		"\u00a0\5H%\2\u00a0\u00a1\5\26\f\2\u00a1\u00a3\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\25\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ad\5\30\r\2\u00a8\u00a9\5J&\2"+
		"\u00a9\u00aa\5\30\r\2\u00aa\u00ac\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00af"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\27\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\7\4\2\2\u00b1\u00b2\5\24\13\2\u00b2\u00b3\7"+
		"\5\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b7\5N(\2\u00b5\u00b7\5\32\16\2\u00b6"+
		"\u00b0\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\31\3\2\2"+
		"\2\u00b8\u00b9\5\34\17\2\u00b9\u00ba\7\65\2\2\u00ba\33\3\2\2\2\u00bb\u00bc"+
		"\7\t\2\2\u00bc\35\3\2\2\2\u00bd\u00c1\5 \21\2\u00be\u00bf\5F$\2\u00bf"+
		"\u00c0\5 \21\2\u00c0\u00c2\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c8\3\2\2\2\u00c3\u00c4\5\24\13\2\u00c4\u00c5\5D#\2\u00c5"+
		"\u00c6\5\24\13\2\u00c6\u00c8\3\2\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00c3\3"+
		"\2\2\2\u00c8\37\3\2\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\5\36\20\2\u00cb"+
		"\u00cc\7\5\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\5\"\22\2\u00ce\u00c9\3"+
		"\2\2\2\u00ce\u00cd\3\2\2\2\u00cf!\3\2\2\2\u00d0\u00d1\5(\25\2\u00d1\u00d2"+
		"\5\36\20\2\u00d2\u00d6\3\2\2\2\u00d3\u00d6\5$\23\2\u00d4\u00d6\5L\'\2"+
		"\u00d5\u00d0\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6#\3"+
		"\2\2\2\u00d7\u00d8\5&\24\2\u00d8\u00d9\7\65\2\2\u00d9%\3\2\2\2\u00da\u00db"+
		"\7\n\2\2\u00db\'\3\2\2\2\u00dc\u00dd\7\13\2\2\u00dd)\3\2\2\2\u00de\u00df"+
		"\7\f\2\2\u00df+\3\2\2\2\u00e0\u00e1\7\r\2\2\u00e1-\3\2\2\2\u00e2\u00e3"+
		"\7/\2\2\u00e3\u00e4\7\4\2\2\u00e4\u00e5\5\24\13\2\u00e5\u00e6\7\5\2\2"+
		"\u00e6/\3\2\2\2\u00e7\u00e8\7\60\2\2\u00e8\u00e9\7\16\2\2\u00e9\u00ea"+
		"\5\24\13\2\u00ea\u00eb\7\17\2\2\u00eb\u00ec\7\b\2\2\u00ec\u00ed\7/\2\2"+
		"\u00ed\u00ee\7\4\2\2\u00ee\u00ef\5\24\13\2\u00ef\u00f0\7\5\2\2\u00f0\61"+
		"\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\7\16\2\2\u00f3\u00f4\5\24\13"+
		"\2\u00f4\u00f5\7\17\2\2\u00f5\u00f8\7\b\2\2\u00f6\u00f9\5\66\34\2\u00f7"+
		"\u00f9\58\35\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\63\3\2\2"+
		"\2\u00fa\u00fb\7\63\2\2\u00fb\u00fc\7\4\2\2\u00fc\u00fd\7\5\2\2\u00fd"+
		"\65\3\2\2\2\u00fe\u00ff\7/\2\2\u00ff\u0103\7\4\2\2\u0100\u0101\5\24\13"+
		"\2\u0101\u0102\7\20\2\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\5\24\13\2\u0106\u0107\7"+
		"\20\2\2\u0107\u0109\5:\36\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\7\5\2\2\u010b\67\3\2\2\2\u010c\u010d\7\62\2"+
		"\2\u010d\u010e\7\4\2\2\u010e\u0111\5\24\13\2\u010f\u0110\7\20\2\2\u0110"+
		"\u0112\5:\36\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0114\7\5\2\2\u01149\3\2\2\2\u0115\u0118\7\6\2\2\u0116\u0119"+
		"\5<\37\2\u0117\u0119\5\24\13\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2"+
		"\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u011b\7\20\2\2\u011b\u011d"+
		"\5> \2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011f\7\20\2\2\u011f\u0121\5@!\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0124\3\2\2\2\u0122\u0123\7\20\2\2\u0123\u0125\5B\"\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\7"+
		"\2\2\u0127;\3\2\2\2\u0128\u0129\7\21\2\2\u0129\u012a\5\24\13\2\u012a="+
		"\3\2\2\2\u012b\u012c\7\22\2\2\u012c\u012d\5\24\13\2\u012d?\3\2\2\2\u012e"+
		"\u012f\7\23\2\2\u012f\u0130\5\24\13\2\u0130A\3\2\2\2\u0131\u0132\7\24"+
		"\2\2\u0132\u0133\5\24\13\2\u0133C\3\2\2\2\u0134\u0135\t\2\2\2\u0135E\3"+
		"\2\2\2\u0136\u0139\5,\27\2\u0137\u0139\5*\26\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139G\3\2\2\2\u013a\u013e\7\33\2\2\u013b\u013e\7\34\2"+
		"\2\u013c\u013e\3\2\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c"+
		"\3\2\2\2\u013eI\3\2\2\2\u013f\u0143\7\35\2\2\u0140\u0143\7\36\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2"+
		"\2\2\u0143K\3\2\2\2\u0144\u0145\t\3\2\2\u0145M\3\2\2\2\u0146\u0148\5V"+
		",\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\5P)\2\u014aO\3\2\2\2\u014b\u014e\5R*\2\u014c\u014e\5T+\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014eQ\3\2\2\2\u014f\u0150\7\67\2\2"+
		"\u0150S\3\2\2\2\u0151\u0152\78\2\2\u0152U\3\2\2\2\u0153\u0154\7\34\2\2"+
		"\u0154W\3\2\2\2\35[aku}\u0090\u009c\u00a4\u00ad\u00b6\u00c1\u00c7\u00ce"+
		"\u00d5\u00f8\u0103\u0108\u0111\u0118\u011c\u0120\u0124\u0138\u013d\u0142"+
		"\u0147\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}