package me.Blume.Duel;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import me.Blume.Duel.Commands.bowduel;
import me.Blume.Duel.Commands.bowduelstop;
import me.Blume.Duel.Listeners.death;


public class Main extends JavaPlugin{
	public static int bowduelon;
	public static Player player1;
	public static Player player2;
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
