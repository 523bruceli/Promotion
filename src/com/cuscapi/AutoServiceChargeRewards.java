package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public class AutoServiceChargeRewards extends CheckRewards {

	private double nowServiceCharge;
	private double originalServiceCharge;

	public AutoServiceChargeRewards() {

	}

	public void getTruthValue() {
		nowServiceCharge = originalServiceCharge * getDiscount() - 100;
		if (nowServiceCharge < 0) {
			nowServiceCharge = 0;
		}
	}

	public double getNowServiceCharge() {
		return nowServiceCharge;
	}

	public void setNowServiceCharge(double nowServiceCharge) {
		this.nowServiceCharge = nowServiceCharge;
	}

	public double getOriginalServiceCharge() {
		return originalServiceCharge;
	}

	public void setOriginalServiceCharge(double originalServiceCharge) {
		this.originalServiceCharge = originalServiceCharge;
	}

}