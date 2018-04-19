package hu.iit.uni.miskolc.oop.model.impl;

import hu.iit.uni.miskolc.oop.Genre;
import hu.iit.uni.miskolc.oop.model.InvalidWinnigYearException;

public class OscarMovie extends MovieImpl{
	private int winningYear;
	private String award;

	public OscarMovie(String title, String producer, Genre genre, int year, String[] actors, int winnigYear, String award) throws InvalidWinnigYearException {
		super(title, producer, genre, year, actors);
		if(winnigYear<year) {
			throw new InvalidWinnigYearException();
		}
		this.winningYear=winnigYear;
		this.award=award;
	}
	@Override
	public String toString() {
		return super.toString()+winningYear+", "+award;
	}

}
