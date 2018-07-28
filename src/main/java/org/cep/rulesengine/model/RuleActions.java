package org.cep.rulesengine.model;

import java.util.ArrayList;

/**
 * Decouples the Rule model (the classes that represent rules and
 * rule parts) from a specific data structure: ArrayList. The idea here is
 * simply to wrap a structure that provides access to its elements through an
 * index while hiding the actual structure from the classes in the model.
 * Also restricts the object type allowed in the structure: RuleAction.
 *
 * @author A. Rodriguez
 */
public class RuleActions {

    // initial size of the data structure.
    private static final int INITIAL_CAPACITY = 10;

    /**
     * The data structure to wrap.
     */
    protected ArrayList<RulePart> elements;

    /**
     * Creates an empty RuleActions
     */
    public RuleActions() {
        elements = new ArrayList<RulePart>(INITIAL_CAPACITY);
    }

    /**
     * Creates a RuleSubCondition and adds the given <tt>condition</tt> to
     * the data structure this class wraps.
     */
    public RuleActions(RuleAction action) {
        elements = new ArrayList<RulePart>(INITIAL_CAPACITY);
        elements.add(action);
    }

    /**
     * Returns the number of elements (RuleAction objects)
     * in this RuleAction.
     */
    public int size() {
        if (elements == null) return 0;
        return elements.size();
    }

    /**
     * Returns the RuleAction at the given <tt>index</tt>.
     */
    public RuleAction get(int index) {
        return (RuleAction) elements.get(index);
    }

    /**
     * Adds the given <tt>condition</tt> to the data structure this
     * RuleAction wraps.
     */
    public void add(RuleAction action) {
        if (this.elements == null) elements = new ArrayList<RulePart>(INITIAL_CAPACITY);
        elements.add(action);
    }

    /**
     * Returns an Iterator for RuleAction
     */
    public RulePartIterator iterator() {
        return new RulePartIterator(elements);
    }

    /**
     * Returns a String representation of this RuleActions.
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        for (RulePart rulePart : this.elements) {
            buff.append(rulePart.toString());
        }
        return buff.toString();
    }

}

