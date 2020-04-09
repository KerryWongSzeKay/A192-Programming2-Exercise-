import java.util.Random;
public class Task4 //start of class
{
    public static void main(String[] args)//start of method
    {
        Random num = new Random();
        int num1 = num.nextInt(100);//random to generate number 1
        int num2 = num.nextInt(100);//random to generate number 2
        int largest = Math.max(num1,num2);
        System.out.println("First Number : "+num1);//display number 1
        System.out.println("Second Number : "+num2);//display number 2
        System.out.println("Largest Value is "+ largest);//display the largest value
    }//end of method
}//end of class