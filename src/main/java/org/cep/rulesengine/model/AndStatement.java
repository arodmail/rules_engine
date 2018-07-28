package org.cep.rulesengine.model;

import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.RuleEvaluationException;

import java.util.Iterator;

/**
 * An AndStatement is a self evaluating object representing an rule made
 * up of two or more expressions, joined by an <tt>&</tt> sign of the form
 * <tt>(prop1=val1) & (prop2=val2)</tt> as defined by the rule language grammar.
 * An AndStatement evaluates to true when all of its expressions are true.
 *
 * @author A. Rodriguez
 */
public class AndStatement extends RuleStatement {

    /**
     * Default no-arg constructor. Creates an empty AndStatement (without
     * RuleConditions).
     */
    public AndStatement() {
        super();
    }

    /**
     * Creates an AndStatement with the given RuleSubConditions.
     *
     * @param conditions a {@link RuleSubConditions} containing
     *                   {@link RuleCondition} objects all of whose constraints must be true
     *                   for this statement to evaluate to true.
     */
    public AndStatement(RuleSubConditions conditions) {
        super(conditions);
    }

    /**
     * Returns true if the statement evaluates to true.
     *
     * @param context an EvaluationContext, or what to evaluate.
     * @return true if the property values in the <tt>context</tt> match
     * the constraints in the conditions in this statement.
     */
    public boolean evaluate(EvaluationContext context)
            throws RuleEvaluationException {
        for (int i = 0; i < conditions.size(); i++) {
            RuleCondition condition = conditions.get(i);
            if (!condition.evaluate(context)) return false; // one is false
        }

        for (int j = 0; j < statements.size(); j++) {
            RuleStatement statement = statements.get(j);
            if (!statement.evaluate(context)) return false;
        }

        return true;
    }

    /**
     * Returns the String representation of an AndStatement.
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        if (this.actions.size() > 0) {
            buff.append("if (");
        }
        Iterator<RulePart> it = conditions.iterator();
        while (it.hasNext())
            buff.append((RulePart) it.next() + "&&");
        buff.replace(buff.length() - 2, buff.length(), ""); // but last &&

        if (this.actions.size() > 0) {
            buff.append(") ");

            buff.append(" { ");
            buff.append(this.actions.toString());
            buff.append(" } ");
        }
        return buff.toString();
    }

}
