import java.util.Scanner;
public class PayrollDemo 
{
    public static void main(String[] args)
    {
        Employee employ = new Employee();
        employ.input();
        Payroll pay = new Payroll(employ.grossPay,employ.stateTax,employ.federalTax);
        pay.calculateNetPay();
        pay.printOutput();
    }
}

class Employee
{
   double employeeID, grossPay, stateTax, federalTax;

    public void input()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your employee ID number : ");
        employeeID = console.nextDouble();
        System.out.print("Enter your Gross Pay          :RM ");
        grossPay = console.nextDouble();
        System.out.print("Enter your State Tax          :RM ");
        stateTax = console.nextDouble();
        System.out.print("Enter your Federal Tax        :RM ");
        federalTax = console.nextDouble();
    }
}
class Payroll
{
    private double grossPay, stateTax, federalTax, netPay;

    public Payroll(double grossPay,double stateTax,double federalTax)
    {
        this.grossPay = grossPay;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
    }

    public double calculateNetPay()
    {
        return netPay = grossPay-stateTax-federalTax;
    }

    public void printOutput()
    {
        System.out.printf("%nNet pay is : RM %.2f", calculateNetPay());
    }
} 