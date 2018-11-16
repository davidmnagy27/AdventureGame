/*David Nagy
 * 5/29/18
 * Roadtile.java
 * Description:Fatigue to the player is added in this class and road tile is created.
*/



package tiles;

import game.Game;
import players.Player;
import players.Squire;

public class RoadTile extends BasicTile {

	public RoadTile() {
		super(TileType.ROAD);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visitTile(Game game) {
		Player p = game.getPlayer();
		int fatigue = p.getCurrentFatigue();
		if(p instanceof Squire ) {
		fatigue++;
		}
		p.setCurrentFatigue(fatigue);
		System.out.println("PLAYER FATIGUE: " + fatigue + "/" + p.getMaxFatigue()); // might have to change
		p.stepsOnRoad();

	}

}
