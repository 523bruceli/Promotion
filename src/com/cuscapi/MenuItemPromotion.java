package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public class MenuItemPromotion extends Promotion {

	public MenuItemPromotion() {

	}

	@Override
	public void configRewards(Rewards rewards) {
		MenuitemRewards menuitemRewards = ((MenuitemRewards) rewards);
		menuitemRewards.setPrice(100);
		menuitemRewards.setDiscount(0.9);
	}
}