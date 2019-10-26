package io.github.thebusybiscuit.hotbarpets;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;

public class HotbarPetsRunnable implements Runnable {

	private HotbarPet chicken; 
	private HotbarPet mooshroom; 
	private HotbarPet fish;
	private HotbarPet goldenCow;

	public HotbarPetsRunnable() {
		chicken = (HotbarPet) SlimefunItem.getByID("HOTBAR_PET_CHICKEN");
		mooshroom = (HotbarPet) SlimefunItem.getByID("HOTBAR_PET_MOOSHROOM");
		fish = (HotbarPet) SlimefunItem.getByID("HOTBAR_PET_FISH");
		goldenCow = (HotbarPet) SlimefunItem.getByID("HOTBAR_PET_GOLDEN_COW");
	}

	@Override
	public void run() {
		for (Player p : Bukkit.getOnlinePlayers()) {
			for (int i = 0; i < 9; ++i) {
				ItemStack item = p.getInventory().getItem(i);

				if (item == null || item.getType() == null || item.getType() == Material.AIR) continue;

				if (chicken != null && SlimefunManager.isItemSimiliar(item, chicken.getItem(), true)) {
					if (!p.getInventory().containsAtLeast(chicken.getFavouriteFood(), 1)) {
						p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Питомец &rКурица &9помог бы, если бы Вы не забывали кормить его :("));
					} 
					else {
						p.getInventory().removeItem(chicken.getFavouriteFood());
						p.getInventory().addItem(new ItemStack(Material.EGG));
						p.getWorld().playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 1.0F, 2.0F);
					}
				}
				else if (mooshroom != null && SlimefunManager.isItemSimiliar(item, mooshroom.getItem(), true)) {
					if (!p.getInventory().containsAtLeast(mooshroom.getFavouriteFood(), 1)) {
						p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Питомец &dГрибная корова &9помог бы, если бы Вы не забывали кормить его :("));
					} 
					else {
						p.getInventory().removeItem(mooshroom.getFavouriteFood());
						p.getInventory().addItem(new ItemStack(Material.BEETROOT_SOUP));
						p.getWorld().playSound(p.getLocation(), Sound.ENTITY_COW_AMBIENT, 1.0F, 2.0F);
					}
				}
				else if (fish != null && SlimefunManager.isItemSimiliar(item, fish.getItem(), true)) {
					if (!p.getInventory().containsAtLeast(fish.getFavouriteFood(), 1)) {
						p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Питомец &3Рыба &9помог бы, если бы Вы не забывали кормить его :("));
					} 
					else {
						p.getInventory().removeItem(fish.getFavouriteFood());
						p.getInventory().addItem(new ItemStack(Material.COOKED_COD));
						p.getWorld().playSound(p.getLocation(), Sound.BLOCK_WATER_AMBIENT, 1.0F, 2.0F);
					}
				}
				else if (goldenCow != null && SlimefunManager.isItemSimiliar(item, goldenCow.getItem(), true)) {
					if (!p.getInventory().containsAtLeast(goldenCow.getFavouriteFood(), 1)) {
						p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Питомец &6Золотая корова &9помог бы, если бы Вы не забывали кормить его :("));
					} 
					else {
						p.getInventory().removeItem(goldenCow.getFavouriteFood());
						p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
						p.getWorld().playSound(p.getLocation(), Sound.ENTITY_COW_AMBIENT, 0.8F, 2.0F);
					}
				}
			}
		}
	}

}
