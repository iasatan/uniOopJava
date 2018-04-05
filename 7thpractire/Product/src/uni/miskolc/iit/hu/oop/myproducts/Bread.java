package uni.miskolc.iit.hu.oop.myproducts;

//Készítsen az Áru osztállyal azonos csomagban Kenyér osztályt, amely az Áru leszármazottja.
public class Bread extends Product {
	// Adattagja: mennyiség (valós, pl. 0.75)
	private double weight;

	// Konstruktora: négy paraméterben kapott adattal inicializálja az objektumot.
	public Bread(String name, int price, int tax, double weight) {
		super(name, price, tax);
		this.weight = weight;
	}

	// Metódusai:
	// - Definiálja felül a toString metódust. Az ősosztályban definiált metódushoz
	// képest fűzze
	// hozzá az egységárat (bruttóár/mennyiség).
	@Override
	public String toString() {
		return super.toString() + ", egységár: " + getPriceWithTax() / weight + "ft";
	}

	// - Adja vissza a mennyiséget.
	public double getQuantity() {
		return weight;
	}

	// - Hasonlítsa össze két kenyér egységárát. Az osztályszintű metódus akkor
	// adjon vissza igazat, ha a paraméterként kapott két Kenyér közül az elsőnek
	// nagyobb az egységára.
	public static boolean firstIsMoreExpensive(Bread first, Bread second) {
		return (first.getPriceWithTax() / first.weight) > (second.getPriceWithTax() / second.weight);
	}

}
