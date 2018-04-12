package hu.iit.uni.miskolc.oop.model.impl;

import java.awt.Color;

import hu.iit.uni.miskolc.oop.model.Colorable;

//Készítsen Szinespont osztályt a Pont osztályból származtatva

public class ColoredDot extends Dot implements Colorable {

	// Adattagja: szín
	private Color color;

	// Csak a szín paraméter megadásával inicializálja az adatokat.
	public ColoredDot(Color color) {
		super(0, 0);
		this.color = color;
	}

	// Három megkapott paraméterrel inicializálja az adatokat.
	public ColoredDot(int xCoordinate, int yCoordinate, Color color) {
		super(xCoordinate, yCoordinate);
		this.color = color;
	}
	//Definiálja felül az Object osztálytól örökölt toString() metódust.
	@Override
	public String toString() {
		return super.toString()+", color: "+color;
	}
	//Implementálja a Színezhető interfészt
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public void setColor(Color color) {
		this.color=color;
	}
}
