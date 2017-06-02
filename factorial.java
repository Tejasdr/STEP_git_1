// To print the factorial of a number

public class factorial{
	
public static void main(String args[])
		{
			int a = 5;
			int res = 1, i = 1;
			int temp = a ;
			
			
			while ( temp > 0)
			{
				res = res*i;
				i++;
				temp--;	
			}
			
			System.out.println("The factorial of " + a +  "is " + res); 
		}	
	
}	