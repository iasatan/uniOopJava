package uni.miskolc.iit.hu.oop;

import uni.miskolc.iit.hu.oop.myproducts.Bread;
import uni.miskolc.iit.hu.oop.myproducts.Product;

public class Main {
	// a) Készítsen egy futtatható osztályt a myproducts alcsomagjában.
	public static void main(String[] args) {
		// Ebben hozzon létre egy Áru és egy Kenyér objektumot.
		Bread bread = new Bread("Barna kenyér", 220, 21, 0.58);
		Product product = new Product("Hangszóró", 50000, 20);
		// Írja ki az adataikat, és hasonlítsa össze az árukat.
		System.out.println(bread);
		System.out.println(product);

		// b) Hozzon létre még egy Kenyér típusú objektumot, de ennek a referenciáját
		// egy Áru típusú
		// változóban tárolja (neve: product2). Próbálja ki, hogy a "product2"
		// referenciára meghívva milyen
		// eredményt ad a toString metódus.
		Product product2 = new Bread("kovászos kenyér", 500, 27, 0.64);
		System.out.println(product2);
		// Meg tudja-e hívni ezen a referencián keresztül a Kenyér
		// mennyiségét visszaadó metódust?
		//ja
		
		// c) Hozzon létre még egy Kenyér példányt (neve: bread2) 
		Bread bread2 = new Bread("kifli", 300, 12, 0.1);
		//és a "product2"
		// referenciával hivatkozott
		// másik Kenyérrel összehasonlítva a nagyobb egységárút kell kiírni
		// (konvertálásra lesz szükség).
		System.out.println(Bread.firstIsMoreExpensive(bread2, (Bread)product2));
		System.out.println((Product)bread2);

	}

}
