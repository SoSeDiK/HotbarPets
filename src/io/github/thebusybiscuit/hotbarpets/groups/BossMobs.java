package io.github.thebusybiscuit.hotbarpets.groups;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.EnderDragonPet;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;

public final class BossMobs implements PetGroup {

	public BossMobs(HotbarPets plugin) throws Exception {
		load(plugin);
	}

	@Override
	public String getName() {
		return "&4Враждебный босс";
	}

	@Override
	public void load(HotbarPets plugin) throws Exception {
		new EnderDragonPet(new CustomItem(Material.DRAGON_HEAD, "&5Эндер-дракон", getName(), "&7Любимая еда: око Эндера", "", "&rПравый клик: &7выпустить огненный шар и получить сопротивление"), "HOTBAR_PET_DRAGON", new ItemStack(Material.ENDER_EYE), new ItemStack[]{
				new ItemStack(Material.PRISMARINE_CRYSTALS), new ItemStack(Material.DRAGON_BREATH), new ItemStack(Material.PRISMARINE_CRYSTALS),
				SlimefunItems.ENDER_LUMP_3, new ItemStack(Material.DRAGON_HEAD), SlimefunItems.ENDER_LUMP_3,
				new ItemStack(Material.PRISMARINE_CRYSTALS), new ItemStack(Material.DRAGON_BREATH), new ItemStack(Material.PRISMARINE_CRYSTALS)
		}).register();

		new HotbarPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2RmNzRlMzIzZWQ0MTQzNjk2NWY1YzU3ZGRmMjgxNWQ1MzMyZmU5OTllNjhmYmI5ZDZjZjVjOGJkNDEzOWYifX19"), "&8Визер", getName(), "&7Любимая еда: песок душ", "", "&rНевосприимчивость к иссушению"), "HOTBAR_PET_WITHER", new ItemStack(Material.SOUL_SAND), new ItemStack[]{
				new ItemStack(Material.COAL), new ItemStack(Material.WITHER_SKELETON_SKULL), new ItemStack(Material.COAL),
				new ItemStack(Material.SOUL_SAND), new ItemStack(Material.NETHER_STAR), new ItemStack(Material.SOUL_SAND),
				new ItemStack(Material.SOUL_SAND), SlimefunItems.GOLD_24K, new ItemStack(Material.SOUL_SAND)
		}).register();
	}



}
