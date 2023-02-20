package machiKoro;

public class Runner {

	public static void main(String[] args) {
		Game theGame = new Game(2);
	
	}
	
	
	//Goes through all dice to check if they are working properly
	public void checkDice(Game theGame, int num){
		for (int i = 0; i < num; i++) {
			theGame.dice[0].rollDice();
			theGame.dice[1].rollDice();
			
			System.out.println("Rolled Dice");
			System.out.println(theGame.dice[0].rolledNum);
			System.out.println(theGame.dice[1].rolledNum);
		}
	}

}
