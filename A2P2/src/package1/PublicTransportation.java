// ----------------------------------------------------- 
// Assignment #2
// Part: 2
// Written by: (Alexandre Kang 40027204) 
// -----------------------------------------------------

package package1;

public class PublicTransportation {
	private double ticketPrice;
	private int numberOfStops;
	
	public PublicTransportation()
	{
		ticketPrice=0.0;
		numberOfStops=0;
	}
	
	public PublicTransportation(double t, int n)
	{
		ticketPrice=t;
		numberOfStops=n;
	}
	
	public PublicTransportation(PublicTransportation p)
	{
		ticketPrice=p.ticketPrice;
		numberOfStops=p.numberOfStops;
	}
	
	public double getTicketPrice()
	{
		return ticketPrice;
	}
	
	public int getNumberOfStops()
	{
		return numberOfStops;
	}
	
	public void setTicketPrice(double t)
	{
		 ticketPrice=t;
	}
	
	public void setNumberOfStops(int n)
	{
		 numberOfStops=n;
	}
	
	public String toString()
	{String s = this.getClass().toString();
	s = s.substring(15);
		return "This " + s + " has " + numberOfStops
				+ " stops, and costs " + ticketPrice+ " $.";
	}
	
	public boolean equals(Object x)
	{
		if (x == null || (this.getClass()!=(x.getClass())))
			return false;
		else
		{
			// cast the passed object to a PublicTransportation object
			PublicTransportation p = (PublicTransportation)x;
			return (this.ticketPrice == p.ticketPrice &&
					this.numberOfStops == p.numberOfStops);
		}

	}

}
