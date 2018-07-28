package org.cep.rulesengine.interpreter;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;

import org.cep.rulesengine.model.RuleStatement;
import org.cep.rulesengine.parser.RuleLangLexer;
import org.cep.rulesengine.parser.RuleLangParser;
import org.cep.rulesengine.parser.RuleTreeWalker;

/**
 * Provides two functions: validates rules for proper syntax and tries to match
 * an EvaluationContext to rule constraints. The RuleIntepreter is really a
 * wrapper for ANTLR generated classes. The evaluation of the rule is carried
 * out by RuleStatement and RuleCondition subclasses which the ANTLR parser
 * generates.
 * <p>
 * Usage:
 * <p>
 * <pre>
 *      String rule = "if (prop=value) then sendMail('recipient')";
 *      RuleInterpreter interpreter = new RuleInterpreter(rule);
 *      EvaluationContext context = new CommonEvaluationContext(contentItem.getProperties());
 *      ComparableFactory factory = new DB2ComparableFactory();
 *      context.setComparableFactory(factory);
 *      boolean result = interpreter.interpret(context);
 * </pre>
 *
 * @author A. Rodriguez
 * @see EvaluationContext
 * @see CommonEvaluationContext
 */
public class RuleInterpreter {

    /**
     * The RuleStatement object created by RuleASTParser.
     */
    public RuleStatement statement;

    /**
     * Initializes the interpreter. Creates an RuleLangLexer with an
     * InputStream containing the <tt>rule</tt> argument, attaches the lexer
     * to a RuleLangParser and hooks the parser to a TreeAdaptor so it knows
     * how to build the abstract syntax tree. Walks down the tree to create a
     * RuleStatement object from the nodes in the AST.
     *
     * @param ruleStatement a Rule containing a rule statement string as specified by
     *                      the rule grammar.
     * @throws RuleInterpreterException if the rule is invalid, unbalanced, or
     *                                  syntactically incorrect in any way.
     */
    public RuleInterpreter(String ruleStatement)
            throws RuleInterpreterException {

        System.out.println("Raw statement: " + ruleStatement.toString());

        RuleLangLexer lex =
                new RuleLangLexer(new ANTLRStringStream(ruleStatement));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        RuleLangParser parser =
                new RuleLangParser(tokens, null);

        final TreeAdaptor adaptor = new CommonTreeAdaptor() {
            public Object create(Token payload) {
                return new CommonTree(payload);
            }
        };

        // hook the adaptor to the parser, so that the parser knows what to use 
        // to create the tree
        parser.setTreeAdaptor(adaptor);

        //build an AST (a 2 dimensional rule)
        try {
            Object tree = parser.statement().getTree();
            CommonTree statementAST = (CommonTree) tree;

            CommonTreeNodeStream nodes = new CommonTreeNodeStream(statementAST);
            RuleTreeWalker walker = new RuleTreeWalker(nodes);

            walker.statement();

            statement = walker.getStatement();


            System.out.println("RuleStatement.toString(): " + statement.toString());

        } catch (RecognitionException e) {
            System.err.println("Invalid rule syntax "
                    + ruleStatement + "Error: " + e.getMessage());
        }

    }

    /**
     * The tree is organized in arrays of children and children can have arrays
     * of children. This is a simple recursive procedure to walk the tree. This
     * is the also the stage at which AST nodes should be mapped into (translated to)
     * the evaluation model.
     */
    public void printTree(CommonTree t, int indent) {
        if (t != null) {
            StringBuffer sb = new StringBuffer(indent);
            for (int i = 0; i < indent; i++)
                sb = sb.append("   ");
            for (int i = 0; i < t.getChildCount(); i++) {
                System.out.println(sb.toString() + t.getChild(i).toString());
                printTree((CommonTree) t.getChild(i), indent + 1);
            }
        }
    }

    /**
     * Returns true if the conditions in the rule are true for the context
     * given.
     *
     * @param context an EvaluationContext, or what to evaluate.
     * @return true if conditions are true, false if not.
     * @throws RuleInterpreterException if anything prevents interpreting
     *                                  the rule against the given context.
     */
    public boolean interpret(EvaluationContext context)
            throws RuleInterpreterException {
        try {
            return statement.evaluate(context);
        } catch (RuleEvaluationException e) {
            throw new RuleInterpreterException(e.getMessage());
        }
    }

    /**
     * Returns true if the given <tt>ruleStatement</tt> is valid syntactically.
     *
     * @param ruleStatement a rule statement string to validate
     * @return true if the rule is valid, false if not.
     */
    public static boolean isValid(String ruleStatement) {
        boolean isValid = true;
        try {
            RuleInterpreter interpreter = new RuleInterpreter(ruleStatement);
        } catch (RuleInterpreterException fre) {
            isValid = false;
        }
        return isValid;
    }
}
