package io.github.thebusybiscuit.hotbarpets.groups;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.CowPet;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;

public final class FarmAnimals implements PetGroup {

	public FarmAnimals(HotbarPets plugin) throws Exception {
		load(plugin);
	}

	@Override
	public String getName() {
		return "&2Сельскохозяйственное животное";
	}

	@Override
	public void load(HotbarPets plugin) throws Exception {
		final ItemStack cow = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWQ2YzZlZGE5NDJmN2Y1ZjcxYzMxNjFjNzMwNmY0YWVkMzA3ZDgyODk1ZjlkMmIwN2FiNDUyNTcxOGVkYzUifX19"), "&6Корова", getName(), "&7Любимая еда: пшеница", "", "&rПравый клик: &7убрать негативные эффекты");
		
		new HotbarPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIxNjY4ZWY3Y2I3OWRkOWMyMmNlM2QxZjNmNGNiNmUyNTU5ODkzYjZkZjRhNDY5NTE0ZTY2N2MxNmFhNCJ9fX0="), "&dСвинья", getName(), "&7Любимая еда: морковь", "", "&rДополнительное насыщение при приёме пищи", "&rРазрешает есть отравленную еду"), "HOTBAR_PET_PIG", new ItemStack(Material.CARROT), new ItemStack[]{
				new ItemStack(Material.REDSTONE), new ItemStack(Material.CARROT), new ItemStack(Material.REDSTONE),
				new ItemStack(Material.PORKCHOP), new ItemStack(Material.DIAMOND), new ItemStack(Material.PORKCHOP),
				new ItemStack(Material.REDSTONE), SlimefunItems.GOLD_16K, new ItemStack(Material.REDSTONE)
		}).register();

		new HotbarPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTYzODQ2OWE1OTljZWVmNzIwNzUzNzYwMzI0OGE5YWIxMWZmNTkxZmQzNzhiZWE0NzM1YjM0NmE3ZmFlODkzIn19fQ=="), "&rКурица", getName(), "&7Любимая еда: семена пшеницы", "", "&rИногда дарит яйца…"), "HOTBAR_PET_CHICKEN", new ItemStack(Material.WHEAT_SEEDS), new ItemStack[]{
				new ItemStack(Material.REDSTONE), new ItemStack(Material.FEATHER), new ItemStack(Material.REDSTONE),
				new ItemStack(Material.COOKED_CHICKEN), new ItemStack(Material.DIAMOND), new ItemStack(Material.COOKED_CHICKEN),
				new ItemStack(Material.REDSTONE), SlimefunItems.GOLD_16K, new ItemStack(Material.REDSTONE)
		}).register();

		new HotbarPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDBiYzYxYjk3NTdhN2I4M2UwM2NkMjUwN2EyMTU3OTEzYzJjZjAxNmU3YzA5NmE0ZDZjZjFmZTFiOGRiIn19fQ=="), "&dГрибная корова", getName(), "&7Любимая еда: красный гриб", "", "&rИногда дарит свекольный суп…"), "HOTBAR_PET_MOOSHROOM", new ItemStack(Material.RED_MUSHROOM), new ItemStack[]{
				new ItemStack(Material.LAPIS_LAZULI), new ItemStack(Material.COOKED_BEEF), new ItemStack(Material.LAPIS_LAZULI),
				new ItemStack(Material.RED_MUSHROOM), new ItemStack(Material.DIAMOND), new ItemStack(Material.BROWN_MUSHROOM),
				new ItemStack(Material.LAPIS_LAZULI), SlimefunItems.GOLD_16K, new ItemStack(Material.LAPIS_LAZULI)
		}).register();

		new CowPet(cow, "HOTBAR_PET_COW", new ItemStack(Material.WHEAT), new ItemStack[]{
				new ItemStack(Material.COAL), new ItemStack(Material.WHEAT), new ItemStack(Material.COAL),
				new ItemStack(Material.COOKED_BEEF), new ItemStack(Material.DIAMOND), new ItemStack(Material.COOKED_BEEF),
				new ItemStack(Material.COAL), SlimefunItems.GOLD_16K, new ItemStack(Material.COAL)
		}).register();

		new HotbarPet(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQxMDMzNThkOGYxYmRhZWYxMjE0YmZhNzdjNGRhNjQxNDMzMTg2YmQ0YmM0NGQ4NTdjMTY4MTE0NzZmZSJ9fX0="), "&6Золотая корова", getName(), "&7Любимая еда: золотая морковь", "", "&rИногда дарит золотые слитки…", "&r(Вы в плюсе на целый 1 самородок)"), "HOTBAR_PET_GOLDEN_COW", new ItemStack(Material.GOLDEN_CARROT), new ItemStack[]{
				new ItemStack(Material.GOLDEN_CARROT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLDEN_CARROT),
				new ItemStack(Material.GOLD_NUGGET), cow, new ItemStack(Material.GOLD_NUGGET),
				new ItemStack(Material.GOLDEN_CARROT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLDEN_CARROT)
		}).register();
	}



}
