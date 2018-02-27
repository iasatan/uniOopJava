package iit.uni.miskolc.oop;

public class TwinPrime {

	public static void main(String[] args) {
		//test prime checker
		System.out.println(isPrime(15));
		//twin primes
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				if (isPrime(i) && isPrime(j) && i + 2 == j) {
					System.out.println("i= " + i + ", j= " + j);
				}
			}

		}

	}
	/**
	 * Checks if the number whether is prime or not
	 * @param n
	 * @return
	 */
	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
