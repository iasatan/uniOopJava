package iit.uni.miskolc.oop;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[10];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100) + 1;
		}
		int index = linearSearch(43, array);
		if (index == -1) {
			System.out.println("not found");
		} else
			System.out.println("43 can be found in the " + index + ". index of the array using linear search");
		System.out.println("before sort:");
		for (int i : array) {
			System.out.println(i);
		}
		System.out.println("after sort:");
		sort(array);
		for (int i : array) {
			System.out.println(i);
		}
		index = binarySeach(43, array);
		if (index <0) {
			System.out.println("not found");
		} else
			System.out.println("43 can be found in the " + index + ". index of the array using binary search");
	}

	/**
	 * Linear Search, finds and returns the index of value inside the array
	 * 
	 * @param value
	 * @param array
	 * @return
	 */
	private static int linearSearch(int value, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value)
				return i;
		}
		return -1;
	}
	
	private static void sort(int[] array) {
		Arrays.sort(array);
	}
	
	private static int binarySeach(int value, int[] array) {
		return Arrays.binarySearch(array, value);
	}

}
