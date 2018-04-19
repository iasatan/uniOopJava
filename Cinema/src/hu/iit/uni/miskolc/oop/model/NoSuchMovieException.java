package hu.iit.uni.miskolc.oop.model;

public class NoSuchMovieException extends Exception {

	public NoSuchMovieException() {
		super("Ó jaj, nincs ilyen film");
		
	}

	public NoSuchMovieException(String arg0) {
		super(arg0);
	}
	

}
