package com.cuscapi;

import java.util.List;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public class CheckCondition extends Condition {

	public CheckCondition(String name) {
		super(name);
	}

	private double amount;

	/**
	 * 
	 * @param component
	 */
	public void Add(Condition component) {

	}

	public boolean isMatch(List<MenuItem> consumeMenuItems) {
		double total = 0;
		for (MenuItem menuItem : consumeMenuItems) {
			total += menuItem.getPrice();
		}
		return total > amount;
	}

	/**
	 * 
	 * @param component
	 */
	public void Remove(Condition component) {

	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}