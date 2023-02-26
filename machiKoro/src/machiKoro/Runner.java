package machiKoro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws FileNotFoundException {
		Game theGame = new Game(2);
	
		Scanner scan = new Scanner(new File("C:\\Users\\SwansonJacob\\git\\MachiKoro_Simulation\\machiKoro\\src\\cards\\CardInfo.txt"));
		
		
		
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
