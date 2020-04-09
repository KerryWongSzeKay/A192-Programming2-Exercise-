import java.util.Scanner;
public class TriangleDemo
{
   public static void main(String[] args)
   {
      //create a Scanner object
      Scanner console = new Scanner(System.in);

      // Create a Triangle object.
      Triangle triangle =new Triangle();
      // Prompt user to input value for height and base                 
      System.out.print("Enter value for Height : ");
	   double height=console.nextDouble();
	   System.out.print("Enter value for Base : ");
	   double base=console.nextDouble();
      //Set the height and base (use mutator) 
      triangle.set(height,base);
      // Display the height, base and area (use accessor)
      System.out.println("The pyramid's height is "+triangle.getHeight());
      System.out.println("The pyramid's base is "+triangle.getBase());      
     System.out.println("The pyramid's area is "+triangle.getArea());
      
   }
}

