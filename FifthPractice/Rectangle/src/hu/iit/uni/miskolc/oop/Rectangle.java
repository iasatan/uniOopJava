package hu.iit.uni.miskolc.oop;

public class Rectangle {
	private int a;
	private int b;

	// konstruktor a, b oldallal
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// négyzet, mindkét oldal a
	public Rectangle(int a) {
		this(a, a);
	}

	// terület
	public int area() {
		return a * b;
	}

	// toString
	public String toString() {
		return "a oldal: " + a + " b oldal: " + b;
	}

	// Írjon setter metódust, amely beállítja a téglalap oldalait a paraméterként
	// kapott egyetlen értéket adva mindkét oldalnak
	public void setBoth(int a) {
		this.a = a;
		this.b = a;
		// setBoth(a, a); //ez is működne
	}

	// Írjon setter metódust, amely beállítja a téglalap oldalait a paraméterként
	// kapott két értékkel.
	public void setBoth(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// Írjon metódust, amely igazat ad, ha a téglalap nagyobb területű, mint a
	// paraméterként kapott téglalap, hamisat ad ha nem.
	public boolean isBigger(Rectangle rectangle) {
		return rectangle.area() < area();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	// Írjon metódust, amely igazat ad, ha a téglalap oldalai megegyeznek a
	// paraméterként kapotz téglalap oldalaival, hamisat ha nem.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (a != other.a)
			return false;
		return !(b != other.b);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

}
