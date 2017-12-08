package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:37
 */
public class TradeOnPriceRewards extends MenuitemRewards {

	public TradeOnPriceRewards() {

	}

	public void getTruthValue() {
		MenuItem m_MenuItem = new MenuItem();
		m_MenuItem.setName("menuItem1");
		m_MenuItem.setPrice(getPrice() * getDiscount());
		m_MenuItems.add(m_MenuItem);
	}
}