/*
 * Program: Still below minimum wage
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: October 7, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: Calculates the wages for differing amounts of employees for 
 *different amounts of hours worked
 *What I learned: better use of for loops
 *Difficulties: no problems
 */
import java.util.*;
import java.text.*;
import java.util.Scanner.*;
public class prog166dwilson
{
    public static final double rate = 8;
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner keyboard = new Scanner(System.in);
        int wages;
        //first loop is for each amount of employees
        for (int i = 3; i < 8; i++)
        {
            //second loop is for each amount of hours worked
            System.out.println("Wages for " + i + " employees\n");
            for (int h = 10; h <= 40; h+=10)
            {
                wages = (int)rate * h * i;
                System.out.println("For " + h + " hours worked, the wages are " + wages + " dollars");
            }     
            System.out.println();
        }       
    }
}
/**sample output
Wages for 3 employees

For 10 hours worked, the wages are 240 dollars
For 20 hours worked, the wages are 480 dollars
For 30 hours worked, the wages are 720 dollars
For 40 hours worked, the wages are 960 dollars

Wages for 4 employees

For 10 hours worked, the wages are 320 dollars
For 20 hours worked, the wages are 640 dollars
For 30 hours worked, the wages are 960 dollars
For 40 hours worked, the wages are 1280 dollars

Wages for 5 employees

For 10 hours worked, the wages are 400 dollars
For 20 hours worked, the wages are 800 dollars
For 30 hours worked, the wages are 1200 dollars
For 40 hours worked, the wages are 1600 dollars

Wages for 6 employees

For 10 hours worked, the wages are 480 dollars
For 20 hours worked, the wages are 960 dollars
For 30 hours worked, the wages are 1440 dollars
For 40 hours worked, the wages are 1920 dollars

Wages for 7 employees

For 10 hours worked, the wages are 560 dollars
For 20 hours worked, the wages are 1120 dollars
For 30 hours worked, the wages are 1680 dollars
For 40 hours worked, the wages are 2240 dollars

**/  
