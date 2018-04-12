package hu.iit.uni.miskolc.oop.geometry;

//Készítsen ugyanebben a csomagban Téglatest osztályt, amely a Hasáb leszármazottja	
public class Cuboid extends Prism {
	// Adattagjai: az alap két oldala (double)
	private double aSide;
	private double bSide;

	// Konstruktor: a három adattagot a paraméterben megkapott értékkel
	// inicializálja
	public Cuboid(int height, double aSide, double bSide) {
		super(height);
		this.aSide = aSide;
		this.bSide = bSide;
	}

	// Definiálja felül az örökölt alapterületet visszaadó metódus
	@Override
	public double getBaseArea() {
		return aSide * bSide;
	}

	// Definiálja felül a toString() metódust: ez összefűzve adja vissza a téglatest
	// alapjának oldalait és magasságát.
	@Override
	public String toString() {
		return "Cuborid, a side:" + aSide + ", b side: " + bSide;
	}
	

}
