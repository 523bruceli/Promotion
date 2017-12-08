package com.cuscapi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public class Main {

	public Main() {

	}

	public static void main(String[] args) {

		MenuItem menuItem1 = new MenuItem();
		menuItem1.setName("menuItem1");
		menuItem1.setPrice(10.0);
		MenuItem menuItem2 = new MenuItem();
		menuItem2.setName("menuItem2");
		menuItem2.setPrice(15.0);
		MenuItem menuItem3 = new MenuItem();
		menuItem3.setName("menuItem3");
		menuItem3.setPrice(20.0);

		Promotion promotion1 = new CheckPromotion();
		List<MenuItem> consumeMenuItems1 = new ArrayList<>();
		consumeMenuItems1.add(menuItem1);
		promotion1.promotion(consumeMenuItems1);
		System.out.println(promotion1.m_Condition);
		System.out.println(promotion1.m_Rewards);

		Promotion promotion2 = new MenuItemPromotion();
		List<MenuItem> consumeMenuItems2 = new ArrayList<>();
		consumeMenuItems2.add(menuItem2);
		consumeMenuItems2.add(menuItem3);
		promotion2.promotion(consumeMenuItems2);
		System.out.println(promotion2.m_Condition);
		System.out.println(promotion2.m_Rewards);

	}
}