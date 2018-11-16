//David Nagy
//5/25/18
//GameDriver.java
//Description: Game Driver Controls the Game

package Game;

import java.util.Scanner;

import player.knight;
import player.Player;
import player.princess;
import player.Squire;

public class GameDriver {
	// fields
	private static Scanner console = new Scanner(System.in);
	private static Player player = null;

	// This class makes you select what you need to at start of the game

	public static void main(String[] args) {
		// Main program messages
		System.out.println("********************************");
		System.out.println("Welcome to the Longest Adventure");
		System.out.println("********************************");
		System.out.println();
		System.out.println();

		System.out.println("Please choose a number of tiles: ");
		int num = console.nextInt();
		System.out.println();
		System.out.println();
		console.nextLine();

		System.out.println("Enter your player name: ");
		String playerName = console.nextLine();
		System.out.println();
		System.out.println();

		System.out.println("Please choose a player type (knight, princess, squire):");
		System.out.println("Knight - Tough travelers that can weather any adversity!");
		System.out.println("Princess - Smart and savvy,  a princess is never caught" + " off guard");
		System.out.println("Squire - Squires have a knack for getting there quicker!");
		String playerType = console.nextLine();

		if (playerType.toLowerCase().equals("squire")) {
			player = new Squire(playerName);
		} else if (playerType.toLowerCase().equals("knight")) {
			player = new knight(playerName);
		} else if (playerType.toLowerCase().equals("princess")) {
			player = new princess(playerName);
		}

		// send in the number of and a new player object here
		Game game = new Game(num, player);
		game.startGame();
		console.close();

	}
}
