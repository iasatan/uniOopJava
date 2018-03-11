package hu.iit.uni.miskolc.oop;

public class Book {
	private String title;
	private String author;
	private int releaseYear;
	private double price;
	
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
		// TODO Auto-generated method stub
		return "title: "+title+" , "+author+","+releaseYear+", "+price;
	}
	

}
