package iit.uni.miskolc.oop;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// new empty double array, size = 10
		int[] array = new int[10];

		// random number generator
		Random rnd = new Random();
		// initializes the elements of the array with random numbers between 1 and 50
		System.out.println("array using for, and Random: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(50) + 1;
		}
		// prints out the elements of the array, using foreach
		System.out.println("array using foreach, and Random: ");
		for (int element : array) {
			System.out.println(element);
		}
		// initializes the elements of the array with random numbers between 1 and 50
		// using Math.random
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 50 + 1);
		}
		// prints out the elements of the array, using foreach
		System.out.println("array using foreach, and Math.random: ");
		for (int element : array) {
			System.out.println(element);
		}
		System.out.println("array in reverse using for:");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		printMaxEvenNumber(array);

	}

	private static void printMaxEvenNumber(int[] array) {
		int maxEvenNumber = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxEvenNumber && array[i] % 2 == 0) {
				maxEvenNumber = array[i];
			}
		}
		System.out.println("Highest even number in the array using for: " + maxEvenNumber);
		maxEvenNumber = 0;
		for (int element : array) {
			if (element > maxEvenNumber && element % 2 == 0)
				maxEvenNumber = element;
		}
		System.out.println("Highest even number in the array using foreach: " + maxEvenNumber);
	}

}
