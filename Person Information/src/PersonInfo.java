
public class PersonInfo extends PersonSalary{

	private String name;
	private String contact;
	private String nationality;
	private String gender;
	
/*	public PersonInfo(String status) {
		super(status);
		
	}*/

	public PersonInfo(String status, String name, String contact, String nationality, String gender) {
		super(status);
		this.name = name;
		this.contact = contact;
		this.nationality = nationality;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo(){
		System.out.println("Person Name: "+name);
		System.out.println("Contact Number: "+contact);
		System.out.println("Nationality: "+nationality);
		System.out.println(name+"'s salary is " );
	}
	
}
