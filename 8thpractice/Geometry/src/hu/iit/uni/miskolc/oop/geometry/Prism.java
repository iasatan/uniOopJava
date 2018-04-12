package hu.iit.uni.miskolc.oop.geometry;

//1. Készítsen saját csomagban Hasáb absztrakt osztályt
public abstract class Prism {
	// Adattagja: magasság (int)
	private int height;

	// Konstruktora: a paraméterben kapott értékkel inicializálja a magasságot
	public Prism(int height) {
		this.height = height;
	}

	// Getter metódus, amely visszaadja a magasságot
	public int getHeight() {
		return height;
	}

	// Abstract metódus az alapterület visszaadására.
	public abstract double getBaseArea();

	// Metódus a térfogat visszaadására
	public double getVolume() {
		return height * getBaseArea();
	}
	// Összehasonlító metódus, amely igazat ad ha a hasáb nagyobb térfogatú, mint
	// egy paraméterben kapott másik hasáb térfogata
	
	public boolean isBigger(Prism prism) {
		return getVolume() > prism.getVolume();
	}
	

}
