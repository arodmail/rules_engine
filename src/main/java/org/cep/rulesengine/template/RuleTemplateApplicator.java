package org.cep.rulesengine.template;

import java.util.List;

/**
 * Defines a method common to classes that apply a template to a set of parameters
 * and values in order to generate a rule.
 *
 * @author A. Rodriguez
 */
public interface RuleTemplateApplicator {

    /**
     * Generates a rule from the given template, parameters, and values.
     */
    public abstract String applyTemplate(String paramString, List<String> paramList1,
                                         List<String> paramList2)
            throws RuleTemplateException;
}
