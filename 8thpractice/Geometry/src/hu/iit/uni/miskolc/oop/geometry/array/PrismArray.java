package hu.iit.uni.miskolc.oop.geometry.array;

import java.util.Iterator;

import hu.iit.uni.miskolc.oop.geometry.Barrel;
import hu.iit.uni.miskolc.oop.geometry.Prism;

//Készítsen új csomagban egy olyan osztályt, amely hasábokat képes tárolni
public class PrismArray {
	// Adattagja: Hasáb típusú tömb adattag
	private Prism[] prismArray;

	// Konstruktor: paraméterben megkapja a hasábok max. számát és ezzel a mérettel
	// hozza létre a tömböt.
	public PrismArray(int size) {
		prismArray = new Prism[size];
	}

	// Setter metódus, amely paraméterben megkap egy indexet és egy hasábot és a
	// tömb adott indexű elemének értékül adja a kapott hasáb referenciáját.
	public void setElement(int index, Prism prism) {
		prismArray[index] = prism;
	}

	// Getter metódus, amely visszaadja a tömb méretét, azaz a hasábok max. számát
	public int getSize() {
		return prismArray.length;
	}

	// Getter metódus, amely paraméterként egy indexet kap és visszaadja a tömb
	// adott indexű elemét
	public Prism getElement(int index) {
		return prismArray[index];
	}

	// Getter metódus, amely visszaadja, hogy hány darab nem null értékű tömbelem
	// van
	public int getNotNull() {
		int count = 0;
		for (Prism prism : prismArray) {
			if (prism != null) {
				count++;
			}
		}
		return count;
	}

	// Getter metódus, amely visszaadja a hasábok átlagos térfogatát
	public double getAverageVolume() {
		double average = 0;
		for (Prism prism : prismArray) {
			if (prism != null) {
				average += prism.getVolume();
			}
		}
		average = average / getNotNull();
		return average;
	}

	// Getter metódus, amely visszadja a Henger típusú hasábok számát.
	public int getBarrelCount() {
		int count = 0;
		for (Prism prism : prismArray) {
			if (prism instanceof Barrel) {
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
