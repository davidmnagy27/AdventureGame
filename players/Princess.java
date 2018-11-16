/*David Nagy
 * 5/29/18
 * princess.java
 * Description: princess player fatique, maximum fatique and steps are created in this class
*/

package players;

public class Princess extends Player {

	private static final int STEPS = 3;
	private static final int MAX_FATIGUE = 12;
	private static final int CURRENT_FATIGUE = 0;

	// Constructor, takes info from the parent class and gives to princess class.
	public Princess(String playerName) {
		super(playerName, CURRENT_FATIGUE, MAX_FATIGUE, STEPS);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void stepsInMud() {
		// This stores the info when the player steps on the mud.
		System.out.println("This mud is going to stain my dress!");
	}

	@Override
	public void stepsOnGrass() {
		// This stores the info when the player steps on the Grass.
		System.out.println("This grass feels great between my toes.");
	}

	@Override
	public void stepsOnRoad() {
		// This stores the info when the player steps on the Road.
		System.out.println("This road is dusty.");
	}

	@Override
	public void stepsOnTrap() {
		// This stores the info when the player steps on the Trap.
		System.out.println("This trap won't affect me!");
	}

}
