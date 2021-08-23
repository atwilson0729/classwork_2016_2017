
/**
 * Driver class
 * This class is the driver class with a main method that runs the PayCheck class
 * 
 * @author Andrew Wilson
 * @version 2/7/2017
 */
import java.util.*;
public class Driver
{
    /**
     * This is no args main method that runs in the compiler
     *
     * @param  empty arguments string array
     * @return none
     */
     public static void main (String [] args)
    {
        //declaration of objects
        Scanner kb = new Scanner(System.in);
        PayCheck employee = new PayCheck();
        
        //declaration of variables
        String choice = new String();
        String firstName = new String();
        String lastName = new String();    
        int hoursWorked;
        double hourlyRate;
        
        do 
        {//run first then check if they want to run again
            //prompt user for input and get user input for each field of the paycheck class
            System.out.print("Enter first name: ");
            firstName = kb.next();            
            System.out.print("Enter last name: ");
            lastName = kb.next();            
            System.out.print("Enter the hours worked: ");
            hoursWorked = kb.nextInt();            
            System.out.print("Enter the hourly rate: ");
            hourlyRate = kb.nextDouble();    
            
            //sets the values in the PayCheck object to the users input
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setHoursWorked(hoursWorked);
            employee.setHourlyRate(hourlyRate);
            
            //print out the toString method for the PayCheck class
            System.out.println(employee.toString());
                   
            //prompt user to see if they want to continue
            System.out.print("Would you like to like to make any changes to the employee's information? (yes / no): ");
            choice = kb.next();
        }
        while (choice.equalsIgnoreCase("yes"));//check user's choice
        //print goodbye!
        System.out.println("Goodbye!");
    }
}
