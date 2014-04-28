// This class simulates a fair, standard die that is used in many games.

import java.util.Random;			// to use random number generator

public class Dice
{
   	private int spots;          	// the number of spots up on the die
		private static Random generator;// a random number generator used in
									// simulating rolling a dice, shared by all dice
									// so that it will be as random as possible.

  		//Constructor creates a single die, initially with no spots
		public Dice()
   	{
			generator = new Random();	//creates an instance of the random
   	  		spots = 0;
   	}

		//simulates rolling the die and stores the number rolled
   	public void roll()
   	{
			spots = generator.nextInt(6) + 1;	//returns 1,2,3,4,5,or 6
   	}

		//returns the value of the die
   	public int getSpots()
   	{
   	    return spots;
   	}
}
