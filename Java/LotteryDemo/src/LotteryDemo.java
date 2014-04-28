package Lottery;
import java.util.Scanner;

public class LotteryDemo 
{
	public static void main(String[] args)
	{
		int lotto_size = Lottery.NUM_DIGITS;
		
		int[] userPicks = new int[lotto_size];
		
		int matching; //holds number of matching
		
		Scanner keyboard = new Scanner(System.in);
		
		//Create a lottery object
		Lottery lotto = new Lottery();
		
		//get user picks
		for (int i=0; i<lotto_size; i++)
		{
			System.out.print("Enter digit " + (i+1) + " : ");
			userPicks[i] = keyboard.nextInt();
			//setup a validation to test for negative nums and
			//ones that are greater than 9
			while (userPicks[i]<0 || userPicks[i]>9)
			{
				System.out.println("That number is WRONG! Select a number between (0-9) : ");
				userPicks[i] = keyboard.nextInt();
			}
		}
		
		//Compare user picks to lottery winning numbers
		matching = lotto.numMatching(userPicks);
		
		//Show the wimming lottery numbers
		System.out.print("Winning numbers: ");
		int[] winningNums = lotto.copy();
		
		for (int i=0; i<lotto_size; i++)
		{
			System.out.print(winningNums[i] + " ");
		} 
		System.out.println();		
		
		System.out.println("You have " + matching + " matching numbers");
		
		if(matching == lotto_size)
		{
			System.out.println("GRAND PRIZE WINNER!");
		}
	}
}
