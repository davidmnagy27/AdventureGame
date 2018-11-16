/*David Nagy
 * 5/29/18
 * GrassTile.java
 * Description:Fatigue to the player is added in this class and Grass tile is created.
*/

package tiles;

import game.Game;
import players.Player;

public class GrassTile extends BasicTile {

	public GrassTile() {
		super(TileType.GRASS);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visitTile(Game game) {
		// TODO Auto-generated method stub
		Player p = game.getPlayer();
		int fatigue = p.getCurrentFatigue();
		fatigue++;
		p.setCurrentFatigue(fatigue);
		System.out.println("PLAYER FATIGUE: " + fatigue + "/" + p.getMaxFatigue());
		p.stepsOnGrass();
	}

}
