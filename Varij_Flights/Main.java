import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		//Here, we are creating an empty array list for all the 3 classes:
		ArrayList<Traveller> trvlers = new ArrayList<Traveller>();
		ArrayList<Flight> flts = new ArrayList<Flight>();
		ArrayList<Reservation> rsvs = new ArrayList<Reservation>();
		
		//1. The Arraylist elements for Travellers
		Traveller trv = new Traveller(0, "Bob Smith", "255 Main Stret", "123QT", "bob_thebuilder@gmail.com");
		trvlers.add(trv);
		trv = new Traveller(1, "Abigail Diaz", "100 Eastern Avenue", "909V3", "abigail_dancer@yahoo.com");
		trvlers.add(trv);
		trv = new Traveller(2, "Carmen Pope", "8 Westgate Road", "777J7", "carmen_white@mail.com");
		trvlers.add(trv);
		
		//2. The Arraylist elements for Flights 
		Flight f = new Flight(0, "AA281", "DFW", "ICN", new Date(), 6835.70);
		flts.add(f);
		f = new Flight(1, "AC306", "YVR", "YUL", new Date(), 2291.00);
		flts.add(f);
		f = new Flight(2, "WN3855", "PHX", "STL", new Date(), 1261.38);
		flts.add(f);
		
		//Here, we are printing the list of our Travellers
		System.out.println("\n\n *-*-*-*-* Travellers List *-*-*-*-*");
		for(Traveller T: trvlers) {
			System.out.println(T.toString());
		}
		
		//Now, Printing and updating the list of our Travellers
		System.out.println("\n\n*-*-*-*-* Updated Travellers List *-*-*-*-*");
		for(Traveller T: trvlers) {
			if(T.get_Name().toLowerCase().contains("abigail"))
			{
				if(T.isValid()) {
					System.out.println("Your Passport Number is Valid. You may go ahead. Thanks!!!");
				}
				else {
					System.out.println("Your Passport Number is not Valid so, please check or wait for assistance!!!");
					T.setPass_No("906Q3");
				}
				T.setEmail_Add("abigail_dancer@mymail.com");
			}
			System.out.println(T.toString());
		}
		
		//Here, we are updating and printing the flights list
		System.out.println("\n\n *-*-*-*-* Updated Flights List *-*-*-*-*");
		for(Flight F: flts) {
			if(F.Flight_no.toUpperCase().contains("WN3855")) {
				F.setDept_date(new Date(21, 1, 12));
			}
			System.out.println(F.toString());
		}
		
		//Now, we have to create a reservation for bob
		trv = trvlers.get(0);
		f = flts.get(0);
		Reservation r = new Reservation(f, 1, trv, new Date(), "A3", (byte) 0);
		rsvs.add(r);
		
		//Now, we have to create reservation for abigail
		trv = trvlers.get(1);
		f = flts.get(2);
		r = new Reservation(f, 2, trv, new Date(), "A3", (byte) 0);
		rsvs.add(r);
		
		//Here, we are printing the list of reservations
		System.out.println("\n\n *-*-*-*-* Reservations List *-*-*-*-*");
		for(Reservation R: rsvs) {
			System.out.println(R.toString());
		}
		
		//At last we have to do search, update and display operation for Bob		
		for(Reservation R: rsvs) {
			if(R.getPassenger_name().toUpperCase().contains("BOB")) {
				System.out.println("\n\n *-*-*-*-* The Reservation Details of Bob is as follows *-*-*-*-*");
				System.out.println(R.toString());
				R.setSeat_No("B5");
				R.setMeal_type((byte) 1);
				System.out.println("\n\n *-*-*-*-* The Updated Reservation Details of Bob is as follows *****");
				System.out.println(R.toString());
				double cost = R.cal_cost();
				System.out.println("\n The Final Reservation Cost will be:- " + cost + "$");
			}
		}
		
	}
}
