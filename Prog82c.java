
/**
 * Lukas Newman
 * 9/25/2015
 * version 1.0
 * Compiler/Platform: Java 1.8 Windows 7
 * Description: Find how much gas will cost you to go one way on your trip.
 * Difficulties:
 * What I learned:
 */

import java.io.*;
import java.util.*;

public class Prog82c
{
   public static void main(String args[])
   {
       //make the keyboard an object
       Scanner kb = new Scanner(System.in);
       
       //Get and store user input
       System.out.print("Enter miles to your destination (one way):");
       double miles = kb.nextDouble();
       System.out.print("Enter estimated cost of gas: $");
       double gasCost = kb.nextDouble();
       System.out.print("Enter mpg for your vehicle: ");
       double carMPG = kb.nextDouble();
       
       //calculate the total cost
       double totalCost = (miles/carMPG)* gasCost;
       totalCost = (int)(totalCost*100.0+.5)/100.0;
       
       //Display output to user
       System.out.print("\nThe cost of traveling " + miles + " miles, in a car that averages " + (int)carMPG + " mpg, \nwith gasoline cost $" + gasCost + " would be $" + totalCost + ".");
       
    }
}
/**
 * Sample output
Enter miles to your destination (one way):2974.12
Enter estimated cost of gas: $1.719
Enter mpg for your vehicle: 30

The cost of traveling 2974.12 miles, in a car that averages 30 mpg, 
with gasoline cost $1.719 would be $170.42.
 */