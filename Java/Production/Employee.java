public class Employee
{
	protected String name;
	protected String id;
	protected String date;
	
	//no args constructor
	public Employee()
	{
		name = "";
		id = "000-A";
		date = "1/1/1900";
	}
	//copy constructor
	public Employee(String name, String id, String date)
	{
		this.name = name;
		this.id = id;
		this.date = date;
	}
	//copy method
	public Employee(Employee object2)
	{
		name = object2.name;
		id = object2.id;
		date = object2.date;
	}
	//set and get methods for variables
	public void setName(String str)
	{
		name = str;
	}
	public String getName()
	{
		return name;
	}
	public void setId(String str)
	{
		id = str;
	}
	public String getId()
	{
		return id;
	}
	public void setDate(String str)
	{
		date = str;
	}
	//returns a neatly packaged string with fields
	public String toString()
	{
		String str = new String();
		str = "\nEmployee Name: " + name
				+ "\nEmployee ID: " + id
				+ "\nDate: " + date;
		return str;
	}
	//equals method
	public boolean equals(Employee object2)
	{
		boolean status;
		if(name.equals(object2.name) && id.equals(object2.id) && date.equals(object2.date))
			status = true;
		else
			status = false;
		return status;
	}
}