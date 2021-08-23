/*
 * Program: Is prime
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: December 17th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: Finds the next and last prime number around a number
 *What I learned: How to check if something is prime
 *Difficulties: None
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog335twilson
{
    /*
     * Determines if the number is prime
     * pre: n >= 2
     * post: returns true or false
     */
    public static boolean isPrime(int n)
    {
        for (int i = 2; 2 * i < n; i++) 
        {//tests if each number is prime
            if (n % i == 0)
            {//checks if it's prime
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in);
        //declaration of variables
        int n;
        int lowerPrime, upperPrime;
        String yesNo;
        boolean contBool = false;
        do
        {//repeats if user wants to calculate another thing
            System.out.print("Enter an integer greater than or equal to 2: ");
            n = kb.nextInt(); 
            lowerPrime = n;
            upperPrime = n;
            while (isPrime(lowerPrime) == false)
            {//starts with n and works it's way down to find the greatest prime number below n
                lowerPrime--;
            }
            while (isPrime(upperPrime) == false)
            {//starts with n and works it's way down to find the lowest prime number above n
                upperPrime++;
            }
            if (isPrime(n) == true)
            {//if the number itself is prime then it's n
                lowerPrime = n;
                upperPrime = n;
            }
            System.out.println("N is between the prime numbers " + lowerPrime + " and " + upperPrime);
            System.out.println("\n");
            System.out.print("Would you like to check another number? (Y/N): "); 
            yesNo = new String(kb.next());
            if (yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes"))
            {//checks if user says yes
                contBool = true;
            }
            if (yesNo.equalsIgnoreCase("n") || yesNo.equalsIgnoreCase("no"))
            {//checks if user says no
                contBool = false;
            }
        }
        while (contBool == true);
        System.out.println("Thanks!");
    }       
}
/**sample output
Enter an integer greater than or equal to 2: 23
N is between the prime numbers 23 and 23


Would you like to check another number? (Y/N): y
Enter an integer greater than or equal to 2: 24
N is between the prime numbers 23 and 29


Would you like to check another number? (Y/N): y
Enter an integer greater than or equal to 2: 32
N is between the prime numbers 31 and 37


Would you like to check another number? (Y/N): y
Enter an integer greater than or equal to 2: 43
N is between the prime numbers 43 and 43


Would you like to check another number? (Y/N): y
Enter an integer greater than or equal to 2: 56
N is between the prime numbers 53 and 59


Would you like to check another number? (Y/N): y
Enter an integer greater than or equal to 2: 13
N is between the prime numbers 13 and 13


Would you like to check another number? (Y/N): n
Thanks!

**/  
