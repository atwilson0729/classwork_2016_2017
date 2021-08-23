/*
 * Program: Donut island
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: September 14th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program calculates the number of fertile land on an island. 
 *It does this by using math formulas related to circles
 *What I learn: I learned how to make a constant
 *Difficulties: It took me a while to realize that you have to put the static
 *variable outside of the static void
 */
public class donutisland
{
    public static final double PI = 3.14159;
    public static void main (String[] args)
    {
        //declaration of variables
        double islanddiameter, islandradius, islandarea, lakeradius, lakearea, fertilelandarea;

        //give numbers their values
        islanddiameter = 4.16; //both in miles
        lakeradius = .95;
        //calculations
        islandradius = islanddiameter / 2.0; //turns the diameter into radius
        islandarea = PI * (islandradius * islandradius);
        lakearea = PI * (lakeradius * lakeradius);
        fertilelandarea = islandarea - lakearea;
        //round the number to the hundreds
        fertilelandarea = (int)(fertilelandarea*100.0+.5)/100.0;     
        
        //print
        System.out.println("Donut island with a diameter of " + islanddiameter + " miles that contains a \n circular lake of " + lakeradius + " miles has " + fertilelandarea + " square miles of \n cultivatable land."); 

        
        
    }
}
/**sample output
Donut island with a diameter of 4.16 miles that contains a 
 circular lake of 0.95 miles has 10.76 square miles of 
 cultivatable land.
**/  