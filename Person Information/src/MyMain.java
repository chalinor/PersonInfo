
public class MyMain {

	public static void main(String[] args) {
		PersonInfo person1 = new PersonInfo ("PT", "John Doe", "0123456", "Italian", "Male");
		person1.displayInfo();
		person1.displaySalary();
		
		System.out.println();
		
		PersonInfo person2 = new PersonInfo ("FT","Jane Clark", "987456", "Canadian", "Female");
		person2.displayInfo();
		person2.displaySalary();
		
		PersonInfo person3 = new PersonInfo ("FT","Nick Ross", "0124565", "French", "Male");
		person3.displayInfo();
		person3.displaySalary();
		
	}

}
