import java.util.Scanner;

public class EncryptorDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Encryptor code = new Encryptor();
		String msg;
		int key;
		
		System.out.println("Enter a key: ");
		key = keyboard.nextInt();
		msg = keyboard.nextLine();
		System.out.println("Enter a message: ");
		msg = keyboard.nextLine();
		
		System.out.println("Key: " + key);
		System.out.println("Original message: " + msg);
		System.out.println("Encoded message: " + code.encode(msg, key));
		System.out.println("Decoded message: " + code.decode(msg, key));
	}
}
/*
Enter a key: 
89
Enter a message: 
This is a test message.
Key: 89
Original message: This is a test message.
10*y0*y8y-<*-y4<**8><w
Decoded message: This is a test message.
*/