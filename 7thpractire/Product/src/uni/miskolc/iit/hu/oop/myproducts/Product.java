package uni.miskolc.iit.hu.oop.myproducts;
//Definiáljon saját csomagban (myproducts) Áru (Product) osztályt.


public class Product {
	// Adattagjai: név, nettó ár (egész), áfakulcs (egész, százalék)

	private String name;
	private int price;
	private int tax;

	// Konstruktora: mindhárom adat megadásával inicializálja az adattagokat.

	public Product(String name, int price, int tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	// Metódusai:
	// - Számítsa ki a bruttóárát egy árunak (egész, kerekítve).
	public int getPriceWithTax() {
		return (Integer) price * (1 + tax / 100);
	}

	// - Egy sztringbe összefűzve adja vissza az áru nevét és a bruttó árát.
	// Definiálja felül az Object osztálybeli toString metódust!
	@Override
	public String toString() {
		return name + ", " + getPriceWithTax() + "ft";
	}

	// - Növelje meg az áru nettó árát a paraméterben megadott százalékos értékkel
	// (egész).
	public void raisePrice(int percentage) {
		price = price * (percentage / 100);
	}
	// - Hasonlítsa össze két áru bruttó árát. 1-et adjon vissza, ha az áru drágább
	// mint a paraméterben megadott; -1-et ha olcsóbb és 0-t ha azonos árúak.
	public int compareProducts(Product other) {
		if(getPriceWithTax()>other.getPriceWithTax()) {
			return 1;
		}
		if(getPriceWithTax()<other.getPriceWithTax()) {
			return -1;
		}
		return 0;
	}
}
