package hu.iit.uni.miskolc.oop;

import java.awt.Color;

import hu.iit.uni.miskolc.oop.model.Colorable;
import hu.iit.uni.miskolc.oop.model.impl.ColoredDot;
import hu.iit.uni.miskolc.oop.model.impl.Pen;

public class Main {

	public static void main(String[] args) {
		// Készítsen egy futtatható osztályt, amelyben egy Színezhető típusú
		// referenciának Szinespont példányt ad értékül, kiírja az adatait, majd
		// átszinezi és újra kiírja az adatait. Ugyanezt próbálja ki egy Toll
		// objektummal is.
		Colorable coloredDot = new ColoredDot(10, 20, Color.BLACK);
		System.out.println(coloredDot);
		coloredDot.setColor(Color.BLUE);
		System.out.println(coloredDot);

		Colorable coloredPen = new Pen("asd", 10, 10, Color.GREEN, "Singetta");
		System.out.println(coloredPen);
		coloredPen.setColor(Color.BLUE);
		System.out.println(coloredPen);
		
		//A main-t is egészítse ki úgy, hogy használja a metódust egy Szinespont példánnyal és egy Toll példánnyal is.
		setColorToDefaultColor(coloredDot);
		System.out.println(coloredDot);
		setColorToDefaultColor(coloredPen);
		System.out.println(coloredPen);
		

	}
	// Készítsen az osztályba egy statikus metódust, amely paraméterként egy
	// Színezhető objektumot vár és az objektumot átszinezi alapszínre.
	
	private static void setColorToDefaultColor(Colorable colorable) {
		colorable.setColor(colorable.defaultColor);
	}

}
