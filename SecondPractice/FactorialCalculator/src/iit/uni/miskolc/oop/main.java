package iit.uni.miskolc.oop;

public class main {

	public static void main(String[] args) {
		System.out.println(factor(6));
		System.out.println(factor2(6));
		for (int i = 1; i <= 10; i++) {
			System.out.println("factor of "+i+": "+factor(i));
		}
	}
	/**
	 * Calculates the factor of n using iteration
	 * @param n
	 * @return
	 */
	private static int factor(int n) {
		int factor = 1;
		for (int i = 1; i <= n; i++) {
			factor *= i;
		}
		return factor;
	}
	/**
	 * calculates the factor of n using recursion
	 * @param n
	 * @return
	 */
	private static int factor2(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factor2(n - 1);
		}
	}
}
