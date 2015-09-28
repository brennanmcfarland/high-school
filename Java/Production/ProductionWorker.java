// class inherits from Employee
public class ProductionWorker extends Employee
{
	//day shift is 1, night shift is 2
	private int shift;
	private double payRate;
	
	//no args constructor
	public ProductionWorker()
	{
		shift = 0;
		payRate = 0.0;
	}
	//constructor accepting values to use for shift + payRate
	public ProductionWorker(int sft, double rate)
	{
		shift = sft;
		payRate = rate;
	}
	//copy constructor
	public ProductionWorker(ProductionWorker object2)
	{
		shift = object2.shift;
		payRate = object2.payRate;
	}
	//set and get methods
	public void setShift(int sft)
	{
		shift = sft;
	}
	public int getShift()
	{
		return shift;
	}
	public void setPayRate(double rate)
	{
		payRate = rate;
	}
	public double getPayRate()
	{
		return payRate;
	}
	//returns a neatly packaged string with fields of the object
	public String toString()
	{
		String str = new String();
		str = 	super.toString()
				+ "\nShift: " + shift
				+ "\nPay Rate: " + payRate;
		return str;
	}
	//equals method
	public boolean equals(ProductionWorker object2)
	{
		boolean status;
		if(shift == object2.shift && payRate == object2.payRate)
			status = true;
		else
			status = false;
		return status;
	}
}