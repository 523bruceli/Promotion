package com.cuscapi;

import java.util.ArrayList;
import java.util.List;

/**
 * This class (a) defines behaviour for components having children, (b) stores
 * child components, and (c) implements child-related operations in the
 * Component interface.
 * 
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public class CompositeCondition extends Condition {

	public CompositeCondition(String name) {
		super(name);
	}

	private List<Condition> children = new ArrayList<Condition>();

	/**
	 * 
	 * @param component
	 */
	public void Add(Condition component) {
		children.add(component);
	}

	public boolean isMatch(List<MenuItem> consumeMenuItems) {
		boolean result = true;
		for (Condition condition : children) {
			result = result & condition.isMatch(consumeMenuItems);
		}
		return result;
	}

	/**
	 * 
	 * @param component
	 */
	public void Remove(Condition component) {
		children.remove(component);
	}

}