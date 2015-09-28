public class Battle extends Interface
{
	private short playerHealth,
					enemyHealth;
	
	//no args constructor
	public Battle()
	{
		playerHealth = 100;
		EnemyHealth = 100;
	}
	//accepts opponent, and attributes through aggregation?
	public Battle()
	{
		playerHealth = 100;
		EnemyHealth = 5//change this to make it dynamic
	}
	public void printBattleScreen()
	{
		//prints pictures from the displayCoordinates array
		printBattleImg();
		//this method should print another section with battle stats such as health, etc
		printBattleStats();
		//prints message and menu bars
		printMessage();
		printInGameMenu();
	}
	//prints the display coordinates array for pictures
	public void printBattleImg()
	{
		for(short row = 0; row < height; row++)
		{
			//for every character within each row...
			for(short col = 0; col < width; col++)
			{
				//read the value for that coordinate of terrain and print what it represents
				switch(displayCoordinates[col][row])
				{
					//if space(0), print a space
					case 0: System.out.print(" ");
							break;
					//if shaded(1), print a period
					case 1:	System.out.print(".");
							break;
					default: System.out.println("Error.  Program forced to close.");
							 System.exit(0);
				}
			}
			System.out.print("\n");
		}
	}
	public void setBattleImg()
	{
	
	}
	public void testBattleImg()
	{
		for(short row = 0; row < height; row++)
		{
			//for every character within each row...
			for(short col = 0; col < width; col++)
			{
				//should print a rectangle
				if(col < 5 && col > 1 && row < 10 && row > 2)
					displayCoordinates[row][col] = 1;
				else
					displayCoordinates[row][col] = 0;
			}
		}
	}
	//takes variables and prints them in a stats bar
	public void printBattleStats()
	{
		//dividing bar
		System.out.println("________________________________________");
		
		
		//dividing bar
		System.out.println("________________________________________");
	}
}