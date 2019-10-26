package io.github.thebusybiscuit.hotbarpets.groups;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.IronGolemPet;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;

public final class PassiveMobs implements PetGroup {

	public PassiveMobs(HotbarPets plugin) throws Exception {
		load(plugin);
	}

	@Override
	public String getName() {
		return "&eНейтральный моб";
	}

	@Override
	public void load(HotbarPets plugin) throws Exception {
		new IronGolemPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODkwOTFkNzllYTBmNTllZjdlZjk0ZDdiYmE2ZTVmMTdmMmY3ZDQ1NzJjNDRmOTBmNzZjNDgxOWE3MTQifX19"), "&7Жезеный голем", getName(), "&7Любимая еда: железные слитки", "", "&rПравый клик: &7получить сопротивление"), "HOTBAR_PET_IRON_GOLEM", new ItemStack(Material.IRON_INGOT), new ItemStack[]{
				new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.PUMPKIN), new ItemStack(Material.IRON_BLOCK),
				new ItemStack(Material.IRON_INGOT), new ItemStack(Material.EMERALD), new ItemStack(Material.IRON_INGOT),
				new ItemStack(Material.IRON_INGOT), SlimefunItems.GOLD_16K, new ItemStack(Material.IRON_INGOT)
		}).register();

		new HotbarPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZhZDIwZmMyZDU3OWJlMjUwZDNkYjY1OWM4MzJkYTJiNDc4YTczYTY5OGI3ZWExMGQxOGM5MTYyZTRkOWI1In19fQ=="), "&aСлизень", getName(), "&7Любимая еда: светокаменная пыль", "", "&rНевосприимчивость к падениям"), "HOTBAR_PET_SLIME", new ItemStack(Material.GLOWSTONE_DUST), new ItemStack[]{
				new ItemStack(Material.SLIME_BALL), new ItemStack(Material.DIAMOND), new ItemStack(Material.SLIME_BALL),
				new ItemStack(Material.SLIME_BALL), new ItemStack(Material.EMERALD), new ItemStack(Material.SLIME_BALL),
				SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K
		}).register();
	}



}
