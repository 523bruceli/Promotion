package com.cuscapi;

import java.util.List;

/**
 * This class (a) represents leaf objects in the composition, and (b) defines
 * behaviour for primitive objects in the composition.
 * 
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public class MenuItemCondition extends Condition {

	public MenuItemCondition(String name) {
		super(name);
	}

	private double amount;
	private double quantity;
	public MenuItem m_MenuItem;

	/**
	 * 
	 * @param component
	 */
	public void Add(Condition component) {
		// cannot add to a leaf
	}

	public boolean isMatch(List<MenuItem> consumeMenuItems) {
		m_MenuItem = new MenuItem();
		m_MenuItem.setName("menuItem1");
		return consumeMenuItems.contains(m_MenuItem);
	}

	/**
	 * 
	 * @param component
	 */
	public void Remove(Condition component) {
		// cannot remove from a leaf
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}