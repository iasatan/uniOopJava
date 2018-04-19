package iit.uni.miskolc.oop;

import java.util.Scanner;

import iit.uni.miskolc.oop.exception.DivisionByZeroException;

public class Calculator {

	public static void main(String[] args) {
		// scanner to read from console
		Scanner scanner = new Scanner(System.in);
		String calculation;
		Double firstNumber;
		Double secondNumber;
		String operator;
		while (true) {
			// reads the calculation from the console in the form of number space operator
			// space number (2 + 5)
			calculation = scanner.nextLine();
			// extracts the numbers and operator from the string
			firstNumber = Double.parseDouble(calculation.split(" ")[0]);
			secondNumber = Double.parseDouble(calculation.split(" ")[2]);
			operator = calculation.split(" ")[1];
			try {
				Util.calculate(operator, firstNumber, secondNumber);
			} catch (DivisionByZeroException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				break;
			}
			
		}
	}

}
