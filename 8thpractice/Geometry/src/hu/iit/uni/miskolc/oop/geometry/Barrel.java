package hu.iit.uni.miskolc.oop.geometry;

//Ugyanebben a csomagban készítsen Henger osztályt, amely a Hasáb leszármazottja
public class Barrel extends Prism {
	// Adattagja: sugár (double)
	private double radius;

	// Konstruktor: a paraméterben kapott sugár és magasság értékekkel inicializálja
	// az objektumot
	public Barrel(int height, double radius) {
		super(height);
		this.radius = radius;
	}

	// Definiálja felül az örökölt alapterületet visszaadó metódust
	@Override
	public double getBaseArea() {
		// return radius * radius * Math.PI;
		return Math.pow(radius, 2) * Math.PI;
	}

	// Definiálja felül a toString() metódust: ez összefűzve adja vissza a henger
	// sugarát és magasságát
	@Override
	public String toString() {
		return "Barrel, radius: " + radius + ", height: " + getHeight();
	}

}
