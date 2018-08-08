// ----------------------------------------------------- 
// Assignment #2
// Part: 1
// Written by: (Alexandre Kang 40027204) 
// -----------------------------------------------------

package package2;

public class Tram extends CityBus{
	private int maxSpeed;
	
	public Tram()
	{
		super();
		maxSpeed=0;
	}
	
	public Tram(double t, int n, long r, int b, String l, String d, int s)
	{
		super(t,n,r,b,l,d);
		maxSpeed=s;
	}
	
	public Tram(Tram t)
	{
		setTicketPrice(t.getTicketPrice());
		setNumberOfStops(t.getNumberOfStops());
		routeNumber=t.routeNumber;
		beginOperationYear=t.beginOperationYear;
		lineName=t.lineName;
		driversName=t.driversName;
		maxSpeed=t.maxSpeed;
	}
	
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
	
	public void setMaxSpeed(int s)
	{
		maxSpeed=s;
	}

	public String toString()
	{String s = this.getClass().toString();
	s = s.substring(15);
		return super.toString() + " The route number"
				+ "is " + routeNumber +". The begin operaion year is "
				+ beginOperationYear + ".  The line name is "
				+ lineName + ". The driver(s) name is (are) "
				+ driversName +". The max speed is " + maxSpeed + ".";
	}
	
	public boolean equals(Object x)
	{
		if (x == null || (this.getClass()!=(x.getClass())))
			return false;
		else
		{
			// cast the passed object to a Tram object
			Tram t = (Tram)x;
			return (this.getTicketPrice() == t.getTicketPrice() &&
					this.getNumberOfStops() == t.getNumberOfStops() &&
					this.routeNumber==t.routeNumber &&
					this.beginOperationYear==t.beginOperationYear &&
					this.lineName==t.lineName &&
					this.driversName==t.driversName &&
					this.maxSpeed==t.maxSpeed);
		}

	}
}
