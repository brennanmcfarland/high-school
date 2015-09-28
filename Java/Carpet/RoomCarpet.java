public class RoomCarpet
{
	private double price;
	private RoomDimension dim;
	//constructor accepting args
	public RoomCarpet(RoomDimension d, double cost)
	{
		//creates new RoomDimension object from a copy of d
		dim = new RoomDimension(d);
		price = cost;
	}
	//no args constructor
	public RoomCarpet()
	{
		dim = new RoomDimension();
		price = 0.0;
	}
	//returns the total cost of carpeting the room
	public double getTotalCost()
	{
		return price*dim.getArea();
	}
	//sets the price per square foot
	public void setPrice(double p)
	{
		price = p;
	}
	//returns the price per square foot
	public double getPrice()
	{
		return price;
	}
}