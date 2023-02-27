package cards;

public class Card {

	private int cost;
	private String name;
	private color cardColor;
	private String description;
	private int[] activationRolls;
	private Symbol cardSymbol;
	
	public Card(int cos, String n, color col, String d, int[] nums, Symbol s) {
		this.cost = cos;
		this.name = n;
		this.cardColor = col;
		this.description = d;
		this.activationRolls = nums;
		this.cardSymbol = s;
	}
	
}
