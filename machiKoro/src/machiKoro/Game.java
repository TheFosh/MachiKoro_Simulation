package machiKoro;

public class Game {
	
	public Player[] players;
	public Dice[] dice;
	
	public Game(int n) {
		this.players = new Player[n];
		
		this.dice = new Dice[2];
		
		this.dice[0] = new Dice();
		this.dice[1] = new Dice();
		
		addPlayers(n);
	}
	
	private void addPlayers(int num) {
		for(int i = 0; i < num; i++) {
			this.players[i] = new Player();
		}
	}
	
}
