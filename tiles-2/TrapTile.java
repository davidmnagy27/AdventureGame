/*David Nagy
 * 5/29/18
 * Traptile.java
 * Description: fatigue to the player is added in this class and traptile is created.
*/


package tiles;

import game.Game;
import players.Knight;
import players.Player;
import players.Princess;


public class TrapTile extends BasicTile {

	public TrapTile() {
		super(TileType.TRAP);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visitTile(Game game) {
		
		Player p = game.getPlayer();
		int fatigue = p.getCurrentFatigue();
		if(!(p instanceof Princess || p instanceof Knight)) {
		fatigue+=2;
		}
		p.setCurrentFatigue(fatigue);
		game.movePlayer(-1);
		p.stepsOnTrap();
	}

}
