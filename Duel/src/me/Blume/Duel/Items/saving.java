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
		for(int i =0;i<Main.inventory1.length;i++) {
			if(Main.inventory1[i]!=null) {
				Main.saveinventory1 = Main.inventory1.clone();
			}
		}
		Main.inventories.put(Main.player1.getUniqueId(),Main.saveinventory1);
		}
		
		
		Main.inventory2 = Main.player2.getInventory().getContents();
		if(Main.inventory2!=null) {
		for(int i =0;i<Main.inventory2.length;i++) {
			if(Main.inventory2[i]!=null) {
				Main.saveinventory2 = Main.inventory2.clone();
				}
			}
		Main.inventories.put(Main.player2.getUniqueId(),Main.saveinventory2);
		}
		
	}
	public void setitems() {
		Main.saveinventory1 = Main.inventories.get(Main.player1.getUniqueId());
		if(Main.saveinventory1!=null) {
			Main.player1.getInventory().setContents(Main.saveinventory1);
		}
	
		Main.saveinventory2 = Main.inventories.get(Main.player2.getUniqueId());
		if(Main.saveinventory2!=null) {
			Main.player2.getInventory().setContents(Main.saveinventory2);
		}
	}
	public void savehealthandfood() {
		health1 = Main.player1.getHealth();
		health2 = Main.player2.getHealth();
		Main.healths.put(Main.player1.getUniqueId(), health1);
		Main.healths.put(Main.player2.getUniqueId(), health2);
		food1 = Main.player1.getFoodLevel();
		food2 = Main.player2.getFoodLevel();
		Main.foods.put(Main.player1.getUniqueId(), food1);
		Main.foods.put(Main.player2.getUniqueId(), food2);
	}
	public void sethealthandfood() {
		health1 = Main.healths.get(Main.player1.getUniqueId());
		health2 = Main.healths.get(Main.player2.getUniqueId());
		food1 = Main.foods.get(Main.player1.getUniqueId());	
		food2 = Main.foods.get(Main.player2.getUniqueId());		
		Main.player1.setHealth(health1);
		Main.player2.setHealth(health2);
		Main.player1.setFoodLevel(food1);
		Main.player2.setFoodLevel(food2);
		
	}
	
}
