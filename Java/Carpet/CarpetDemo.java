import java.text.DecimalFormat;
import java.util.Scanner;

public class CarpetDemo
{
	 public static void main(String [] args)
	 {
	 	//declares variables
	 	double length,
	 			width,
	 			price;
	 	DecimalFormat money = new DecimalFormat("#0.00");
	 	Scanner keyboard = new Scanner(System.in);
	 	//creates dimension object of class RoomDimension
	 	RoomDimension dimension = new RoomDimension();
	 	
	 	//puts user input into length
	 	System.out.println("Enter room length: ");
	 	length = keyboard.nextDouble();
	 	//passes length to method setLength of object dimension
		dimension.setLength(length);
		//does the same for width
		System.out.println("Enter room width: ");
		width = keyboard.nextDouble();
		dimension.setWidth(width);
		//puts user input into price
		System.out.println("Enter carpet price per square foot: ");
		price = keyboard.nextDouble();	 	
		
		//creates object carpet passing object dimension, price
	 	RoomCarpet carpet = new RoomCarpet(dimension, price);
	 	
	 	//prints total cost to carpet room, using mehtod getTotalCost
	 	System.out.println("Total cost to carpet the room: $" + money.format(carpet.getTotalCost()));
	 }
}