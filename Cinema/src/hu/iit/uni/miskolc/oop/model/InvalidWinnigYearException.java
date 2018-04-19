package hu.iit.uni.miskolc.oop.model;

public class InvalidWinnigYearException extends Exception {

	public InvalidWinnigYearException() {
		super("You cannot win before you are released");
		
	}

	public InvalidWinnigYearException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	

}
