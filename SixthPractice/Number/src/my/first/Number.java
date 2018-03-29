package my.first;

public class Number {
	// Készítsen egy Szám osztályt a sajat.elso nevű csomagban, amelynek van egy
	// osztályszintű konstans adattagja 0.001 értékkel egy tűrés tárolására.
	private static double delta = 0.001;
	// Legyen  egy másik private adattagja egy valós szám tárolására.
	private double number;
	// Legyen konstruktora, amely a paraméterként kapott értékekkel inicializálja az
	// adattagot.
	public Number(double number) {
		this.number = number;
	}


	// Legyen getter, setter metódusa a valós szám adattagra.
	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	// Legyen egy metódusa, amely igazat ad, ha a valós szám adattagnak a
	// paraméterként kapott számtól való eltérése a tűrésen belül van.
	public boolean equals(Number number) {
		return Math.abs((this.number-number.number))<delta;
	}
	
	@Override
	public String toString() {
		return Double.toString(number);
	}
	

	
	

}
