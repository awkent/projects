package class4;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SalesAnalysis 
{
	public static void main(String[] args) throws IOException
	{
		File fileObj;
		Scanner inputFile;
		String input;
		double total = 0.0;
		double average;
		double weekSales;
		int weekNum = 0;
		
		fileObj = new File("SalesData.txt");
		inputFile = new Scanner(fileObj);
		
		while (inputFile.hasNext())
		{
			weekNum++;
			input = inputFile.nextLine();
			weekSales = getWeeklySales(input);
			average = weekSales / 7.0;
			total += weekSales;
			System.out.print("week #" + weekNum + "sales totals: $" + weekSales);
			System.out.println("\tAverage daily sales: $" + average);
		}
		
		inputFile.close();
		System.out.println("Total sales for " + weekNum + " week(s): $" + total);
		
	}
	
	public static double getWeeklySales(String data)
	{
		double weekTotal = 0.0;
		StringTokenizer sToken = new StringTokenizer(data, ",");
		
		while(sToken.hasMoreTokens())
		{
			weekTotal += Double.parseDouble(sToken.nextToken());
		}
		
		return weekTotal;
	}

}
