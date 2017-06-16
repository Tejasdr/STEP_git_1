// Class Rectangle 

public class Rectangle extends Shape{

		double length, breadth;
		
		Rectangle (double length, double breadth){
			this.length = length;
			this.breadth = breadth;
		}
		
		double area(){
			return (length * breadth);
		}
}
