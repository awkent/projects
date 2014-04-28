package week8;

import java.util.Scanner;

public class SocSecProcessor 
{
	public static void main(String[] args)
	{
		String name, SSN;
		name = "Abe Lincoln";
		SSN = "123-45-6789";
		Scanner keyboard = new Scanner(System.in);
		int input;
		
		try 
		{
			if(isValid(SSN))
			{
				System.out.println("Name: " + name);
				System.out.println("SSN: " + SSN);
			}
		}
		catch(SocSecException sse)
		{
			System.out.println(sse);
		}
		
		try
		{
			System.out.println("Please enter an integer: ");
			input = keyboard.nextInt();
			System.out.println("You entered the value " + input);
		}
		catch(Exception ex)
		{
			System.out.println("Learn to follwo directions, thanks.");
		}
		
	}
	
	public static boolean isValid(String ssn) throws SocSecException
	{
		if(ssn.length() != 11)
			throw new SocSecException("Incorrect number of characters.");
		
		return true;		
	}
}
