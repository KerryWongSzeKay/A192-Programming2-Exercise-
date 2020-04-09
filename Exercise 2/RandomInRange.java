/*import java.util.Scanner;
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
}//end of class*/

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomInRange {

    public static void main(String[] args) {
        //Q4
        System.out.println("Enter 2 number: ");
        Scanner input = new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        if(num1>num2){
            System.out.println("0");
        }else {
            int randomInt = ThreadLocalRandom.current().nextInt(num1, num2 + 1);
            System.out.println("Random integer between " + num1 + " and " + num2 + ": " + randomInt);
        }
    }
}

      
      