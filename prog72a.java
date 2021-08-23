/*
 * Program: Identity
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: September 22th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program calculates the letter that needs to be added on to
 *a credit card number based off of the numbers included using numerical values
 *of ASCII characters
 *What I learned: How to convert from an integer to a character
 *Difficulties: Figuring out how much I would have to add to the remainder after
 *%26 to make it correspond with proper ASCII values
 */
import java.util.*;
public class prog72a
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner keyboard = new Scanner(System.in);
        int firstTwo, secondTwo, thirdTwo, fourthTwo, letterNum;
        char lastLetter;
        //print and input
        System.out.print("Enter the credit card number (XX XX XX XX): ");
        firstTwo = keyboard.nextInt();
        secondTwo = keyboard.nextInt();
        thirdTwo = keyboard.nextInt();
        fourthTwo = keyboard.nextInt();
        
        //calculations
        letterNum = firstTwo + secondTwo + thirdTwo + fourthTwo;
        letterNum = letterNum % 26;
        lastLetter = (char)(letterNum + 65);
        //print
        System.out.println("The correct number and code is " + firstTwo + " " + secondTwo + " " + thirdTwo + " " + fourthTwo + " " + lastLetter);
        
    }
}
/**sample output
Enter the credit card number (XX XX XX XX): 16 26 26 26
The correct number and code is 16 26 26 26 Q
Enter the credit card number (XX XX XX XX): 26 54 74 56
The correct number and code is 26 54 74 56 C
Enter the credit card number (XX XX XX XX): 26 26 26 26
The correct number and code is 26 26 26 26 A
Enter the credit card number (XX XX XX XX): 26 54 74 55
The correct number and code is 26 54 74 55 B
**/  