
public class PersonSalary {
	private String status;
	private int FT;
	private int PT;
	
	
	public PersonSalary(String status) {
		this.status = status;
		FT = 4000;
		PT = 1000;
	}

	public String getStatus() {
		return status;
	}

	public void calculateSalary(){
		if (status.equals("FT")){
			System.out.println("The employee's salary is: $"+FT+"NZD");
		}
		else if(status.equals("PT")){
			System.out.println("The employee's salary is $" +PT+ "NZD");
		}
	}

	public void displaySalary(){
	 calculateSalary();
	}
}
