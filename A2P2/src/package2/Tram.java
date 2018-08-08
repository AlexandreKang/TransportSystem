// ----------------------------------------------------- 
// Assignment #2
// Part: 2
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
		setRouteNumber(t.getRouteNumber());
		setBeginOperationYear(t.getBeginOperationYear());
		setLineName(t.getLineName());
		setDriversName(t.getDriversName());
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
				+ "is " + getRouteNumber() +". The begin operaion year is "
				+ getBeginOperationYear() + ".  The line name is "
				+ getLineName() + ". The driver(s) name is (are) "
				+ getDriversName() +". The max speed is " + maxSpeed + ".";
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
					this.getRouteNumber()==t.getRouteNumber() &&
					this.getBeginOperationYear()==t.getBeginOperationYear() &&
					this.getLineName()==t.getLineName() &&
					this.getDriversName()==t.getDriversName() &&
					this.maxSpeed==t.maxSpeed);
		}

	}
}
