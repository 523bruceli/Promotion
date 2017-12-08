package com.cuscapi;

import java.util.List;

/**
 * This class (a) declares the interface for objects in the composition, (b)
 * implements default behaviour for the interface common to all classes, as
 * appropriate, (c) declares an interface for accessing and managing its child
 * components, and (d) optionally defines an interface for accessing a
 * component's parent in the recursive structure and implements it if that's
 * appropriate.
 * 
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public abstract class Condition {

	protected String name;

	public Condition(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param component
	 */
	public abstract void Add(Condition component);

	public abstract boolean isMatch(List<MenuItem> consumeMenuItems);

	/**
	 * 
	 * @param component
	 */
	public abstract void Remove(Condition component);

}