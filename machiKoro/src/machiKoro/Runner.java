package machiKoro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import cards.Card;
import cards.Color;
import cards.Symbol;

public class Runner {

	public static void main(String[] args) throws FileNotFoundException {
		Game theGame = new Game(4);
	
		Scanner scan = new Scanner(new File("C:\\Users\\SwansonJacob\\git\\MachiKoro_Simulation\\machiKoro\\src\\cards\\CardInfo.txt"));
		
		ArrayList<Card> deck = makeDeck(scan);
		
	}
	//Makes all the cards in the game based off the info on the info file
	public static ArrayList<Card> makeDeck(Scanner scan){
		
		ArrayList<Card> deck = new ArrayList<>();
		
		while(scan.hasNextLine()) {

			int cost = scan.nextInt();
			scan.nextLine();
			String name = scan.nextLine();
			Color c = Color.valueOf(scan.nextLine());
			String description = scan.nextLine();
			ArrayList<Integer> nums = getRolls(scan.nextLine());
			Symbol s = Symbol.valueOf(scan.nextLine());
			scan.nextLine();

			
			Card card = new Card(cost, name, c, description, nums, s);
			deck.add(card);
			
		}
		
		return deck;
	}
	
	//Makes an array of numbers for the cards to determine what their rolls are
	private static ArrayList<Integer> getRolls(String range) {
		ArrayList<Integer> nums = new ArrayList<>();
		
		do {
			
			int num = Integer.parseInt(range.substring(0, 1));
			if(range.indexOf(',') != -1)
				range = range.substring(range.indexOf(',') +1);
			
		} while(range.indexOf(',') != -1);
		
		return nums;
	}
	
	//Goes through all dice to check if they are working properly
	public static void checkDice(Game theGame, int num){
		for (int i = 0; i < num; i++) {
			theGame.dice[0].rollDice();
			theGame.dice[1].rollDice();
			
			System.out.println("Rolled Dice");
			System.out.println(theGame.dice[0].rolledNum);
			System.out.println(theGame.dice[1].rolledNum);
		}
	}

}
