package hu.iit.uni.miskolc.oop.stlye;

import java.util.Random;
import java.util.Scanner;

//Készítsen egy futtatható osztályt a KönyvStílus-t magában foglaló csomag alcsomagjában.
public class Main {

	public static void main(String[] args) {
		// Ebben olvasson be n darab könyvet egy tömbbe.
		Scanner scanner = new Scanner(System.in);
		BookStyle[] booksWithStyle = new BookStyle[scanner.nextInt()];
		scanner.close();
		booksWithStyle[0]= new BookStyle("Stargate", "thor", 1996, 42, "Scifi");
		for (int i = 1; i < booksWithStyle.length; i++) {
			booksWithStyle[i] = new BookStyle("Trónok harca" + i, "George" + i + "Martin", 2000 + i, i * 1000, "fantasy" + new Random().nextInt(3));
		}
		// a) Számolja meg hányféle különböző stílusú könyv szerepel a tömbben.
		double count = 0;
		if(booksWithStyle.length>0) {
			count=1;
		}
		boolean newStyle=true;
		for (int i = 1; i < booksWithStyle.length; i++) {
			for (int j = 0; j < i; j++) {
				if(booksWithStyle[i].getStyle().equalsIgnoreCase(booksWithStyle[j].getStyle())) {
					newStyle=false;
					break;
				}
			}
			if(newStyle) {
				count+=1;
			}
		}
		System.out.println("stílusok száma: "+count);
		// b) Írja ki a "Scifi" stílusú könyvek adatait.
		for (BookStyle bookStyle : booksWithStyle) {
			if(bookStyle.getStyle().equalsIgnoreCase("scifi")) {
				System.out.println(bookStyle);
			}
		}
		
		// c) Számítsa ki a "Scifi" stílusú könyvek átlagárát.
		double avgPrice=0;
		count =0;
		for (BookStyle bookStyle : booksWithStyle) {
			if(bookStyle.getStyle().equalsIgnoreCase("fantasy1")) {
				System.out.println(bookStyle.getPrice());
				count++;
				avgPrice+=bookStyle.getPrice();
			}
		}
		System.out.println("átlag ár:"+avgPrice/count);
		// A String-ek egyezésének vizsgálatára használja a String osztály
		// boolean equalsIgnoreCase(String anotherString)
		// metódusát.

	}

}
