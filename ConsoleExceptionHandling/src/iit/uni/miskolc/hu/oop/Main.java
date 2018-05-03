package iit.uni.miskolc.hu.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	// Készítsen saját csomagban futtatható osztályt, amelyben létrehoz egy 5 elemű
	// int tömböt és megpróbálja feltölteni billentyűzetről beolvasott értékekkel.
	// Ha sikerült, írja ki a beolvasott 5 számot. Kezelje az esetleg felmerülő
	// kivételeket. Tesztelje a programot!
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int[] array = new int[5];
		// Beolvasás Scanner osztály nextInt() metódusával5
		/*
		 * for (int i = 0; i < array.length; i++) { try { array[i] = scanner.nextInt();
		 * } catch (InputMismatchException e) {
		 * System.out.println("fucktard, that is not a number"); }
		 * 
		 * }
		 */
		// Beolvasás Scanner osztály nextLine() metódusával és típus konverzióval
		/*
		 * for (int i = 0; i < array.length; i++) { try { array[i] =
		 * Integer.parseInt(scanner.nextLine()); } catch (NumberFormatException e) {
		 * System.out.println("fucktard, that is not a number"); } }
		 */
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = readFromConsole();
			} catch (IllegalArgumentException e) {
				System.out.println("negatív szám nem lehet");
			} catch (NotPrimException e) {
				System.out.println("csak prím lehet");
			} 

		}

		for (int number : array) {
			System.out.println(number);
		}

	}
	// Módosítsa úgy a feladatot, hogy a beolvasást külön metódus valósítsa meg.
	// Csak pozitív számokat fogadjon el. A negatív számok és a 0 érvénytelen input.
	// Talál hozzá létező kivételosztályt? Használható-e az IllegalInputException
	// (RuntimeException)?

	public static int readFromConsole() throws IllegalArgumentException, NotPrimException {
		int number = 0;
		while (true) {
			try {
				number = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Enyje benyje, az nem szám");
			}
		}
		if (number < 1) {
			throw new IllegalArgumentException();
		}
		if(notPrime(number)) {
			throw new NotPrimException();
		}
		return number;
	}

	// Módosítsa úgy a feladatot, hogy csak prímszámokat fogadjon el beolvasáskor.
	// Készítsen hozzá saját kivételosztályt (legyen kötelezően lekezelendő).
	private static boolean notPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return true;
		}
		return false;
	}
}
