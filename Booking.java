package busreservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Booking {
	String passengername;
	int busno;
	Date date;
	
	Booking(){
		Scanner r=new Scanner(System.in);
		System.out.println("Enter your name:"); 
		passengername=r.nextLine();
		System.out.println("enter your Busno");
		busno=r.nextInt();
		System.out.println("date-month-year:");
		String dateinput=r.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy");
		try {
			date=dateformat.parse(dateinput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus>buses){
		int capacity=0;
		for(Bus b:buses) {
			if(b.getbusno()==busno)
			capacity=b.getcapacity();	
			 
		}
		int booked=0;
		for(Booking c:bookings) {
			if(c.busno==busno && c.date.equals(date) ) {
				booked++;
			}
		}
		return booked<capacity?true:false;
		
		
	}
}
