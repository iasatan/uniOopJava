package hu.iit.uni.miskolc.oop;

import java.util.Date;

public class Book {
	private String title;
	private String author;
	private int releaseYear;
	private double price;
	
	
	
	public Book() {
	}
	public Book(String title, String author, int releaseYear, double price) {
		this.title = title;
		this.author = author;
		this.releaseYear = releaseYear;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void raisePrice(int percentage) {
		price*=(1+percentage/100.0);
	}
	
	public String toString() {
		return "title: "+title+" , "+author+","+releaseYear+", "+price;
	}
	

}
