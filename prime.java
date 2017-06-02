// To Print the if a number is prime or not

public class prime{
	
public static void main(String args[])
	{
		int a = 10	;
		int b[ ] = {1,2,3,4,5};
		int flag = 0 ;
		
		for (int i = 2; i < a; i++)
		{
			if( (a%i) == 0)
					flag = 1; 
		}	
		if (flag == 1) 
			System.out.println( a + "Its not a prime number");
		else 
			System.out.println(a + "Its a prime number");
		//flag = 0; //re-instialising the flag
		
		// Checking prime check for numbers in an array
		System.out.println("printing for array of {1,2,3,4,5}");
		
		for (int i = 0; i < 5; i++)
		{	flag = 0;
			if( b[i] == 1){
				System.out.println("Neither prime nor composite");
				continue;
			}
			
			for (int j = 2; j < b[i]; j++)
			{
				if( (b[i]%j) == 0 )
				flag = 1;
			}
				
		if (flag == 1)
				System.out.println("Its not a prime number");
		else 
				System.out.println("Its a prime number");
			
		}	
	}
}	