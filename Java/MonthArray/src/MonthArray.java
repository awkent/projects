
public class MonthArray 
{
	public static void main(String[] args)
	{
		final int MONTHS = 12;
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		
		//int[] days = new int[MONTHS];
		//days[0] = 31;
		
		for(int i=0; i<MONTHS; i++)
		{
			System.out.println("Month " + (i+1) + " has " + days[i] + " days.");
		}
		
		int[] numbers = {3,6,9};
		
		//enhanced for loop
		for(int val : numbers)
		{
			System.out.println("The next value is " + val);
		}		
	}
	
}
