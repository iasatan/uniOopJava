package hu.iit.uni.miskolc.oop.enumbook;

import hu.iit.uni.miskolc.oop.Book;

//Készítsen osztályt új csomagban BookWithEnum néven a korábbi könyv osztály leszármazottjaként.
public class BookWithEnum extends Book {
	// Legyen benne public beágyazott felsorolás típus Style néven a könyv
	// stílusának megadásához a következő konstansokkal:
	// SCIFI, COOK, ROMANCE, OTHER.

	public enum Style {
		SCIFI, COOK, ROMANCE, OTHER
	};

	// Adattagja: Style típusú stílus adattag
	private Style style;

	// Konstruktor: minden adattagot a paraméterben kapott értékekkel inicializálja
	public BookWithEnum(String title, String author, int releaseYear, double price, Style style) {
		super(title, author, releaseYear, price);
		this.style = style;
	}

	// Definiálja felül a toString metódust úgy, hogy az ősbelihez még fűzze hozzá a
	// stílust.
	@Override
	public String toString() {
		return super.toString() + "Style: " + style.name();
	}

	// Getter metódus a stílus lekérdezésére
	public Style getStyle() {
		return style;
	}

}
