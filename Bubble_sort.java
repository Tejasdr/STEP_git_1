// To perform bubble sort 

public class Bubble_sort
{
		
	public static void main(String []args)
	{
			int a[] = {1,3,21,33,45,9};
			int temp;
			
			for (int i = 0; i < (a.length-1); i++)
			{
				for (int j = 0; j < (a.length - i - 1 ); j++)
				{
						if (a[j]>a[j+1])
						{
							temp = a[j];
							a[j] = a[j+1];
							a[j+1] = temp;
						}
					
				}
			}
			
		System.out.println("Printing the Bubble sort :");
			for (int i = 0 ; i < a.length ; i++)
				System.out.println(a[i] + " ");
			
	
	}
	
}	