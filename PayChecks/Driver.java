
/**
 * Creates a PayCheck instance and tests it
 * 
 * @Andrew Wilson, Lukas Newman 
 * @version 1.0
 */
import java.util.*;
public class Driver
{
    public static void main (String [] args)
    {
        //declaration of Scanner
        Scanner kb = new Scanner(System.in);
        
        //prompt user for input and set for proper variable
        System.out.print("Enter the employee name: ");
        String name = kb.next();
        System.out.print("Enter the hours worked: ");
        double hours = kb.nextDouble();
        System.out.print("Enter the pay rate: ");
        double ratePay = kb.nextDouble();
        
        //create new PayCheck object and overload constructor
        PayCheck myCheck = new PayCheck(name, ratePay, hours);
        
        
        //prints out specs from PayCheck class
        System.out.println("Employee: " + myCheck.getName());
        System.out.println("Hours Worked: " + myCheck.getHours());
        System.out.println("Rate of Pay: " + myCheck.getPay());
        System.out.println("Gross pay: S" + myCheck.getGross());
    }
}
