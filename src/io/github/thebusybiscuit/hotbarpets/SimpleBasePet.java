package io.github.thebusybiscuit.hotbarpets;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.CSCoreLibPlugin.events.ItemUseEvent;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.handlers.ItemInteractionHandler;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;

public abstract class SimpleBasePet extends HotbarPet {

	public SimpleBasePet(ItemStack item, String name, ItemStack food, ItemStack[] recipe) {
		super(item, name, food, recipe);
	}

	public abstract void onUseItem(Player p);
	
	@Override
	public void register() {
		this.register(new ItemInteractionHandler() {

			@Override
			public boolean onRightClick(ItemUseEvent e, Player p, ItemStack item) {
				if (SlimefunManager.isItemSimiliar(item, getItem(), true)) {
					if (!p.getInventory().containsAtLeast(getFavouriteFood(), 1)) {
						p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Питомец &r" + getItem().getItemMeta().getDisplayName() + " &9помог бы, если бы Вы не забывали кормить его :("));
					} 
					else {
						p.getInventory().removeItem(getFavouriteFood());
						onUseItem(p);
					}
					return true;
				} 
				else {
					return false;
				}
			}
		});
	}

}
