package hu.iit.uni.miskolc.oop.model.impl;

import hu.iit.uni.miskolc.oop.Genre;
import hu.iit.uni.miskolc.oop.model.Movie;

public class MovieImpl implements Movie {
	private String title;
	private String producer;
	private Genre genre;
	private final int year;
	private String[] actors;

	public MovieImpl(String title, String producer, Genre genre, int year, String[] actors) {
		this.title = title;
		this.producer = producer;
		this.genre = genre;
		this.year = year;
		this.actors = actors;
	}

	@Override
	public String[] getActors() {
		return actors;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public Genre getGenre() {
		return genre;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		String toString = title + ", " + producer + ", " + year + ", " + genre.name() + ", actors:";
		for (int i = 0; i < actors.length; i++) {
			toString += actors[i];
		}
		return toString;
	}

}
