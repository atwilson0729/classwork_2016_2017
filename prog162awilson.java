/*
 * Program: Small factorials
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: October 5th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program factorializes a value entered by the user
 *What I learned: How to get user input of yes or no into boolean
 *Difficulties: Making the input work and figuring out how to do factorials
 */
import java.util.*;
import java.text.*;
public class prog162awilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        int input, factorial, numbers;
        String yesno;
        boolean yes = true;
        numbers = 0;
        factorial = 1;

        //first loop
        do
        {
            System.out.print("Enter a number: ");
            input = kb.nextInt();
            for(int i = 0; i < input; i++)
            {
                 //calculations
                 factorial = factorial * (i + 1);
            }
            System.out.println("The value of " + input + "!  is " + factorial + "\n");
            factorial = 1;
            boolean inputWrong = true;
            do
            {
                System.out.print("\nWould you like to calculate another number? (Y/N) ");
                String continueInput = kb.next();
                if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("yes"))
                {
                    yes = true;
                    inputWrong = false;
                } 
                else if (continueInput.equalsIgnoreCase("n") || continueInput.equalsIgnoreCase("no")) 
                {
                    yes = false;
                    inputWrong = false;
                }
                else 
                {
                    System.out.println("Please enter yes or no");
                    inputWrong = true;
                }
            }
            while (inputWrong == true);
        }
        while(yes == true);
        System.out.println("Factorial Processing Complete.");
    }
}
/**sample output
Enter a number: 6
The value of 6!  is 720


Would you like to calculate another number? (Y/N) yes
Enter a number: 9
The value of 9!  is 362880


Would you like to calculate another number? (Y/N) yes
Enter a number: 12
The value of 12!  is 479001600


Would you like to calculate another number? (Y/N) yes
Enter a number: 7
The value of 7!  is 5040


Would you like to calculate another number? (Y/N) yes
Enter a number: 8
The value of 8!  is 40320


Would you like to calculate another number? (Y/N) yes
Enter a number: 13
The value of 13!  is 1932053504


Would you like to calculate another number? (Y/N) no
Factorial Processing Complete.

**/  
