import java.util.Scanner;

public class UpperCase
{
	public static void main(String[]args)
	{
		String msg = "";
		String uprmsg = "";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a message: ");
		msg = keyboard.nextLine();
		for(int i=0; i < msg.length(); i++)
		{	
			if((int)(msg.charAt(i)) != 32)
			{
				uprmsg = (uprmsg + (char)(msg.charAt(i) & 65503));
			}
			else
			{
				uprmsg = (uprmsg + (char)(msg.charAt(i)));
			}
		}
		System.out.println("The message in uppercase is: " + uprmsg);
			
	}
}
/*
Enter a message: 
This is a message
The message in uppercase is: THIS IS A MESSAGE
*/