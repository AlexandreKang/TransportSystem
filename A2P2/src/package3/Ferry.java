// ----------------------------------------------------- 
// Assignment #2
// Part: 2
// Written by: (Alexandre Kang 40027204) 
// -----------------------------------------------------

package package3;

import package1.PublicTransportation;

public class Ferry extends PublicTransportation{
	private int buildYear;
	private String shipName;
	
	public Ferry()
	{
		super();
		buildYear=0;
		shipName=null;
	}
	
	public Ferry(double t, int n, int y, String s)
	{
		super(t,n);
		buildYear=y;
		shipName=s;
	}
	
	public Ferry(Ferry f)
	{
		setTicketPrice(f.getTicketPrice());
		setNumberOfStops(f.getNumberOfStops());
		buildYear=f.buildYear;
		shipName=f.shipName;
	}
	
	public int getBuildYear()
	{
		return buildYear;
	}
	
	public String getShipName()
	{
		return shipName;
	}
	
	public void setBuildYear(int y)
	{
		 buildYear=y;
	}
	
	public void setShipName(String s)
	{
		 shipName=s;
	}

	public String toString()
	{String s = this.getClass().toString();
	s = s.substring(15);
		return super.toString() + "The build year is "
				+ buildYear + ". The ship's name is " + shipName +".";
	}
	
	public boolean equals(Object x)
	{
		if (x == null || (this.getClass()!=(x.getClass())))
			return false;
		else
		{
			// cast the passed object to a Ferry object
			Ferry f = (Ferry)x;
			return (this.getTicketPrice() == f.getTicketPrice() &&
					this.getNumberOfStops() == f.getNumberOfStops() &&
					this.buildYear== f.buildYear &&
					this.shipName==f.shipName);
		}
}
}
