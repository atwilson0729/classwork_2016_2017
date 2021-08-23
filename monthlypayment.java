/*
 * Program: Monthly payment
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: September 21th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program calculates the monthly payments, interest, and total
 *of a loan given the time, rate, and principle of the program using a specific formula
 *What I learned: How to better use the Math.pow method
 *Difficulties: For some reason when I tried to make a seperate time variable for the months of time
 *it kept giving me the error "void cannot be converted into double" even though
 *I was assigning is a value and whatnot
 */
import java.util.*;
public class monthlypayment
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner keyboard = new Scanner(System.in);
        double principle, rate, time, monthlypayments, interestpaid, amountpaid;         
        
        //print and input
        System.out.print("The amount I wish to borrow is? ");
        principle = keyboard.nextDouble();
        System.out.print("The loan rate I can get is? ");
        rate = keyboard.nextDouble();
        System.out.print("The number of years it will take me to pay off the loan is? ");
        time = keyboard.nextDouble();
        
        //calculations
        monthlypayments = principle *(rate/1200.0)* ((Math.pow((1+(rate/1200.0)), time*12.0)) / ((Math.pow((1+(rate/1200.0)),time*12.0)) - 1));
        interestpaid = monthlypayments * (time * 12.0) - principle;
        amountpaid = interestpaid + principle;
        
        //round numbers
        monthlypayments = (int)(monthlypayments*100.0+.5)/100.0;
        interestpaid = (int)(interestpaid*100.0+.5)/100.0;
        amountpaid = (int)(amountpaid*100.0+.5)/100.0;
        
        //print
        System.out.println("My monthly payments will be $" + monthlypayments);
        System.out.println("Total Interest Paid is $" + interestpaid);
        System.out.println("Total Amount Paid is $" + amountpaid);
        
    }
}
/**sample output
The amount I wish to borrow is? 7500
The loan rate I can get is? 14.5
The number of years it will take me to pay off the loan is? 3
My monthly payments will be $258.16
Total Interest Paid is $1793.66
Total Amount Paid is $9293.66
The amount I wish to borrow is? 7500
The loan rate I can get is? 14.5
The number of years it will take me to pay off the loan is? 4
My monthly payments will be $206.83
Total Interest Paid is $2428.06
Total Amount Paid is $9928.06
The amount I wish to borrow is? 7500
The loan rate I can get is? 7.5
The number of years it will take me to pay off the loan is? 3
My monthly payments will be $233.3
Total Interest Paid is $898.68
Total Amount Paid is $8398.68
**/  