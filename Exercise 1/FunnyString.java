import java.util.Scanner;
public class FunnyString
{
   public static void main (String[]args)
   {
   Scanner scan=new Scanner(System.in);
   String color,food,animal,name,ans;
   System.out.print("Enter a favourite color: ");//ask user input favourite color
   color=scan.nextLine();
   System.out.print("Enter your favourite food: ");//ask user input favourite food
   food=scan.nextLine();
   System.out.print("Enter a favourite animal: ");//ask user input favourite animal
   animal=scan.nextLine();
   System.out.print("Enter the first name of a friend: ");//ask user input the first name of friend
   name=scan.nextLine();
   ans="I had a dream that "+name+" ate a "+color+" "+animal+
   " and said it tasted like "+food+"!";
   System.out.println(ans);//display the output
   }
} 
   
  