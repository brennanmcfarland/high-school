import java.util.Scanner;
import java.io.*;

public class AppendFile
{
	public static void main(String[] args) throws IOException
	{
		//initialization
		String line = null;
		Scanner keyboard = new Scanner(System.in);
		
		//asks user for file name
		System.out.println("Enter file name: ");
		String filename = keyboard.nextLine();
		
		//creates fwriter and outputFile to enable appending file
		//and opens the file of name filename
		FileWriter fwriter = new FileWriter(filename, true);
		PrintWriter outputFile = new PrintWriter(fwriter);
		
		//asks user what to append to file
		System.out.println("What would you like to add to the file?");
		line = keyboard.nextLine();
		
		//appends to file and closes it
		outputFile.println(line);
		outputFile.close();
		
		//alerts the user that the file is closed
		System.out.println("The file is closed.  Data written successfully.");
	}
}
/*
Enter file name: 
Write to this file
What would you like to add to the file?
This is the text I have written to this file.  It is text that I have written to the program, and the program is going to take this text and put it into the file called Write to this file.  If the file does not exist, it will create it.
The file is closed.  Data written successfully.