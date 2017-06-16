public class Marketing_executive extends Employee{
	
	double kilometer; 
	
	Marketing_executive(int employee_id, String name, int basic_salary, int kilometer){
		super(employee_id, name, basic_salary);
		this.kilometer = kilometer;
	}

	double tour_allowance = (kilometer/5.0);
	int telephone_allowance = 1500;
	double gross_salary = basic_salary + (double )telephone_allowance + tour_allowance;

	public void Display(){
		System.out.println("Empployee id :- " + employee_id + "\tName :- " + name + "\tNet Salary :- " + basic_salary + "\tGross Salary:- " + gross_salary);
		System.out.println("Kilometer\t" + kilometer + "  Tour Allowance\t" + tour_allowance + "  Telephone Allowance\t" + telephone_allowance);
		System.out.println();
	}
	
}