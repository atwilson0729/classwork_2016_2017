/*
 * Program: Avoiding Duplicates
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: March 3th, 2016
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program gets rid of duplicate numbers from a file
 *What I learned: How to use arrays better
 *Difficulties: The main for loop body was hard to do logic for
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog415hwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        Scanner inFile = null;
        int [] numbers = new int[20];
        int [] dupes = new int[20];
        boolean [] isDupe = new boolean[20];
        
        try //Finds the file specified
        {
            inFile = new Scanner(new File("prog415h.dat"));
        }
        catch(FileNotFoundException e)
        {//if file doesn't exist, returns error
            System.out.println("File not found!");
            System.exit(0);
        }
        int count = 0;
        System.out.print("The original set of numbers are: ");
        while(inFile.hasNext())
        {//while the file has more numbers
            numbers[count] = inFile.nextInt();
            System.out.print(numbers[count] + " ");
            count++;
        }   
        for (int i = 0; i < isDupe.length; i++)
        {//sets all of array to false
            isDupe[i] = false;
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++)
        {//for each number in the file
            for (int j = 0; j < i; j++)
            {//checks each number up until i 
                if (numbers[j] == numbers[i] && isDupe[i] == false)
                {//if the numbers are equal and the bool is false
                    isDupe[i] = true;
                }
            }
        }
        System.out.print("The different numbers from the set of integers are: ");
        for (int i = 0; i < numbers.length; i++)
        {//goes through each position for the boolean array
            if (isDupe[i] == true)
            {//does nothing
                
            }
            else
            {//prints the numbers
                System.out.print(numbers[i] + " ");
            }
        }
    }   
}
/**sample output
The original set of numbers are: 12 12 30 12 45 66 78 30 82 19 99 11 11 15 31 18 51 17 12 17 
The different numbers from the set of integers are: 12 30 45 66 78 82 19 99 11 15 31 18 51 17
**/  
