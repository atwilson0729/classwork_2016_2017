/*
 * Program: Thinking inside the box
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: December 1th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program prints a box around user input
 *What I learned: How to do array stuff and strings
 *Difficulties: none
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog507awilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        //array of characters for thing to pull from to print for the formatting, each line is it's own char array position
        char placeHolder[] = {'*',' ',' ','*'};
        //gets the string
        System.out.print("Enter a String: ");
        String line = new String(kb.nextLine());
        //loop for each line needed
        for(int i = 0; i < 4; i++)
        {
            //prints the first and last asterisk of each line
            System.out.print("*");
            //prints for however many asterisks or spaces needed, minus the first and last one
            for(int p = 0; p < (line.length() + 2); p++)
            {
                System.out.print(placeHolder[i]);
            }
            System.out.println("*");
            //prints the user input with its asterisks on the ends
            if(i == 1)
            {
                System.out.println("* " + line + " *");
            }      
        }
    }
    
    
}
/**sample output
Enter a String: thinking
************
*          *
* thinking *
*          *
************
Enter a String: Mr. Langner is my cool teacher
**********************************
*                                *
* Mr. Langner is my cool teacher *
*                                *
**********************************
Enter a String: I
*****
*   *
* I *
*   *
*****
Enter a String: Coma the doof warrior
*************************
*                       *
* Coma the doof warrior *
*                       *
*************************

**/  
