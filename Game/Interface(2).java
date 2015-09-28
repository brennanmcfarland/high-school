import java.util.Scanner; //may be able to delete this later but keep it for testing purposes for now at least
/*KEY FOR PRINTED VALUES:
0: land
1: water
2: tree
3: wall
4: lava

50: player's body
51: player's head
52: player's left arm/right leg
53: player's right arm/left leg
*/
public class Interface
{
	//variables for dimensions of screen that the finals are passed into in the constructor
	private static short screenWidth;
	private static short screenHeight;
	//static constructor that accepts arguments for height and width of screen (the constants)
	public static void initialize(short screenHeight, short screenWidth)
	{
		short[][]displayCoordinates = new short[screenWidth][screenHeight];
		displayCoordinates[2][3] = 1;//test line
		System.out.println(displayCoordinates[2][3]);//test line
	}
	//sets all the values of the map for terrain, player, etc to be printed
	//array (which will be coordinates) passed by reference to setMap, also passes x and y coordinates for player
	public static void setMap(short[][] array, short playerX, short playerY)
	{
		//sets terrain
		setTerrain(array);
		//sets the player --can be extended to other characters?
		setPlayer(playerX, playerY);
	}
	//sets the terrain values
	public static void setTerrain(short[][] array)
	{
		//should copy all the terrain values into the displayCoordinates array to protect the original array's data
		//for every row of characters on the screen...
		for(short row = 0; row < screenWidth; row++)
		{
			//for every character within each row...
			for(short col = 0; col < screenHeight; col++)
			{
				//copy coordinate values into the array
				displayCoordinates[row][col] = array[row][col];
			}
		}
	}
	//sets the player's coordinate values
	public static void setPlayer(short x, short y)
	{
		//sets the coordinate values of all parts of the player
		//body
		displayCoordinates[x][y] = 50;
		//head
		displayCoordinates[x][y+1] = 51;
		//left arm
		displayCoordinates[x-1][y+1] = 52;
		//right leg
		displayCoordinates[x+1][y-1] = 52;
		//right arm
		displayCoordinates[x+1][y+1] = 53;
		//left leg
		displayCoordinates[x-1][y-1] = 53;
	}
	//prints the map screen
	public static void printMap()
	{
		//for every row of characters on the screen...
		for(short row = 0; row < Position.width; row++)
		{
			//for every character within each row...
			for(short col = 0; col < Position.height; col++)
			{
				//read the value for that coordinate of terrain and print what it represents
				switch(Position.coordinates[row][col])
				{
					//if land(0), print a space
					case 0: System.out.println(" ");
							break;
					//if water(1), print a period
					case 1:	System.out.println(".");
							break;
					//if a tree(2), print a T
					case 2: System.out.println("T");
							break;
					//if a wall(3), print an I
					case 3:	System.out.println("I");
							break;
					//if lava(4), print a V
					case 4: System.out.println("V");
							break;
					//cases 50-53 print the player
					case 50: System.out.println("|");
							break;
					case 51: System.out.println("O");
							break;
					case 52: System.out.println("\\");
							break;
					case 53: System.out.println("/");
							break;
					default: System.out.println("Error.  Program forced to close.");
							 System.exit(0);
				}
			}
		}
	}
}





/* the player should look roughly like this:
 
\O/
 |
/ \
*/