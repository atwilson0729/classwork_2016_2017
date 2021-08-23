/*
 * Program: Quantity Ordering
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: November 9th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program calculates the amount you pay for a certain number of items bought
 *What I learned: How to use that other fancy decision thing and switch case
 *Difficulties: None, this code was fun
 */
import java.util.*;
import java.text.*;
public class prog213bwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        DecimalFormat twoDigits= new DecimalFormat("0.00");
        double costperItem, total;
        int check, numItems;
        costperItem = 0;
        //makes sure user enters right stuff
        do
        {
            //user enters quantity
            System.out.print("Enter the quantity off items ordered: ");
            numItems = kb.nextInt();
            //check out me fancy codin' eh ; also this assigns case
            check = numItems >= 300 ? 1 : (numItems >= 200 ? 2 : (numItems >= 100 ? 3: (numItems >= 0 ? 4 : 0))) ;   
            //checks the case
            switch ( check )
            {
                case 1:
                costperItem = 7.15;
                break;
                
                case 2:
                costperItem = 7.4;
                break;
                
                case 3:
                costperItem = 7.75;
                break;
                
                case 4:
                costperItem = 7.95;
                break;
                
                default:
                costperItem = 0;
            }
            //if user is incapable of numbers
            if (costperItem == 0)
            {
                System.out.println("Please enter a positive number.");
            }
        }
        while (costperItem == 0);
        //prints the price and total
        System.out.println("Price per item : $" + twoDigits.format(costperItem));
        System.out.println("Amount due : $" + twoDigits.format((numItems * costperItem)));
    }
}

/**sample output
Enter the quantity off items ordered: 50
Price per item : $7.95
Amount due : $397.50
Enter the quantity off items ordered: 199
Price per item : $7.75
Amount due : $1542.25
Enter the quantity off items ordered: 200
Price per item : $7.40
Amount due : $1480.00
Enter the quantity off items ordered: 475
Price per item : $7.15
Amount due : $3396.25
Enter the quantity off items ordered: -1
Please enter a positive number.
Enter the quantity off items ordered: 6
Price per item : $7.95
Amount due : $47.70

**/  
