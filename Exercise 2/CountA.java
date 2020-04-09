import java.util.Scanner;
public class CountA//start of class
{
   public static void main (String[]args)//start of main method
   {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the String to count A's :");
      String str=scan.nextLine();
      int stringLength= str.length();
      int count=0;//count stores the number of times 'A' is encountered in the string
      int i=0;//check all the characters of the string
      while(i<str.length())
      {
         if(str.charAt(i)=='A'||str.charAt(i)=='a')
         {
            count++;
         }
       i++;
      }//end while loop
       System.out.println("The number of character 'A' found :" + count);
    }//end of main method
}//end of class
