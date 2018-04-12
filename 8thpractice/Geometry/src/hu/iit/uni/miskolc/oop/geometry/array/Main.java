package hu.iit.uni.miskolc.oop.geometry.array;

import hu.iit.uni.miskolc.oop.geometry.Barrel;
import hu.iit.uni.miskolc.oop.geometry.Cuboid;
import hu.iit.uni.miskolc.oop.geometry.Prism;

public class Main {
	// Készítsen ugyanebben a csomagban futtatható osztályt, amelyben létrehoz egy 5
	// elemű hasáb-tömb objektumot.
	public static void main(String[] args) {
		PrismArray prismArray = new PrismArray(5);

		// A tömb elemeinek adjon értéket úgy, hogy legyen null értékű tömbelem is.
		prismArray.setElement(0, new Barrel(5, 10));
		prismArray.setElement(1, new Barrel(20, 30));
		prismArray.setElement(3, new Cuboid(5, 10, 10));
		prismArray.setElement(4, new Cuboid(5, 10, 20));

		// Írja ki az összes hasáb adatát, majd a hasábok átlagos térfogatát, és a
		// hengerek számát

		for (int i = 0; i < 5; i++) {
			System.out.println(prismArray.getElement(i));
		}
		System.out.println("average volume:" + prismArray.getAverageVolume());
		System.out.println("number of barrels: "+prismArray.getBarrelCount());
		System.out.println("nulls:"+(prismArray.getSize()-prismArray.getNotNull()));
	}

}
