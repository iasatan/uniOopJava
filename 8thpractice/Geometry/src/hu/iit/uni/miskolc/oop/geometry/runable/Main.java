package hu.iit.uni.miskolc.oop.geometry.runable;

import hu.iit.uni.miskolc.oop.geometry.Barrel;
import hu.iit.uni.miskolc.oop.geometry.Cuboid;
import hu.iit.uni.miskolc.oop.geometry.Prism;

//Alcsomagban készítsen futtatható osztályt
public class Main {

	public static void main(String[] args) {
		// amelyben létrehoz egy hengert majd kiírja az adatait és a térfogatát
		Barrel barrel = new Barrel(10, 10);
		System.out.println(barrel);
		System.out.println(barrel.getVolume());

		// Hozzon létre egy téglatestet és írja ki az adatait és a térfogatát
		Cuboid cuboid = new Cuboid(10, 10, 10);
		System.out.println(cuboid);
		System.out.println(cuboid.getVolume());

		// majd azt hogy melyik a nagyobb térfogatú
		System.out.println("The barrel is bigger: " + barrel.isBigger(cuboid));

	}

}
