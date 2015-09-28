public class Move
{
	//coordinate values for whatever moves
	private short x;
	private short y;
	
	//default constructor, sets everything to 0
	public Move()
	{
		x = 0;
		y = 0;
	}
	//constructor that accepts variables from save file to set position
	public Move(short horizontal, short vertical)
	{
		x = horizontal;
		y = vertical;
	}
	//moves one space to the left
	public short moveLeft()
	{
			x--;
		return x;
	}
	//moves one space to the right
	public short moveRight()
	{
			x++;
		return x;
	}
	//moves one space up
	public short moveUp()
	{
		if(!(y < 0))
			y--;
		return y;
	}
	public short moveDown()
	{
			y++;
		return y;
	}
}