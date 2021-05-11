package me.Blume.Duel.Items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class items {
	public static ItemStack bow;
	public static ItemStack arrow;
	public static ItemStack beef;
	public static ItemStack blocks;
	public static ItemStack[] leatherarmor= new ItemStack[4];
	public static ItemStack pickaxe;
	public static ItemStack water;
	public ItemStack metaBow() {
		bow = new ItemStack(Material.BOW,1);
		ItemMeta bowmeta = bow.getItemMeta();
		bowmeta.setDisplayName("Bow Duel");
		bowmeta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		bowmeta.addEnchant(Enchantment.DURABILITY, 10, true);
		bow.setItemMeta(bowmeta);
		return bow;
	}
	public ItemStack metaArrow() {
		arrow = new ItemStack(Material.ARROW,1);
		return arrow;
	}
	public ItemStack metaBeefs() {
		beef = new ItemStack(Material.COOKED_BEEF,64);
		return beef;
	}
	public ItemStack metaBlock() {
		blocks = new ItemStack(Material.COBBLESTONE,64);
		return blocks;
	}
	public ItemStack[] metaSet(){
		leatherarmor[0] = new ItemStack(Material.LEATHER_BOOTS);
		leatherarmor[1] = new ItemStack(Material.LEATHER_LEGGINGS);
		leatherarmor[2] = new ItemStack(Material.LEATHER_CHESTPLATE);
		leatherarmor[3] = new ItemStack(Material.LEATHER_HELMET);
		return leatherarmor;
	}
	public ItemStack metaPickaxe() {
		pickaxe = new ItemStack(Material.STONE_PICKAXE);
		return pickaxe;
	}
	public ItemStack metaWater() {
		water = new ItemStack(Material.WATER_BUCKET);
		return water;
	}
}
