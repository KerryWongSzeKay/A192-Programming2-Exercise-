import java.util.Scanner;
public class Date
{
   public static void main (String[]args)
   {
   Scanner scan=new Scanner(System.in);
   String date,change;//declare the variable date and change as string
   System.out.print("Enter the date: ");//ask user input the date
   date=scan.next();
   change=date.replace('/','.');//replace the slash with full stop
   System.out.println(change);//display the output
   }
}
   
   