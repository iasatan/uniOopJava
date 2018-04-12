package hu.iit.uni.miskolc.oop.enumbook;


import hu.iit.uni.miskolc.oop.Book;
import hu.iit.uni.miskolc.oop.enumbook.BookWithEnum.Style;
// Ugyanebben a csomagban készítsen egy futtaható osztályt, amelyben
public class Main {
	// létrehoz egy könyv tömböt random,
	// kiírja a könyvek adatait, majd kiválogatja és kiírja a scifi stílusúakat
	public static void main(String[] args) {
		BookWithEnum[] booksWithEnum = new BookWithEnum[4];
		booksWithEnum[0]= new BookWithEnum("asd", "adam", 2000, 2000, Style.SCIFI);
		booksWithEnum[1]= new BookWithEnum("asd1", "adam6", 7000, 12000, Style.COOK);
		booksWithEnum[2]= new BookWithEnum("asd2", "adam5", 8000,11000, Style.ROMANCE);
		booksWithEnum[3]= new BookWithEnum("asd3", "adam4", 9000, 10000, Style.SCIFI);
		switch (booksWithEnum[0].getStyle()) {
		case SCIFI:
			System.out.println("scifi");
			break;
		case COOK:
			System.out.println("cook");
			break;

		}
		
		printBook(getBooksWithStyle(booksWithEnum, Style.SCIFI));
	}

	// legyen egy osztályszintű metódus, amely megkap egy könyv tömböt (Book) és
	// minden könyv adatát kiírja
	private static void printBook(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}

	// legyen egy osztályszintű metódus, amely megkap egy BookWithEnum tömböt és egy
	// Style-t és visszaadja azon könyvek tömbjét (BookWithEnum tömb), amelyek a
	// megadott stílusúak.
	private static BookWithEnum[] getBooksWithStyle(BookWithEnum[] booksWithEnum, Style style) {
		int count=0;
		for (int i = 0; i < booksWithEnum.length; i++) {
			if (booksWithEnum[i].getStyle()==style){
				count++;
			}
		}
		BookWithEnum[] booksWithStyle = new BookWithEnum[count];
		int j = 0;
		for (int i = 0; i < booksWithEnum.length; i++) {
			if (booksWithEnum[i].getStyle().equals(style)) {
				booksWithStyle[j] = booksWithEnum[i];
				j++;
			}
		}
		return booksWithStyle;
	}

}
