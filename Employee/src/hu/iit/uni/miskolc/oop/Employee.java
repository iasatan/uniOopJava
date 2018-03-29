package hu.iit.uni.miskolc.oop;

import java.time.LocalDate;

//Készítsen egy Alkalmazott osztályt név, kor és fizetés adatokkal.
public class Employee {
	// Legyen egy osztályszintű adattagja a nyugdíjkorhatár tárolására, értéke
	// kezdetben legyen 65.
	private static int pensionAgeLimit = 65;
	private String name;
	private Integer salary;
	private LocalDate birthDate;

	/*
	 * Legyen 2 konstruktora. Az egyik a paraméterként kapott név, kor és fizetés
	 * értékekkel inicializálja az adattagokat. A másiknak csak a nevet és a kort
	 * kell megadni, a fizetés 10000*kor.
	 */

	public Employee(String employeeName, int salary, LocalDate birthDate) {
		this.birthDate = birthDate;
		name = employeeName;
		this.salary = salary;
	}

	public Employee() {
		birthDate = LocalDate.now();
		salary = 0;
		name = "";
	}

	public Employee(String name, LocalDate birthDate) {
		this.birthDate = birthDate;
		this.name = name;
		salary = 10000 * (LocalDate.now().getYear() - birthDate.getYear());
	}

	// Legyen metódusa, amely visszadja hány éve van még nyugdíjig.
	public int yearsLeftToPension() {
		return pensionAgeLimit - (LocalDate.now().getYear() - birthDate.getYear());
	}

	// Legyen metódusa, amely String-be összefűzve adja vissza az Alkalmazott
	// adatait, hozzáfűzve a nyugdíjig hátrelevő éveinek számát is.
	@Override
	public String toString() {
		return name + ", született: " + birthDate.getYear() + ". " + birthDate.getMonthValue() + ". "
				+ birthDate.getDayOfMonth() + " ," + salary + "ft " + yearsLeftToPension() + "év van nyugdíjig";
	}

	// Legyen metódusa, amely a paraméterként kapott értékre állítja be a
	// nyugdíjkorhatárt.
	public static void setPensionageLimit(int limit) {
		pensionAgeLimit = limit;
	}

	// Legyen metódusa, amely a paraméterként kapott két Alkalmazott közül azt adja
	// vissza, amelyiknek több éve van még hátra a nyugdíjig.

	public static Employee hasMoreYearsTillPension(Employee firstEmployee, Employee secondEmployee) {
		if (firstEmployee.yearsLeftToPension() >= secondEmployee.yearsLeftToPension()) {
			return firstEmployee;
		}
		return secondEmployee;
	}

	/*
	 * adjon vissza igazat, ha a fizetés a paraméterként megadott határok közé esik,
	 * és hamisat ha nem; adja vissza a fizetendő adó értéket, ha az adókulcs 16% ;
	 * 
	 * adjon vissza igazat, ha a fizetés nagyobb, mint egy paraméterként megadott
	 * másik alkalmazotté.
	 */

	public boolean isBetweenSalary(int lowerSalary, int upperSalary) {
		if (salary < upperSalary && salary > lowerSalary) {
			return true;
		}
		return false;
	}

	public boolean hasBiggerSalary(Employee otherEmployee) {
		if (salary < otherEmployee.salary) {
			return true;
		}
		return false;

	}

	public double getTax() {
		return salary * 0.16;
	}

	public void raiseSalary(int raise) {
		salary += raise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
