package org.cep.rulesengine.model;

import java.util.List;

import org.cep.rulesengine.Event;
import org.cep.rulesengine.RuleExecutionException;
import org.cep.rulesengine.interpreter.EvaluationContext;

/**
 * CommonRuleAction wraps RuleAction by mapping an actionName to a RuleAction
 * sub-class.
 *
 * @author A. Rodriguez
 */
public class CommonRuleAction extends RuleAction {

    public static final String SEND_MAIL_ACTION = "sendMail";

    /**
     * Creates a new, empty CommonRuleAction.
     */
    public CommonRuleAction() {
        super();
    }

    /**
     * Creates a new CommonRuleAction.
     */
    public CommonRuleAction(List<String> args) {
        super(args);
    }

    /**
     * Executes the CommonRuleAction. Creates a RuleAction from this CommonRuleAction's
     * actionName.
     */
    public boolean execute(EvaluationContext context, List<Event> args)
            throws RuleExecutionException {

        if (!actionName.equals("") && actionName.equals(SEND_MAIL_ACTION)) {
            RuleAction sendMailAction = new MailAction(super.getArgs());
            return sendMailAction.execute(context, args);
        }
        // ... handle other cases

        return false;
    }

    /**
     * Returns a String representation of this RuleSubConditions.
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append(super.getActionName() + "(" + super.argsToString() + ")");
        return buff.toString();
    }


}
