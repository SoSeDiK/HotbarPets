package io.github.thebusybiscuit.hotbarpets.pets;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.hotbarpets.SimpleBasePet;

public class SquidPet extends SimpleBasePet {

	public SquidPet(ItemStack item, String name, ItemStack food, ItemStack[] recipe) {
		super(item, name, food, recipe);
	}
	
	@Override
	public void onUseItem(Player p) {
        p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1200, 2));
	}

}
