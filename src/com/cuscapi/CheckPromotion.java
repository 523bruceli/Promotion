package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public class CheckPromotion extends Promotion {

	public CheckPromotion() {

	}

	

	@Override
	public void configRewards(Rewards rewards) {
		AutoServiceChargeRewards autoServiceChargeRewards = ((AutoServiceChargeRewards) rewards);
		autoServiceChargeRewards.setOriginalServiceCharge(100);
		autoServiceChargeRewards.setDiscount(0.9);
	}
}