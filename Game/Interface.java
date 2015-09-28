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

for the map, (0,0) is on the top left, x increases farther across, y increases farther down
*/

//this class should control everything printed to the screen
public class Interface extends Position
{
	private short displayCoordinates[][];
	private String firstMessage = "";
	private String secondMessage = "";
	private String thirdMessage = "";
	//variables for dimensions of screen that the finals are passed into in the constructor
	//static constructor that inherits width and height and makes dimensions of displayCoordinates
	public Interface()
	{
		//creates multidimensional array to display to the screen later
		displayCoordinates = new short[width][height];
	}
	//sets all the values of the map for terrain, player, etc to be printed
	//inherits all values it needs from Position
	public void setMap()
	{
		//sets terrain
		setTerrainDisplay();
		//sets the player --can be extended to other characters?
		setPlayerDisplay();
	}
	//sets the terrain values
	public void setTerrainDisplay()
	{
		//should copy all the terrain values into the displayCoordinates array to protect the original array's data
		//for every row of characters on the screen...
		for(short row = 0; row < height; row++)
		{
			//for every character within each row...
			for(short col = 0; col < width; col++)
			{
				//copy coordinate values into the array
				displayCoordinates[col][row] = coordinates[col][row];
				//System.out.println("test");
				//prints this 73 times and then throws an exception
			}
		}
	}
	//sets the player's coordinate values, inherits x and y
	public void setPlayerDisplay()
	{
		//sets the coordinate values of all parts of the player
		//body
		displayCoordinates[x][y] = 50;
		//head
		displayCoordinates[x][y-1] = 51;
		//left arm
		displayCoordinates[x-1][y+1] = 53;
		//right leg
		displayCoordinates[x+1][y-1] = 53;
		//right arm
		displayCoordinates[x+1][y+1] = 52;
		//left leg
		displayCoordinates[x-1][y-1] = 52;
	}
	//prints the map screen, must accept the Position array to function
	public void printMap()
	{
		//for every row of characters on the screen...
		for(short row = 0; row < height; row++)
		{
			//for every character within each row...
			for(short col = 0; col < width; col++)
			{
				//read the value for that coordinate of terrain and print what it represents
				switch(displayCoordinates[col][row])
				{
					//if land(0), print a space
					case 0: System.out.print(" ");
							break;
					//if water(1), print a period
					case 1:	System.out.print(".");
							break;
					//if a tree(2), print a T
					case 2: System.out.print("T");
							break;
					//if a wall(3), print an I
					case 3:	System.out.print("I");
							break;
					//if lava(4), print a V
					case 4: System.out.print("V");
							break;
					//cases 50-53 print the player
					case 50: System.out.print("|");
							break;
					case 51: System.out.print("O");
							break;
					case 52: System.out.print("\\");
							break;
					case 53: System.out.print("/");
							break;
					default: System.out.println("Error.  Program forced to close.");
							 System.exit(0);
				}
			}
			System.out.print("\n");
		}
	}
	//prints an in game menu below the screen with keyboard shortcuts
	public void printInGameMenu()
	{
		//dividing bar
		for(int i = 0; i < width; i++)
			System.out.print("_");
		System.out.print("\n");
		
		//list of shortcuts
		System.out.print("Save: ! ");
		System.out.print("Save As: ! ");
		System.out.println("Quit: ~");
		//dividing bar
		for(int i = 0; i < width; i++)
			System.out.print("_");
		System.out.print("\n");
		System.out.println("Enter user input: ");
	}
	public void setMessage(String newMessage)
	{
		thirdMessage = secondMessage;
		secondMessage = firstMessage;
		firstMessage = newMessage;
	}
	public void printMessage()
	{	
		//dividing bar
		System.out.println("________________________________________");
		//title
		System.out.println("Messages:");
		//dividing bar
		System.out.println("________________________________________");
		//messages
		System.out.println("  " + firstMessage);
		System.out.println("  " + secondMessage);
		System.out.println("  " + thirdMessage);
	}
}





/* the player should look roughly like this:
 
\O/
 |
/ \
*/