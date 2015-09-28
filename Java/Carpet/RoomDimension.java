public class RoomDimension
{
	private double roomLength,
					roomWidth;
	//constructor accepting args for the length+width of the room
	public RoomDimension(RoomDimension object2)
	{
		roomLength = object2.roomLength;
		roomWidth = object2.roomWidth;
	}
	//no args constructor
	public RoomDimension()
	{
		roomLength = 0;
		roomWidth = 0;
	}
	//sets roomLength
	public void setLength(double len)
	{
		roomLength = len;
	}
	//sets roomWidth
	public void setWidth(double wid)
	{
		roomWidth = wid;
	}
	//returns the area of the room
	public double getArea()
	{
		return roomLength*roomWidth;
	}
	//equals method
	public boolean equals(RoomDimension object2)
	{
		boolean status;
		//tests if all fields are =
		if((this.roomLength == object2.roomLength) && (this.roomWidth == object2.roomWidth))
		{
			status = true;
		}
		else
			status = false;
		return status;
	}
	//toString method, returns a string with values of fields
	public String toString()
	{
		String str = "Room Length: " + roomLength
					+ "\nRoom Width: " + roomWidth;
		return str;
	}
}