/**
 * StatsDemo class
 */
import java.util.Scanner;			//for keyboard input
import java.io.*;						//for using files

public class StatsDemo
{
	public static void main(String [] args) throws IOException
	{
		//create an object of type Decimal Format
		//create an object of type Scanner
		Scanner keyboard = new Scanner (System.in);
		String inFilename;	// the user input file name
		String outFilename;

		inFilename = "Numbers.txt";
		outFilename = "Results.txt";

		//create an object of type Stats using the user input file name
		FileStats stats = new FileStats(inFilename);

		//create an object of PrintWriter using "Results.txt".
		PrintWriter output = new PrintWriter(outFilename);

		//print the results to the output file
		output.println("mean = " + stats.getMean());
		output.println("standard deviation = " + stats.getStdDev());

		//close the output file
		output.close();
	}
}