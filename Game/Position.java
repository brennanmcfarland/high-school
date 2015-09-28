public class Position
{
	//constant variables for the x and y dimensions in characters of the screen
	public final short width = 50;
	public final short height = 30;
	//variables for the x and y positions of the character
	public short x;
	public short y;
	public Move player;
	
	//the coordinates system
	public short[][] coordinates;
	
	//this constructor should run automatically and creates a blank xy coordinate plane
	public Position()
	{
		//creates multidimensional array for the xy coordinate plane
		coordinates = new short[width][height];
	
		//places a character in the xy plane, initializes it to 10, 10
		//sets x and y positions of the character
		x = 25;
		y = 15;	
		//should create move object for player to move
		player = new Move(x, y);
	
	}
	public Position(short x, short y)
	{
		//creates multidimensional array for the xy coordinate plane
		coordinates = new short[width][height];
		player = new Move(x, y);
		//places a character in the xy plane, initializes it to 10, 10
		//sets x and y positions of the character
		this.x = 10;
		this.y = 10;
	}
	//initializes player to different coordinates based on input
	public void setPlayer(short x, short y)
	{
		this.x = x;
		this.y = y;
	}
	public void setTerrain()
	{
	
	}
	public void testTerrain()
	{
		for(short row = 0; row < width; row++)
		{
			//for every character within each row...
			for(short col = 0; col < height; col++)
			{
				//copy coordinate values into the array
				coordinates[row][col] = 1;
			}
		}
	}
	//moves player left
	public void moveLeft()
	{
		if(x-1 > 0)
			x = player.moveLeft();
	}
	//moves one space to the right
	public void moveRight()
	{
		if(x+2 < width)
			x = player.moveRight();
	}
	//moves one space up
	public void moveDown()
	{
		if(y+2 < height)
			y = player.moveDown();
	}
	//moves one space down
	public void moveUp()
	{
		if(y-1 > 0)
		y = player.moveUp();
	}
}