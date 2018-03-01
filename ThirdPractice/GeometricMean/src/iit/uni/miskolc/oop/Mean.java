package iit.uni.miskolc.oop;

import java.util.Scanner;

public class Mean {

	public static void main(String[] args) {
		int size =10;
		//new empty double array, size = 10
		double[] array = new double[size];
		double mean = 1.0;
		//scanner to read from console
		Scanner scanner = new Scanner(System.in);
		//initializes the  elements of the array from user input
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextDouble();
		}
		//prints out the elements of the array, using foreach
		for (double d : array) {
			System.out.println(d);
		}
		//calculates the under root part of the mean of the array
		for (double d : array) {
			mean *= d;
		}
		//calculates and prints the size-th root 
		System.out.println(Math.pow(mean, 1/size));
		scanner.close();
	}

}
