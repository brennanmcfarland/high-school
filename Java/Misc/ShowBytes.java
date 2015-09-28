import java.util.Scanner;

public class ShowBytes
{
	public static void main(String[] args)
	{
		byte num;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = keyboard.nextByte();
		System.out.println("The number in binary is: ");
		for(int t=128; t>0; t = t/2)
		{
			if((num & t) != 0)
				System.out.print("1");
			else
				System.out.print("0");
		}
	}
}
/*
Enter a number: 
68
The number in binary is: 
01000100
*/