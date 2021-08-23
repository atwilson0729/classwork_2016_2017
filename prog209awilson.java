/*
 * Program: Weird wages
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: November 15th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program calculates wages based of a weird set of rules
 *What I learned: working salary is nice
 *Difficulties: For some reason I couldn't get the cash from over 40 hours
 *to just add straight to the week total, so I had to make a seperate variable
 *that added on at the end. Makes no sense that it wouldn't add properly
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog209awilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        Scanner inFile = null;
        int t;
        t = 11;
while (10 < t < 100)
{
    t++;
}
        int count, overFourty, weektotalHours, hours, mon, tues, wed, thurs, fri, sat, sun;
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        double monWage, tuesWage, wedWage, thursWage, friWage, satWage, sunWage;
        double weekTotal;
        weekTotal = 0;
        weektotalHours = 0;
        overFourty = 0;
        count = 1;
        weekTotal = 0;
        mon = 0;
        tues = 0;
        wed = 0;
        thurs = 0;
        fri = 0;
        sat = 0;
        sun = 0;
        monWage = 0;
        tuesWage = 0;
        wedWage = 0;
        thursWage = 0;
        friWage = 0;
        satWage = 0;
        sunWage = 0;
        
        //get file
        try 
        {
            // Create a scanner to read the file, file name is parameter
            inFile = new Scanner (new File("prog213a.dat"));
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
        //reads the file 
        while (inFile.hasNext())
        {
            mon = inFile.nextInt();
            tues = inFile.nextInt();
            wed = inFile.nextInt();
            thurs = inFile.nextInt();
            fri = inFile.nextInt();
            sat = inFile.nextInt();
            sun = inFile.nextInt();
            weektotalHours =  (mon + tues + wed + thurs + fri + sat + sun);
            if (weektotalHours > 40)
            {
                overFourty = 15 *(weektotalHours - 40);
            }
            monWage = 30 * mon;
            if (mon > 8)
            {
                monWage += 25.50 * (mon - 8);
            }
            tuesWage = 30 * tues;
            if (tues > 8)
            {
                tuesWage += 25.50 * (tues - 8);
            }
            wedWage = 30 * wed;
            if (wed > 8)
            {
                wedWage += 25.50 * (wed - 8);
            }
            thursWage = 30 * thurs;
            if (thurs > 8)
            {
                thursWage += 25.50 * (thurs - 8);
            }
            friWage = 30 * fri;
            if (fri > 8)
            {
                friWage += 25.50 * (fri - 8);
            }  
            satWage = 30 * sat;
            if (sat > 8)
            {
                satWage += 25.50 * (sat - 8);
            }         
            satWage = 2.25 * satWage;
            sunWage = 30 * sun;
            if (sun > 8)
            {
                sunWage += 25.50 * (sun - 8);
            }
            sunWage = 1.5 * sunWage;
            weekTotal = monWage + tuesWage + wedWage + thursWage + friWage + satWage + sunWage + overFourty;
            System.out.println("Hours Worked: " + mon + " " + tues + " " + wed + " " + thurs + " " + fri + " " + sat + " " + sun);
            System.out.println("Week #" + count + " $" + twoDigits.format(weekTotal));
            System.out.println();
            count++;
            overFourty = 0;
        }
        System.out.println("\n\nEnd of reading from file.");
        // close the file
        inFile.close();
    }       
}
/**sample output
Hours Worked: 9 8 10 8 9 9 5
Week #1 $2581.88

Hours Worked: 7 8 8 8 0 8 9
Week #2 $2033.25

Hours Worked: 6 10 5 0 0 0 0
Week #3 $681.00



End of reading from file.

**/  
