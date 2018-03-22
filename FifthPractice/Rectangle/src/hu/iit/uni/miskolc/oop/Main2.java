package hu.iit.uni.miskolc.oop;

import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		/*
		 * 2. Készítsen egy futtatható osztályt, amelyben létrehoz 10 darab Téglalap
		 * típusú objektumot és eltárolja a referenciájukat egy tömbben, véletlenszerűen
		 * generálva az oldalaikat a 2-10 tartományban.
		 */
		Rectangle[] rectangles = new Rectangle[10];
		Random rnd = new Random();
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle(rnd.nextInt(9) + 2, rnd.nextInt(9) + 2);
		}
		// Írja ki az összes téglalap adatait String-be összefűzve.
		System.out.println("Téglalapok: ");
		for (Rectangle rectangle : rectangles) {
			System.out.println(rectangle);
		}
		// Írja ki a legkisebb területű téglalap adatait.
		Rectangle minRectangle = rectangles[0];
		for (int i = 1; i < rectangles.length; i++) {
			if (minRectangle.isBigger(rectangles[i])) {
				minRectangle = rectangles[i];
			}
		}
		System.out.println("Legkisebb területű téglalap: " + minRectangle);

		// Hozzon létre egy új téglalapot, amelynek az adatait beolvassa.
		Scanner scanner = new Scanner(System.in);
		Rectangle userRectangle;
		System.out.println("Téglalp a oldala");
		int aSide = scanner.nextInt();
		System.out.println("Téglalap b oldala");
		int bSide = scanner.nextInt();
		userRectangle = new Rectangle(aSide, bSide);
		System.out.println(userRectangle);
		// Számolja meg az ettől kisebb területű téglalapokat
		int count = 0;
		for (int i = 0; i < rectangles.length; i++) {
			if (userRectangle.isBigger(rectangles[i])) {
				count++;
			}
		}
		System.out.println(count + "db kisebb téglalap van");

		/*
		 * Írja ki az első olyan téglalapnak az indexét, amelynek az oldalai megegyeznek
		 * a beolvasott téglalapéval, vagy ha nincs ilyen, akkor azt hogy
		 * "nincs egyező".
		 */
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].equals(userRectangle)) {
				System.out.println(i);
				break;
			}
			else if(i==rectangles.length) {
				System.out.println("nincs ilyen");
			}

		}
			

	}

}
