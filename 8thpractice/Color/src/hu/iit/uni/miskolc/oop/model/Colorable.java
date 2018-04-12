package hu.iit.uni.miskolc.oop.model;

import java.awt.Color;

//Készítsen saját csomagban Színezhető néven interfészt
public interface Colorable {
	// Adattagja: alapértelmezett szín, értéke piros (használja a java.awt.Color
	// osztályt).
	Color defaultColor = Color.RED;
	
	//Getter metódus a szín lekérdezésére
	Color getColor();
	
	// Setter metódus a szín megváltoztatására
	void setColor(Color color);
}
