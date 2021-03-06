// ----------------------------------------------------- 
// Assignment #2
// Part: 1
// Written by: (Alexandre Kang 40027204) 
// -----------------------------------------------------

package package2;

public class Metro extends CityBus{
	private int numberOfVehicles;
	private String city;
	
	public Metro()
	{
		super();
		numberOfVehicles=0;
		city=null;
	}
	
	public Metro(double t, int n, long r, int b, String l, String d, int v, String c)
	{
		super(t,n,r,b,l,d);
		numberOfVehicles=v;
		city=c;
	}
	
	public Metro(Metro m)
	{
		setTicketPrice(m.getTicketPrice());
		setNumberOfStops(m.getNumberOfStops());
		routeNumber=m.routeNumber;
		beginOperationYear=m.beginOperationYear;
		lineName=m.lineName;
		driversName=m.driversName;
		numberOfVehicles=m.numberOfVehicles;
		city=m.city;
	}
	
	public int getNumberOfVehicles()
	{
		return numberOfVehicles;
	}
	
	public void setNumberOfVehicles(int v)
	{
		numberOfVehicles=v;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String c)
	{
		city=c;
	}

	public String toString()
	{String s = this.getClass().toString();
	s = s.substring(15);
		return super.toString() + " The route number is "
				+ routeNumber + ". The begin operaion year is "
				+ beginOperationYear + ".  The line name is "
				+ lineName + ". The driver(s) name is (are) "
				+ driversName + ". The number of vehicles is "
				+ numberOfVehicles + ". The city is "
				+ city + ".";
	}
	
	public boolean equals(Object x)
	{
		if (x == null || (this.getClass()!=(x.getClass())))
			return false;
		else
		{
			// cast the passed object to a Metro object
			Metro m = (Metro)x;
			return (this.getTicketPrice() == m.getTicketPrice() &&
					this.getNumberOfStops() == m.getNumberOfStops() &&
					this.routeNumber==m.routeNumber &&
					this.beginOperationYear==m.beginOperationYear &&
					this.lineName==m.lineName &&
					this.driversName==m.driversName &&
					this.numberOfVehicles==m.numberOfVehicles &&
					this.city==m.city);
		}

	}
}
