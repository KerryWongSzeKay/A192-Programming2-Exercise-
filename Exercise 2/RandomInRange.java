import java.util.Scanner;
import java.util.Random;//import scanner and random
public class RandomInRange//start of class
{
   public static void main(String[]args)//start of main method
   {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the Lower Limit :");
      int lower= scan.nextInt();
 
      System.out.print("Enter the Upper Limit :");
      int upper=scan.nextInt();
      new RandomInRange(lower,upper);
   }//end of main method

   public RandomInRange(int lower, int upper)//start of RandomInRange constructor
   {
      int rng=(lower>upper)?0:lower+
      new Random(System.currentTimeMillis()).nextInt((upper-lower)+1);
      System.out.println("The Random Number : "+rng);//display random number
   }//end of constructor
}//end of class

      
      