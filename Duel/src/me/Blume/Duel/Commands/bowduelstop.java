package me.Blume.Duel.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Blume.Duel.Main;
import me.Blume.Duel.Items.saving;
import me.Blume.Duel.Listeners.death;
import net.md_5.bungee.api.ChatColor;

public class bowduelstop implements CommandExecutor{
	private  Main plugin;
	public bowduelstop(Main main) {
		this.plugin = main;
	}
	death dead = new death();
	saving itemsaver1 = new saving();
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(Main.bowduelon==1) {
			if(label.equals("bowduelstop")) {
				if(!(sender instanceof Player)) return true;
				if(!(sender.isOp())) {
					sender.sendMessage(ChatColor.RED+"You dont have permission!");
					return true;
				}
				if(args.length!=0) {
					sender.sendMessage(ChatColor.RED+"Wrong usage!");
					return true;
				}
				sender.sendMessage(ChatColor.GREEN+"Bow Duel ended");
				if(death.p1>death.p2) {
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA+""+Main.player1.getName()+": "+death.p1);
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA+""+Main.player2.getName()+": "+death.p2);
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN+""+Main.player1.getName()+" WON");
				}
				else if(death.p1<death.p2) {
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA+""+Main.player1.getName()+": "+death.p1);
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA+""+Main.player2.getName()+": "+death.p2);
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN+""+Main.player2.getName()+" WON");
					
				}
				else {
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA+""+Main.player1.getName()+": "+death.p1);
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA+""+Main.player2.getName()+": "+death.p2);
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN+" DRAW");
					
				}
				death.p1=0;
				death.p2=0;
				Main.player1.getInventory().clear();
				Main.player2.getInventory().clear();

				
				itemsaver1.setitems();
				itemsaver1.sethealthandfood();
				itemsaver1.removehealthandfood();
				itemsaver1.removeitems();
				
				Main.player1.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
				Main.player2.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());   
				Main.bowduelon=0;
			}
	
		}
		else if(Main.bowduelon==0) {
			sender.sendMessage(ChatColor.GREEN+"Duel does not exist");
			return true;
		}
		return false;
	}
}
