/*
 * Program: Galactic Weight
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: March 3th, 2016
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program calculates the users weight on other celestial bodies
 *What I learned: How to use arrays and lookup tables better
 *Difficulties: put || instead of &&
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog432awilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        System.out.println("Convert your weight on earth to:");
        System.out.println("1. Mercury\n2. Venus\n3. Moon (not a planet)\n4. Mar\n5. Jupiter\n6. Saturn\n7. Neptune\n8. Pluto (also not a planet)\n9. Quit");
        System.out.print("Select a destination by number (or 9 to quit): ");
        int planet = kb.nextInt();
        if (planet == 9)
        {//does the exit thing
            System.exit(0);
        }
        //user input
        System.out.print("Enter your weight: ");
        int weight = kb.nextInt();
        DecimalFormat tenth = new DecimalFormat("###.#");
        double newWeight = 0;
        if (planet > 1 && planet < 9)
        {//sends to the other class for the calculations
            System.out.println("Your weight on " + weightFinder.planetName(planet) + " would be " + tenth.format(weightFinder.weight(planet, weight)) + " pounds.");
        }
        else
        {//if there's an error
            System.out.println("Error--Invalid destination");
        }
    }   
}
/**sample output
Convert your weight on earth to:
1. Mercury
2. Venus
3. Moon (not a planet)
4. Mar
5. Jupiter
6. Saturn
7. Neptune
8. Pluto (also not a planet)
9. Quit
Select a destination by number (or 9 to quit): 7
Enter your weight: 160
Your weight on Neptune would be 179.2 pounds.

Convert your weight on earth to:
1. Mercury
2. Venus
3. Moon (not a planet)
4. Mar
5. Jupiter
6. Saturn
7. Neptune
8. Pluto (also not a planet)
9. Quit
Select a destination by number (or 9 to quit): 11
Enter your weight: 160
Error--Invalid destination

**/  
