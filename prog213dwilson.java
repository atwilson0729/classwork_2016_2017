/*
 * Program: Weather Forecasting
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: November 12th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: 
 *What I learned: 
 *Difficulties: 
 */
import java.util.*;
import java.text.*;
public class prog213dwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        int check, error;
        double chirps, fahrenheit, celsius;
        boolean yes = false;
        String condition = "";
        fahrenheit = 0;
        chirps = 0;
        error = 0;
        do
        {
            //makes sure user enters right stuff
            do
            {
                //user enters quantity
                System.out.print("Enter cricket chirps per minute: ");
                chirps = kb.nextDouble();
                //check out me fancy codin' eh ; also this assigns case
                fahrenheit = (chirps + 40) / 4;
                check = fahrenheit >= 109 ? 4 : (fahrenheit >= 81 ? 3 : (fahrenheit >= 65 ? 2: (fahrenheit >= 45 ? 1 : 0))) ;   
                //checks the case
                switch ( check )
                {
                    case 1:
                    error = 1;
                    condition = "Bur-rrr";
                    break;
                
                    case 2:
                    error = 1;
                    condition = "Take a jacket";
                    break;
                
                    case 3:
                    error = 1;
                    condition = "Ah-hhh";
                    break;
                
                    case 4:
                    error = 1;
                    condition = "Whew";
                    break;
                    
                    case 0:
                    error = 1;
                    condition = "Dead cricket";
                    break;
                
                    default:
                    error = 0;
                }
                //if user is incapable of numbers
                if (error == 0)
                {
                    System.out.println("Please enter a number.");
                }
            } 
            while (error == 0);
            //prints the price and total
            System.out.println("Fahrenheit: " + fahrenheit);
            celsius = ((fahrenheit - 32) * 5) / 9;
            System.out.println("Celsius: " + celsius);
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

**/  
