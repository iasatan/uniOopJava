package hu.iit.uni.miskolc.oop;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		Employee[] employeeArray = new Employee[10];
		for (int i = 0; i < employeeArray.length; i++) {
			employeeArray[i] = new Employee();
			employeeArray[i].setName("employee"+(i+1));
			employeeArray[i].setSalary(Math.abs(new Random().nextInt()));
		}
		for (Employee employee : employeeArray) {
			System.out.println(employee);
		}
		// Állapítsuk meg, hogy kinek a legmagasabb a fizetése.
		Employee employeeWithHighestSalary=employeeArray[0];
		for (int i = 1; i < employeeArray.length; i++) {
			if(employeeWithHighestSalary.hasBiggerSalary(employeeArray[i])){
				employeeWithHighestSalary=employeeArray[i];
			}
		}
		System.out.println("legmagasabb fizetés: "+employeeWithHighestSalary);
		
		
		//Számoljuk meg, hogy hány alkalmazott fizetése esik egy megadott intervallumba.
		int count = 0;
		for (Employee employee : employeeArray) {
			if(employee.isBetweenSalary(400, 1093577983)) {
				count++;
			}
		}
		System.out.println(count+ " alkalmazott fizetése esik a megadott intervallumba");
		//Számítsuk ki az alkalmazottak átlagfizetését.
		double averageSalary=0;
		for (Employee employee : employeeArray) {
			averageSalary+=employee.getSalary();
		}
		averageSalary=averageSalary/10.0;
		System.out.println("Átlagfizetés: "+averageSalary);
		//Számítsuk ki az alkalmazottak által befizetett adó összértékét.
		double sumTax=0;
		for (Employee employee : employeeArray) {
			sumTax+=employee.getTax();
		}
		System.out.println("Összes adó: "+(long)sumTax);
	}

}
