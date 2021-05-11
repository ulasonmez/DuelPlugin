package me.Blume.Duel;


import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import me.Blume.Duel.Commands.bowduel;
import me.Blume.Duel.Commands.bowduelstop;
import me.Blume.Duel.Listeners.death;


public class Main extends JavaPlugin{
	public static int bowduelon;
	public static Player player1;
	public static Player player2;
	public static ItemStack[] inventory1;
	public static ItemStack[] saveinventory1;
	public static ItemStack[] saveinventory2;
	public static ItemStack[] inventory2;
	public static HashMap<UUID,ItemStack[]> inventories = new HashMap<>();
	public static HashMap<UUID,Double> healths = new HashMap<>();
	public static HashMap<UUID,Integer> foods = new HashMap<>();
	@Override
	public void onEnable() {
		getCommand("bowduel").setExecutor(new bowduel(this));
		getCommand("bowduelstop").setExecutor(new bowduelstop(this));
		getServer().getPluginManager().registerEvents(new death(), this);
	}
	@Override
	public void onDisable() {
		
	}

}
