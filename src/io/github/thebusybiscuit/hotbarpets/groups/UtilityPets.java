package io.github.thebusybiscuit.hotbarpets.groups;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.BedPet;
import io.github.thebusybiscuit.hotbarpets.pets.EnderChestPet;
import io.github.thebusybiscuit.hotbarpets.pets.WorkbenchPet;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;

public final class UtilityPets implements PetGroup {

	public UtilityPets(HotbarPets plugin) throws Exception {
		load(plugin);
	}

	@Override
	public String getName() {
		return "&aВспомагательный питомец";
	}

	@Override
	public void load(HotbarPets plugin) throws Exception {
		new BedPet(new CustomItem(Material.RED_BED, "&rКровать", getName(), "&7Любимая еда: шерсть", "", "&rПравый клик: &7уснуть"), "HOTBAR_PET_BED", new ItemStack(Material.WHITE_WOOL), new ItemStack[]{
				new ItemStack(Material.IRON_INGOT), new ItemStack(Material.RED_BED), new ItemStack(Material.IRON_INGOT),
				new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.DIAMOND), new ItemStack(Material.WHITE_WOOL),
				new ItemStack(Material.OAK_PLANKS), SlimefunItems.GOLD_14K, new ItemStack(Material.OAK_PLANKS)
		}).register();

		new EnderChestPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTZjYzQ4NmMyYmUxY2I5ZGZjYjJlNTNkZDlhM2U5YTg4M2JmYWRiMjdjYjk1NmYxODk2ZDYwMmI0MDY3In19fQ=="), "&5Эндер-сундук", getName(), "&7Любимая еда: эндер-жемчуг", "", "&rПравый клик: &7открыть"), "HOTBAR_PET_ENDER_CHEST", new ItemStack(Material.ENDER_PEARL), new ItemStack[]{
				new ItemStack(Material.OBSIDIAN), new ItemStack(Material.ENDER_EYE), new ItemStack(Material.OBSIDIAN),
				new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.EMERALD), new ItemStack(Material.ENDER_PEARL),
				new ItemStack(Material.OBSIDIAN), SlimefunItems.GOLD_16K, new ItemStack(Material.OBSIDIAN)
		}).register();

		new WorkbenchPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGFkODgxZDY4NTQ3MTYxYWE3YjI5MjVlMzgzNzc4NzU2YmM2N2E3NWI0NDRhNTg2ZTUxNTk1M2VmODNhOSJ9fX0="), "&6Верстак", getName(), "&7Любимая еда: доски", "", "&rПравый клик: &7открыть"), "HOTBAR_PET_WORKBENCH", new ItemStack(Material.OAK_PLANKS), new ItemStack[]{
				new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.CRAFTING_TABLE), new ItemStack(Material.OAK_PLANKS),
				new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.OAK_PLANKS),
				new ItemStack(Material.OAK_PLANKS), SlimefunItems.GOLD_16K, new ItemStack(Material.OAK_PLANKS)
		}).register();
	}



}
