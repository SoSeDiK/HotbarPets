package io.github.thebusybiscuit.hotbarpets.groups;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.special.CookieSlimePet;
import io.github.thebusybiscuit.hotbarpets.pets.special.PatriotPet;
import io.github.thebusybiscuit.hotbarpets.pets.special.PurpliciousCowPet;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;

public final class SpecialPets implements PetGroup {

	public SpecialPets(HotbarPets plugin) throws Exception {
		load(plugin);
	}

	@Override
	public String getName() {
		return "&9Особый питомец";
	}

	@Override
	public void load(HotbarPets plugin) throws Exception {
		new PurpliciousCowPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2UxZmM2M2QzMDNlYjVmMzY2YWVjYWU2ZDI1MGQ0ZTJkNzc5YTlmNWVmOGRlYWZmNWIzYmM5NTMwN2ZmOSJ9fX0="), "&5Святая корова", getName(), "&7Любимая еда: золотое яблоко", "", "&rПравый клик: &7получить регенерацию"), "HOTBAR_PET_PURPLICIOUS_COW", new ItemStack(Material.GOLDEN_APPLE), new ItemStack[]{
				new ItemStack(Material.COOKED_BEEF), new ItemStack(Material.DIAMOND), new ItemStack(Material.COOKED_BEEF),
				new ItemStack(Material.DIAMOND), new ItemStack(Material.EMERALD), new ItemStack(Material.DIAMOND),
				SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K
		}).register();

		new CookieSlimePet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTY3MDlkODdlODVkMTUzYmI4ODNhMjNhNWE4ODNlZTQ0ZGRiMjg0ZDUzMThiNzgwYTE2ZTgyYTlkYWM2NTEifX19"), "&aМистер Печенюшка", getName(), "&7Любимая еда: печенье", "", "&rImmune to Fall Damage", "&rПравый клик: &7получить регенерацию"), "HOTBAR_PET_MRCOOKIESLIME", new ItemStack(Material.COOKIE), new ItemStack[]{
				new ItemStack(Material.COOKIE), new ItemStack(Material.DIAMOND), new ItemStack(Material.COOKIE),
				new ItemStack(Material.DIAMOND), new ItemStack(Material.EMERALD), new ItemStack(Material.DIAMOND),
				SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K
		}).register();

		new PatriotPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzhhNTY0NmM4NDczZTFiZjQ1NTEzYmU0ZTZlODY1NjA1MDY3MWI2NTEzM2MwMDQ4ZDQ4NGUxYmYwYjQ2Mjk1ZiJ9fX0="), "&5Патриот", getName(), "&7Любимая еда: нарост из Незера", "", "&rполучить, сопротивление, силу", "&rи насыщение"), "HOTBAR_PET_PATRIOT", new ItemStack(Material.NETHER_WART), new ItemStack[]{
				new ItemStack(Material.REDSTONE), SlimefunItems.MAGIC_LUMP_1, new ItemStack(Material.REDSTONE),
				SlimefunItems.MAGIC_LUMP_1, SlimefunItems.RAW_CARBONADO, SlimefunItems.MAGIC_LUMP_1,
				SlimefunItems.GOLD_4K, new ItemStack(Material.REDSTONE), SlimefunItems.GOLD_4K
		}).register();

		new HotbarPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzk2NmYwZWJkNzdmMWJjZDY1NmZhMmRjM2VmMDMwM2UyNmE2YTNkZTQ5OGMzOTk5ZDM5ZmRjYWNjNWY1YWQifX19"), "&bМорж", getName(), "&7Любимая еда: сырая треска", "", "&rНевозможно утонуть"), "HOTBAR_PET_WALSHRUS", new ItemStack(Material.COD), new ItemStack[]{
				new ItemStack(Material.COD), new ItemStack(Material.DIAMOND), new ItemStack(Material.COD),
				new ItemStack(Material.DIAMOND), new ItemStack(Material.EMERALD), new ItemStack(Material.DIAMOND),
				SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K
		}).register();

		new HotbarPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTg0NzRmN2E2YzEzOWYxY2NkNzM1YTQ2NzdjMDQ1M2M0YmVmZWRmYzg5ZmVkYTQ5ZWE4ODZlYjE4ZGRmNmNkZiJ9fX0="), "&4Смерть", getName(), "&7Любимая еда: души", "", "&rОстерегайтесь! Готовит пирог", "&rиз душ убитых игроков"), "HOTBAR_PET_EYAMAZ", new ItemStack(Material.SOUL_SAND), new ItemStack[]{
				new ItemStack(Material.SOUL_SAND), new ItemStack(Material.DIAMOND), new ItemStack(Material.SOUL_SAND),
				new ItemStack(Material.DIAMOND), new ItemStack(Material.EMERALD), new ItemStack(Material.DIAMOND),
				SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K
		}).register();
	}



}
