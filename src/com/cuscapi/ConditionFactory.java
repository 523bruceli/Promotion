package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public abstract class ConditionFactory {

	/**
	 * 
	 * @param rootName
	 * @param conditionType
	 */
	public abstract Condition createConditions(String rootName,
			String conditionType);

}