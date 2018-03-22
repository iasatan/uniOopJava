package hu.uni.miskolc.iit.oop;

//Készítsen egy Hanglemez osztályt, melynek adattagjai az előadó, a cím és a hossz (egész).
public class Music {
	String artist;
	String title;
	int length;

	// Írjon konstruktort, amely a paraméterként kapott értékekkel inicializálja az
	// adattagokat.
	public Music(String artist, String title, int length) {
		this.artist = artist;
		this.title = title;
		this.length = length;
	}

	// Írjon metódust, amely egy String-ben összefűzve adja vissza a lemez adatait a
	// következő alakban "Elődó: Cim, hossz perc".
	@Override
	public String toString() {
		return artist + ": " + title + ", " + length + "perc";
	}

	// Írjon metódust, amely 1-t ad vissza, ha a lemez hosszabb, mint a
	// paraméterként kapott lemez, -1-et ad vissza, ha a paraméterként kapott a
	// hosszabb és 0-t ad, ha egyformahosszúak.
	/**
	 * compares the length of the music, returns 1 if this is longer, -1 is this is
	 * shorter and 0 if the length equals.
	 * 
	 * @param other
	 *            the other music
	 * @return 1 if this is longer, -1 is this is shorter and 0 if the length
	 *         equals.
	 */
	public int compareLength(Music other) {
		if (length > other.length) {
			return 1;
		} else if (length < other.length) {
			return -1;
		}
		return 0;
	}

	// Írjon metódust, amely paraméterként egy előadót kap (String) és igazat ad, ha
	// a lemeznek ő az előadója. (A String-ek tartalmi egyezőségének vizsgálatára
	// használja a String osztály equals() vagy equalsIgnoreCase() metódusát.)
	
	public boolean artitsEquals(String artist) {
		return this.artist.equalsIgnoreCase(artist);
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
