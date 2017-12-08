package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-����-2014 15:55:36
 */
public class DiscountRewardsFactory extends RewardFactory {

	public DiscountRewardsFactory() {

	}

	/**
	 * 
	 * @param type
	 */
	public Rewards createReawards(String type) {
		return new DiscountRewards();
	}

}