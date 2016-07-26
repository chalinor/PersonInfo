
public class PersonSalary {
	private String status;
	private int FT;
	private int PT;
	
	
	public PersonSalary(String status) {
		this.status = status;

		FT = 6000;
		PT = 3000;

	}

	public void calculateSalary(){
		if (status.equals("FT")){
			FT = FT*2; //updated salary formula
			System.out.println("The employee's salary is: $"+FT+"NZD");
		}
		else if(status.equals("PT")){
			PT = FT/3; //updated part salary formula
			System.out.println("The employee's salary is $" +PT+ "NZD");
		}
	}

	public void displaySalary(){
	 calculateSalary();
	}
}
