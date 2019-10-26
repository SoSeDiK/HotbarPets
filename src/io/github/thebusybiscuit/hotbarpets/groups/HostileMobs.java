package io.github.thebusybiscuit.hotbarpets.groups;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.CreeperPet;
import io.github.thebusybiscuit.hotbarpets.pets.EndermanPet;
import io.github.thebusybiscuit.hotbarpets.pets.GhastPet;
import io.github.thebusybiscuit.hotbarpets.pets.PhantomPet;
import io.github.thebusybiscuit.hotbarpets.pets.ShulkerPet;
import io.github.thebusybiscuit.hotbarpets.pets.SpiderPet;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;

public final class HostileMobs implements PetGroup {

	public HostileMobs(HotbarPets plugin) throws Exception {
		load(plugin);
	}

	@Override
	public String getName() {
		return "&cВраждебный моб";
	}

	@Override
	public void load(HotbarPets plugin) throws Exception {
		new SpiderPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjdhNGMyNTZmMGRmNjE0MjMxZjhkNTUzNDRjOWRlMzkzODkzNjFhNzQwYzExZmFjYzBkMjk5ZjY3NmRkOWEifX19"), "&8Паук", getName(), "&7Любимая еда: гнилая плоть", "", "&rПравый клик: &7получить прыгучесть"), "HOTBAR_PET_SPIDER", new ItemStack(Material.ROTTEN_FLESH), new ItemStack[]{
				new ItemStack(Material.COAL), new ItemStack(Material.STRING), new ItemStack(Material.COAL),
				new ItemStack(Material.SPIDER_EYE), new ItemStack(Material.EMERALD), new ItemStack(Material.SPIDER_EYE),
				new ItemStack(Material.STRING), SlimefunItems.GOLD_16K, new ItemStack(Material.STRING)
		}).register();

		new GhastPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGI2YTcyMTM4ZDY5ZmJiZDJmZWEzZmEyNTFjYWJkODcxNTJlNGYxYzk3ZTVmOTg2YmY2ODU1NzFkYjNjYzAifX19"), "&rГаст", getName(), "&7Любимая еда: огненный заряд", "", "&rПравый клик: &7выпустить огненный шар", "&7и получить огнестойкость"), "HOTBAR_PET_GHAST", new ItemStack(Material.FIRE_CHARGE), new ItemStack[]{
				new ItemStack(Material.GHAST_TEAR), new ItemStack(Material.DIAMOND), new ItemStack(Material.GHAST_TEAR),
				new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.QUARTZ_BLOCK),
				SlimefunItems.GOLD_24K, new ItemStack(Material.TNT), SlimefunItems.GOLD_24K
		}).register();

		new ShulkerPet(plugin, new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjFkMzUzNGQyMWZlODQ5OTI2MmRlODdhZmZiZWFjNGQyNWZmZGUzNWM4YmRjYTA2OWU2MWUxNzg3ZmYyZiJ9fX0=="), "&dШалкер", getName(), "&7Любимая еда: плод хоруса", "", "&rПравый клик: &7запустить стрелу левитации"), "HOTBAR_PET_SHULKER", new ItemStack(Material.CHORUS_FRUIT), new ItemStack[]{
				new ItemStack(Material.NETHER_WART), new ItemStack(Material.SHULKER_SHELL), new ItemStack(Material.NETHER_WART),
				new ItemStack(Material.QUARTZ), new ItemStack(Material.GLOWSTONE_DUST), new ItemStack(Material.QUARTZ),
				new ItemStack(Material.FEATHER), new ItemStack(Material.SHULKER_SHELL), new ItemStack(Material.FEATHER)
		}).register();

		new PhantomPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBiOTE4OWMzNzEzZjBkYWNhYzliMmJiNjA2NTA5MGM1MmIwYzkwZjEwODIwOGUwYTg2YmU1ODg1ZTk5NTc5YSJ9fX0="), "&7Фантом", getName(), "&7Любимая еда: свёкла", "", "&rПравый клик: &7получить плавное падение"), "HOTBAR_PET_PHANTOM", new ItemStack(Material.BEETROOT), new ItemStack[]{
				new ItemStack(Material.PHANTOM_MEMBRANE), new ItemStack(Material.RABBIT_FOOT), new ItemStack(Material.PHANTOM_MEMBRANE),
				new ItemStack(Material.DIAMOND), SlimefunItems.GOLD_6K, new ItemStack(Material.DIAMOND),
				new ItemStack(Material.PHANTOM_MEMBRANE), new ItemStack(Material.RABBIT_FOOT), new ItemStack(Material.PHANTOM_MEMBRANE)
		}).register();

		new EndermanPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E1OWJiMGE3YTMyOTY1YjNkOTBkOGVhZmE4OTlkMTgzNWY0MjQ1MDllYWRkNGU2YjcwOWFkYTUwYjljZiJ9fX0="), "&8Эндермен", getName(), "&7Любимая еда: эндерняк", "", "&rПравый клик: &7выпустить эндер-жемчуг"), "HOTBAR_PET_ENDER_MAN", new ItemStack(Material.END_STONE), new ItemStack[]{
				new ItemStack(Material.OBSIDIAN), new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.OBSIDIAN),
				new ItemStack(Material.ENDER_EYE), new ItemStack(Material.EMERALD), new ItemStack(Material.ENDER_EYE),
				new ItemStack(Material.ENDER_PEARL), SlimefunItems.GOLD_16K, new ItemStack(Material.ENDER_PEARL)
		}).register();

		new CreeperPet(plugin, new CustomItem(Material.CREEPER_HEAD, "&2Крипер", getName(), "&7Любимая еда: порох", "", "&rНевосприимчивость к взрывам", "&rПравый клик: &7устроить взрыв"), "HOTBAR_PET_CREEPER", new ItemStack(Material.GUNPOWDER), new ItemStack[]{
				new ItemStack(Material.DIAMOND), new ItemStack(Material.CREEPER_HEAD), new ItemStack(Material.DIAMOND),
				new ItemStack(Material.GUNPOWDER), new ItemStack(Material.EMERALD), new ItemStack(Material.GUNPOWDER),
				new ItemStack(Material.DIAMOND), SlimefunItems.GOLD_20K, new ItemStack(Material.DIAMOND)
		}).register();

		new HotbarPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzg5NTdkNTAyM2M5MzdjNGM0MWFhMjQxMmQ0MzQxMGJkYTIzY2Y3OWE5ZjZhYjM2Yjc2ZmVmMmQ3YzQyOSJ9fX0="), "&4Магмовый куб", getName(), "&7Любимая еда: Незер-кварц", "", "&rНевосприимчивость к лаве", "&rСлегка прожорлив"), "HOTBAR_PET_MAGMA_CUBE", new ItemStack(Material.QUARTZ), new ItemStack[]{
				new ItemStack(Material.REDSTONE), new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.REDSTONE),
				new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.EMERALD), new ItemStack(Material.BLAZE_POWDER),
				new ItemStack(Material.NETHERRACK), SlimefunItems.GOLD_20K, new ItemStack(Material.NETHERRACK)
		}).register();

		new HotbarPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjI1MDViZTc3OTZiN2Q3OGE3MTdjM2U2NWVhNDJiZjIxMTQ0OWZkYjZkOTNmMmI0MDZhODhhYjcxYjcwIn19fQ=="), "&6Ифрит", getName(), "&7Любимая еда: Незер-кварц", "", "&rНевосприимчивость к огню"), "HOTBAR_PET_BLAZE", new ItemStack(Material.QUARTZ), new ItemStack[]{
				new ItemStack(Material.GLOWSTONE_DUST), new ItemStack(Material.BLAZE_ROD), new ItemStack(Material.GLOWSTONE_DUST),
				new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.EMERALD), new ItemStack(Material.BLAZE_POWDER),
				SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K
		}).register();

		new HotbarPet(new CustomItem(Material.ZOMBIE_HEAD, "&2Зомби", getName(), "", "&rРазрешает есть гнилую плоть", "&rбез получения голода"), "HOTBAR_PET_ZOMBIE", new ItemStack(Material.ROTTEN_FLESH), new ItemStack[] {
				new ItemStack(Material.DIAMOND), new ItemStack(Material.ZOMBIE_HEAD), new ItemStack(Material.DIAMOND),
				new ItemStack(Material.MOSSY_COBBLESTONE), new ItemStack(Material.EMERALD), new ItemStack(Material.MOSSY_COBBLESTONE),
				new ItemStack(Material.ROTTEN_FLESH), SlimefunItems.NECROTIC_SKULL, new ItemStack(Material.ROTTEN_FLESH)
		}).register();
	}



}
