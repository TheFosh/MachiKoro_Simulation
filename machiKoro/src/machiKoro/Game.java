package machiKoro;

public class Game {
	
	public int numPlayers;
	public Dice[] dice;
	
	public Game(int n) {
		this.numPlayers = n;
		
		this.dice = new Dice[2];
		
		this.dice[0] = new Dice();
		this.dice[1] = new Dice();
	}
	
}
