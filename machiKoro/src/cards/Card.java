package cards;

public abstract class Card {

	private int cost;
	private String name;
	private char color;
	private String description;
	private int[] activationRolls;
	
	public Card(int cos, String n, char col, String d, int[] nums) {
		this.cost = cos;
		this.name = n;
		this.color = col;
		this.description = d;
		this.activationRolls = nums;
	}
	
	public void whenRolled() {
		
	}
	
}
