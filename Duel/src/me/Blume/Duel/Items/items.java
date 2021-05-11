package me.Blume.Duel.Items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class items {
	public  ItemStack bow;
	public  ItemStack arrow;
	public  ItemStack beef;
	public  ItemStack blocks;
	public  ItemStack[] leatherarmor= new ItemStack[4];
	public  ItemStack pickaxe;
	public  ItemStack water;
	public ItemStack metaBow() {
		bow = new ItemStack(Material.BOW,1);
		ItemMeta bowmeta = bow.getItemMeta();
		bowmeta.setDisplayName("Bow Duel");
		bowmeta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		bowmeta.addEnchant(Enchantment.DURABILITY, 10, true);
		bow.setItemMeta(bowmeta);
		return bow;
	}
	public ItemStack getArrow() {
		arrow = new ItemStack(Material.ARROW,1);
		return arrow;
	}
	public ItemStack getBeefs() {
		beef = new ItemStack(Material.COOKED_BEEF,64);
		return beef;
	}
	public ItemStack getBlock() {
		blocks = new ItemStack(Material.COBBLESTONE,64);
		return blocks;
	}
	public ItemStack[] getLeatherSet(){
		leatherarmor[0] = new ItemStack(Material.LEATHER_BOOTS);
		leatherarmor[1] = new ItemStack(Material.LEATHER_LEGGINGS);
		leatherarmor[2] = new ItemStack(Material.LEATHER_CHESTPLATE);
		leatherarmor[3] = new ItemStack(Material.LEATHER_HELMET);
		return leatherarmor;
	}
	public ItemStack getPickaxe() {
		pickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
		return pickaxe;
	}
	public ItemStack getWater() {
		water = new ItemStack(Material.WATER_BUCKET);
		return water;
	}
}
