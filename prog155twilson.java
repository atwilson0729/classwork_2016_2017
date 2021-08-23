/*
 * Program: Finding Sum and Average
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: October 6th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: Finds the sum for variables in a file
 *What I learned: how to read the files
 *Difficulties: none
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog155twilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        Scanner inFile = null;
        int sum, numScores, scores;
        double average = 0;
        numScores = 0;
        sum = 0;
        //get file
        try 
        {
            // Create a scanner to read the file, file name is parameter
            inFile = new Scanner (new File("ints.dat"));
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
        System.out.println("Scores");
        //reads the file 
		while(inFile.hasNext()) // returns false at end of file
		{
			// read and print the next integer
			scores = inFile.nextInt();
			sum += scores;
			System.out.println(scores);
			numScores++;
		}
		average = (double)sum / numScores;
		average = (int)(average*10.0+.5)/10.0;
		System.out.println("The sum of the numbers = " + sum);
		System.out.println("The number of scores = " + numScores);
		System.out.println("The average of the scores = " + average);
		// close the file
		inFile.close();
    }
    
    
}
/**sample output
Scores
3
8
1
13
18
15
7
17
1
14
0
12
3
2
5
4
The sum of the numbers = 123
The number of scores = 16
The average of the scores = 7.7

**/  
