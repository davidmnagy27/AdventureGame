//David Nagy
//5/25/18
//Game.java
//Description: Game Controls the Game

package Game;

import java.util.Random;
import player.Player;
import player.Squire;
import tiles.BasicTile;
import tiles.GrassTile;
import tiles.MudTile;
import tiles.RoadTile;
import tiles.TrapTile;

public class Game {
	// fields

	private static final int BACKMOVE = -1;
	private Random random = new Random();
	private int position = BACKMOVE;
	private Player player;
	private int Distance;
	private int journeyTurns;
	private boolean stepBack;
	private boolean loopBreak;

	// stores tile objects
	private BasicTile[] tiles;

	// Stores number of tiles and the players.

	// constructor
	public Game(int countTiles, Player player) {
		this.player = player;
		tiles = new BasicTile[countTiles];
	}

	/**
	 * Starts the game prints tiles and players reactions player visits on tile and
	 * current
	 */
	public void startGame() {
		// this creates our array of tile objects
		buildTiles();

		// Boolean if player is moving back steps
		stepBack = false;

		// To break loop
		loopBreak = false;

		// For player's journey turns
		journeyTurns = 0;

		/*
		 * The main game loop should be declared here. Each turn the player /*should
		 * move a random distance forward from 1 to maxSteps.
		 */

		while (true) {
			// count player journey turns
			journeyTurns++;

			Distance = random.nextInt(player.getSteps()) + 1;
			if (stepBack == false) {
				movePlayer(Distance);
			} else if (stepBack == true) {
				stepBack = false;
			}

			if (loopBreak == true) {
				break; // break loop
			}
		}
	}

	private String printTiles() {
		String tilesResult = "[";

		for (int i = 0; i < tiles.length; i++) {
			if (i != 0) {
				tilesResult += ", ";
			}
			if (position == i) {
				tilesResult += tiles[i].toString() + " - (player)";
			} else {
				tilesResult += tiles[i].toString();
			}
		}
		tilesResult += "]";

		if (position >= tiles.length) {
			tilesResult += " (player)";
		}

		return tilesResult;
	}

	// * Method to move players according to the game.

	// move one step back when on trap tiles
	public void movePlayer(int distance) {
		/*
		 * This method moves the player the given distance. A positive value will move
		 * the player to the later indices in the tiles array, while a negative value
		 * will move the player back to lower indices.
		 */

		position += distance;

		if (distance == BACKMOVE) {
			stepBack = true;
		}

		if (!stepBack) {
			for (int i = 0; i < tiles.length; i++) {
				if (position == i) {
					// number of steps took by player and type of tile
					System.out.println("Player moves " + distance + " steps(s) to " + tiles[i].getType() + " tile.");
					System.out.println();

					// print tiles
					System.out.println(printTiles());
					System.out.println();

					// calling visitTile() method
					tiles[i].visitTile(this);
					System.out.println();
					System.out.println();
				}
				// breaks loop if player fatigue greater than or equals to max
				// fatigue
				if (player.getCurrentFatigue() >= player.getMaxFatigue()) {
					// show message to user with number of steps took by player
					System.out.println(
							"Unfortunately, " + player.getPlayerName() + ", you have become too tired to continue!");
					System.out.println("You journey took " + journeyTurns + " turns!");
					loopBreak = true; // break loop
					break; // breaks inner loop

				}
				// move player out of array if player position is greater than
				// tiles length
				else if (position >= tiles.length) {
					// print tiles again
					System.out.println(printTiles());
					System.out.println();
					// show message to user with number of steps took by player
					System.out.println("Congratulations " + player.getPlayerName() + " you have complete the journey!");
					System.out.println("You journey took " + journeyTurns + " turns!");
					loopBreak = true; // break outer loop
					break; // break inner loop
				}
			}
		}

		else {
			System.out.println(printTiles());
		}
		if (distance == -1 && position > 0) {
			position += distance;
			Distance = distance;
			stepBack = true;
		}
	}

	private void buildTiles() {
		/*
		 * This method instantiate tile objects to fill the array. 40% of grass,30% of
		 * road,20% of mud and 10% of the trap tiles.
		 * 
		 */
		BasicTile grassTile = new GrassTile();
		BasicTile mudTile = new MudTile();
		BasicTile roadTile = new RoadTile();
		BasicTile trapTile = new TrapTile();

		/*
		 * different random tiles in loop to display
		 */
		for (int i = 0; i < tiles.length; i++) {
			// generate random number between one to ten according to tiles percentages
			int randomTiles = random.nextInt(10) + 1;
			int tenNum = 10;
			int fourNum = 4;
			int sevenNum = 7;
			int nineNum = 9;

			if (randomTiles <= fourNum) {
				tiles[i] = grassTile;
			}

			else if (randomTiles > fourNum && randomTiles <= sevenNum) {
				tiles[i] = roadTile;
			}

			else if (randomTiles > sevenNum && randomTiles <= nineNum) {
				tiles[i] = mudTile;
			}

			else if (randomTiles == tenNum) {
				tiles[i] = trapTile;
			}
		}
	}

	// This is a getter to access the player class.

	public Player getPlayer() {
		return player;
	}

}
