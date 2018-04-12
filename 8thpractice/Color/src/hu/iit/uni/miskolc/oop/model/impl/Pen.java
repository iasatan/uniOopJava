package hu.iit.uni.miskolc.oop.model.impl;

import java.awt.Color;

import hu.iit.uni.miskolc.oop.model.Colorable;

//Készített Áru osztállyal azonos csomagban készítsen Toll osztályt az Áru osztály leszármazottjaként
public class Pen extends Product implements Colorable {
	// Adattagjai: szín és márkanév
	private Color color;
	private String brand;

	// Konstruktor: minden adatot megkap paraméterként
	public Pen(String name, int price, int tax, Color color, String brand) {
		super(name, price, tax);
		this.color = color;
		this.brand = brand;
	}


	// Definiálja felül az örökölt toString() metódust
	@Override
	public String toString() {
		return super.toString() + ", Color: " + color + ", brand:" + brand;
	}
	//Implementálja a Színezhető interfészt.
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
	}

}
