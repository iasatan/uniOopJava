package uni.iit.miskolc;

public class Wallis {

	public static void main(String[] args) {
		double pi=1;
		for (double i = 1; i < 10000; i++) {
			pi*=((2*i/(2*i-1)*(2*i)/(2*i+1)));
		}
		System.out.println(pi*2);
		pi=0.0;
		for (int i = 0; i < 10000; i++) {
			pi+= (Math.pow(-1, i)/(2*i+1));
		}
		System.out.println(pi*4);
		System.out.println(factor(6));
		System.out.println(factor2(6));
		

	}
	
	private static int factor(int n) {
		int factor=1;
		for (int i = 1; i <= n; i++) {
			factor*=i;
		}
		return factor;
	}
	private static int factor2(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n * factor2(n-1);
		}
	}

}
