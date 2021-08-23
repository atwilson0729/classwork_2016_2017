/*
 * Program: Challenging crossing cumbers
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: October 7, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: Prints x's into the shape of an x 21 rows tall
 *What I learned: Better use of for loops
 *Difficulties: There were like 15 variables within for loops and it took about 2 hours to get them all to cooperate
 */
import java.util.*;
import java.text.*;
import java.util.Scanner.*;
public class prog168hwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        //builds the upper part of the x, stops at row 10
        for (int r = 1; r <=10; r++) 
        { 
            //puts the spaces between the edge and the first x
            for (int b =  r; b >= 1; b--) 
            { 
                System.out.print(" "); 
            } 
            System.out.print("x"); 
            //puts the spaces between the first x and the second
            for (int b = 2 * r + 1; b <= 21; b++) 
            { 
                System.out.print(" "); 
            } 
            System.out.print("x"); 
            System.out.println(); 
        }

        //puts the spaces in for the 11th row before the x
        for (int e = 1; e < 12; e++)
        {
            System.out.print(" ");
        }
        System.out.print("x\n");
        //builds the lower part of the x, rows 12 through 21
        for(int r = 12; r<22; r++) 
        { 
            //puts the spaces between the edge and the first x
            for(int c = r; c<22; c++) 
            { 
                System.out.print(" "); 
            } 
            System.out.print("x"); 
            //puts the spaces between the first x and the second
            for(int y = 2 * r; y>24; y--) 
            { 
                System.out.print(" "); 
            } 
            System.out.print("x"); 
            System.out.println(); 
        }

    } 
}
/**sample output
 x                   x
  x                 x
   x               x
    x             x
     x           x
      x         x
       x       x
        x     x
         x   x
          x x
           x
          xx
         x  x
        x    x
       x      x
      x        x
     x          x
    x            x
   x              x
  x                x
 x                  x

**/  
