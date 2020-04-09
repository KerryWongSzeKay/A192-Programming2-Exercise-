import java.util.Scanner;
public class PrintReverse//start of class
{
   public static void main (String[]args)//start of main method
   {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the Spring : ");
      String str=scan.nextLine();
      int stringLength=str.length();
      char reverse;
      for(int i=0;i<str.length();i++)
      {
         reverse=str.charAt(str.length()-i-1);
         System.out.print(reverse);
      }//end for loop
    }//end of main method
  }//end of class
      