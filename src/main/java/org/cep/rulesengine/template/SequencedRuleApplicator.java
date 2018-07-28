package org.cep.rulesengine.template;

import org.antlr.stringtemplate.StringTemplate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * A RuleTemplateApplicator implementation for sequenced rule definition.
 *
 * @author A. Rodriguez
 */
public class SequencedRuleApplicator implements RuleTemplateApplicator {

    private static final String PRIMITIVE_SET = "PrimitiveSet";
    private static final String TIME_DURATION = "time_duration";

    private static final String CLASS_1 = "class1";
    private static final String VIEW_1 = "view1";

    /**
     * Implementation of applyTemplate() for a sequenced rule definition.
     */
    public String applyTemplate(String templateSpec, List<String> parameters,
                                List<String> values) throws RuleTemplateException {

        StringTemplate myRule = new StringTemplate(templateSpec);

        List<AlertViewPairs> set = new ArrayList<AlertViewPairs>(6);

        if (values.size() > 1 && (values.size() % 2 == 0)) {
            int midPoint = values.size() / 2;
            String view1 = values.remove(midPoint);
            parameters.remove(midPoint);

            // first element is the primary
            String identity1 = values.remove(0);
            parameters.remove(0);

            myRule.setAttribute(CLASS_1, identity1);
            myRule.setAttribute(VIEW_1, view1);
        }

        AlertViewPairs alertViewPairs = new AlertViewPairs();

        for (int i = 0; i < parameters.size(); i++) {
            callSetter(alertViewPairs, parameters.get(i), values.get(i));
        }

        set.add(alertViewPairs);

        myRule.setAttribute(PRIMITIVE_SET, set);
        myRule.setAttribute(TIME_DURATION, "15s");

        return myRule.toString();
    }

    /**
     * Calls the setter method on the given AlertViewPairs, using the parameter
     * and value specified.
     */
    private void callSetter(AlertViewPairs alertViewPairs, String parameter,
                            String value) {

        String setterMethod = "set" + parameter.substring(0, 1).toUpperCase() + parameter.substring(1, parameter.length());

        Method method;

        try {
            method = alertViewPairs.getClass().getMethod(setterMethod, new Class[]{String.class});
            method.invoke(alertViewPairs, value);
        } catch (SecurityException | NoSuchMethodException
                | IllegalArgumentException | IllegalAccessException
                | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unused")
    private class AlertViewPairs {

        public String class2 = "";
        public String class3 = "";

        public String view2 = "";
        public String view3 = "";

        public String getClass2() {
            return class2;
        }

        public String getClass3() {
            return class3;
        }

        public String getView2() {
            return view2;
        }

        public String getView3() {
            return view3;
        }

        public void setClass2(String class2) {
            this.class2 = class2;
        }

        public void setClass3(String class3) {
            this.class3 = class3;
        }

        public void setView2(String view2) {
            this.view2 = view2;
        }

        public void setView3(String view3) {
            this.view3 = view3;
        }

    }

}
