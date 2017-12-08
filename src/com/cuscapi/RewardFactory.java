package com.cuscapi;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:37
 */
public abstract class RewardFactory {

	public RewardFactory(){

	}

	/**
	 * 
	 * @param type
	 */
	public abstract Rewards createReawards(String type);

}