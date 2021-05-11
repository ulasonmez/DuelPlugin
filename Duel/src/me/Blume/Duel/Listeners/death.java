package me.Blume.Duel.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import me.Blume.Duel.Main;
import me.Blume.Duel.Items.items;
import net.md_5.bungee.api.ChatColor;

public class death implements Listener{
	public static int p1=0,p2=0;
	items item1 = new items();

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onDeath(PlayerDeathEvent event) {
		
		if(Main.bowduelon==1) {
		    int p1id= Main.player1.getEntityId();
			int p2id= Main.player2.getEntityId();
			Player player = event.getEntity().getPlayer();
			Player killer = event.getEntity().getKiller();
			if(player instanceof Player && killer instanceof Player) {
				if(killer.getEntityId()==p1id) {
					p1++;
					Main.player1.setHealth(20);
					Main.player1.setFoodLevel(25);
				}
				else if(killer.getEntityId()==p2id) {
					p2++;
					Main.player2.setHealth(20);
					Main.player2.setFoodLevel(25);
				}
				Main.player1.getInventory().clear();
				Main.player2.getInventory().clear();
				
					ScoreboardManager m = Bukkit.getScoreboardManager();
				Scoreboard board = m.getNewScoreboard();
				
				Objective o = board.registerNewObjective("Kill","");
				o.setDisplayName(ChatColor.LIGHT_PURPLE+"Bow Duel");
				o.setDisplaySlot(DisplaySlot.SIDEBAR);
				Score pkill1 = o.getScore(ChatColor.AQUA+""+Main.player1.getName()+": "+p1);
				pkill1.setScore(1);
				Score pkill2 = o.getScore(ChatColor.AQUA+""+Main.player2.getName()+": "+p2);
				pkill2.setScore(2);
				Main.player1.setScoreboard(board);
				Main.player2.setScoreboard(board);
				Main.player1.getInventory().addItem(item1.metaBow(),item1.metaPickaxe(),item1.metaBlock(),
						item1.metaWater(),item1.metaBeefs(),item1.metaArrow());
				Main.player1.getInventory().setArmorContents(item1.metaSet());
				Main.player2.getInventory().addItem(item1.metaBow(),item1.metaPickaxe(),item1.metaBlock(),
						item1.metaWater(),item1.metaBeefs(),item1.metaArrow());
				Main.player2.getInventory().setArmorContents(item1.metaSet());
			}
		}
		else if(Main.bowduelon==0) {
			Main.player1.getInventory().clear();
			Main.player2.getInventory().clear();
		}
		
	}
}
