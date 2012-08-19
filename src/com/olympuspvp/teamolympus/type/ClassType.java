package com.olympuspvp.teamolympus.type;

public enum ClassType {

	ROUGE("Rouge", 10, "a"),
	INFILTRATOR("Infiltrator", 8, "a"),
	ASSASSIN("Assassin", 12, "an"),
	WARRIOR("Warrior", 18, "a"),
	BERSERKER("Berserker", 10, "a"),
	PALADIN("Paladin", 12, "a"),
	ARCHER("Archer", 12, "an"),
	HUNTSMAN("Huntsman", 14, "a"),
	RANGER("Ranger", 14, "a"),
	MAGE("Mage", 14, "a"),
	CLERIC("Cleric", 18, "a"),
	SORCERER("Sorcerer", 12, "a");

	private String name;
	private int maxHealth;
	private String article;

	ClassType(final String friendlyName, final int maximumHealth, final String article){
		this.name = friendlyName;
		this.maxHealth = maximumHealth;
		this.article = article;
	}

	public String getName(){
		return this.name;
	}

	public int getMaxHealth(){
		return this.maxHealth;
	}
	
	public String getArticle(){
		return article;
	}

}