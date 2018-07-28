package org.cep.rulesengine.model;

import org.cep.rulesengine.Event;
import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.RuleEvaluationException;
import org.cep.rulesengine.interpreter.RuleInterpreterException;

import java.util.*;

/**
 * RuleStatement is the abstract base class of all rule statements. A
 * RuleStatement has a cardinality of 1 to n with RuleCondition and
 * descendants of RuleStatement. The first is the most common case which
 * occurs when a rule statement has more than one condition as in
 *
 * <tt>
 * if ( (prop1 == value1) && (prop2 == value2) ) {
 * sendMail('recipient')
 * }
 * </tt>
 * <p>
 * (an AndStatement with two EqualCondition inside). The second case is less
 * common but occurs when a rule statement is nested inside another as in
 *
 * <tt>
 * if ( (prop1 == value1) && ( (prop2 == value2) || (prop3 == value3) ) ) {
 * sendMail('recipient')
 * }
 * </tt>
 * <p>
 * (an EitherOrStatement inside an AndStatement). In both cases, a
 * RuleStatament object represents the entire rule as opposed to its
 * individual parts which are represented by RuleCondition objects.
 *
 * @author A. Rodriguez
 */
public class RuleStatement implements RulePart {

    /**
     * The parent RuleStatement or null if this is the topmost statement.
     */
    RuleStatement parent = null;

    /**
     * Indexed structure of RuleCondition objects.
     */
    RuleSubConditions conditions = new RuleSubConditions();

    /**
     * Indexed structure of RuleStatement objects.
     */
    RuleSubStatements statements = new RuleSubStatements();

    /**
     * Indexed structure of RuleAction objects.
     */
    RuleActions actions = new RuleActions();

    /**
     * Globally scoped Rule variables.
     */
    List<RuleVariable> vars = new ArrayList<RuleVariable>();

    /**
     * Creates an empty RuleStatement.
     */
    public RuleStatement() {
    }

    /**
     * Creates a RuleStatement with the given <tt>conditions</tt>
     * RuleConditions.
     *
     * @param conditions a RuleConditions to assign to this
     *                   rule statement.
     */
    public RuleStatement(RuleSubConditions conditions) {
        this.conditions = conditions;
    }

    /**
     * Creates a RuleStatement with the given <tt>conditions</tt>
     * RuleConditions.
     *
     * @param conditions a RuleConditions to assign to this
     *                   rule statement.
     * @param actions    a RuleActions to assign to this rule statement.
     */
    public RuleStatement(RuleSubConditions conditions, RuleActions actions) {
        this.conditions = conditions;
        this.actions = actions;
    }

    /**
     * Creates a RuleStatement with the given <tt>conditions</tt>
     * and <tt>statements</tt>.
     *
     * @param conditions a RuleConditions to assign to this
     *                   rule statement.
     * @param statements a RuleStatements to assign to this
     *                   rule statement.
     */
    public RuleStatement(RuleSubConditions conditions,
                         RuleSubStatements statements) {
        this.conditions = conditions;
        this.statements = statements;
    }

    /**
     * Creates a RuleStatement with the given <tt>conditions</tt>
     * and <tt>statements</tt>.
     *
     * @param conditions a RuleConditions to assign to this
     *                   rule statement.
     * @param statements a RuleStatements to assign to this
     *                   rule statement.
     * @param actions    a RuleActions to assign to this rule statement.
     */
    public RuleStatement(RuleSubConditions conditions,
                         RuleSubStatements statements,
                         RuleActions actions) {
        this.conditions = conditions;
        this.statements = statements;
        this.actions = actions;
    }

    /**
     * Adds a RuleConditions to the RuleStatement.
     */
    public void addCondition(RuleCondition condition) {
        conditions.add(condition);
        condition.setParent(this);
    }

    /**
     * Adds a RuleStatement to the RuleStatement.
     */
    public void addStatement(RuleStatement statement) {
        statements.add(statement);
        statement.setParent(this);
    }

    /**
     * Adds a SubStatements to the RuleStatement.
     */
    public void setSubStatements(RuleSubStatements subStatements) {
        RulePartIterator it = subStatements.iterator();
        while (it.hasNext()) {
            RuleStatement subStatement = (RuleStatement) it.next();
            subStatement.setParent(this);
            statements.add(subStatement);
        }
    }

    /**
     * Adds a RuleAction to the RuleStatement.
     */
    public void addAction(RuleAction action) {
        actions.add(action);
        action.setParent(this);
    }

    /**
     * Returns the RuleSubStatements in this RuleStatement.
     */
    public RuleSubStatements getStatements() {
        return this.statements;
    }

    /**
     * Returns the RuleConditions in this RuleStatement.
     */
    public RuleSubConditions getConditions() {
        return this.conditions;
    }

    /**
     * Returns the RuleActions in this RuleStatement.
     */
    public RuleActions getActions() {
        return this.actions;
    }

    /**
     * Returns RuleActions in SubStatements.
     */
    public RuleActions getSubActions() {
        RuleActions result = new RuleActions();
        Iterator<RulePart> it = this.statements.iterator();
        while (it.hasNext()) {
            RuleStatement statement = (RuleStatement) it.next();
            RulePartIterator iter = statement.actions.iterator();
            while (iter.hasNext()) {
                result.add((RuleAction) iter.next());
            }
        }
        return result;
    }

    /**
     * Returns true if the constrains in the conditions in this statement are true
     * relative to the EvaluationContext given.
     *
     * @throws RuleEvaluationException if something prevents
     *                                 evaluating the statement.
     */
    public boolean evaluate(EvaluationContext context)
            throws RuleEvaluationException {

        boolean result = false;
        Iterator<RulePart> iter = this.conditions.iterator();
        while (iter.hasNext()) {
            RuleCondition cond = (RuleCondition) iter.next();
            if (cond.evaluate(context)) {
                result = true;
            }
        }

        Iterator<RulePart> it = this.statements.iterator();
        while (it.hasNext()) {
            RuleStatement statement = (RuleStatement) it.next();
            if (statement.evaluate(context)) {
                result = true;
            } else {
                result = false; // one false evaluates to all false
                break;
            }
        }

        return result;
    }

    /**
     * Returns true if the statement has an empty set of conditions and statements.
     */
    public boolean isEmpty() {
        boolean result = true;
        if (this.conditions.size() > 0 || this.statements.size() > 0) result = false;
        return result;
    }

    /**
     * Returns true if the statement contains only SingleStatement.
     */
    public boolean hasMultipleStatements() {
        boolean result = true;
        if (this.statements.size() > 0) {
            Iterator<RulePart> it = this.statements.iterator();
            while (it.hasNext()) {
                RulePart rulePart = (RulePart) it.next();
                if (!(rulePart instanceof SingleStatement)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    /**
     * Returns a string representation of multiple single statements.
     */
    private String statementsToString() {
        StringBuffer buff = new StringBuffer();
        Iterator<RulePart> it = this.statements.iterator();
        while (it.hasNext()) {
            RulePart rulePart = (RulePart) it.next();
            buff.append(rulePart);
        }
        return buff.toString();
    }

    /**
     * Returns a String representation of a RuleStatement.
     *
     * @return A String representation of the RuleStatement.
     */
    public String toString() {
        if (hasMultipleStatements()) {
            return statementsToString();
        } else {
            StringBuffer buff = new StringBuffer();
            if (this.conditions.size() > 0) {
                buff.append("if ( ");

                Iterator<RulePart> iter = this.conditions.iterator();
                while (iter.hasNext())
                    buff.append((RulePart) iter.next());

                buff.append(" ) ");
            }

            if (this.statements.size() > 0) {
                Iterator<RulePart> it = this.statements.iterator();
                while (it.hasNext()) {
                    RulePart rulePart = (RulePart) it.next();
                    buff.append(rulePart);
                }
            }

            if (actions.size() > 0) {
                buff.append("{");
                buff.append(actions.toString());
                buff.append(" } ");
            }
            return buff.toString();
        }
    }

    /**
     * Returns a view of the property names in the RuleStatement
     *
     * @return Collection of String
     */
    public Collection<String> getAttributeNames() throws RuleInterpreterException {
        Collection<String> attributeNames = new Vector<String>(5);
        traverseStatement(this, attributeNames);
        return attributeNames;
    }

    /**
     * Sets this statement's parent RuleStatement.
     *
     * @param parent the parent or containing statement;
     */
    public void setParent(RuleStatement parent) {
        this.parent = parent;
    }

    /**
     * Adds property names in all RuleCondition in the given RuleStatement.
     * Recursive.
     */
    private void traverseStatement(RuleStatement statement,
                                   Collection<String> propertyNames) throws RuleInterpreterException {
        while (true) {
            RuleSubConditions conditions = statement.getConditions();
            RulePartIterator it = (RulePartIterator) conditions.iterator();
            while (it.hasNext()) {
                RuleCondition e = (RuleCondition) it.next();
                propertyNames.add(e.getPropertyName());
            }
            RuleSubStatements statements = statement.getStatements();
            if (statements.size() == 0) {
                break;
            } else {
                RulePartIterator iter =
                        (RulePartIterator) statements.iterator();
                while (iter.hasNext()) {
                    statement = (RuleStatement) iter.next();
                    traverseStatement(statement, propertyNames);
                }
            }
        }
    }

    /**
     * Traverses the given RuleStatement and consolidates all lookup results into
     * lookupResults.
     */
    public void getLookupResults(RuleStatement statement, List<Event> lookupResults) {
        Iterator<RulePart> iter = statement.conditions.iterator();
        while (iter.hasNext()) {
            RuleCondition e = (RuleCondition) iter.next();
            if (e.leftExpr != null && e.leftExpr instanceof LookupExpression) {
                LookupExpression lookupExpr = (LookupExpression) e.leftExpr;
                lookupResults.addAll(lookupExpr.getLookupResults());
            }
            if (e.rightExpr != null && e.rightExpr instanceof LookupExpression) {
                LookupExpression lookupExpr = (LookupExpression) e.rightExpr;
                lookupResults.addAll(lookupExpr.getLookupResults());
            }
        }
        if (statement.statements.size() == 0) {
            // end of branch
        } else {
            Iterator<RulePart> it = statement.statements.iterator();
            while (it.hasNext()) {
                RuleStatement s = (RuleStatement) it.next();
                getLookupResults(s, lookupResults);
            }
        }
    }

}
