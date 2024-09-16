package busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Busresservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bus> buses=new ArrayList<Bus>();
		buses.add(new Bus(1,true,1));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,38));
		
		ArrayList<Booking> bookings =new ArrayList<Booking>();
		
		
		for(Bus b:buses) {
			b.displaybus();
		}
		
		
		Scanner r=new Scanner(System.in);
		int user=1;
		while(user==1) {
			
			
			if(user==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Booking is confirmed");
				}
				else {
					System.out.println("BUS HAS BEEN FILLED...PLEASE CHOOSE OTHER BUS");
				}
				
			}
			else {
				System.out.println("Thank You!");
			}
			System.out.println("Enter 1 to book again 2 to exit"); 
			user=r.nextInt();
		}
	}

}