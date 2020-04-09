import java.lang.Math;
public class MathClass//start of class
{
   public static void main(String[]args)//start of main method
   {
      int number;
		double square;
		double cube;
      
		System.out.printf("%-15s%-15s%-15s%n","Number","Square","Cube");//display string

		for (number=0;number<11;number++)
		{
			square= Math.pow(number,2);
			cube= Math.pow(number,3);
			System.out.printf("%-15d%-15.0f%-15.0f%n",number,square,cube);	//display data		
		}//end for loop
      System.out.println("\n");
	}//End of main method

} //End of class     
      
      
      
      