// To Create a overloaded class 

public class Adder{
	
	void add (int num1, int num2){
		
		int sum = num1 + num2;
		System.out.println("The Sum of two nos. is :- " + sum);
	}

	void add (float num1, float num2){
		
		float sum = num1 + num2;
		System.out.println("The sum of the two nos. is :- " + sum);
	}

	void add (String s1, String s2){
		
		String sum = s1 + s2;
		System.out.println("The concatenated result is :- " + sum);
	}

	public static void main (String []args){
		
		Adder var = new Adder();
		
		var.add(10,20);
		var.add(10.0f,30.0f);
		var.add("Hello","STEP");
	}
}	