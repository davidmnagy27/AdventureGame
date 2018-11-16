/*David Nagy
 * 5/29/18
 * knight.java
 * Description: knight player created, fatique is created in this class
*/

package players;

public class Knight extends Player {

	private static final int STEPS = 2;
	private static final int MAX_FATIGUE = 25;
	private static final int CURRENT_FATIGUE = 0;

	// Constructor, takes info from the parent class and gives to knight class.
	public Knight(String playerName) {
		super(playerName, CURRENT_FATIGUE, MAX_FATIGUE, STEPS);

	}

	@Override
	public void stepsInMud() {
		// This stores the info when the player steps on the mud.

		System.out.println("Mud, yuck, mud everywhere!");

	}

	@Override
	public void stepsOnGrass() {
		// This stores the info when the player steps on the Grass.

		System.out.println("This grass is slowing me down.");
	}

	@Override
	public void stepsOnRoad() {
		// This stores the info when the player steps on the Road.

		System.out.println("This road is more to my liking.");
	}

	@Override
	public void stepsOnTrap() {
		// This stores the info when the player steps on the Trap.

		System.out.println("Lucky my armor is on, ouch!");
	}

}
