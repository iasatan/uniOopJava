package hu.iit.uni.miskolc.oop;

public class Main {

	public static void main(String[] args) {
		Book book = new Book();
		book.setAuthor("J.K. Rowling");
		book.setPrice(2);
		book.setReleaseYear(2008);
		book.setTitle("Harry Potter");
		System.out.println(book);
		book.raisePrice(5);
		System.out.println(book);

	}

}
