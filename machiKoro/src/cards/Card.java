package cards;

import java.util.ArrayList;

public class Card {

	private int cost;
	private String name;
	private Color cardColor;
	private String description;
	private ArrayList<Integer> activationRolls;
	private Symbol cardSymbol;
	
	public Card(int cos, String n, Color col, String d, ArrayList<Integer> nums, Symbol s) {
		this.cost = cos;
		this.name = n;
		this.cardColor = col;
		this.description = d;
		this.activationRolls = nums;
		this.cardSymbol = s;
	}
	
	@Override
	public String toString() {
		String message = "Name: " + this.name + "\n";
		message += "Cost: " + this.cost + "\n";
		message += "Color: " + this.cardColor + "\n";
		message += "Desc: " + this.description + "\n";
		for(int i = 0; i < this.activationRolls.size(); i++) {
			message += "Roll number " + i + ": " + this.activationRolls.get(i) + "\n";
		}
		message += "Symbol: " + this.cardSymbol + "\n";
		
		return message;
	}
}
