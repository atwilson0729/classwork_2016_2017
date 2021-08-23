/*
 * Program: Bermuda Triangle
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: October 15, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: Prints a triangle out of the number of rows a user inputs
 *What I learned: How to better us for loops to make grids, also can't wait for arrays
 *Difficulties: Getting the right amount of rows to come up
 */
import java.util.*;
import java.text.*;
import java.util.Scanner.*;
public class prog166gwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        int rows;
        boolean contBool;
        rows = 4;
        //prints the number of rows across the top
        System.out.println("Number of rows for this triangle: " + rows);
        for (int r = 1; r <= rows; r++)
        {
            System.out.print(r + "\t");
        }
        System.out.print("\n");
        //prints the rows for the triangles
        for (int r = 1; r <= rows; r++)
        {
            for (int c = 1; c <= r; c++)
            {
                System.out.print(r * c + "\t");
                
            }
            System.out.print("\n");
        }
        rows = 0;
        contBool = true;
        do
        {
            System.out.print("Please enter the number of rows you would like to print: ");
            rows = kb.nextInt();
            //checks for continuity
            if (rows == 0)
            {
                contBool = false;
            }
            if (contBool == true)
            {
                System.out.println("Number of rows for this triangle: " + rows);
            }
            //prints the number of rows across the top
            for (int r = 1; r <= rows; r++)
            {
                System.out.print(r + "\t");
            }
            System.out.print("\n");
            //prints the rows for the triangles
            for (int r = 1; r <= rows; r++)
            {
                //prints the individual columns
                for (int c = 1; c <= r; c++)
                {
                    System.out.print(r * c + "\t");                
                }
                System.out.print("\n");
            }
        }
        while (contBool == true);
        System.out.println("Thank you for using this program!");
    } 
}
/**sample output
Number of rows for this triangle: 4
1	2	3	4	
1	
2	4	
3	6	9	
4	8	12	16	
Please enter the number of rows you would like to print: 2
Number of rows for this triangle: 2
1	2	
1	
2	4	
Please enter the number of rows you would like to print: 7
Number of rows for this triangle: 7
1	2	3	4	5	6	7	
1	
2	4	
3	6	9	
4	8	12	16	
5	10	15	20	25	
6	12	18	24	30	36	
7	14	21	28	35	42	49	
Please enter the number of rows you would like to print: 0

Thank you for using this program!

**/  