public class Traveller implements ICanValidate { //Traveller class implementing ICanValidate interface
	private int cust_id;
	private String pass_no, name, address, email_add;
	
	public Traveller() {
		
	}
	
	public Traveller(int Customer_Id, String Name,String Address, String Passport_No ,String Email_Address) {
		this.cust_id = Customer_Id;
		this.name = Name;
		this.address = Address;
		this.pass_no = Passport_No;
		this.email_add = Email_Address;
	}
	
	public Traveller(Traveller Trv) {
		this.cust_id = Trv.cust_id;
		this.pass_no = Trv.pass_no;
		this.name = Trv.name;
		this.address = Trv.address;
		this.email_add = Trv.email_add;
	}
	
	//Function to validate the Passport number is valid or not
	public boolean isValid() {
		if(pass_no.substring(0, 3).contains("[0-9]+") && pass_no.length() == 5 && (pass_no.toLowerCase().charAt(4) == 'q' || pass_no.toLowerCase().charAt(4) == 't'))
			return true;
		else
			return false;
	}
	
	//Getter Name
	public String get_Name() {
		return name;
	}
	
	//Setter Passport Number
	public void setPass_No(String value) {
		pass_no = value;
	}
	
	//Setter Email Address
	public void setEmail_Add(String value) {
		email_add = value;
	}
	
	//It is the method that contains all the information about the passenger
	public String toString() {
		return "Customer ID:- " + cust_id + " \t\tName:- " + name +" \tAddress: "  + address+ " \t\tPassport Number:- " + pass_no  +" \t\tEmail ID:- " + email_add ;
	}

}
