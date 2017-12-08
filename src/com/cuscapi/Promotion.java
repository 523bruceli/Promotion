package com.cuscapi;

import java.util.Date;
import java.util.List;

/**
 * @author BruceLi
 * @version 1.0
 * @created 07-ÈýÔÂ-2014 15:55:37
 */
public abstract class Promotion {

	private int allowMaxTimes;
	private boolean appliedSimultaneously;
	private String brand;
	private Date effectiveTime;
	private String PRI;
	private String promotionDescription;
	private String promotionName;
	private String promotionType;
	private String rewardsType;
	private String store;
	public Condition m_Condition;
	public Rewards m_Rewards;

	public Promotion() {

	}

	/**
	 * 
	 * @param conditions
	 */
	public Rewards computeRewardsByConditions(Condition conditions,
			List<MenuItem> consumeMenuItems) {
		Rewards rewards = createRewards(rewardsType);
		configRewards(rewards);
		if (conditions.isMatch(consumeMenuItems)) {
			rewards.getTruthValue();
		}
		return rewards;
	}

	public abstract void configRewards(Rewards rewards);

	/**
	 * 
	 * @param rootName
	 * @param conditionType
	 */
	public Condition createCondition(String rootName, String conditionType) {
		ConditionFactory factory = null;
		if (conditionType.equals("check")) {
			factory = new CheckConditionFactory();
		}
		if (conditionType.equals("menuItem")) {
			factory = new MenuItemConditionFactory();
		}
		if (conditionType.equals("checkWithMenuItem")) {
			factory = new CompositeConditionFactory();
		}
		return factory.createConditions(rootName, conditionType);
	}

	/**
	 * 
	 * @param rewardsType
	 */
	public Rewards createRewards(String rewardsType) {
		RewardFactory factory = null;
		if (rewardsType.equals("check")) {
			factory = new AutoServiceChargeRewardsFactory();
		}
		if (rewardsType.equals("discount")) {
			factory = new DiscountRewardsFactory();
		}
		if (rewardsType.equals("tradeOnPrice")) {
			factory = new TradeOnPriceRewardsFactory();
		}
		return factory.createReawards(rewardsType);
	}

	/**
	 * 
	 * @param consumeMenuItems
	 */
	public void promotion(List<MenuItem> consumeMenuItems) {
		this.m_Condition = createCondition("root", promotionType);
		this.m_Rewards = computeRewardsByConditions(this.m_Condition,
				consumeMenuItems);
	}

	public int getAllowMaxTimes() {
		return allowMaxTimes;
	}

	public void setAllowMaxTimes(int allowMaxTimes) {
		this.allowMaxTimes = allowMaxTimes;
	}

	public boolean isAppliedSimultaneously() {
		return appliedSimultaneously;
	}

	public void setAppliedSimultaneously(boolean appliedSimultaneously) {
		this.appliedSimultaneously = appliedSimultaneously;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getPromotionDescription() {
		return promotionDescription;
	}

	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public String getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public String getRewardsType() {
		return rewardsType;
	}

	public void setRewardsType(String rewardsType) {
		this.rewardsType = rewardsType;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getPRI() {
		return PRI;
	}

	public void setPRI(String pRI) {
		PRI = pRI;
	}

}