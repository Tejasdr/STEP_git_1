// Class Employee

public class Employee_2 implements Printable{
	
	int id;
	String name;
	
	Employee_2(int id, String name){
		
		this.id = id;
		this.name = name;
	}	
	
	public void print(){
		
		System.out.println("Output");
		System.out.println("Employee ID " + id + "\tName " + name);
	}

	public static void main(String args[]){
		
		Employee_2 emp = new Employee_2(01, "Tejas"); 
		emp.print();
		
		Shape_2 s1 = new Shape_2();
		s1.print();
		
		Date1 d1 = new Date1("11/10/1997");
		d1.print();
	}	
	
}
	