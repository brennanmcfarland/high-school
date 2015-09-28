import java.text.DecimalFormat;
import java.util.Scanner;

public class SoftwareSalesDemo
{
	public static void main(String[] args)
	{
		byte numSold;
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat decimals = new DecimalFormat("#0.00");
		
		System.out.print("How many software units would you like to purchase: ");
		numSold = keyboard.nextByte();
		SoftwareSales customer = new SoftwareSales();
		customer.setUnitsSold(numSold);
		
		System.out.println("\nUnits ordered: " + customer.getUnitsSold());
		System.out.println("Cost per unit: $" + decimals.format(customer.calcPurchasePrice()));
		System.out.println("Balance due: $" + decimals.format(customer.balanceDue()));
	}
}