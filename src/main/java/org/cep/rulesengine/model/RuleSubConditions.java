package org.cep.rulesengine.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Decouples the Rule model (the classes that represent rules and
 * rule parts) from a specific data structure: ArrayList. The idea here is
 * simply to wrap a structure that provides access to its elements through an
 * index while hiding the actual structure from the classes in the model.
 * Also restricts the object type allowed in the structure: RuleCondition.
 * The "sub" in RuleSubConditions implies that this type of object occurs inside
 * RuleStatement or RuleCondition instances as a subordinate or nested
 * structure.
 *
 * @author A. Rodriguez
 */
public class RuleSubConditions {

    // initial size of the data structure.
    private static final int INITIAL_CAPACITY = 10;

    /**
     * The data structure to wrap.
     */
    protected ArrayList<RulePart> elements;

    /**
     * Creates an empty RuleSubConditions
     */
    public RuleSubConditions() {
        elements = new ArrayList<RulePart>(INITIAL_CAPACITY);
    }

    /**
     * Creates a RuleSubCondition and adds the given <tt>condition</tt> to
     * the data structure this class wraps.
     */
    public RuleSubConditions(RuleCondition condition) {
        elements = new ArrayList<RulePart>(INITIAL_CAPACITY);
        elements.add(condition);
    }

    /**
     * Returns the number of elements (RuleCondition objects)
     * in this RuleConditions.
     */
    public int size() {
        if (elements == null) return 0;
        return elements.size();
    }

    /**
     * Returns the RuleCondition at the given <tt>index</tt>.
     */
    public RuleCondition get(int index) {
        return (RuleCondition) elements.get(index);
    }

    /**
     * Adds the given <tt>condition</tt> to the data structure this
     * RuleConditions wraps.
     */
    public void add(RuleCondition condition) {
        if (this.elements == null) elements = new ArrayList<RulePart>(INITIAL_CAPACITY);
        elements.add(condition);
    }

    /**
     * Returns an Iterator for RuleCondition
     */
    public Iterator<RulePart> iterator() {
        return new RulePartIterator(elements);
    }

    /**
     * Returns a String representation of this RuleSubConditions.
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        for (RulePart rulePart : this.elements) {
            buff.append(rulePart.toString());
        }
        return buff.toString();
    }

}
