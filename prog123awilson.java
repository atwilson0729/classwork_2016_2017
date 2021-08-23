/*
 * Program: Count 25 formatted numbers
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: October 7th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program prints numbers 1 - 25 in 5 rows and 5 columns
 *What I learned: How to make it skip a line
 *Difficulties: I put a semicolon after the for loop condition and it messed it up
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog123awilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        System.out.println("----Table of numbers----");
        for (int i = 1; i <= 25; i++)
        {
            System.out.print(i + "\t");
            if (i % 5 == 0)
            {
                System.out.println();
            }
        }
    }
    
    
}
/**sample output
----Table of numbers----
1	2	3	4	5	
6	7	8	9	10	
11	12	13	14	15	
16	17	18	19	20	
21	22	23	24	25	
**/  
