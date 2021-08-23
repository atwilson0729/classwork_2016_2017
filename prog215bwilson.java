/*
 * Program: Faster than a speeding bullet
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: October 26, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program calculates the max height of a bullet after it 
 *is shot, and the time that it reaches this max height
 *What I learned: How to use if statements better
 *Difficulties: Getting the time that the bullet reaches it's max to display
 */
import java.util.*;
import java.text.*;
import java.util.Scanner.*;
public class prog215bwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        int height = 0; 
        int time = 0; 
        int preHeight = 0; 
        int maxHeight = 0;
        int maxTime = 0;
        int preTime = 0;
        do
        {
            height = (960 * time) - (int)(16 * Math.pow(time, 2)); 
            if(height > preHeight) 
            { 
                preHeight = height;
                preTime = time;
            } 
            else 
            { 
                maxHeight = preHeight;
                maxTime = preTime;
            } 
            time++;
        } 
        while (time <= 60);
        System.out.println("The maximum height reached by the bullet is " + maxHeight + " " + "feet after " + maxTime + " seconds."); 
    } 
}
/**sample output
The maximum height reached by the bullet is 14400 feet after 30 seconds.

**/  