package machiKoro;

public class Dice {
	public int rolledNum;
	private int numSides = 6;
	
	//Generates a random integer based on the number of sides given on the dice
	public void rollDice() {
		this.rolledNum = (int)(Math.random() * this.numSides +1);
	}
}
