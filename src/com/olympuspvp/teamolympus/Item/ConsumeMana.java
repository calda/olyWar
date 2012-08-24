package com.olympuspvp.teamolympus.Item;

import org.bukkit.entity.Player;

public class ConsumeMana{

	public static boolean consumeMana(final Player p, final int consume){
		boolean enoughMana;
		int mana = p.getFoodLevel();
		if(mana < consume){
			enoughMana = false;
		}else{
			enoughMana = true;
			mana -= consume;
			p.setFoodLevel(mana);
		}
		return enoughMana;
	}

}
