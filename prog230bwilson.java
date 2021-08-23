/*
 * Program: Ulam hypothesis
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: November 4, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program uses a hypothesis to prove that any number will eventually go to one
 *if you use certain functions
 *What I learned: More logic on nested loops
 *Difficulties: Getting it to not loop forever, so I had to use a value seperate of i
 */
import java.util.*;
import java.text.*;
import java.util.Scanner.*;
public class prog230bwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        int val;
        Scanner kb = new Scanner(System.in);
        //each of the 25 loops
        for (int i = 1; i <= 25; i++)
        {
            val = i;
            System.out.print(i + ": ");
            //does the math until the value goes to one
            do
            { 
                if(val % 2 == 0)
                {
                    val /= 2; 
                }
                else 
                {
                    val = 3 * val + 1; 
                }
                System.out.print(val + " ");
            }
            while (val != 1);
            System.out.println();
        }        
    }
}
/**sample output
1: 4 2 1 
2: 1 
3: 10 5 16 8 4 2 1 
4: 2 1 
5: 16 8 4 2 1 
6: 3 10 5 16 8 4 2 1 
7: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
8: 4 2 1 
9: 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
10: 5 16 8 4 2 1 
11: 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
12: 6 3 10 5 16 8 4 2 1 
13: 40 20 10 5 16 8 4 2 1 
14: 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
15: 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
16: 8 4 2 1 
17: 52 26 13 40 20 10 5 16 8 4 2 1 
18: 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
19: 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
20: 10 5 16 8 4 2 1 
21: 64 32 16 8 4 2 1 
22: 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
23: 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
24: 12 6 3 10 5 16 8 4 2 1 
25: 76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 

**/  