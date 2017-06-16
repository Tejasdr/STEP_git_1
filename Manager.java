public class Manager extends Employee{

	Manager(int employee_id,String name, int basic_salary){
			
		super(employee_id, name, basic_salary);
	}

	double  pet_allowance = 0.08 * basic_salary;
	double food_allowance = 0.13 * basic_salary;
	double other_allowance = 0.03 * basic_salary;
    double gross_salary = basic_salary + pet_allowance + food_allowance + other_allowance;
	
	public void Display(){
		System.out.println("Empployee id :- " + employee_id + "\tName :- " + name + "\tNet Salary :- " + basic_salary + "\tGross Salary  " + gross_salary);
		System.out.println("Petrol Allowance \t" + pet_allowance + "  Food Allowance \t" + food_allowance + "  Other Allowance \t" + other_allowance);
		System.out.println();
	}
	
}