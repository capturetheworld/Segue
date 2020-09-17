/**
 * Parser class for a simple interpreter.
 * <p>
 * (c) 2020 by Ronald Mak
 * Department of Computer Science
 * San Jose State University
 */
package frontend;

import intermediate.Node;
import intermediate.Symtab;
import intermediate.SymtabEntry;

import java.util.ArrayList;
import java.util.HashSet;

import static frontend.Token.TokenType.*;
import static intermediate.Node.NodeType.*;

public class Parser {
    private Scanner scanner;
    private Symtab symtab;
    private Token currentToken;
    private int lineNumber;
    private int errorCount;

    public Parser(Scanner scanner, Symtab symtab) {
        this.scanner = scanner;
        this.symtab = symtab;
        this.currentToken = null;
        this.lineNumber = 1;
        this.errorCount = 0;
    }

    public int errorCount() {
        return errorCount;
    }

    public Node parseProgram() {
        Node programNode = new Node(Node.NodeType.PROGRAM);

        currentToken = scanner.nextToken();  // first token!

        if (currentToken.type == Token.TokenType.PROGRAM) {
            currentToken = scanner.nextToken();  // consume PROGRAM
        } else syntaxError("Expecting PROGRAM");

        if (currentToken.type == IDENTIFIER) {
            String programName = currentToken.text;
            symtab.enter(programName);
            programNode.text = programName;

            currentToken = scanner.nextToken();  // consume program name
        } else syntaxError("Expecting program name");

        if (currentToken.type == SEMICOLON) {
            currentToken = scanner.nextToken();  // consume ;
        } else syntaxError("Missing ;");

        if (currentToken.type != BEGIN) syntaxError("Expecting BEGIN");

        // The PROGRAM node adopts the COMPOUND tree.
        programNode.adopt(parseCompoundStatement());

        if (currentToken.type == SEMICOLON) syntaxError("Expecting .");
        return programNode;
    }

    private static HashSet<Token.TokenType> statementStarters;
    private static HashSet<Token.TokenType> statementFollowers;
    private static HashSet<Token.TokenType> relationalOperators;
    private static HashSet<Token.TokenType> simpleExpressionOperators;
    private static HashSet<Token.TokenType> termOperators;

    static {
        statementStarters = new HashSet<Token.TokenType>();
        statementFollowers = new HashSet<Token.TokenType>();
        relationalOperators = new HashSet<Token.TokenType>();
        simpleExpressionOperators = new HashSet<Token.TokenType>();
        termOperators = new HashSet<Token.TokenType>();

        // Tokens that can start a statement.
        statementStarters.add(BEGIN);
        statementStarters.add(IDENTIFIER);
        statementStarters.add(REPEAT);
        statementStarters.add(WHILE);
        statementStarters.add(Token.TokenType.IF);
        statementStarters.add(FOR);
        statementStarters.add(Token.TokenType.CASE);
        statementStarters.add(Token.TokenType.WRITE);
        statementStarters.add(Token.TokenType.WRITELN);

        // Tokens that can immediately follow a statement.
        statementFollowers.add(SEMICOLON);
        statementFollowers.add(END);
        statementFollowers.add(UNTIL);
        statementFollowers.add(END_OF_FILE);

        relationalOperators.add(EQUALS);
        relationalOperators.add(LESS_THAN);
        relationalOperators.add(LESS_EQUALS);
        relationalOperators.add(NOT_EQUALS);
        relationalOperators.add(GREATER_EQUALS);
        relationalOperators.add(GREATER_THAN);

        simpleExpressionOperators.add(PLUS);
        simpleExpressionOperators.add(MINUS);
        simpleExpressionOperators.add(Token.TokenType.OR);

        termOperators.add(STAR);
        termOperators.add(SLASH);
        termOperators.add(Token.TokenType.DIV);
        termOperators.add(Token.TokenType.MOD);
        termOperators.add(Token.TokenType.AND);
        termOperators.add(Token.TokenType.OR);
    }

    private Node parseStatement() {
        Node stmtNode = null;
        int savedLineNumber = currentToken.lineNumber;
        lineNumber = savedLineNumber;

        switch (currentToken.type) {
            case IDENTIFIER:
                stmtNode = parseAssignmentStatement();
                break;
            case BEGIN:
                stmtNode = parseCompoundStatement();
                break;
            case REPEAT:
                stmtNode = parseRepeatStatement();
                break;
            case WHILE:
                stmtNode = parseWhileStatement();
                break;
            case IF:
                stmtNode = parseIfStatement();
                break;
            case FOR:
                stmtNode = parseForStatement();
                break;
            case CASE:
                stmtNode = parseCaseStatement();
                break;
            case WRITE:
                stmtNode = parseWriteStatement();
                break;
            case WRITELN:
                stmtNode = parseWritelnStatement();
                break;
            case SEMICOLON:
                stmtNode = null;
                break;  // empty statement

            default:
                syntaxError("Unexpected token parse statement  1ps");
        }

        if (stmtNode != null) stmtNode.lineNumber = savedLineNumber;
        return stmtNode;
    }


    private Node parseForStatement() { //current token is for
        Node compoundNode = new Node(COMPOUND);
        currentToken = scanner.nextToken(); //consume FOR token

        Node assignmentNode = parseAssignmentStatement();
        lineNumber = currentToken.lineNumber;
        assignmentNode.lineNumber = lineNumber;

        Node childNode = new Node(TEST);
        lineNumber = currentToken.lineNumber;
        childNode.lineNumber = lineNumber;
        //childNode.adopt(assignmentNode.children.get(1)); //adopts k

        compoundNode.adopt(assignmentNode);

        if (currentToken.type == TO || currentToken.type == DOWNTO) {
            Token.TokenType reference = currentToken.type;
            currentToken = scanner.nextToken(); //consume TO or DOWNTO token

            Node loopNode = new Node(LOOP);

            Node constantNode = parseSimpleExpression(); //create a test node here
//            lineNumber = currentToken.lineNumber;
//            testNode.lineNumber = lineNumber;
//
//            testNode.adopt(parseSimpleExpression());
//            loopNode.adopt(testNode); // adopt the test node

            if (currentToken.type == DO) {
                currentToken = scanner.nextToken();//consume do

                loopNode.adopt(childNode);

                loopNode.adopt(parseStatement()); //actually is adopt compound node


                //   loopNode.adopt(parseStatement());//how to increment or decrement
                Node comparison = null;
                if (reference == TO) {
                    comparison = new Node(GT);
                } else {
                    comparison = new Node(LT);
                }

                childNode.adopt(comparison);
                comparison.adopt(assignmentNode.children.get(0));
                comparison.adopt(constantNode);

                compoundNode.adopt(loopNode);

                Node assign = new Node(ASSIGN);
                lineNumber = currentToken.lineNumber;
                assign.lineNumber = lineNumber;

                assign.adopt(assignmentNode.children.get(0));

                Node step = null;

                if (reference == TO) {
                    step = new Node(ADD);
//                    childNode.children.get(0).value = (long) childNode.children.get(0).value + 1;
                } else {
                    step = new Node(SUBTRACT);
//                    childNode.children.get(0).value = (long) childNode.children.get(0).value - 1;
                }
                step.adopt(assignmentNode.children.get(0));

                Node one = new Node(INTEGER_CONSTANT);
                one.value = 1L;

                step.adopt(one);

                assign.adopt(step);

                loopNode.adopt(assign);
            } else {
                syntaxError("Missing Do");
            }
        } else {
            syntaxError("Expecting TO or DOWNTO");
        }

        return compoundNode;

    }

    private Node parseAssignmentStatement() {
        // The current token should now be the left-hand-side variable name.

        Node assignmentNode = new Node(ASSIGN);

        // The assignment node adopts the variable node as its first child.
        Node lhsNode = new Node(VARIABLE);
        String variableName = currentToken.text;
        SymtabEntry variableId = symtab.enter(variableName.toLowerCase());

        lhsNode.text = variableName;
        lhsNode.entry = variableId;
        assignmentNode.adopt(lhsNode);

        currentToken = scanner.nextToken();  // consume the LHS variable;

        if (currentToken.type == COLON_EQUALS) {
            currentToken = scanner.nextToken();  // consume :=
        } else syntaxError("Missing :=");

        // The assignment node adopts the expression node as its second child.
        Node rhsNode = parseExpression();
        assignmentNode.adopt(rhsNode);

        return assignmentNode;
    }

    private Node parseCompoundStatement() {
        Node compoundNode = new Node(COMPOUND);
        compoundNode.lineNumber = currentToken.lineNumber;

        currentToken = scanner.nextToken();  // consume BEGIN
        parseStatementList(compoundNode, END);

        if (currentToken.type == END) {
            currentToken = scanner.nextToken();  // consume END
        } else syntaxError("Expecting END");

        return compoundNode;
    }

    private void parseStatementList(Node parentNode, Token.TokenType terminalType) {
        while ((currentToken.type != terminalType) && (currentToken.type != END_OF_FILE)) {
            Node stmtNode = parseStatement();
            if (stmtNode != null) parentNode.adopt(stmtNode);

            // A semicolon separates statements.
            if (currentToken.type == SEMICOLON) {
                while (currentToken.type == SEMICOLON) {
                    currentToken = scanner.nextToken();  // consume ;
                }
            } else if (statementStarters.contains(currentToken.type)) {
                syntaxError("Missing ;");
            }
        }
    }


    private Node parseRepeatStatement() {
        // The current token should now be REPEAT.

        // Create a LOOP node.
        Node loopNode = new Node(LOOP);
        currentToken = scanner.nextToken();  // consume REPEAT

        parseStatementList(loopNode, UNTIL);

        if (currentToken.type == UNTIL) {
            // Create a TEST node. It adopts the test expression node.
            Node testNode = new Node(TEST);
            lineNumber = currentToken.lineNumber;
            testNode.lineNumber = lineNumber;
            currentToken = scanner.nextToken();  // consume UNTIL

            testNode.adopt(parseExpression());

            // The LOOP node adopts the TEST node as its final child.
            loopNode.adopt(testNode);
        } else syntaxError("Expecting UNTIL");

        return loopNode;
    }

    private Node parseWhileStatement() {
        // The current token should now be WHILE.

        // Create a LOOP node.
        Node loopNode = new Node(LOOP);
        currentToken = scanner.nextToken();  // consume WHILE

        // Create a TEST node. It adopts the test expression node.
        Node testNode = new Node(TEST);
        lineNumber = currentToken.lineNumber;
        testNode.lineNumber = lineNumber;

        Node temp = parseExpression();

        Node tempNot = new Node(Node.NodeType.NOT);
        lineNumber = currentToken.lineNumber;
        testNode.lineNumber = lineNumber;
        tempNot.adopt(temp);
        testNode.adopt(tempNot);


        // System.out.println(currentToken.type + " while statement current token");
        if (currentToken.type == DO) {

            currentToken = scanner.nextToken();  // consume DO
            loopNode.adopt(parseStatement());

            // The LOOP node adopts the TEST node as its final child.
            loopNode.adopt(testNode);
        } else {
            syntaxError("Expecting DO");
        }

        return loopNode;
    }


    private Node parseIfStatement() {

        Node ifNode = new Node(Node.NodeType.IF);
        currentToken = scanner.nextToken(); //consumes the if
        lineNumber = currentToken.lineNumber;
        ifNode.lineNumber = lineNumber;


        Node condition = new Node(TEST);
        lineNumber = currentToken.lineNumber;
        condition.lineNumber = lineNumber;
        ifNode.adopt(condition);

        condition.adopt(parseExpression());
        if (currentToken.type == THEN) {

            currentToken = scanner.nextToken();  // consume THEN
            ifNode.adopt(parseStatement());


        } else {
            syntaxError("Expecting THEN!!!!!");
        }

        if (currentToken.type == ELSE) {
            currentToken = scanner.nextToken();  // consume ELSE
            ifNode.adopt(parseStatement());
        }


        return ifNode;
    }


    private Node parseCaseStatement() {
        Node currIf = null;
        Node headIf = null;

        currentToken = scanner.nextToken(); //consumes the CASE
        Node expNode = parseExpression();

        if (currentToken.type == OF) {

            currentToken = scanner.nextToken();  // consume OF
            Node testNode = null;
            //  Node.adopt(parseStatement());

            while (currentToken.type != END) {
                Node nextIf = new Node(Node.NodeType.IF);

                lineNumber = currentToken.lineNumber;
                nextIf.lineNumber = lineNumber;



                testNode = new Node(TEST);
                lineNumber = currentToken.lineNumber;
                testNode.lineNumber = lineNumber;

                ArrayList<Node> nodeList = new ArrayList<>();

                while (currentToken.type != END_OF_FILE) {

                    switch (currentToken.type) {

                        case INTEGER:
                            nodeList.add(parseIntegerConstant());
                            break;
                        case STRING:
                            nodeList.add(parseStringConstant());
                            break;
                        case REAL:
                            nodeList.add(parseRealConstant());
                            break;
                    }
                    if (currentToken.type == COMMA) {

                        currentToken = scanner.nextToken();
                        continue;
                    } else if (currentToken.type == COLON) {
                        currentToken = scanner.nextToken();
                        break;
                    } else {
                        syntaxError("Expecting colon or comma!");
                    }


                }


                Node headOr = null;
                // boolean first = false;
                Node currOr = null;

                for (Node n : nodeList) {
                    Node nextOr = new Node(Node.NodeType.OR);
                    lineNumber = currentToken.lineNumber;
                    nextOr.lineNumber = lineNumber;

                    Node equal = new Node(EQ);
                    lineNumber = currentToken.lineNumber;
                    equal.lineNumber = lineNumber;

                    equal.adopt(expNode);
                    equal.adopt(n);
                    nextOr.adopt(equal);

                    if (headOr == null) {
                        currOr = nextOr;
                        headOr = currOr;
                    } else {
                        currOr.adopt(nextOr);
                        currOr = nextOr;
                    }


                }

                testNode.adopt(headOr);
                Node job = parseStatement();
                nextIf.adopt(testNode); ///????
                nextIf.adopt(job); ///????

                if (headIf == null) {
                    currIf = nextIf;
                    headIf = currIf;
                }
                else{
                    currIf.adopt(nextIf);
                    currIf = nextIf;
                }


            }


        } else {
            syntaxError("Expecting OF");
        }

        return headIf;
    }
//    private Node parseForStatement()
//    {
//        // The current token should now be WHILE.
//
//        // Create a LOOP node.
//        Node loopNode = new Node(LOOP);
//        currentToken = scanner.nextToken();  // consume WHILE
//
//        // Create a TEST node. It adopts the test expression node.
//        Node testNode = new Node(TEST);
//        lineNumber = currentToken.lineNumber;
//        testNode.lineNumber = lineNumber;
//
//        Node temp = parseExpression();
//
//        Node tempNot = new Node (Node.NodeType.NOT);
//        lineNumber = currentToken.lineNumber;
//        testNode.lineNumber = lineNumber;
//        tempNot.adopt(temp);
//        testNode.adopt(tempNot);
//
//
//        // System.out.println(currentToken.type + " while statement current token");
//        if (currentToken.type == DO)
//        {
//
//            currentToken = scanner.nextToken();  // consume DO
//            loopNode.adopt(parseStatement());
//
//            // The LOOP node adopts the TEST node as its final child.
//            loopNode.adopt(testNode);
//        }
//        else {
//            syntaxError("Expecting DO");
//        }
//
//        return loopNode;
//    }


    private Node parseWriteStatement() {
        // The current token should now be WRITE.

        // Create a WRITE node. It adopts the variable or string node.
        Node writeNode = new Node(Node.NodeType.WRITE);
        currentToken = scanner.nextToken();  // consume WRITE

        parseWriteArguments(writeNode);
        if (writeNode.children.size() == 0) {
            syntaxError("Invalid WRITE statement");
        }

        return writeNode;
    }

    private Node parseWritelnStatement() {
        // The current token should now be WRITELN.

        // Create a WRITELN node. It adopts the variable or string node.
        Node writelnNode = new Node(Node.NodeType.WRITELN);
        currentToken = scanner.nextToken();  // consume WRITELN

        if (currentToken.type == LPAREN) parseWriteArguments(writelnNode);
        return writelnNode;
    }

    private void parseWriteArguments(Node node) {
        // The current token should now be (

        boolean hasArgument = false;

        if (currentToken.type == LPAREN) {
            currentToken = scanner.nextToken();  // consume (
        } else syntaxError("Missing left parenthesis");

        if (currentToken.type == IDENTIFIER) {
            node.adopt(parseVariable());
            hasArgument = true;
        } else if (currentToken.type == STRING) {
            node.adopt(parseStringConstant());
            hasArgument = true;
        } else syntaxError("Invalid WRITE or WRITELN statement");

        // Look for a field width and a count of decimal places.
        if (hasArgument) {
            if (currentToken.type == COLON) {
                currentToken = scanner.nextToken();  // consume ,

                if (currentToken.type == INTEGER) {
                    // Field width
                    node.adopt(parseIntegerConstant());

                    if (currentToken.type == COLON) {
                        currentToken = scanner.nextToken();  // consume ,

                        if (currentToken.type == INTEGER) {
                            // Count of decimal places
                            node.adopt(parseIntegerConstant());
                        } else syntaxError("Invalid count of decimal places");
                    }
                } else syntaxError("Invalid field width");
            }
        }

        if (currentToken.type == RPAREN) {
            currentToken = scanner.nextToken();  // consume )
        } else syntaxError("Missing right parenthesis");
    }

    private Node parseExpression() {
        // The current token should now be an identifier or a number.

        // The expression's root node.
        Node exprNode = parseSimpleExpression();

        // The current token might now be a relational operator.
        //System.out.println(currentToken.type + " current token");
        if (relationalOperators.contains(currentToken.type)) {

            Token.TokenType tokenType = currentToken.type;
            Node opNode = tokenType == EQUALS ? new Node(EQ)
                    : tokenType == LESS_THAN ? new Node(LT)
                    : tokenType == LESS_EQUALS ? new Node(LE)
                    : tokenType == NOT_EQUALS ? new Node(NE)
                    : tokenType == GREATER_EQUALS ? new Node(GE)
                    : tokenType == GREATER_THAN ? new Node(GT)
                    //: tokenType == Token.TokenType.NOT ? new Node(Node.NodeType.NOT)
                    : null;

            currentToken = scanner.nextToken();  // consume relational operator


            // The relational operator node adopts the first simple expression
            // node as its first child and the second simple expression node
            // as its second child. Then it becomes the expression's root node.
            if (opNode != null) {
                opNode.adopt(exprNode);
                opNode.adopt(parseSimpleExpression());
                exprNode = opNode;
            }
        }

        return exprNode;
    }

    private Node parseSimpleExpression() {

        // The simple expression's root node.
        Node simpExprNode = null;
        if (currentToken.type == PLUS) {
            currentToken = scanner.nextToken();  //
            simpExprNode = parseTerm();
        } else if (currentToken.type == MINUS) {
            currentToken = scanner.nextToken();  // consume "-"
            //           System.out.println("NEXT TOKEN IS THIS  " + currentToken.type);

//            temp.value = temp.value / -1;
            if (currentToken.type == INTEGER) {
                simpExprNode = parseTerm();
                simpExprNode.value = (long) simpExprNode.value * -1;
            } else if (currentToken.type == REAL) {
                simpExprNode = parseTerm();
                simpExprNode.value = (double) simpExprNode.value * -1;
            } else {
                syntaxError("Expected a number to be negative");
            }
        }

        // The current token should now be an identifier or a number.


        //System.out.println("EXPRESSION NODE " + simpExprNode.type);
        else {
            simpExprNode = parseTerm();
        }

        // Keep parsing more terms as long as the current token
        // is a + or - operator.
        while (simpleExpressionOperators.contains(currentToken.type)) {
            Node opNode = currentToken.type == PLUS ? new Node(ADD)
                    : new Node(SUBTRACT);

            currentToken = scanner.nextToken();  // consume the operator

            // The add or subtract node adopts the first term node as its
            // first child and the next term node as its second child.
            // Then it becomes the simple expression's root node.
            opNode.adopt(simpExprNode);
            opNode.adopt(parseTerm());
            simpExprNode = opNode;
        }

        return simpExprNode;
    }

    private Node parseTerm() {
        // The current token should now be an identifier or a number.

        // The term's root node.
        Node termNode = parseFactor();

        // Keep parsing more factor as long as the current token
        // is a * or / operator.
        while (termOperators.contains(currentToken.type)) {
            Node opNode = null;

            switch (currentToken.type) {
                case STAR:
                    opNode = new Node(MULTIPLY);
                    break;
                case SLASH:
                    opNode = new Node(DIVIDE);
                    break;
                case DIV:
                    opNode = new Node(Node.NodeType.DIV);
                    break;
                case MOD:
                    opNode = new Node(Node.NodeType.MOD);
                    break;
                case AND:
                    opNode = new Node(Node.NodeType.AND);
                    break;
                case OR:
                    opNode = new Node(Node.NodeType.OR);
                    break;

                default:
                    syntaxError("Unexpected token parse statement 2pt");
            }

            currentToken = scanner.nextToken();  // consume the operator

            // The multiply or dive node adopts the first factor node as its
            // as its first child and the next factor node as its second child.
            // Then it becomes the term's root node.
            opNode.adopt(termNode);
            opNode.adopt(parseFactor());
            termNode = opNode;
        }

        return termNode;
    }

    private Node parseFactor() {
        // The current token should now be an identifier or a number or (
        // System.out.println(currentToken.type + "  <----PARSING THIS TOKEN");

        if (currentToken.type == IDENTIFIER) return parseVariable();
        else if (currentToken.type == INTEGER) return parseIntegerConstant();
        else if (currentToken.type == REAL) return parseRealConstant();
        else if (currentToken.type == Token.TokenType.NOT) {
            currentToken = scanner.nextToken();  // consume "NOT"
            Node temp = new Node(Node.NodeType.NOT);
            lineNumber = currentToken.lineNumber;
            temp.lineNumber = lineNumber;
            temp.adopt(parseFactor());
            return temp;
        }


//        else if (currentToken.type == MINUS)       {
//            currentToken = scanner.nextToken();  // consume "-"
// //           System.out.println("NEXT TOKEN IS THIS  " + currentToken.type);
//            Node temp = null;
////            temp.value = temp.value / -1;
//            if(currentToken.type == INTEGER){
//                temp = parseFactor();
//                temp.value = (long) temp.value * -1;
//            }
//            else if(currentToken.type == REAL){
//                temp = parseFactor();
//                temp.value = (double) temp.value * -1;
//            }
//            else{
//                syntaxError("Expected a number to be negative");
//            }
//            return temp;
//        }


        else if (currentToken.type == LPAREN) {
            currentToken = scanner.nextToken();  // consume (
            Node exprNode = parseExpression();

            if (currentToken.type == RPAREN) {
                currentToken = scanner.nextToken();  // consume )
            } else syntaxError("Expecting )");

            return exprNode;
        } else syntaxError("Unexpected token parse Factor");
        return null;
    }

    private Node parseVariable() {
        // The current token should now be an identifier.

        String variableName = currentToken.text;
        SymtabEntry variableId = symtab.lookup(variableName.toLowerCase());

        if (variableId == null) semanticError("Undeclared identifier");

        Node node = new Node(VARIABLE);
        node.text = variableName;

        currentToken = scanner.nextToken();  // consume the identifier
        return node;
    }

    private Node parseIntegerConstant() {
        // The current token should now be a number.

        Node integerNode = new Node(INTEGER_CONSTANT);
        integerNode.value = currentToken.value;

        currentToken = scanner.nextToken();  // consume the number
        return integerNode;
    }

    private Node parseRealConstant() {
        // The current token should now be a number.

        Node realNode = new Node(REAL_CONSTANT);
        realNode.value = currentToken.value;

        currentToken = scanner.nextToken();  // consume the number
        return realNode;
    }

    private Node parseStringConstant() {
        // The current token should now be STRING.

        Node stringNode = new Node(STRING_CONSTANT);
        stringNode.value = currentToken.value;

        currentToken = scanner.nextToken();  // consume the string
        return stringNode;
    }

    private void syntaxError(String message) {
        System.out.println("SYNTAX ERROR at line " + lineNumber
                + ": " + message + " at '" + currentToken.text + "'");
        errorCount++;

        // Recover by skipping the rest of the statement.
        // Skip to a statement follower token.
        while (!statementFollowers.contains(currentToken.type)) {
            currentToken = scanner.nextToken();
        }
    }

    private void semanticError(String message) {
        System.out.println("SEMANTIC ERROR at line " + lineNumber
                + ": " + message + " at '" + currentToken.text + "'");
        errorCount++;
    }
}
