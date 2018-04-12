package hu.iit.uni.miskolc.oop.stlye;

import hu.iit.uni.miskolc.oop.Book;

//2. A korábbi saját csomagban definiált Könyv osztály (mybooks.Book) leszármazottjaként készítsen
//egy másik csomagban KönyvStílus osztályt.
public class BookStyle extends Book {
	// Adattagjai: stílus (szöveg)
	private String style;
	// Konstruktora: minden adatát paraméterben kapott adatokkal inicializálja.

	public BookStyle() {
		super();
	}

	public BookStyle(String title, String author, int releaseYear, double price, String style) {
		super(title, author, releaseYear, price);
		this.style = style;
	}

	// Metódusai:
	// - Adja vissza a stílust.
	public String getStyle() {
		return style;
	}
	// - Definiálja felül az ősosztálybeli String-et visszaadó metódust úgy, hogy az
	// ősbeli sztringhez fűzze hozzá a stílust is.
	@Override
	public String toString() {
		return super.toString()+"style: "+style;
	}

}
