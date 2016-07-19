
public class PersonInfo {

	private String name;
	private String contact;
	private String nationality;
	
	public PersonInfo(String name, String contact, String nationality) {
		super();
		this.name = name;
		this.contact = contact;
		this.nationality = nationality;
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
	}
	
}
