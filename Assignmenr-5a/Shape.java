// To Create an abstract class shape and override area()

abstract class Shape{
	double area(){
	
		System.out.println("This is area in abstract class");
		return 0;
	}
	
	public static void main(String args[]){
		
		/*Shape s2 = new Shape();
		C:\Users\Tejas Rajopadhye\Desktop\JAVA>javac Shape.java
        Shape.java:12: error: Shape is abstract; cannot be instantiated
                Shape s2 = new Shape();
                           ^ 
        1 error
		*/
		
		// If area is not overriden then we cannot call the area() funtion of other classes(Rectangle, Circle, etc) with the 
		// Reference of Shape class
		
		Circle c1 = new Circle(2.0);
		Rectangle r1 = new Rectangle(2.0, 4.0);
		
		System.out.println("Area of circle " + c1.area());
		System.out.println("Area of Rectangle " + r1.area());
		
		
		Shape s1 = new Circle(4.0);
		System.out.println("Area of Circle " + s1.area());
		s1 = new Rectangle(3.0, 5.0);
		System.out.println("Area of Rectangle " + s1.area());
	
	}	
}




		
			