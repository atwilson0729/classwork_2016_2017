/*
 * Program: Egg Mystery
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: October 29, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program finds the amount of eggs in a basket
 *What I learned: How to use modulo thingies better
 *Difficulties: None
 */
import java.util.*;
import java.text.*;
import java.util.Scanner.*;
public class prog230hwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        boolean complete = false;
        int numEggs = 0;
        while (complete == false)
        {
            numEggs++;
            if (numEggs % 2 == 1)
            {
                if (numEggs % 3 == 2)
                {
                    if (numEggs % 4 == 3)
                    {
                        if (numEggs % 5 == 4)
                        {
                            if (numEggs % 6 == 5)
                            {
                                if (numEggs % 7 == 0)
                                {
                                    {
                                        complete = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("The basket contains " + numEggs + " eggs.");
    } 
}
/**sample output
The basket contains 119 eggs.
**/  