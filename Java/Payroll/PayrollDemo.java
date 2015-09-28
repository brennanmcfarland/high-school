import java.util.Scanner;

public class PayrollDemo
{
	public static void main(String[] args)
	{
		String name;
		int id,
			hrs;
		double rate;
		Payroll employee = new Payroll();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Name: ");
		name = keyboard.nextLine();
		employee.setName(name);
		System.out.println("ID #: ");
		id = keyboard.nextInt();
		employee.setIdNumber(id);
		System.out.println("Hours worked: ");
		hrs = keyboard.nextInt();
		employee.setHours(hrs);
		System.out.println("Hourly rate: ");
		rate = keyboard.nextDouble();
		employee.setHourlyRate(rate);	
		
		System.out.println("\nName: " + employee.getName());
		System.out.println("ID #: " + employee.getIdNumber());
		System.out.println("Hours worked: " + employee.getHours());
		System.out.println("Hourly rate: " + employee.getHourlyRate());
		System.out.println("Gross pay: " + employee.getGross());
	}
}
/*
Name: 
John Lan Tran
ID #: 
50283
Hours worked: 
9
Hourly rate: 
30.45    

Name: John Lan Tran
ID #: 50283
Hours worked: 9
Hourly rate: 30.45
Gross pay: 274.05
*/