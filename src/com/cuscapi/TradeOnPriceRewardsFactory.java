package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:37
 */
public class TradeOnPriceRewardsFactory extends RewardFactory {

	public TradeOnPriceRewardsFactory() {

	}

	/**
	 * 
	 * @param type
	 */
	public Rewards createReawards(String type) {
		return new TradeOnPriceRewards();
	}

}