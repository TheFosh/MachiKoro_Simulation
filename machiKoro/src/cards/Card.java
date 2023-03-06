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
}
