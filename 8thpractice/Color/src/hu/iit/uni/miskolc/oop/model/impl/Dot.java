package hu.iit.uni.miskolc.oop.model.impl;

import hu.iit.uni.miskolc.oop.model.Colorable;

//Készítsen másik csomagban Pont osztályt
public class Dot {
	// Adattagja: x és y koordináta (int)
	private int xCoordinate;
	private int yCoordinate;

	// Konstruktor: két megkapott paraméterrel inicializálja az adattagokat
	public Dot(int xCoordinate, int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	// Definiálja felül a toString() metódust, amely Stringben összefűzve adja
	// vissza a pont adatait
	@Override
	public String toString() {
		return "Dot, xCoordinate: " + xCoordinate + ", yCoordinate: " + yCoordinate;
	}
}
