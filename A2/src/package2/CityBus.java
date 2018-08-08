// ----------------------------------------------------- 
// Assignment #2
// Part: 1
// Written by: (Alexandre Kang 40027204) 
// -----------------------------------------------------

package package2;

import package1.PublicTransportation;

public class CityBus extends PublicTransportation{
	protected long routeNumber;
	protected int beginOperationYear;
	protected String lineName;
	protected String driversName;
	
	public CityBus()
	{
		ticketPrice=0.0;
		numberOfStops=0;
		routeNumber=0;
		beginOperationYear=0;
		lineName=null;
		driversName=null;
	}
	
	public CityBus(double t, int n, long r, int b, String l, String d)

	{
		ticketPrice=t;
		numberOfStops=n;
		routeNumber=r;
		beginOperationYear=b;
		lineName=l;
		driversName=d;
	}
	
	public CityBus(CityBus c)
	{
		ticketPrice=c.ticketPrice;
		numberOfStops=c.numberOfStops;
		routeNumber=c.routeNumber;
		beginOperationYear=c.beginOperationYear;
		lineName=c.lineName;
		driversName=c.driversName;
	}
	
	public long getRouteNumber()
	{
		return routeNumber;
	}
	
	public int getBeginOperationYear()
	{
		return beginOperationYear;
	}
	
	public String getLineName()
	{
		return lineName;
	}
	
	public String getDriversName()
	{
		return driversName;
	}
	
	public void setRouteNumber(long r)
	{
		routeNumber=r;
	}
	
	public void setBeginOperationYear(int b)
	{
		beginOperationYear=b;
	}
	
	public void setLineName(String l)
	{
		lineName=l;
	}
	
	public void setDriversName(String d)
	{
		driversName=d;
	}
	
	public String toString()
	{String s = this.getClass().toString();
	s = s.substring(15);
		return super.toString() + " The route number is "
				+ routeNumber +". The begin operaion year is "
				+ beginOperationYear + ".  The line name is "
				+ lineName + ". The driver(s) name is (are) "
				+ driversName +".";
	}
	
	public boolean equals(Object x)
	{
		if (x == null || (this.getClass()!=(x.getClass())))
			return false;
		else
		{
			// cast the passed object to a CityBus object
			CityBus c = (CityBus)x;
			return (this.getTicketPrice() == c.getTicketPrice() &&
					this.getNumberOfStops() == c.getNumberOfStops() &&
					this.routeNumber==c.routeNumber &&
					this.beginOperationYear==c.beginOperationYear &&
					this.lineName==c.lineName &&
					this.driversName==c.driversName);
		}

	}
	
}
