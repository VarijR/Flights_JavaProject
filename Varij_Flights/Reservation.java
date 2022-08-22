import java.util.Date;

public class Reservation extends Flight {//Here reservation class inherits all the Flight class attributes and methods
	private int res_id;
	private Traveller pssgr = new Traveller();
	private Date res_date;
	private String seat_no;
	private byte meal_type;
	
	public Reservation(Flight fl, int Reservation_Id, Traveller Passenger,Date Reservation_date, String Seat_No, byte Meal_Type) {
		super(fl.Flight_id, fl.Flight_no, fl.Dept_airport, fl.Arr_airport,fl.Dept_date, fl.Dist);
		this.res_id = Reservation_Id;
		this.pssgr = new Traveller(Passenger);
		this.res_date = Reservation_date;
		this.seat_no = Seat_No;
		this.meal_type = Meal_Type;
	}
	
	//Here is the method that calculates and returns the cost of the reservation
	public double cal_cost() {
		return 100 + (Dist * 0.12);
	}
	
	//Setting Seat Number
	public void setSeat_No(String value) {
		seat_no = value;
	}
	
	//Setting Meal Type
	public void setMeal_type(byte value) {
		meal_type = value;
	}
	
	//Getting Passenger Name
	public String getPassenger_name() {
		return pssgr.get_Name();
	}
	
	//It is the method that contains all the information about the passenger
	public String toString() {
		String type;
		if(meal_type == (byte)1)
			type = "Vegeterian";
		else
			type = "Non-Vegeterian";
		return "Reservation Id:- " + res_id + " \tReservation Date:- " + res_date + pssgr.toString() +" \tFlight Number:- " + Flight_no + 
				" \tDistance to travel:- " + Dist + " miles" + " \tDeparture Date:- " + Dept_date + " \tDeparture Airport:- " +
		          Dept_airport + " \tSeat Number:- " + seat_no + " \tMeal Type:- " + type;
	}
}
