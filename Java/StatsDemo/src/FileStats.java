//  To calculate the statistics on a file of numbers

import java.io.*;          // for I/O classes
import java.util.Scanner;  // for the Scanner class

public class FileStats
{
   private double mean; //the arithmetic average
   private double stdDev;//the standard deviation

   //Constructor calls calculateMean and calculateStdDev methods
   //and store the results in the respective instance variables
   public FileStats(String filename) throws IOException
   {
      mean = calculateMean(filename);
      stdDev = calculateStdDev(filename);
   }

   //returns the mean
   public double getMean()
   {
      return mean;
   }

   //returns the standard deviation
   public double getStdDev()
   {
      return stdDev;
   }

   //returns the calculated arithmetic average
   public double calculateMean(String filename)throws IOException
   {
      //Create a File object passing it the filename
      File file = new File(filename);
      //Create a Scanner object passing it the File object.
      Scanner input = new Scanner(file);

      double total = 0;   //the sum of the numbers
      int count = 0;     //the number of numbers added

      //loop that continues until you are at the end of the file
      while (input.hasNext())
      {
         //convert the line into a double value and add the value to the sum
         total += input.nextDouble();
         //increment the counter
         count++;
      }

      //close the input file
      input.close();

      //return the calculated mean
      return total/count;
   }

   //returns the calculated standard deviation
   public double calculateStdDev(String filename)throws IOException
   {
      //Create a File object passing it the filename
      File file = new File(filename);
      //Create a Scanner object passing it the File object.
      Scanner input = new Scanner(file);

      double total = 0;   //the sum of the numbers
      int count = 0;     //the number of numbers added
      double difference; //difference between the value and the mean

      //loop that continues until you are at the end of the file
      while (input.hasNext())
      {
         //convert the line into a double value and subtract the mean
         difference = input.nextDouble()- mean;

         //add the square of the difference to the sum
         total += Math.pow(difference,2);

         //increment the counter
         count++;
      }

      //close the input file
      input.close();

      //return the calculated mean
      return Math.sqrt(total/count);

   }
}