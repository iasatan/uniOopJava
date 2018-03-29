package hu.iit.uni.miskolc.oop;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// Készítsen egy futtatható osztályt, amely beolvas n számú alkalmazottat egy
		// tömbbe.
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Random rnd = new Random();
		Employee[] employees = new Employee[number];

		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("employee" + i, rnd.nextInt(100000), LocalDate.of((1950+rnd.nextInt(70)), 01, 05));
		}

		// Írja ki az alkalmazottak adatait, majd módosítsa a nyugdíjkorhatárt és újra
		// írja ki az alkalmazottak adatait. 
		System.out.println("initial");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		Employee.setPensionageLimit(70);
		System.out.println("PensionAgeLimit Changed");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		// Írja ki azon alkalmazottak adatait, akiknek 5 évnél kevesebb van még hátra
		// nyugdíjig.
		System.out.println("5 évnél kevesebb van nyugdíjig");
		printWithYearsToPension(employees, 5);
		// Írja ki azoknak az alkalmazottaknak az adatait, akiknek az átlagnál több éve
		// van még hátra nyugdíjig.
		double avg=employees[0].yearsLeftToPension();
		for (int i = 1; i < employees.length; i++) {
			avg+=employees[i].yearsLeftToPension();
		}
		avg=avg/number;
		System.out.println(avg);
		printWithYearsToPension(employees, avg);
		// Rendezze az alkalmazottak tömbjét a nyugdíjig hátralévő évek alapján növekvő,
		// majd pedig csökkentő sorrendbe.

	}
	
	private static void printWithYearsToPension(Employee[] employees, double years) {
		for (Employee employee : employees) {
			if(employee.yearsLeftToPension()<years) {
				System.out.println(employee);
			}
		}
	}

}
