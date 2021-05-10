package me.Blume.Duel.Items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class items {
	public static ItemStack bow;
	public static ItemStack arrow;
	public static ItemStack beef;
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
	
}
