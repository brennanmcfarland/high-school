public class SoftwareSales
{
	private byte numSold;
	private double pPrice;
	private double balanceDue;
	final byte PRICE = 99;
	
	public SoftwareSales()
	{
		numSold = 0;
		pPrice = 0.0;
		balanceDue = 0.0;
	}
	public SoftwareSales(byte quantity, double price, double balance)
	{
		numSold = quantity;
		pPrice = price;
		balanceDue = balance;
	}
	public void setUnitsSold(byte quantity)
	{
		numSold = quantity;
	}
	public byte getUnitsSold()
	{
		return numSold;
	}
	public double balanceDue()
	{
		calcPurchasePrice();
		balanceDue = numSold * pPrice;
		
		return balanceDue;
	}
	public double calcPurchasePrice()
	{
		if(numSold >= 100)
			pPrice = PRICE * .5;
		else if(numSold >= 50)
			pPrice = PRICE * .6;
		else if(numSold >= 20)
			pPrice = PRICE * .7;
		else if(numSold >= 10)
			pPrice = PRICE * .8;
		else
			pPrice = PRICE;

		return pPrice;
	}
}