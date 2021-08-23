
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Driver
{
    public static void main (String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("1. Calculate the area of a circle\n2. Calculate the area of a rectangle:\n3. Calculate the area of a triangle:\n4. Quit");
        int choice;
        double param1;
        double param2;
        
        do
        {
            param1 = 0;
            param2 = 0;
            System.out.print("Enter your choice: ");
            choice = kb.nextInt();
            if (choice == 1)
            {
                System.out.print("Enter the radius: ");
                param1 = kb.nextDouble();
                System.out.println("Circle area " + Geometry.areaCircle(param1));
                
            }
            else if (choice == 2)
            {
                System.out.print("Enter the length: ");
                param1 = kb.nextDouble();
                System.out.print("Enter the width: ");
                param2 = kb.nextDouble();
                System.out.println("Rectangle area " + Geometry.areaRect(param1, param2));
                
            }
            else if (choice == 3)
            {
                System.out.print("Enter the base: ");
                param1 = kb.nextDouble();
                System.out.print("Enter the height: ");
                param2 = kb.nextDouble();
                System.out.println("Triangle area " + Geometry.areaTri(param1, param2));
                
            }
            else if (choice == 4)
            {
                
            }
            else
            {
                System.out.println("Not a menu choice");
            }
        }
        while (choice != 4);
        System.out.println("Goodbye!");
        
    }
}
