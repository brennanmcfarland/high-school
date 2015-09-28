import java.util.Scanner;
import java.io.*;

public class ReadFile
{
	public static void main(String[] args) throws IOException
	{
		//initialization
		Scanner keyboard = new Scanner(System.in);
		String line = null;

		//asks user for file name
		System.out.println("Enter file name: ");
		String filename = keyboard.nextLine();
		
		//opens a file of filename, if it does not exist, displays an error and exits
		File file = new File(filename);
		if(!file.exists())
		{
			System.out.println("Error: the file does not exist");
			System.exit(0);
		}
		Scanner inputFile = new Scanner(file);
		
		//displays "file says..."
		System.out.println("The file says:");
		//reads every line and displays it until the file is fully read
		while(inputFile.hasNext())
		{
			line = inputFile.nextLine();
			System.out.println(line);
		}
		
		//closes file + says it's read
		inputFile.close();
		System.out.println("File reading complete.  File closed.");
	}
}
/*
OUTPUT
Enter file name: 
toBeRead.txt
The file says:
This is text.
This is a message.

The dog is fat.
File reading complete.  File closed.
OUTPUT
Enter file name: 
readFile
Error: the file does not exist

*/