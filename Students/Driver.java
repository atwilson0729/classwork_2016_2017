import java.io.*;
import java.util.*;

/**
 * This is a driver class used to
 * test the methods of the Student class
 * in learning about equals( ) amd compareTo( )
 * 
 * @author 
 * @version v1
 */
public class Driver
{

    public static void main(String[ ] args)throws IOException
    {
        Student s1; //reference variable will hold the address of a Student object
        Student s2; //reference variable will hold the address of a Student object
        Student s3; //reference variable will hold the address of a Student object
        //write the code to create the three Student objects using the constructor that accepts all the values
        s1 = new Student("Wilson", "Andrew" , 800800803, 4.0, 75);
        s2 = new Student("Newman", "Lukas", 123890098, 3.75, 90);
        s3 = new Student("Wainwright", "Kaleb", 189734789, 3.97, 57);

        if (s1.equals(s3))
        {
            System.out.println(s1.toString() + " is considered equal to " + s3.toString());
        }
        else
        {
            System.out.println(s1.toString() + " is not considered equal to " + s3.toString());
        }
        //Write the code to determine the "greatest" Student object using the compareTo( ) method
        //Write the code to determine the "least" Student object using the compareTo( ) method
        if (s1.compareTo(s2) > 0 && s1.compareTo(s3) > 0)
        {
            System.out.println(s1.toString() + " is the greatest");
        }
        else if (s2.compareTo(s1) > 0 && s2.compareTo(s3) > 0)
        {
            System.out.println(s2.toString() + " is the greatest");            
        }
        else
        {
            System.out.println(s3.toString() + " is the greatest");            
        }
        
        
        if (s1.compareTo(s2) < 0 && s1.compareTo(s3) < 0)
        {
            System.out.println(s1.toString() + " is the least");
        }
        else if (s2.compareTo(s1) < 0 && s2.compareTo(s3) < 0)
        {
            System.out.println(s2.toString() + " is the least");            
        }
        else
        {
            System.out.println(s3.toString() + " is the least");            
        }

    }//end of main( )
}