package com.cuscapi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:36
 */
public abstract class MenuitemRewards extends Rewards {

	private double discount;
	private double price;
	public List<MenuItem> m_MenuItems = new ArrayList<>();

	public MenuitemRewards() {

	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}