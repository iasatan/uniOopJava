package iit.uni.miskolc.oop.exception;

public class DivisionByZeroException extends Exception {
	public DivisionByZeroException(String message) {
		super(message);
	}

	public DivisionByZeroException() {
		super("you cannot divide by zero");
	}
}
