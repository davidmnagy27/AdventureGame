/*David Nagy
 * 5/29/18
 * mudtile.java
 * Description:Fatigue to the player is added in this class and mud tile is created.
*/

package tiles;

import game.Game;
import players.Player;

public class MudTile extends BasicTile {

	public MudTile() {
		super(TileType.MUD);
		
	}

	@Override
	public void visitTile(Game game) {
		Player p = game.getPlayer();
		int fatigue = p.getCurrentFatigue();
		fatigue+=2;
		p.setCurrentFatigue(fatigue);
		System.out.println("PLAYER FATIGUE: " + fatigue + "/" + p.getMaxFatigue()); 
		p.stepsInMud();

	}

}
