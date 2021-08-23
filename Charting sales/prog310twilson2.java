/*
 * Description: This class is called from the main method to create a figure for sales and then print the graph
 * Author: Andrew Wilson
 * version: 1.0
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog310twilson2
{
    /*
     * Generates the sales figures based on specific regulations
     * Post: prints the sales and then runs the histogram method
     */
    public static void randomVal(int day, int sales)
    {
        Random rand = new Random();
        if (day == 2 || day == 9 || day == 16 || day == 23 || day == 30)
        {//if it's a monday the random val is under 50000 but at least 30000
            sales = rand.nextInt(20000) + 30000;
        }
        else if (day == 3 || day == 10 || day == 17 || day == 24 || day == 31)
        {//if it's a tuesday the random val is under 50000 but at least 20000
            sales = rand.nextInt(30000) + 20000;
        }
        else if (day == 7 || day == 14 || day == 21 || day == 28)
        {//if it's a saturday the random val is under 15000 but at least 10000
            sales = rand.nextInt(5000) + 10000;
        }
        else
        {//wednesdays and thursdays and fridays are between 10000 and 40000
            sales = rand.nextInt(40000) + 10000;
        }
        System.out.print("\t");
        System.out.print(sales);
        histogram(sales);
    }
    /*
     * Takes the sales figure and graphs it
     * Post: prints an asterisk for every $1000 in sales
     */    
    public static void histogram(int sales)
    {
        System.out.print("\t");
        for (int i = 1; i <= (sales / 1000); i++)
        {//this prints an asterisk for each $1000 in sales
            System.out.print("*");
        }
    }

}
/**sample output

**/  
