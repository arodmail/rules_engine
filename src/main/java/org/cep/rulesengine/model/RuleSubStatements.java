package org.cep.rulesengine.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Decouples the rule language model (the classes that represent rules and
 * rule parts) from a data structure: ArrayList. The idea here is simply to
 * wrap a structure that provides access to its elements through an index while
 * hiding the actual structure from the classes in the model. Also ensures the
 * type of object allowed in the structure: RuleStatement only. The "sub" in
 * RuleSubStatements implies that this type of object occurs inside
 * RuleStatement instances as a subordinate or nested structure.
 *
 * @author A. Rodriguez
 */
public class RuleSubStatements {

    // initial size of the data structure.
    private static final int INITIAL_CAPACITY = 10;

    /**
     * The data structure to wrap.
     */
    protected ArrayList<RulePart> elements;

    /**
     * Creates an empty RuleSubStatements
     */
    public RuleSubStatements() {
        elements = new ArrayList<RulePart>(INITIAL_CAPACITY);
    }

    /**
     * Creates a RuleStatements with the given <tt>statement</tt>.
     */
    public RuleSubStatements(RuleStatement statement) {
        elements = new ArrayList<RulePart>(INITIAL_CAPACITY);
        elements.add(statement);
    }

    /**
     * Returns the number of elements (RuleStatement objects)
     * in this RuleStatements.
     */
    public int size() {
        if (elements == null) return 0;
        return elements.size();
    }

    /**
     * Returns the RuleStatement at the given <tt>index</tt>.
     */
    public RuleStatement get(int index) {
        return (RuleStatement) elements.get(index);
    }

    /**
     * Adds the given <tt>statement</tt> to the data structure this
     * RuleStatement wraps.
     */
    public void add(RuleStatement statement) {
        if (this.elements == null) elements = new ArrayList<RulePart>(INITIAL_CAPACITY);
        elements.add(statement);
    }

    /**
     * Returns an Iterator for RuleStatement
     */
    public RulePartIterator iterator() {
        return new RulePartIterator(elements);
    }

    /**
     * Returns a String representation of the RuleStatement objects in
     * this RuleSubStatements.
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        Iterator<RulePart> it = this.elements.iterator();
        while (it.hasNext()) {
            RuleStatement statement = (RuleStatement) it.next();
            buff.append(statement.toString());
        }
        return buff.toString();
    }

}

