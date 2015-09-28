import java.util.Scanner;

public class EmployeeDemo
{
	public static void main(String [] args)
	{
		String str;
		int shift;
		double payRate;
		
		ProductionWorker worker = new ProductionWorker();
		Scanner keyboard = new Scanner(System.in);

		//sets employee name
		System.out.println("Enter employee name: ");
		str = keyboard.nextLine();
		worker.setName(str);
		
		//validates and then sets employee id
		do
		{
			System.out.println("Enter employee number in the format XXX-L, "
								+ "where each X is a digit and L is a letter from A-M");
			str = keyboard.nextLine();
		}while((str.charAt(0) < '0' || str.charAt(0) > '9') ||
			(str.charAt(1) < '0' || str.charAt(1) > '9') ||
			(str.charAt(2) < '0' || str.charAt(2) > '9') ||
			!(str.charAt(3) == '-') ||
			(str.charAt(4) < 'A' || str.charAt(4) > 'M'));
		worker.setId(str);
		
		//sets employee date of hire
		System.out.println("Enter hire date: ");
		str = keyboard.nextLine();
		worker.setDate(str);
		
		//sets shift, 1 for day, 2 for night, and validates
		do
		{
			System.out.println("Enter shift.  1 for day, 2 for night: ");
			shift = keyboard.nextInt();
		}while(shift != 1 && shift != 2);
		worker.setShift(shift);
		
		//sets pay rate
		do
		{
			System.out.println("Enter pay rate: ");
			payRate = keyboard.nextDouble();
		}while(payRate < 0);
		worker.setPayRate(payRate);
		
		//calls toString method to display all values
		System.out.println(worker);
	}
}
/*
Enter employee number in the format XXX-L, where each X is a digit and L is a letter from A-M
465-T
Enter employee number in the format XXX-L, where each X is a digit and L is a letter from A-M
1L8-K
Enter employee number in the format XXX-L, where each X is a digit and L is a letter from A-M
345-Z
Enter employee number in the format XXX-L, where each X is a digit and L is a letter from A-M
123-K
Enter hire date: 
12/6/12
Enter shift.  1 for day, 2 for night: 
2
Enter pay rate: 
1.50

Employee Name: Steve Nicollerat
Employee ID: 123-K
Date: 12/6/12
Shift: 2
Pay Rate: 1.5
*/