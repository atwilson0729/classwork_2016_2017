/*
 * Program: Batter Up
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: September 15th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program uses math functions provided by a 'coach' to help
 *find the batting average of baseball players and their On Base Percentage
 *What I learned: How to cast correctly
 *Difficulties: Casting all of the integers to doubles that could be used for 
 *math
 */
import java.util.*;
public class batterup
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //declaration of variables
        int hits, timesatbat, walks;
        double batAvg, onbasePercent;
        String playerName;
        //print and input
        System.out.print("Enter a name: ");
        playerName = keyboard.next();
        System.out.print("Enter number of times at bat: ");
        timesatbat = keyboard.nextInt();
        System.out.print("Enter number of hits: ");
        hits = keyboard.nextInt();
        System.out.print("Enter number of walks: ");
        walks = keyboard.nextInt();
        
        //calculations
        batAvg = ((double)hits / (double)timesatbat) - walks;
        onbasePercent = (double)(hits + walks) / (double)timesatbat;
        
        //round the numbers
        batAvg = (int)(batAvg*1000.0+.5)/ 1000.0;
        onbasePercent = (int)(onbasePercent*1000.0+.5)/ 1000.0;
        //print
        System.out.println("Player " + playerName + " has a  \nbatting average of " + batAvg + " and an \nOn Base Percentage of " + onbasePercent + "%");
    }
}
/**sample outputs of different values
Enter a name: Lukas
Enter number of times at bat: 3
Enter number of hits: 9
Enter number of walks: 1
Player Lukas has a  
batting average of 2.0 and an 
On Base Percentage of 3.333%
**/  
