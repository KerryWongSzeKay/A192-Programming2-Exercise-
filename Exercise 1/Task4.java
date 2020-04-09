import java.util.Scanner;
public class Task4
{
   public static void main(String [] args)
   {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter a four-digit numbers: ");//ask user input the 4-digit number
      String strNum=input.nextLine();
      String strNumber="";//declare the strNumber as string
      int total=0;//declare total as int
      for(int i=0;i<strNum.length();i++)
      {
         System.out.println(strNum.charAt(i));//display the number in one digit per line
         strNumber=String.valueOf(strNum.charAt(i));//convert character to string
         total=total+Integer.parseInt(strNumber);//calculate the total of the digits
      }
      System.out.println("The sum of the digit: "+total);//display the total
    }
}
         
      
      
   