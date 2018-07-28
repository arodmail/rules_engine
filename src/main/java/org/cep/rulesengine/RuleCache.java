package org.cep.rulesengine;

import java.util.ArrayList;
import java.util.List;

/**
 * A very basic cache for Rule.
 *
 * @author A. Rodriguez
 */
public class RuleCache {

    /**
     * The singleton instance of the cache.
     */
    private static RuleCache instance = null;

    /**
     * The data structure for this cache
     */
    private List<Rule> cachedRules = new ArrayList<Rule>(26);

    /**
     * May only be constructed here.
     */
    private RuleCache() {
    }

    /**
     * Returns the singleton instance of the RuleCache.
     *
     * @return a singleton instance of RuleCache.
     */
    public static synchronized RuleCache getInstance() {
        if (instance == null)
            instance = new RuleCache();
        return instance;
    }

    /**
     * Returns a subset of the rules in cache that match the given target
     * or content type.
     *
     * @param ruleTarget the name of a CTD.
     * @return an ArrayList of Rule whose target matches the target given.
     */
    public List<Rule> getRulesByTarget(String ruleTarget) {
        List<Rule> result = new ArrayList<Rule>(10);
        for (Rule rule : cachedRules) {
            if (rule.getRuleTarget().equals(ruleTarget)) {
                result.add(rule);
            }
        }
        return result;
    }

    /**
     * Puts a Rule in the cache.
     *
     * @param rule a rule to cache.
     */
    public void put(Rule rule) {
        this.cachedRules.add(rule);
    }

    /**
     * Puts multiple Rule in the cache.
     *
     * @param rules a List<Rule> to add to the cache.
     */
    public void putAll(List<Rule> rules) {
        this.cachedRules.addAll(rules);
    }

    /**
     * Clears (expires) all currently cached rule.
     */
    public void expireCache() {
        this.cachedRules.clear();
    }

}
