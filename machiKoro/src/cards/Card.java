package cards;

public class Card {

	private int cost;
	private String name;
	private String description;
	private int[] activationRolls;
	
	public Card(int c, String n, String d, int[] nums) {
		this.cost = c;
		this.name = n;
		this.description = d;
		this.activationRolls = nums;
	}
	
	
}
