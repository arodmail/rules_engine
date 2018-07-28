package org.cep.rulesengine.model;

import java.util.ArrayList;
import java.util.List;

import org.cep.rulesengine.Event;
import org.cep.rulesengine.RuleExecutionException;
import org.cep.rulesengine.interpreter.EvaluationContext;

/**
 * RuleAction is the abstract base class of all rule actions. A
 * RuleAction has a cardinality of 1 to n with a descendant of RuleStatement.
 * In a rule, an action comes after the <tt>then</tt> part, as in:
 *
 * <tt>if (prop = val) then actionName(arg1, arg2, arg3)</tt>.
 * <p>
 * An action name is typically mapped to a class that extends this abstract
 * superclass.
 *
 * @author A. Rodriguez
 */
public abstract class RuleAction implements RulePart {

    private List<String> args = new ArrayList<String>(10);

    /**
     * The parent RuleStatement for this RuleAction.
     */
    RuleStatement parent = null;

    /**
     * The name of the action.
     */
    public String actionName = "";

    /**
     * Creates a new RuleAction.
     */
    public RuleAction() {

    }

    public RuleAction(List<String> args) {
        this.setArgs(args);
    }

    /**
     * Sub-classes of RuleAction should implement an <tt>execute</tt> method
     * to perform the action.
     *
     * @param context an EvaluationContext, or what to evaluate.
     * @param args    a list of arguments, for example, the ordered arguments to
     *                an external program.
     */
    public abstract boolean execute(EvaluationContext context, List<Event> args)
            throws RuleExecutionException;

    /**
     * Sets the arguments for this RuleAction
     */
    public void setArgs(List<String> args) {
        this.args = args;
    }

    /**
     * Returns the arguments for this RuleAction.
     */
    public List<String> getArgs() {
        return args;
    }

    /**
     * Sets this action's parent RuleStatement.
     *
     * @param parent the parent or containing statement;
     */
    public void setParent(RuleStatement parent) {
        this.parent = parent;
    }

    /**
     * Returns the action name.
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the action name.
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * Returns a String representation of this RuleAction's args.
     */
    public String argsToString() {
        StringBuffer buff = new StringBuffer();
        for (String arg : this.args) {
            buff.append(arg + ", ");
        }
        String result = buff.toString();
        if (result.lastIndexOf(',') != -1)
            result = result.substring(0, result.lastIndexOf(',')); // but last comma
        return result;
    }

}
