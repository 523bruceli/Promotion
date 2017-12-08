package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public class AutoServiceChargeRewardsFactory extends RewardFactory {

	public AutoServiceChargeRewardsFactory() {

	}

	/**
	 * 
	 * @param type
	 */
	public Rewards createReawards(String type) {
		return new AutoServiceChargeRewards();
	}

}