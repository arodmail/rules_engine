package org.cep.rulesengine.template;

import org.antlr.stringtemplate.StringTemplate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * A RuleTemplateApplicator implementation for un-sequenced rule definition.
 *
 * @author A. Rodriguez
 */
public class UnSequencedRuleApplicator implements RuleTemplateApplicator {

    private static final String PERMUTATIONS = "Permutations";
    private static final String TIME_DURATION = "time_duration";
    private static final String CLASS = "class";

    /**
     * Implementation of applyTemplate() for a un-sequenced rule definition.
     */
    public String applyTemplate(String templateSpec, List<String> parameters,
                                List<String> values) throws RuleTemplateException {

        StringTemplate myRule = new StringTemplate(templateSpec);
        ArrayList<String> toPermute = new ArrayList<String>();

        Map<String, String> mapping = new HashMap<String, String>();

        for (int i = 0; i < parameters.size(); i++) {

            String parameter = parameters.get(i);
            String value = values.get(i);

            mapping.put(parameter, value);

            if (parameter.startsWith(CLASS))
                toPermute.add(value);

        }

        myRule.setAttribute(PERMUTATIONS, permute(toPermute, parameters, values));
        myRule.setAttribute(TIME_DURATION, "15s");

        return myRule.toString();

    }

    /**
     * Returns an ArrayList of AlertViewPairs permutations.
     */
    private ArrayList<AlertViewPairs> permute(ArrayList<String> toPermute,
                                              List<String> parameters, List<String> values) {

        ArrayList<AlertViewPairs> set = new ArrayList<AlertViewPairs>();

        int[] indices;
        Object[] elements = toPermute.toArray();
        PermutationGenerator permuter = new PermutationGenerator(elements.length);
        StringBuffer permutation = null;
        while (permuter.hasMore()) {
            permutation = new StringBuffer();
            AlertViewPairs alertViewPairs = new AlertViewPairs();

            indices = permuter.getNext();
            for (int i = 0; i < indices.length; i++) {
                permutation.append(elements[indices[i]] + ",");
            }

            StringTokenizer tokenizer = new StringTokenizer(permutation.toString(), ",");
            int count = 0;
            while (tokenizer.hasMoreTokens()) {
                String identity = tokenizer.nextToken();

                callSetter(alertViewPairs, parameters.get(count), identity); // sets the identity

                int midpoint = parameters.size() / 2;
                int index = values.indexOf(identity);
                int viewIndex = midpoint + index;

                callSetter(alertViewPairs, parameters.get(viewIndex),
                        values.get(viewIndex)); // sets the view
                count++;
            }

            set.add(alertViewPairs);

        }

        return set;
    }

    /**
     * Calls the setter method on the given AlertViewPairs, using the parameter
     * and value specified.
     */
    private void callSetter(AlertViewPairs alertViewPairs,
                            String parameter, String value) {
        // call the setter on the AlertViewPairs
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

        public String class1 = "";
        public String class2 = "";
        public String class3 = "";

        public String view1 = "";
        public String view2 = "";
        public String view3 = "";

        public String getClass1() {
            return class1;
        }

        public String getClass2() {
            return class2;
        }

        public String getClass3() {
            return class3;
        }

        public String getView1() {
            return view1;
        }

        public String getView2() {
            return view2;
        }

        public String getView3() {
            return view3;
        }

        public void setClass1(String class1) {
            this.class1 = class1;
        }

        public void setClass2(String class2) {
            this.class2 = class2;
        }

        public void setClass3(String class3) {
            this.class3 = class3;
        }

        public void setView1(String view1) {
            this.view1 = view1;
        }

        public void setView2(String view2) {
            this.view2 = view2;
        }

        public void setView3(String view3) {
            this.view3 = view3;
        }

    }

}
