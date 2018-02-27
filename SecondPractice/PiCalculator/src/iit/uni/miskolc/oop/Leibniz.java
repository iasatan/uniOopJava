package iit.uni.miskolc.oop;

public class Leibniz {
	/**
	 * Calculates PI using the Leibniz formula 
	 * @param args
	 */
	public static void main(String[] args) {
		double pi = 0.0;
		for (int i = 0; i < 1000; i++) {
			pi += (Math.pow(-1, i) / (2 * i + 1));
		}
		System.out.println("pi using 1000 iterations: "+pi * 4);
		pi = 0.0;
		for (int i = 0; i < 10000; i++) {
			pi += (Math.pow(-1, i) / (2 * i + 1));
		}
		System.out.println("pi using 10000 iterations: "+pi * 4);

	}

}
