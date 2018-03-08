package hu.iit.uni.miskolc.oop;

public class Main {

	public static void main(String[] args) {
		// Hozzon létre két téglalap objektumot ("a" és "b"), és deklaráljon egy
		// harmadik referencia változót ("c"), amely értékül "a"-t veszi fel.
		
		Rectangle firstRectangle = new Rectangle(86, 42);
		Rectangle secondRectangle = new Rectangle(17);
		
		Rectangle thirdRectangle = firstRectangle;
		
		//Írja ki mindhárom referencia változó esetén a String-be összefűzött adatokat.
		System.out.println("1: "+firstRectangle);
		System.out.println("2: "+secondRectangle);
		System.out.println("3: "+thirdRectangle);
		System.out.println();
		firstRectangle.setBoth(56, 60);
		System.out.println("1: "+firstRectangle);
		System.out.println("2: "+secondRectangle);
		System.out.println("3: "+thirdRectangle);
		
	}

}
