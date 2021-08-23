/*
 * Program: Making Change Again
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: March 4th, 2016
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program calculates the change that the cashier gives to a customer
 *What I learned: How to use lookup tables better
 *Difficulties: count kept surpassing 5
 *+++++++++++++++++++++++++++++++++++++++++
 *Also kinda funny story, I had to find something to test this to make sure that the
 *amount of coins was correct, and I searched online for a coin calculator for this sort of thing
 *and couldn't find one, but on one of those math flash game websites I found a game
 *where you give the proper change, so I just put in whatever my program told me to
 *to see if I had arrived at the correct answer, so basically I made a cheat for that game!
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog600_58twilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        String [] changeNames = {"Ones", "Quarters", "Dimes", "Nickels", "Pennies"};
        //user input
        System.out.print("Enter purchase price: ");
        double price = kb.nextDouble();
        System.out.print("Enter amount given: ");
        double given = kb.nextDouble();
        System.out.println("+++++++++++++++++\nCorrect Change\n++++++++++++++++++\n");
        if (given >= price)
        {//to make sure the customer gave enough cash
            //gets the difference
            double difference = given - price;
            difference = (int)(difference*100.0+.5)/100.0;
            for (int i = 0; i < 5; i++)
            {//for each type of coin
                System.out.println(changeNames[i] + ": " + change.coinage(difference)[i]);
            }
            System.out.println("Total Amount: $" + difference);
        }
        else
        {
            System.out.println("Insufficient funds!");
        }
    }   
}
/**sample output
Enter purchase price: 10.01
Enter amount given: 20.00
+++++++++++++++++
Correct Change
++++++++++++++++++

Ones: 9
Quarters: 3
Dimes: 2
Nickels: 0
Pennies: 4
Total Amount: $9.99

**/  
