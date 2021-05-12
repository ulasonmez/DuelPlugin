package me.Blume.Duel.Items;

import me.Blume.Duel.Main;

public class saving {
	public double health1;
	public double health2;
	public int food1;
	public int food2;
	public void saveitems() {
		Main.inventory1 = Main.player1.getInventory().getContents();
		if(Main.inventory2!=null) {
		Main.inventories.put(Main.player1.getUniqueId(),Main.player1.getInventory().getContents());
		}
		
		
		Main.inventory2 = Main.player2.getInventory().getContents();
		if(Main.inventory2!=null) {
		Main.inventories.put(Main.player2.getUniqueId(),Main.player2.getInventory().getContents());
		}
		
	}
	public void setitems() {
		if(Main.inventories.get(Main.player1.getUniqueId())!=null) {
			Main.player1.getInventory().setContents(Main.inventories.get(Main.player1.getUniqueId()));
		}
		if(Main.inventories.get(Main.player2.getUniqueId())!=null) {
			Main.player2.getInventory().setContents(Main.inventories.get(Main.player2.getUniqueId()));
		}
	}
public void removeitems() {
		Main.inventories.remove(Main.player1.getUniqueId());
		
		Main.inventories.remove(Main.player2.getUniqueId());
	}
	public void savehealthandfood() {
		Main.healths.put(Main.player1.getUniqueId(), Main.player1.getHealth());
		Main.healths.put(Main.player2.getUniqueId(), Main.player2.getHealth());
	
		Main.foods.put(Main.player1.getUniqueId(), Main.player1.getFoodLevel());
		Main.foods.put(Main.player2.getUniqueId(), Main.player2.getFoodLevel());
	}
	public void sethealthandfood() {	
		Main.player1.setHealth(Main.healths.get(Main.player1.getUniqueId()));
		Main.player2.setHealth(Main.healths.get(Main.player2.getUniqueId()));
		
		Main.player1.setFoodLevel(Main.foods.get(Main.player1.getUniqueId()));
		Main.player2.setFoodLevel(Main.foods.get(Main.player2.getUniqueId()));
		
	}
	public void removehealthandfood() {
		Main.healths.remove(Main.player1.getUniqueId());
		Main.healths.remove(Main.player2.getUniqueId());
		Main.foods.remove(Main.player1.getUniqueId());
		Main.foods.remove(Main.player1.getUniqueId());
		
	}
	
}
