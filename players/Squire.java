/*David Nagy
 * 5/29/18
 * squire.java
 * Description: squire player fatique, maximum fatique and steps are created in this class
*/

package players;

public class Squire extends Player {

	private static final int STEPS = 3;
	private static final int MAX_FATIGUE = 15;
	private static final int CURRENT_FATIGUE = 0;

	// Constructor, takes info from the parent class and gives to squire class.
	public Squire(String playerName) {
		super(playerName, CURRENT_FATIGUE, MAX_FATIGUE, STEPS);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void stepsInMud() {
		// This stores the info when the player steps on the mud.
		System.out.println("I grew up in the mud, this won't affect me!");

	}

	@Override
	public void stepsOnGrass() {
		// This stores the info when the player steps on the Grass.
		System.out.println("I love the open grassy fields.");
	}

	@Override
	public void stepsOnRoad() {
		// This stores the info when the player steps on the Road.
		System.out.println("I wonder how long this road will go on.");
	}

	@Override
	public void stepsOnTrap() {
		// This stores the info when the player steps on the Trap.
		System.out.println("Ugh a trap!");
	}

}
