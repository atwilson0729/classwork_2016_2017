/*
 * Program: Wegie of stars
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: October 7, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: Prints a shape out of asterisks from the input given by users
 *What I learned: Rows goes in the first for loop, columns goes in the second
 *Difficulties: Figuring out the conditions for the for loops
 */
import java.util.*;
import java.text.*;
import java.util.Scanner.*;
public class prog165awilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        int rows, columns, size;
        //user input
        System.out.print("Enter the starting size: ");
        size = kb.nextInt();
        //loops, first loop increments the rows
        for (int r = size; r > 0; r--)
        {
            //second loop increments the columns, and prints the asterisks
            for (int c = 0; c < r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/**sample output
Enter the starting size: 7
*******
******
*****
****
***
**
*
Enter the starting size: 4
****
***
**
*

**/  
