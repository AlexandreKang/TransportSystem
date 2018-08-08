// ----------------------------------------------------- 
// Assignment #2
// Part: 2
// Written by: (Alexandre Kang 40027204) 
// -----------------------------------------------------

package package4;

import package1.PublicTransportation;

public class AirCraft extends PublicTransportation{
	public enum classType {Helicopter, Airline, Glider, Balloon};
	public enum maintenanceType {Weekly, Monthly, Yearly};
	
	private classType type;
	private maintenanceType maintenance;
	
	public AirCraft()
	{
		super();
		type=classType.Airline;
		maintenance=maintenanceType.Monthly;
	}
	
	public AirCraft(double t, int n, classType c, maintenanceType m)
	{
		super(t,n);
		type = c;
		maintenance = m;
	}
	
	public AirCraft(AirCraft a)
	{
		setTicketPrice(a.getTicketPrice());
		setNumberOfStops(a.getNumberOfStops());
		type=a.type;
		maintenance=a.maintenance;
	}
	
	public classType getClassType()
	{
		return type;
	}
	
	public void setClassType(classType c)
	{
		type = c;
	}
	
	public maintenanceType getMaintenanceType()
	{
		return maintenance;
	}
	
	public void setMaintenanceType(maintenanceType m)
	{
		maintenance = m;
	}

	public String toString()
	{String s = this.getClass().toString();
	s = s.substring(15);
		return super.toString() + "The class type is "
				+ type + ". The maintenance type is " + maintenance + ".";
	}
	
	public boolean equals(Object x)
	{
		if (x == null || (this.getClass()!=(x.getClass())))
			return false;
		else
		{
			// cast the passed object to a PublicTransportation object
			AirCraft a = (AirCraft)x;
			return (this.getTicketPrice() == a.getTicketPrice() &&
					this.getNumberOfStops() == a.getNumberOfStops() &&
					this.type==a.type &&
					this.maintenance==a.maintenance);
		}

	}

}
