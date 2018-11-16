/*David Nagy
 * 5/29/18
 * player.java
 * Description:In this class players,fatigue,maximum fatique and steps are created
*/

package players;

public abstract class Player {
	private String playerName;
	private int currentFatigue;
	private int maxFatigue;
	private int steps;

	/*
	 * Player objects will need to manage: name: the players name fatigue: the
	 * players current and maximum fatigue (a player loses when current == maximum)
	 * steps: the maximum number of steps a player can take (based on sub class)
	 */
	public Player(String playerName, int currentFatigue, int maxFatigue, int steps) {
		super();
		this.playerName = playerName;
		this.currentFatigue = currentFatigue;
		this.maxFatigue = maxFatigue;
		this.steps = steps;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getCurrentFatigue() {
		return currentFatigue;
	}

	public int getMaxFatigue() {
		return maxFatigue;
	}

	public int getSteps() {
		return steps;
	}

	public void setCurrentFatigue(int currentFatigue) {
		this.currentFatigue = currentFatigue;
	}

	public abstract void stepsInMud();

	public abstract void stepsOnGrass();

	public abstract void stepsOnRoad();

	public abstract void stepsOnTrap();
}
