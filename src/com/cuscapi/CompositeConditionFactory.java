package com.cuscapi;

public class CompositeConditionFactory extends ConditionFactory {

	@Override
	public Condition createConditions(String rootName, String conditionType) {
		Condition root = new CompositeCondition(rootName);
		CheckCondition check1 = new CheckCondition("check1");
		check1.setAmount(5);
		root.Add(check1);
		CheckCondition check2 = new CheckCondition("check1");
		check2.setAmount(9);
		root.Add(check2);
		Condition menuItems = new CompositeCondition("menus");
		MenuItemCondition menuItemCondition1 = new MenuItemCondition(
				"menuItem1");
		MenuItem menuItem1 = new MenuItem();
		menuItemCondition1.m_MenuItem = menuItem1;
		MenuItemCondition menuItemCondition2 = new MenuItemCondition(
				"menuItem2");
		MenuItem menuItem2 = new MenuItem();
		menuItemCondition2.m_MenuItem = menuItem2;
		MenuItemCondition menuItemCondition3 = new MenuItemCondition(
				"menuItem3");
		MenuItem menuItem3 = new MenuItem();
		menuItemCondition3.m_MenuItem = menuItem3;
		menuItems.Add(menuItemCondition1);
		menuItems.Add(menuItemCondition2);
		menuItems.Add(menuItemCondition3);
		root.Add(menuItems);
		return root;
	}
}
