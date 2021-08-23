/*
 * Program: Circle
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: September 9th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program prints the radius, area, and circumference of a circle.
 *It does this using difference formulas for a circle.
 *What I learn: There is no exponent method in Java
 *Difficulties: Making sure my math worked out
 */
public class circle
{
    public static void main (String[] args)
    {
        //i do declare
        double radius, area, circumference;
        double pi;
        //give numbers their values
        pi = 3.14159;
        radius = 3.712;
        //calculations
        area = pi * (radius * radius);
        circumference = 2 * pi * radius;
        //round the numbers
        radius = (int)(radius*1000.0+.5)/1000.0;
        area = (int)(area*1000.0+.5)/1000.0;
        circumference = (int)(circumference*1000.0+.5)/1000.0;     
        
        //print
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumference of the circle = " + circumference);
        
        
    }
}
/**sample output
The Radius of the circle = 3.712
The Area of the circle = 43.288
The Circumference of the circle = 23.323

**/  