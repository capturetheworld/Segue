// Generated from c:\Users\mcnan\Documents\SJSU\Fall 2020\CS 153\CS153-Compiler-Design\HW4\Pcl4.g4 by ANTLR 4.8

    package antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pcl4Parser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_programHeader = 1, RULE_programParameters = 2, 
		RULE_block = 3, RULE_declarations = 4, RULE_statement = 5, RULE_compoundStatement = 6, 
		RULE_emptyStatement = 7, RULE_statementList = 8, RULE_assignmentStatement = 9, 
		RULE_repeatStatement = 10, RULE_whileStatement = 11, RULE_ifStatement = 12, 
		RULE_forStatement = 13, RULE_caseStatement = 14, RULE_lhs = 15, RULE_rhs = 16, 
		RULE_writeStatement = 17, RULE_writelnStatement = 18, RULE_expression = 19, 
		RULE_simpleExpression = 20, RULE_term = 21, RULE_factor = 22, RULE_variable = 23, 
		RULE_number = 24, RULE_unsignedNumber = 25, RULE_integerConstant = 26, 
		RULE_realConstant = 27, RULE_characterConstant = 28, RULE_stringConstant = 29, 
		RULE_constantList = 30, RULE_caseList = 31, RULE_constant = 32, RULE_sign = 33, 
		RULE_relOp = 34, RULE_addOp = 35, RULE_mulOp = 36, RULE_writeArgumentsOn = 37, 
		RULE_writeArgumentListOn = 38, RULE_writeArgumentsLn = 39, RULE_writeArgumentListLn = 40, 
		RULE_writeArgumentList = 41, RULE_writeArgument = 42, RULE_fieldWidth = 43, 
		RULE_decimalPlaces = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeader", "programParameters", "block", "declarations", 
			"statement", "compoundStatement", "emptyStatement", "statementList", 
			"assignmentStatement", "repeatStatement", "whileStatement", "ifStatement", 
			"forStatement", "caseStatement", "lhs", "rhs", "writeStatement", "writelnStatement", 
			"expression", "simpleExpression", "term", "factor", "variable", "number", 
			"unsignedNumber", "integerConstant", "realConstant", "characterConstant", 
			"stringConstant", "constantList", "caseList", "constant", "sign", "relOp", 
			"addOp", "mulOp", "writeArgumentsOn", "writeArgumentListOn", "writeArgumentsLn", 
			"writeArgumentListLn", "writeArgumentList", "writeArgument", "fieldWidth", 
			"decimalPlaces"
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

	@Override
	public String getGrammarFileName() { return "Pcl4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Pcl4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeaderContext programHeader() {
			return getRuleContext(ProgramHeaderContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			programHeader();
			setState(91);
			block();
			setState(92);
			match(T__0);
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

	public static class ProgramHeaderContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(Pcl4Parser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Pcl4Parser.IDENTIFIER, 0); }
		public ProgramParametersContext programParameters() {
			return getRuleContext(ProgramParametersContext.class,0);
		}
		public ProgramHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitProgramHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeaderContext programHeader() throws RecognitionException {
		ProgramHeaderContext _localctx = new ProgramHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(PROGRAM);
			setState(95);
			match(IDENTIFIER);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(96);
				programParameters();
				}
			}

			setState(99);
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

	public static class ProgramParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Pcl4Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Pcl4Parser.IDENTIFIER, i);
		}
		public ProgramParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitProgramParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramParametersContext programParameters() throws RecognitionException {
		ProgramParametersContext _localctx = new ProgramParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__2);
			setState(102);
			match(IDENTIFIER);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(103);
				match(T__3);
				setState(104);
				match(IDENTIFIER);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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

	public static class BlockContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			declarations();
			setState(113);
			compoundStatement();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public WritelnStatementContext writelnStatement() {
			return getRuleContext(WritelnStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				compoundStatement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				assignmentStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				repeatStatement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				writeStatement();
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				writelnStatement();
				}
				break;
			case T__1:
			case END:
			case ELSE:
			case UNTIL:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				emptyStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				whileStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(125);
				forStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 10);
				{
				setState(126);
				caseStatement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(Pcl4Parser.BEGIN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END() { return getToken(Pcl4Parser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(BEGIN);
			setState(130);
			statementList();
			setState(131);
			match(END);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			statement();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(136);
				match(T__1);
				setState(137);
				statement();
				}
				}
				setState(142);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			lhs();
			setState(144);
			match(T__5);
			setState(145);
			rhs();
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

	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(Pcl4Parser.REPEAT, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(Pcl4Parser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(REPEAT);
			setState(148);
			statementList();
			setState(149);
			match(UNTIL);
			setState(150);
			expression();
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
		public TerminalNode WHILE() { return getToken(Pcl4Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(Pcl4Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(WHILE);
			setState(153);
			expression();
			setState(154);
			match(DO);
			setState(155);
			statement();
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
		public TerminalNode IF() { return getToken(Pcl4Parser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Pcl4Parser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Pcl4Parser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IF);
			setState(158);
			expression();
			setState(159);
			match(THEN);
			setState(160);
			statement();
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(161);
				match(ELSE);
				setState(162);
				statement();
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Pcl4Parser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Pcl4Parser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DO() { return getToken(Pcl4Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TO() { return getToken(Pcl4Parser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(Pcl4Parser.DOWNTO, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(FOR);
			setState(166);
			match(IDENTIFIER);
			setState(167);
			match(T__5);
			setState(168);
			expression();
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			expression();
			setState(171);
			match(DO);
			setState(172);
			statement();
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

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Pcl4Parser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(Pcl4Parser.OF, 0); }
		public TerminalNode END() { return getToken(Pcl4Parser.END, 0); }
		public CaseListContext caseList() {
			return getRuleContext(CaseListContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(CASE);
			setState(175);
			expression();
			setState(176);
			match(OF);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << REAL) | (1L << CHARACTER) | (1L << STRING))) != 0)) {
				{
				setState(177);
				caseList();
				}
			}

			setState(180);
			match(END);
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

	public static class LhsContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			variable();
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

	public static class RhsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitRhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			expression();
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

	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(Pcl4Parser.WRITE, 0); }
		public WriteArgumentsOnContext writeArgumentsOn() {
			return getRuleContext(WriteArgumentsOnContext.class,0);
		}
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WRITE);
			setState(187);
			writeArgumentsOn();
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

	public static class WritelnStatementContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(Pcl4Parser.WRITELN, 0); }
		public WriteArgumentsLnContext writeArgumentsLn() {
			return getRuleContext(WriteArgumentsLnContext.class,0);
		}
		public WritelnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writelnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitWritelnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritelnStatementContext writelnStatement() throws RecognitionException {
		WritelnStatementContext _localctx = new WritelnStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_writelnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(WRITELN);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(190);
				writeArgumentsLn();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			simpleExpression();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(194);
				relOp();
				setState(195);
				simpleExpression();
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(199);
				sign();
				}
				break;
			}
			setState(202);
			term();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << OR))) != 0)) {
				{
				{
				setState(203);
				addOp();
				setState(204);
				term();
				}
				}
				setState(210);
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
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			factor();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << DIV) | (1L << MOD) | (1L << AND))) != 0)) {
				{
				{
				setState(212);
				mulOp();
				setState(213);
				factor();
				}
				}
				setState(219);
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
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringFactorContext extends FactorContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public StringFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitStringFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharacterFactorContext extends FactorContext {
		public CharacterConstantContext characterConstant() {
			return getRuleContext(CharacterConstantContext.class,0);
		}
		public CharacterFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitCharacterFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends FactorContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotFactorContext extends FactorContext {
		public TerminalNode NOT() { return getToken(Pcl4Parser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public NotFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitNotFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExpressionContext extends FactorContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				variable();
				}
				break;
			case T__7:
			case T__8:
			case INTEGER:
			case REAL:
				_localctx = new NumberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				number();
				}
				break;
			case CHARACTER:
				_localctx = new CharacterFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				characterConstant();
				}
				break;
			case STRING:
				_localctx = new StringFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				stringConstant();
				}
				break;
			case NOT:
				_localctx = new NotFactorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				match(NOT);
				setState(225);
				factor();
				}
				break;
			case T__2:
				_localctx = new ParenthesizedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(T__2);
				setState(227);
				expression();
				setState(228);
				match(T__4);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Pcl4Parser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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

	public static class NumberContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8) {
				{
				setState(234);
				sign();
				}
			}

			setState(237);
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
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public RealConstantContext realConstant() {
			return getRuleContext(RealConstantContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unsignedNumber);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				integerConstant();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				realConstant();
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

	public static class IntegerConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Pcl4Parser.INTEGER, 0); }
		public IntegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerConstantContext integerConstant() throws RecognitionException {
		IntegerConstantContext _localctx = new IntegerConstantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_integerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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

	public static class RealConstantContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(Pcl4Parser.REAL, 0); }
		public RealConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitRealConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealConstantContext realConstant() throws RecognitionException {
		RealConstantContext _localctx = new RealConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_realConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(REAL);
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

	public static class CharacterConstantContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(Pcl4Parser.CHARACTER, 0); }
		public CharacterConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitCharacterConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterConstantContext characterConstant() throws RecognitionException {
		CharacterConstantContext _localctx = new CharacterConstantContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_characterConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(CHARACTER);
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

	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(Pcl4Parser.STRING, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(STRING);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			constant();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(252);
				match(T__3);
				setState(253);
				constant();
				}
				}
				setState(258);
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

	public static class CaseListContext extends ParserRuleContext {
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseListContext caseList() {
			return getRuleContext(CaseListContext.class,0);
		}
		public CaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitCaseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListContext caseList() throws RecognitionException {
		CaseListContext _localctx = new CaseListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_caseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(259);
			constantList();
			setState(260);
			match(T__6);
			setState(261);
			statement();
			}
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(263);
				match(T__1);
				setState(264);
				caseList();
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

	public static class ConstantContext extends ParserRuleContext {
		public CharacterConstantContext characterConstant() {
			return getRuleContext(CharacterConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Pcl4Parser.IDENTIFIER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constant);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				characterConstant();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				stringConstant();
				}
				break;
			case T__7:
			case T__8:
			case INTEGER:
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				number();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(IDENTIFIER);
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

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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

	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
		public TerminalNode OR() { return getToken(Pcl4Parser.OR, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << OR))) != 0)) ) {
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
		public TerminalNode DIV() { return getToken(Pcl4Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Pcl4Parser.MOD, 0); }
		public TerminalNode AND() { return getToken(Pcl4Parser.AND, 0); }
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << DIV) | (1L << MOD) | (1L << AND))) != 0)) ) {
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

	public static class WriteArgumentsOnContext extends ParserRuleContext {
		public WriteArgumentListOnContext writeArgumentListOn() {
			return getRuleContext(WriteArgumentListOnContext.class,0);
		}
		public WriteArgumentsOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArgumentsOn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitWriteArgumentsOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteArgumentsOnContext writeArgumentsOn() throws RecognitionException {
		WriteArgumentsOnContext _localctx = new WriteArgumentsOnContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_writeArgumentsOn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__2);
			setState(282);
			writeArgumentListOn();
			setState(283);
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

	public static class WriteArgumentListOnContext extends ParserRuleContext {
		public WriteArgumentListContext writeArgumentList() {
			return getRuleContext(WriteArgumentListContext.class,0);
		}
		public WriteArgumentListOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArgumentListOn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitWriteArgumentListOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteArgumentListOnContext writeArgumentListOn() throws RecognitionException {
		WriteArgumentListOnContext _localctx = new WriteArgumentListOnContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_writeArgumentListOn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			writeArgumentList();
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

	public static class WriteArgumentsLnContext extends ParserRuleContext {
		public WriteArgumentListLnContext writeArgumentListLn() {
			return getRuleContext(WriteArgumentListLnContext.class,0);
		}
		public WriteArgumentsLnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArgumentsLn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitWriteArgumentsLn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteArgumentsLnContext writeArgumentsLn() throws RecognitionException {
		WriteArgumentsLnContext _localctx = new WriteArgumentsLnContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_writeArgumentsLn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__2);
			setState(288);
			writeArgumentListLn();
			setState(289);
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

	public static class WriteArgumentListLnContext extends ParserRuleContext {
		public WriteArgumentListContext writeArgumentList() {
			return getRuleContext(WriteArgumentListContext.class,0);
		}
		public WriteArgumentListLnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArgumentListLn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitWriteArgumentListLn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteArgumentListLnContext writeArgumentListLn() throws RecognitionException {
		WriteArgumentListLnContext _localctx = new WriteArgumentListLnContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_writeArgumentListLn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			writeArgumentList();
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

	public static class WriteArgumentListContext extends ParserRuleContext {
		public List<WriteArgumentContext> writeArgument() {
			return getRuleContexts(WriteArgumentContext.class);
		}
		public WriteArgumentContext writeArgument(int i) {
			return getRuleContext(WriteArgumentContext.class,i);
		}
		public WriteArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArgumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitWriteArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteArgumentListContext writeArgumentList() throws RecognitionException {
		WriteArgumentListContext _localctx = new WriteArgumentListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_writeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			writeArgument();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(294);
				match(T__3);
				setState(295);
				writeArgument();
				}
				}
				setState(300);
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

	public static class WriteArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldWidthContext fieldWidth() {
			return getRuleContext(FieldWidthContext.class,0);
		}
		public WriteArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitWriteArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteArgumentContext writeArgument() throws RecognitionException {
		WriteArgumentContext _localctx = new WriteArgumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_writeArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			expression();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(302);
				match(T__6);
				setState(303);
				fieldWidth();
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

	public static class FieldWidthContext extends ParserRuleContext {
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public DecimalPlacesContext decimalPlaces() {
			return getRuleContext(DecimalPlacesContext.class,0);
		}
		public FieldWidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldWidth; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitFieldWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldWidthContext fieldWidth() throws RecognitionException {
		FieldWidthContext _localctx = new FieldWidthContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fieldWidth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8) {
				{
				setState(306);
				sign();
				}
			}

			setState(309);
			integerConstant();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(310);
				match(T__6);
				setState(311);
				decimalPlaces();
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

	public static class DecimalPlacesContext extends ParserRuleContext {
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public DecimalPlacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalPlaces; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl4Visitor ) return ((Pcl4Visitor<? extends T>)visitor).visitDecimalPlaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalPlacesContext decimalPlaces() throws RecognitionException {
		DecimalPlacesContext _localctx = new DecimalPlacesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_decimalPlaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			integerConstant();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u013f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3d\n\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00a6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\5\20\u00b5\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\5\24\u00c2\n\24\3\25\3\25\3\25\3\25\5\25\u00c8\n\25\3\26\5\26\u00cb"+
		"\n\26\3\26\3\26\3\26\3\26\7\26\u00d1\n\26\f\26\16\26\u00d4\13\26\3\27"+
		"\3\27\3\27\3\27\7\27\u00da\n\27\f\27\16\27\u00dd\13\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e9\n\30\3\31\3\31\3\32\5\32"+
		"\u00ee\n\32\3\32\3\32\3\33\3\33\5\33\u00f4\n\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \7 \u0101\n \f \16 \u0104\13 \3!\3!\3!\3!\3"+
		"!\3!\5!\u010c\n!\3\"\3\"\3\"\3\"\5\"\u0112\n\"\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3+\7+\u012b\n+\f+\16+"+
		"\u012e\13+\3,\3,\3,\5,\u0133\n,\3-\5-\u0136\n-\3-\3-\3-\5-\u013b\n-\3"+
		".\3.\3.\2\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\2\7\3\2+,\3\2\n\13\3\2\f\21\4\2\n\13  \4\2\22\23"+
		"\35\37\2\u0134\2\\\3\2\2\2\4`\3\2\2\2\6g\3\2\2\2\br\3\2\2\2\nu\3\2\2\2"+
		"\f\u0081\3\2\2\2\16\u0083\3\2\2\2\20\u0087\3\2\2\2\22\u0089\3\2\2\2\24"+
		"\u0091\3\2\2\2\26\u0095\3\2\2\2\30\u009a\3\2\2\2\32\u009f\3\2\2\2\34\u00a7"+
		"\3\2\2\2\36\u00b0\3\2\2\2 \u00b8\3\2\2\2\"\u00ba\3\2\2\2$\u00bc\3\2\2"+
		"\2&\u00bf\3\2\2\2(\u00c3\3\2\2\2*\u00ca\3\2\2\2,\u00d5\3\2\2\2.\u00e8"+
		"\3\2\2\2\60\u00ea\3\2\2\2\62\u00ed\3\2\2\2\64\u00f3\3\2\2\2\66\u00f5\3"+
		"\2\2\28\u00f7\3\2\2\2:\u00f9\3\2\2\2<\u00fb\3\2\2\2>\u00fd\3\2\2\2@\u0105"+
		"\3\2\2\2B\u0111\3\2\2\2D\u0113\3\2\2\2F\u0115\3\2\2\2H\u0117\3\2\2\2J"+
		"\u0119\3\2\2\2L\u011b\3\2\2\2N\u011f\3\2\2\2P\u0121\3\2\2\2R\u0125\3\2"+
		"\2\2T\u0127\3\2\2\2V\u012f\3\2\2\2X\u0135\3\2\2\2Z\u013c\3\2\2\2\\]\5"+
		"\4\3\2]^\5\b\5\2^_\7\3\2\2_\3\3\2\2\2`a\7\24\2\2ac\7\63\2\2bd\5\6\4\2"+
		"cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\4\2\2f\5\3\2\2\2gh\7\5\2\2hm\7\63\2"+
		"\2ij\7\6\2\2jl\7\63\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2"+
		"\2\2om\3\2\2\2pq\7\7\2\2q\7\3\2\2\2rs\5\n\6\2st\5\16\b\2t\t\3\2\2\2uv"+
		"\3\2\2\2v\13\3\2\2\2w\u0082\5\16\b\2x\u0082\5\24\13\2y\u0082\5\26\f\2"+
		"z\u0082\5$\23\2{\u0082\5&\24\2|\u0082\5\20\t\2}\u0082\5\30\r\2~\u0082"+
		"\5\32\16\2\177\u0082\5\34\17\2\u0080\u0082\5\36\20\2\u0081w\3\2\2\2\u0081"+
		"x\3\2\2\2\u0081y\3\2\2\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081|\3\2\2\2"+
		"\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\r\3\2\2\2\u0083\u0084\7\33\2\2\u0084\u0085\5\22\n\2\u0085\u0086\7\34"+
		"\2\2\u0086\17\3\2\2\2\u0087\u0088\3\2\2\2\u0088\21\3\2\2\2\u0089\u008e"+
		"\5\f\7\2\u008a\u008b\7\4\2\2\u008b\u008d\5\f\7\2\u008c\u008a\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\23\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0091\u0092\5 \21\2\u0092\u0093\7\b\2\2\u0093\u0094"+
		"\5\"\22\2\u0094\25\3\2\2\2\u0095\u0096\7&\2\2\u0096\u0097\5\22\n\2\u0097"+
		"\u0098\7\'\2\2\u0098\u0099\5(\25\2\u0099\27\3\2\2\2\u009a\u009b\7(\2\2"+
		"\u009b\u009c\5(\25\2\u009c\u009d\7)\2\2\u009d\u009e\5\f\7\2\u009e\31\3"+
		"\2\2\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\5(\25\2\u00a1\u00a2\7#\2\2\u00a2"+
		"\u00a5\5\f\7\2\u00a3\u00a4\7$\2\2\u00a4\u00a6\5\f\7\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\33\3\2\2\2\u00a7\u00a8\7*\2\2\u00a8\u00a9"+
		"\7\63\2\2\u00a9\u00aa\7\b\2\2\u00aa\u00ab\5(\25\2\u00ab\u00ac\t\2\2\2"+
		"\u00ac\u00ad\5(\25\2\u00ad\u00ae\7)\2\2\u00ae\u00af\5\f\7\2\u00af\35\3"+
		"\2\2\2\u00b0\u00b1\7%\2\2\u00b1\u00b2\5(\25\2\u00b2\u00b4\7\30\2\2\u00b3"+
		"\u00b5\5@!\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2"+
		"\2\u00b6\u00b7\7\34\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\5\60\31\2\u00b9!"+
		"\3\2\2\2\u00ba\u00bb\5(\25\2\u00bb#\3\2\2\2\u00bc\u00bd\7-\2\2\u00bd\u00be"+
		"\5L\'\2\u00be%\3\2\2\2\u00bf\u00c1\7.\2\2\u00c0\u00c2\5P)\2\u00c1\u00c0"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\'\3\2\2\2\u00c3\u00c7\5*\26\2\u00c4"+
		"\u00c5\5F$\2\u00c5\u00c6\5*\26\2\u00c6\u00c8\3\2\2\2\u00c7\u00c4\3\2\2"+
		"\2\u00c7\u00c8\3\2\2\2\u00c8)\3\2\2\2\u00c9\u00cb\5D#\2\u00ca\u00c9\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d2\5,\27\2\u00cd"+
		"\u00ce\5H%\2\u00ce\u00cf\5,\27\2\u00cf\u00d1\3\2\2\2\u00d0\u00cd\3\2\2"+
		"\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3+"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00db\5.\30\2\u00d6\u00d7\5J&\2\u00d7"+
		"\u00d8\5.\30\2\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc-\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00e9\5\60\31\2\u00df\u00e9\5\62\32\2\u00e0\u00e9\5:\36"+
		"\2\u00e1\u00e9\5<\37\2\u00e2\u00e3\7!\2\2\u00e3\u00e9\5.\30\2\u00e4\u00e5"+
		"\7\5\2\2\u00e5\u00e6\5(\25\2\u00e6\u00e7\7\7\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00de\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e1\3\2"+
		"\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9/\3\2\2\2\u00ea\u00eb"+
		"\7\63\2\2\u00eb\61\3\2\2\2\u00ec\u00ee\5D#\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\5\64\33\2\u00f0\63\3\2"+
		"\2\2\u00f1\u00f4\5\66\34\2\u00f2\u00f4\58\35\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\65\3\2\2\2\u00f5\u00f6\7\64\2\2\u00f6\67\3\2\2\2"+
		"\u00f7\u00f8\7\65\2\2\u00f89\3\2\2\2\u00f9\u00fa\79\2\2\u00fa;\3\2\2\2"+
		"\u00fb\u00fc\7:\2\2\u00fc=\3\2\2\2\u00fd\u0102\5B\"\2\u00fe\u00ff\7\6"+
		"\2\2\u00ff\u0101\5B\"\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103?\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0105\u0106\5> \2\u0106\u0107\7\t\2\2\u0107\u0108\5\f\7\2\u0108\u010b"+
		"\3\2\2\2\u0109\u010a\7\4\2\2\u010a\u010c\5@!\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010cA\3\2\2\2\u010d\u0112\5:\36\2\u010e\u0112\5<\37\2"+
		"\u010f\u0112\5\62\32\2\u0110\u0112\7\63\2\2\u0111\u010d\3\2\2\2\u0111"+
		"\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112C\3\2\2\2"+
		"\u0113\u0114\t\3\2\2\u0114E\3\2\2\2\u0115\u0116\t\4\2\2\u0116G\3\2\2\2"+
		"\u0117\u0118\t\5\2\2\u0118I\3\2\2\2\u0119\u011a\t\6\2\2\u011aK\3\2\2\2"+
		"\u011b\u011c\7\5\2\2\u011c\u011d\5N(\2\u011d\u011e\7\7\2\2\u011eM\3\2"+
		"\2\2\u011f\u0120\5T+\2\u0120O\3\2\2\2\u0121\u0122\7\5\2\2\u0122\u0123"+
		"\5R*\2\u0123\u0124\7\7\2\2\u0124Q\3\2\2\2\u0125\u0126\5T+\2\u0126S\3\2"+
		"\2\2\u0127\u012c\5V,\2\u0128\u0129\7\6\2\2\u0129\u012b\5V,\2\u012a\u0128"+
		"\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"U\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0132\5(\25\2\u0130\u0131\7\t\2\2"+
		"\u0131\u0133\5X-\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133W\3\2"+
		"\2\2\u0134\u0136\5D#\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u013a\5\66\34\2\u0138\u0139\7\t\2\2\u0139\u013b\5Z.\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bY\3\2\2\2\u013c\u013d\5\66\34"+
		"\2\u013d[\3\2\2\2\27cm\u0081\u008e\u00a5\u00b4\u00c1\u00c7\u00ca\u00d2"+
		"\u00db\u00e8\u00ed\u00f3\u0102\u010b\u0111\u012c\u0132\u0135\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}