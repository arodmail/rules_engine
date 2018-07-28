package org.cep.rulesengine.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * An iterator for RulePart.
 *
 * @author A. Rodriguez
 */
public class RulePartIterator implements Iterator<RulePart> {

    private ArrayList<RulePart> list;
    int current = -1;
    int next = 0;

    public RulePartIterator(ArrayList<RulePart> elements) {
        this.list = elements;
    }

    /**
     * Returns true if there are more elements in the Iterator.
     */
    public boolean hasNext() {
        if (next == -1) return false;
        if (next + 1 > list.size())
            return false;
        if (next <= list.size())
            return true;
        return false;
    }

    /**
     * Returns the next element in the Iterator.
     */
    public RulePart next() {
        Object n = list.get(next);
        current++;
        next++;
        return (RulePart) n;
    }

    /**
     * Replaces the current RuleCondition or RuleStatement with the given
     * object.
     */
    public void replace(Object o) {
        Object obj = list.get(current);
        obj = o;
        list.set(current, (RulePart) o);
    }

    /**
     * Removes the last element returned by the Iterator.
     */
    public void remove() {
        if (current == -1) {
            throw new IllegalStateException("Nothing to remove.");
        }
        list.remove(current);
        next = current--;
    }

}
