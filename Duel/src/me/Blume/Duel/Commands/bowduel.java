package me.Blume.Duel.Commands;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Blume.Duel.Main;
import me.Blume.Duel.Items.items;
import me.Blume.Duel.Items.saving;
import me.Blume.Duel.Listeners.death;
import net.md_5.bungee.api.ChatColor;

public class bowduel implements CommandExecutor{
	private  Main plugin;
	public bowduel(Main main) {
		this.plugin = main;
	}
	items item1 = new items(); 
	death dead = new death();
	saving itemsaver1 = new saving();
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(Main.bowduelon==0) {
		if(label.equals("bowduel")) {
			if(!(sender instanceof Player)) return true;
			if(!(sender.isOp())) {
				sender.sendMessage(ChatColor.RED+"You dont have permission!");
				return true;
			}
			if(args.length==0) {
				sender.sendMessage(ChatColor.RED+"You need to choose a player to duel");
				return true;
			}
			if(args.length!=1) {
				sender.sendMessage(ChatColor.RED+"Wrong usage!");
				return true;
			}
			
			Main.player1 = (Player) sender;
			if(Bukkit.getServer().getPlayerExact(args[0])==Main.player1) {
				Main.player1.sendMessage(ChatColor.RED+"You cant challenge yourself");
				return true;
			}
			Main.player2 =Bukkit.getServer().getPlayerExact(args[0]);
			if(Main.player2==null) {
				Main.player1.sendMessage(ChatColor.RED+"Cannot find player with that name");
				return true;
			}
			
			sender.sendMessage(ChatColor.GREEN+"Bow Duel Started");
			itemsaver1.savehealthandfood();
			itemsaver1.saveitems();
			Main.player1.getInventory().clear();
			Main.player2.getInventory().clear();
			death.p1=0;
			death.p2=0;
			Main.player1.setHealth(20);
			Main.player1.setFoodLevel(25);
			Main.player2.setHealth(20);
			Main.player2.setFoodLevel(25);
			
			Main.player1.getInventory().addItem(item1.metaBow(),item1.getPickaxe(),item1.getBlock(),
					item1.getWater(),item1.getBeefs(),item1.getArrow());
			Main.player1.getInventory().setArmorContents(item1.getLeatherSet());
			Main.player2.getInventory().addItem(item1.metaBow(),item1.getPickaxe(),item1.getBlock(),
					item1.getWater(),item1.getBeefs(),item1.getArrow());
			Main.player2.getInventory().setArmorContents(item1.getLeatherSet());
			Main.bowduelon=1;
			return true;
			}
		}
		else if(Main.bowduelon==1) {
			sender.sendMessage(ChatColor.GREEN+"Duel is on");
			return true;
		}
		return false;
		
	}
}
