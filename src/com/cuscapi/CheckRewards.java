package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-����-2014 15:55:36
 */
public abstract class CheckRewards extends Rewards {

	private double discount;

	public CheckRewards() {

	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}