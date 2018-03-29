package my.second;

import my.first.Number;

public class Main {

	public static void main(String[] args) {
		// Készítsen egy futtatható osztályt a sajat.masodik nevű csomagban, amelyben
		// létrehoz egy Számot,elynek értéke 0-1 közötti intervallumba esik, és
		// eltárolja egy final lokális változóban.
		final Number number = new Number(Math.random());
		System.out.println("Eredeti szám"+number);
		Number randomNumber = new Number(Math.random());
		int count=0;
		// Generáljon ciklusban 0-1 közötti valós számokat és írja ki azokat
		// egész addig, amíg egyezőt nem talál a létrehozott Számmal (különbségük a
		// tűrésen belül van). 
		
		while (!number.equals(randomNumber)) {
			System.out.println(randomNumber);
			randomNumber = new Number(Math.random());
			count++;
		}
		System.out.println(randomNumber);
		
		//Írja ki  hányadiknak állította elő ezt a számot.
		System.out.println(count);
		//  Próbálja ki, hogy meg tudja-e változtatni a Szám adattagjának értékét.
		System.out.println(number);
		number.setNumber(0.4);
		System.out.println(number);
		//  Próbálja ki, hogy meg tudja-e változtatni a referenciájának az értékét.
		//number = new Number(0.1);
	}

}
