/*
 * Program: If then student classifier
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: November 10th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This programs determines the grade code of a student based
 *off of how many credits they have
 *What I learned: How to use switch case statements better
 *Difficulties: None
 */
import java.util.*;
import java.text.*;
public class prog213cwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        int check, studentNum, code;
        double credits;
        boolean yes = false;
        credits = 0;
        code = 0;
        do
        {
            //makes sure user enters right stuff
            do
            {
                System.out.print("Enter student number: ");
                studentNum = kb.nextInt();
                //user enters quantity
                System.out.print("Enter credits: ");
                credits = kb.nextDouble();
                //check out me fancy codin' eh ; also this assigns case
                check = credits >= 90 ? 4 : (credits >= 70 ? 3 : (credits >= 30 ? 2: (credits >= 1 ? 1 : 0))) ;   
                //checks the case
                switch ( check )
                {
                    case 1:
                    code = 1;
                    break;
                
                    case 2:
                    code = 2;
                    break;
                
                    case 3:
                    code = 3;
                    break;
                
                    case 4:
                    code = 4;
                    break;
                
                    default:
                    code = 0;
                }
                //if user is incapable of numbers
                if (code == 0)
                {
                    System.out.println("Please enter a positive number.");
                }
            } 
            while (code == 0);
            //prints the price and total
            System.out.println("Grade level code: " + code);
            boolean inputWrong = true;
            //checks if the user would like to continue
            do
            {
                System.out.print("Do again? (Y/N) ");
                String continueInput = kb.next();
                //yay
                if (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("yes"))
                {
                    yes = true;
                    inputWrong = false;
                } 
                //nay
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
                System.out.println();
            }
            while (inputWrong == true);  
        }
        while (yes ==  true);
        System.out.println("Complete.");
    }
}

/**sample output
Enter student number: 2352
Enter credits: 30.0
Grade level code: 2
Do again? (Y/N) yes

Enter student number: 3639
Enter credits: 29.9
Grade level code: 1
Do again? (Y/N) yes

Enter student number: 4007
Enter credits: 70
Grade level code: 3
Do again? (Y/N) yes

Enter student number: 4915
Enter credits: 103.7
Grade level code: 4
Do again? (Y/N) no

Complete.

**/  
