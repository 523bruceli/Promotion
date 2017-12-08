package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public class CheckConditionFactory extends ConditionFactory {

	/**
	 * 
	 * @param rootName
	 * @param conditionType
	 */
	public Condition createConditions(String rootName, String conditionType) {
		Condition root = new CompositeCondition(rootName);
		CheckCondition check1 = new CheckCondition("check1");
		check1.setAmount(5);
		root.Add(check1);
		CheckCondition check2 = new CheckCondition("check1");
		check2.setAmount(9);
		root.Add(check2);
		return root;
	}
}