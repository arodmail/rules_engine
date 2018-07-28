package org.cep.rulesengine.model;

import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.RuleEvaluationException;

import java.util.Iterator;

/**
 * Evaluates true if any of the conditions in the statement are true.
 *
 * @author A. Rodriguez
 */
public class EitherOrStatement extends RuleStatement {

    /**
     * Default no-arg constructor. Creates an EitherOrStatement without
     * FilterExpressions.
     */
    public EitherOrStatement() {
        super();
    }

    /**
     * Creates an EitherOrStatement with the given RuleConditions.
     *
     * @param conditions a {@link RuleSubConditions} containing {@link RuleCondition}
     *                   objects, only one of which must evaluate to true for this
     *                   statement to evaluate to true.
     */
    public EitherOrStatement(RuleSubConditions conditions) {
        super(conditions);
    }

    /**
     * Returns true if the statement evaluates to true.
     *
     * @param context an EvaluationContext, or what to evaluate.
     * @return true if the property values in the <tt>context</tt> match the
     * constraints in the conditions in this statement.
     */
    public boolean evaluate(EvaluationContext context)
            throws RuleEvaluationException {
        for (int i = 0; i < conditions.size(); i++) {
            RuleCondition expression = conditions.get(i);
            if (expression.evaluate(context))
                return true; // one is true
        }

        for (int j = 0; j < statements.size(); j++) {
            RuleStatement statement = statements.get(j);
            if (statement.evaluate(context))
                return true;
        }

        return false; // all are false
    }

    /**
     * Returns the String representation of an EitherOrStatement.
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        if (this.actions.size() > 0) {
            buff.append(" if (");
        }
        Iterator<RulePart> it = conditions.iterator();
        while (it.hasNext())
            buff.append((RulePart) it.next() + "||");
        buff.replace(buff.length() - 2, buff.length(), ""); // but last ||
        if (this.actions.size() > 0) {
            buff.append(") ");

            buff.append(" { ");
            buff.append(this.actions.toString());
            buff.append(" } ");
        }
        return buff.toString();
    }

}
