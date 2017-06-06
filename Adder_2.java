// To Create a overloaded class 

public class Adder_2{
	
	void add (int ...num){
		
		int sum = 0;
		System.out.println("The number of arguments is:- " + num.length);
		
		for(int i = 0; i < num.length; i++){
			sum = sum + num[i];
		}
		
		System.out.println("The sum of " + num.length + "is " + sum); 
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
		
		Adder_2 var = new Adder_2();
		
		var.add(10.0f,30.0f);
		var.add("Hello","STEP");
		var.add(1,2,3,4,5);
		var.add(2,2,3);
		var.add(20,12);
	
		
	}
}	