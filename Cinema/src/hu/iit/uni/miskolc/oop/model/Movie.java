package hu.iit.uni.miskolc.oop.model;

import hu.iit.uni.miskolc.oop.Genre;

public interface Movie {
	public String[] getActors();
	public String getTitle();
	public Genre getGenre();
	public void setTitle(String title);
	public void setGenre(Genre genre);

}
