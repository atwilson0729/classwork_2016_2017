/*
 * Program: Computing Interest
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: September 16th, 2015
 * Compiler/ Platform: Java 1.8, Windows 7
 *Description: This program uses a formula to find the total interest and total
 *amount of money in the account after a certain amount of time at a certain rate
 *What I learned: How to use the Math.pow method thingy to do this sort of formula
 *Difficulties: Putting the interest formula into code
 */
import java.util.*;
public class prog54j
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //declaration of variables
        double amount, rate, principle, numDaysinaccount, numDaysperyear, totalInterest;
        //print and input
        System.out.print("Enter the original amount: ");
        principle = keyboard.nextDouble();
        System.out.print("Enter the rate of interest on the account: ");
        rate = keyboard.nextDouble();
        System.out.print("Enter the number of days compounded per year: ");
        numDaysperyear = keyboard.nextDouble();
        System.out.print("Enter the number of days the money is interested: ");
        numDaysinaccount = keyboard.nextDouble();       
        
        //calculations
        amount = principle * (Math.pow((1+((.01 * rate)/numDaysperyear)),(numDaysperyear * numDaysinaccount)/365));
        totalInterest = amount - principle;
        //round the numbers
        amount = (int)(amount*100.0+.5)/100.0;
        totalInterest = (int)(totalInterest*100.0+.5)/100.0;
        //print
        System.out.println("The interest earned is $" + totalInterest + "\nThe total amount in savings is now $" + amount);
    }
}
/**sample outputs of different values
Enter the original amount: 5000
Enter the rate of interest on the account: 11.5
Enter the number of days compounded per year: 365
Enter the number of days the money is interested: 900
The interest earned is $1638.96
The total amount in savings is now $6638.96
Enter the original amount: 10000
Enter the rate of interest on the account: 16.5
Enter the number of days compounded per year: 365
Enter the number of days the money is interested: 90
The interest earned is $415.14
The total amount in savings is now $10415.14
Enter the original amount: 1500
Enter the rate of interest on the account: 8.5
Enter the number of days compounded per year: 365
Enter the number of days the money is interested: 365
The interest earned is $133.06
The total amount in savings is now $1633.06
**/  
