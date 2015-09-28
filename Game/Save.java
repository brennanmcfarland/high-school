import java.util.Scanner;
import java.io.*;

public class Save
{
	public void save() throws IOException
	{
		//initialization
		Scanner keyboard = new Scanner(System.in);
		String line = null;
		
		//this block of code shows previous saves and requests current save
		System.out.println("Saves:");
		//opens the file listing previous saves
		File saveList = new File("saves.txt");
		//if there are previous saves, display them
		if(saveList.exists())
		{
			//read from the file
			Scanner readSaves = new Scanner(saveList);
			//read from each line and display it
			while(readSaves.hasNext())
			{
				line = readSaves.nextLine();
				System.out.println(line);
			}
			//close the saveList file
			readSaves.close();
		}
		//and after displaying previous files, ask for file name
		System.out.print("Save to: ");
		String filename = keyboard.nextLine();
		
		//opens saves.txt and appends the saved file
		FileWriter saveWrite = new FileWriter("saves.txt", true);
		PrintWriter toSave = new PrintWriter(saveWrite);
		toSave.println(filename);
		toSave.close();
		
		//opens a file of filename
		File file = new File(filename);
		PrintWriter outputFile = new PrintWriter(filename);
		
		//saves variables to the file
		outputFile.println("File name" + filename);
		outputFile.println("Test variables:");
		outputFile.println("3");
		
		//closes the file and confirms save
		outputFile.close();
		System.out.println("Save successful.  Press enter to continue.");
		keyboard.nextLine();
	}
}
//should be good except doesn't check to see if it's replacing the file
//may want to add that in at some later point
//not essential, but good to do