package com.cuscapi;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PromotionTest {
	private MenuItem menuItem1;
	private MenuItem menuItem2;
	private MenuItem menuItem3;
	private MenuItem menuItem4;
	private MenuItem menuItem5;

	@Before
	public void setUp() throws Exception {
		menuItem1 = new MenuItem();
		menuItem1.setName("menuItem1");
		menuItem1.setPrice(10.0);
		menuItem2 = new MenuItem();
		menuItem2.setName("menuItem2");
		menuItem2.setPrice(15.0);
		menuItem3 = new MenuItem();
		menuItem3.setName("menuItem3");
		menuItem3.setPrice(20.0);
		menuItem4 = new MenuItem();
		menuItem4.setName("menuItem4");
		menuItem4.setPrice(20.0);
		menuItem5 = new MenuItem();
		menuItem5.setName("menuItem5");
		menuItem5.setPrice(20.0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAutoServiceChargeRewards() {
		List<MenuItem> consumeMenuItems1 = new ArrayList<>();
		consumeMenuItems1.add(menuItem1);
		Promotion promotion1 = new CheckPromotion();
		promotion1.setAllowMaxTimes(1);
		promotion1.setPromotionName("promotionName1");
		promotion1.setPromotionType("check");
		promotion1.setRewardsType("check");
		promotion1.promotion(consumeMenuItems1);
		double price = ((AutoServiceChargeRewards) promotion1.m_Rewards)
				.getNowServiceCharge();
		Assert.assertTrue(0 == price);
	}

	@Test
	public void testDiscountRewards() {
		Promotion promotion2 = new MenuItemPromotion();
		List<MenuItem> consumeMenuItems2 = new ArrayList<>();
		consumeMenuItems2.add(menuItem2);
		consumeMenuItems2.add(menuItem3);
		promotion2.setPromotionType("menuItem");
		promotion2.setRewardsType("discount");
		promotion2.promotion(consumeMenuItems2);
		double price = ((DiscountRewards) promotion2.m_Rewards).getPrice();
		Assert.assertTrue(100.0 == price);
	}

	@Test
	public void testTradeOnPriceRewards() {
		Promotion promotion3 = new MenuItemPromotion();
		List<MenuItem> consumeMenuItems3 = new ArrayList<>();
		consumeMenuItems3.add(menuItem4);
		consumeMenuItems3.add(menuItem5);
		promotion3.setPromotionType("checkWithMenuItem");
		promotion3.setRewardsType("tradeOnPrice");
		promotion3.promotion(consumeMenuItems3);
		double price = ((TradeOnPriceRewards) promotion3.m_Rewards).getPrice();
		Assert.assertTrue(100.0 == price);
	}

}
