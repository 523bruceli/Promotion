package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public class DiscountRewards extends MenuitemRewards {

	public DiscountRewards() {

	}

	public void getTruthValue() {

		MenuItem menuItem1 = new MenuItem();
		menuItem1.setName("menuItem1");
		menuItem1.setPrice(menuItem1.getPrice() * getDiscount());

		m_MenuItems.add(menuItem1);

	}

}