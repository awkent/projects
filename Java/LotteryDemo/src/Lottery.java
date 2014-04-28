package Lottery;
import java.util.Random;

public class Lottery 
{
	//Constant for the number of digits
	public static final int NUM_DIGITS = 5;
	
	//Array to hold the lottery numbers
	private int[] lotteryNumbers;
	
	/**
	 * Constructor
	 */
	public Lottery()
	{
		lotteryNumbers = new int[NUM_DIGITS];
		Random rand = new Random();
		
		for(int i=0; i<NUM_DIGITS; i++)
		{
			lotteryNumbers[i] = rand .nextInt(9);
		}
	}
	/*
	 * numMatching method
	 * Returns the number of digits in the
	 * users pick that match the winning numbers
	 */
	
	public int numMatching(int[] picks)
	{
		int num = 0; //accumulate # of matching
		
		for(int i=0; i<NUM_DIGITS; i++)
		{
			if(picks[i] == lotteryNumbers[i])
			{
				num++;
			}
		}
		return num;
	}
	
	/*
	 * copy method
	 */
	
	public int[] copy()
	{
		int[] arr = new int[NUM_DIGITS];
		
		for (int i=0; i<NUM_DIGITS; i++)
		{
			arr[i] = lotteryNumbers[i];
		}
		
		return arr;
	}
}
