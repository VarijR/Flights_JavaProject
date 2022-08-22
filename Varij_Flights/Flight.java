import java.util.Date;

public class Flight {

	protected int Flight_id;
	protected String Dept_airport, Arr_airport, Flight_no;
	protected Date Dept_date;
	protected double Dist;
	
	Flight(int Flight_Id, String Flight_No, String Departure_airport, String Arrival_airport,Date Departure_date, double Distance)
	{
		this.Flight_id = Flight_Id;
		this.Dept_airport = Departure_airport;
		this.Arr_airport = Arrival_airport;
		this.Dept_date = Departure_date;
		this.Dist = Distance;
		this.Flight_no = Flight_No;
	}
	
	//Setter Departure Date
	public void setDept_date(Date value) {
		Dept_date = value;
	}
	
	//It is the method that contains all the information about the passenger
	public String toString() {
		return "Flight Id:- " + Flight_id + "\tFlight Number:-" + Flight_no +" \tDeparture Airport:- " + Dept_airport + "\t\tArrival Airport:- " + Arr_airport + 
				"\tDeparture Date:- " + Dept_date + "\t\tDistance to travel:- " + Dist + " miles";
	}

}
