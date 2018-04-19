package hu.iit.uni.miskolc.oop;

public class Main {
	public static void main(String[] args) {
		Person adam = new Person(new Person.Name("Satan", "Adam"), 12);
		System.out.println(adam);
		Person.Name benceName = new Person.Name("Bogdandy", "Bence");
		Person bence = new Person(benceName, 23);
		System.out.println(bence.getName());
	}
	
	

}
