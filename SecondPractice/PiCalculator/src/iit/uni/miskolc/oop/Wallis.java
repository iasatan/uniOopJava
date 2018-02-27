package iit.uni.miskolc.oop;

public class Wallis {
	/**
	 * Calculates PI using the Wallis formula
	 * @param args
	 */
	public static void main(String[] args) {
		double pi = 1;
		for (double i = 1; i < 1000; i++) {
			pi *= ((2 * i / (2 * i - 1) * (2 * i) / (2 * i + 1)));
		}
		System.out.println("pi using 1000 iterations: "+pi * 2);
		pi = 1;
		for (double i = 1; i < 10000; i++) {
			pi *= ((2 * i / (2 * i - 1) * (2 * i) / (2 * i + 1)));
		}
		System.out.println("pi using 10000 iterations: "+pi * 2);

	}

}
