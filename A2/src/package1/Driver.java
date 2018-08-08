// ----------------------------------------------------- 
// Assignment #2
// Part: 1
// Written by: (Alexandre Kang 40027204) 
// -----------------------------------------------------

// This driver serves to create an array of PublicTransportation,
// test methods created in package, find the most expensive PublicTransportation and the least expensive 
// PublicTransportation and display the location of these PublicTransportation in the array.

package package1;
import package2.CityBus;
import package2.Metro;
import package2.Tram;
import package3.Ferry;
import package4.AirCraft;
import package4.AirCraft.classType;
import package4.AirCraft.maintenanceType;

public class Driver {

	public static void main(String[] args) {
		
		//Create an array of 10 PublicTransportation objects and fill that array with various objects
		//from the 6 classes 
		PublicTransportation [] p = new PublicTransportation [10];
		p[0]= new PublicTransportation(100.00, 10);
		p[1]= new CityBus (200.00,9,514,2000,"Concordia","Bob");
		p[2]= new Tram(300.00,8,450,2001,"Cadillac","Bill",100);
		p[3]= new Metro(150.00,7,438,2002,"Canada","Borg",150,"Montreal");
		p[4]= new Ferry(120.00,6,2003,"Fer");
		p[5]= new AirCraft(50.00,5,classType.Helicopter,maintenanceType.Monthly);
		p[6]= new CityBus((CityBus) p[1]);
		p[7]= new Tram((Tram) p[2]);
		p[8]= new Metro((Metro) p[3]);
		p[9]= new Ferry((Ferry) p[4]);
		
		double minTicketPrice=p[0].getTicketPrice();
		int j=0;
		int k=0;
		
		System.out.println("Searching in the array to find the object "
				+ "that is least expensive (has lowest price) and the one that is most expensive."
				+ " Display all information of these two objects along with their location (index) in the array...\n");
		//j=i in order to keep the location in the array. Since we assume that p[0] is the least
		//expensive PublicTransportation, we begin the loop with 1. Trace(search) that array to find the
		//object that is least expensive (has lowest price) and the one that is most expensive.
		//Display all information of these two objects along with their location (index) in the array.		
		for(int i = 1; i<p.length;i++)
		{
			if(p[i].getTicketPrice() < minTicketPrice)
			{	
				j=i;
				minTicketPrice= p[i].getTicketPrice();
				
			}
			if (i==p.length-1) System.out.println("The least expensive object is "+ p[j].toString() + " The location in the array p is " + j + ".");
			
		}
		//k=i in order to keep the location in the array. Since we assume that p[0] is the most
		//expensive PublicTransportation, we begin the loop with 1. Trace(search) that array to find the
		//object that is least expensive (has lowest price) and the one that is most expensive.
		//Display all information of these two objects along with their location (index) in the array.
		double maxTicketPrice=p[0].getTicketPrice();
		for(int i =1; i<p.length;i++)
		{
			if(p[i].getTicketPrice() > maxTicketPrice)
			{
				k=i;
				maxTicketPrice= p[i].getTicketPrice();
			}	
			if (i==p.length-1) System.out.println("The most expensive object is " + p[k].toString() + " The location in the array p is " + k + ".");
		}
		
		System.out.println();
		System.out.println("Printing information of the 6 different PublicTransportation...\n");

		// Display all information of different PublicTransportation using the toString() method.
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);
		System.out.println(p[5]);

		System.out.println();
		System.out.println("Testing the equals method ...\n");
		
		//Test the equality of some to the created objects using the equals() method.
		
		System.out.println("Is p[1] equals p[6]?");
		if(p[1].equals(p[6])) System.out.println("The two objects are equal.\n");
		else System.out.println("The two objects are not equal.\n");
		
		System.out.println("Is p[2] equals p[3]?");
		if(p[2].equals(p[3])) System.out.println("The two objects are equal.\n");
		else System.out.println("The two objects are not equal.\n");
		
		System.out.println("Is p[4] equals p[7]?");
		if(p[4].equals(p[7])) System.out.println("The two objects are equal.\n");
		else System.out.println("The two objects are not equal.\n");
		
		System.out.println("Is p[5] equals p[2]?");
		if(p[5].equals(p[2])) System.out.println("The two objects are equal.\n");
		else System.out.println("The two objects are not equal.\n");
		
		System.out.println("Is p[9] equals p[4]?");
		if(p[9].equals(p[4])) System.out.println("The two objects are equal.\n");
		else System.out.println("The two objects are not equal.\n");
	
		// Program terminated
		System.out.println("The program has been terminated.");
		// TODO Auto-generated method stub

	}

}
