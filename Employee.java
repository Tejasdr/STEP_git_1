/*
To Create the Class Employee
*/

public class Employee{

	public int employee_id;
	public String name;
	public int basic_salary;
	
	Employee (int employee_id, String name, int basic_salary){
		
		this.employee_id = employee_id;
		this.name = name;
		this.basic_salary = basic_salary;
	}
	
	public void ShowDetails (Employee e){
		
		System.out.println("Empployee id :- " + e.employee_id + "\tName :- " + e.name + "\tNet Salary :- " + e.basic_salary);
	}	
	
	// Overriding the toString
	public String toString(){
		
		return "Employee id\t" + employee_id + " Name\t" + name + " Net salary\t" + basic_salary;
	}		
	
	public static void main (String args[]){
		
		Manager m = new Manager (00, "Me", 25000);
		Marketing_executive mk = new Marketing_executive (01, "MK", 30000, 240);
		
		// Displaying with show method 
		m.ShowDetails(m);
		mk.ShowDetails(mk);
		System.out.println("End of the execution of ShowDetails method");
		System.out.println();
		
		// Displaying with overridden "Display()" method in respective classes
		m.Display();
		mk.Display();
		System.out.println("End of execution of Display method");
		
		// Using the toString method
		System.out.println(m);
		System.out.println(mk);
		System.out.println("End of Program");
		
	}
}





	
	