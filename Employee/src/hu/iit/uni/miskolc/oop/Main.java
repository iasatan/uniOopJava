package hu.iit.uni.miskolc.oop;

public class Main {

	public static void main(String[] args) {
		Employee adam = new Employee();
		adam.setName("Satan Adam");
		adam.setSalary(0);
		System.out.println("Employee toString: "+adam.toString());
		adam.raiseSalary(500);
		System.out.println("Employee toStrign toString kiírsa nélkül "+adam);
		System.out.println(adam.getName()+" fizetése 200 és 1000 között: "+adam.isBetweenSalary(200, 1000));
		System.out.println(adam.isBetweenSalary(1000, 2000));
		System.out.println(adam.getTax());
		Employee bence = new Employee();
		bence.setName("Bence Bogdany");
		bence.setSalary(20000);
		System.out.println(adam.getName()+" fizetése nagyobb: "+ adam.hasBiggerSalary(bence));
	}

}
