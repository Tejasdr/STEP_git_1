public class Marketing_executive extends Employee{
	
	int kilometer; 
	
	Marketing_executive(int employee_id, String name, int basic_salary, int kilometer){
		super(employee_id, name, basic_salary);
		this.kilometer = kilometer;
	}

	double tour_allowance = (kilometer / 5);
	int telephone_allowance = 1500;

	public void Display(){
		System.out.println("Empployee id :- " + employee_id + "\tName :- " + name + "\tBasic Salary :- " + basic_salary);
		System.out.println("Kilometer\t" + kilometer + "  Tour Allowance\t" + tour_allowance + "  Telephone Allowance\t" + telephone_allowance);
		System.out.println();
	}
	
}