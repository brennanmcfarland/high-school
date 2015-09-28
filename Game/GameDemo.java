//movement works great except when goes out of bounds fix that
import java.util.Scanner;
import java.io.*;

public class GameDemo
{
	public static void main(String [] args) throws IOException
	{
		final short width = 50;
		final short height = 30;
		boolean quit = false;
		String strInput;
		char userInput;
		short[][] testMap = new short[width][height];
		Scanner keyboard = new Scanner(System.in);
		
		short testA = 5;
		short testB = 7;
		
		for(short row = 0; row < width; row++)
		{
			for(short col = 0; col < height; col++)
			{
				testMap[row][col] = 1;
			}
		}
		//creates drawScreen object that creates the interface
		Interface drawScreen = new Interface();
		
		while(!quit)
		{
			drawScreen.testTerrain();
			drawScreen.setMap();
			drawScreen.printMap();
			drawScreen.printMessage();//prints messages
			drawScreen.printInGameMenu();//this part under construction, prints in game menu
			
			strInput = keyboard.nextLine();
			if(strInput.equals(""))
				userInput = ' ';
			else
				userInput = strInput.charAt(0);
				
			switch (userInput)
			{
				//a moves left
				case 'a':
				case 'A':	drawScreen.moveLeft();
							break;
				//d moves right
				case 'd':
				case 'D':	drawScreen.moveRight();
							break;
				//w moves up
				case 's':
				case 'S':	drawScreen.moveDown();
							break;
				//s moves down
				case 'w':
				case 'W':	drawScreen.moveUp();
							break;
				case 'p': quit = true;
							break;	
				//if not valid input, do nothing but alert the user and refresh the screen
				default: drawScreen.setMessage("Error: Invalid Input");
			}
		}
	}
}