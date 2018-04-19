package hu.iit.uni.miskolc.oop;

public class Person {
	private Name name;
	private int age;

	public Person(Name name, int age) {
		this.name = name;
		this.age = age;
	}

	public Name getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + ", " + age;
	}

	public static class Name {
		private String firstname;
		private String familyname;

		public Name(String familyname, String firstname) {
			this.familyname = familyname;
			this.firstname = firstname;
		}

		@Override
		public String toString() {
			return familyname + " " + firstname;
		}
	}
}
