public class Payroll
{
	private String name;
	private int idNumber,
				hours;
	private double hourlyRate;
	
	public Payroll()
	{
		name = null;
		idNumber = 0;
		hours = 0;
		hourlyRate = 0;
	}
	public void setName(String nam)
	{
		name = nam;
	}
	public void setIdNumber(int id)
	{
		idNumber = id;
	}
	public void setHours(int hrs)
	{
		hours = hrs;
	}
	public void setHourlyRate(double rate)
	{
		hourlyRate = rate;
	}
	public String getName()
	{
		return name;
	}
	public int getIdNumber()
	{
		return idNumber;
	}
	public int getHours()
	{
		return hours;
	}
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	public double getGross()
	{
		return hours * hourlyRate;
	}
}