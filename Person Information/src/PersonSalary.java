
public class PersonSalary {
	private String status;
	private int FT;
	private int PT;
	
	
	public PersonSalary(String status) {
		this.status = status;
		FT = 4000;
		PT = 1000;
	}

	public void displaySalary(){
		if (status.equals("FT")){
			System.out.println("The employee's salary is: $"+FT+"NZD");
		}
		else if(status.equals("PT")){
			System.out.println("The employee's salary is $" +PT+ "NZD");
		}
	}
}
