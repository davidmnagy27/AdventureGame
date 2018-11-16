/*David Nagy
 * 5/29/18
 * Basictile.java
 * Description:tile types are stored in this class also return tile type
*/



package tiles;

import game.Game;

public abstract class BasicTile
{
	private TileType type;
	
	public BasicTile(TileType type)
	{
		this.type = type;
	}
	
	public TileType getType()
	{
		return type;
	}
	
	public String toString()
	{
		return type.toString().substring(0, 1);
	}
	
	public abstract void visitTile(Game game);
}
