
/**
 * This class uses basic operations to do other math functions
 * 
 * @Andrew Wilson 
 * @version 1.0
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class Mathey
{
    public static void main(String [] args)
    {
        /////////////Triangle area//////////////
        //create variables
        //to use the triangle area method, you must have both the base and the height of the triangle that you are finding
        //the area for, and you send those two numbers in, base first, then height, and it returns the area
        Scanner kb = new Scanner(System.in);        
        double tBase, tHeight, tArea;
        System.out.print("Enter the base of the triangle: ");
        tBase = kb.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        tHeight = kb.nextDouble();
        //sends numbers to triangle area finder
        tArea = triArea(tBase, tHeight);
        System.out.println("The area of the triangle is: " + tArea + "\n");
        
        /////////////Circle area////////////////
        //create variables
        //to use the circle area method, you must have the radius of the circle, and send that
        //number to the method, which returns the area
        double cRadius, cArea;
        System.out.print("Enter the radius of the circle: ");
        cRadius = kb.nextDouble();
        //sends radius to circle area finder
        cArea = circleArea(cRadius);
        System.out.println("The area of the circle is: " + cArea + "\n");
        
        /////////////Cone Solver////////////////
        //create variables
        //to use the cone solver method, you must have both the radius and height of the cone
        //the cone solver can retrieve both the volume and surface area of the cone, depending on the amount of variables you send
        //you must send two doubles, or two doubles and an integer, and you will receive
        //either the volume of the cone or the surface area
        double coneRadius, coneHeight, cVolume, cSurfaceArea;
        int side = 2;
        System.out.println("Enter the radius of the cone: ");
        coneRadius = kb.nextDouble();
        System.out.println("Enter the height of the cone: ");
        coneHeight = kb.nextDouble();
        //finds the volume
        cVolume = coneSolver(coneRadius, coneHeight);
        //finds the surface area
        cSurfaceArea = coneSolver(coneRadius, coneHeight, side);
        System.out.println("The volume of the cone is: " + cVolume + "\n");
        System.out.println("The surface area of the cone is: " + cSurfaceArea + "\n");        
        
        /////////////Radians to degrees/////////
        //create variables
        //to use the radians to degrees converter, you must have the double radians
        //this returns the degrees
        double radians, degrees;
        System.out.print("Enter the radian value as a decimal: ");
        radians = kb.nextDouble();
        //finds the degrees
        degrees = radToDeg(radians);
        System.out.println(radians + " radians to degrees is " + degrees + " degrees.\n");
        
        /////////////rect solver////////////////
        //create variables
        //to use the rectangle solver, you must have the length, the width, and the height of the rectangle
        //the rectangle solver can retrieve both the volume and surface area of the rectangle, depending on the amound of variables send to the method
        //you must send at 3 doubles, or 3 doubles and an integer for this method to function, and it will return either
        //the volume, or the surface area
        double rLength, rWidth, rHeight, rVolume, rSurfaceArea;
        int sides = 6;
        System.out.print("Enter the length of the rectangle: ");
        rLength = kb.nextDouble();
        System.out.print("Enter the width of the rectangle: ");      
        rWidth = kb.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        rHeight = kb.nextDouble();
        //finds the volume
        rVolume = rectSolver(rLength, rWidth, rHeight);
        //finds the surface area
        rSurfaceArea = rectSolver(rLength, rWidth, rHeight, sides);
        //Displays the rectangle
        System.out.println("The volume of the rectangle is: " + rVolume + "\n");
        System.out.println("The surface area of the rectangle is: " + rSurfaceArea + "\n");
    }
     /**
      * Returns the area of the triangle
      * pre: base, height
      * post: area is returned
      */    
    public static double triArea(double base, double height)
    {
        double area;
        //formula for area of a triangle        
        area = .5 * base * height;
        area = (int)(area*100.0+.5)/100.0;
        return area;
    }
     /**
      * Returns the area of the circle
      * pre: radius
      * post: area is returned
      */      
    public static double circleArea(double radi)
    {
        double pi = 3.1415;        
        double area;
        //formula for area of a circle
        area = pi * radi * radi;
        area = (int)(area*100.0+.5)/100.0;
        return area;
    }
     /**
      * Returns the volume of the cone
      * pre: radius, height
      * post: volume is returned
      */      
    public static double coneSolver(double radi, double height)
    {
        double pi = 3.1415;
        double volume;
        //formula for volume of a cone
        volume = pi * radi * radi * (height / 3);
        volume = (int)(volume*100.0+.5)/100.0;
        return volume;
    }
     /**
      * Returns the surface area of the cone
      * pre: radius, height, number of sides
      * post: surface area is returned
      */     
    public static double coneSolver(double radi, double height, int sides)
    {
        double pi = 3.1415;
        double area;
        //formula for surface area of a cone
        area = pi * radi * (radi + Math.sqrt((height * height) + (radi * radi)));
        area = (int)(area*100.0+.5)/100.0;
        return area;
    }
     /**
      * Converts the radians to degrees
      * pre: radians
      * post: degrees is returned
      */     
    public static double radToDeg(double radians)
    {
        double pi = 3.1415;
        double deg;
        //formula for radians to degrees conversion
        deg = (radians * 180.0) / pi;
        deg = (int)(deg*100.0+.5)/100.0;
        return deg;
    }
     /**
      * Returns the volume of the rectangle
      * pre: length, width, height
      * post: volume is returned
      */     
    public static double rectSolver(double length, double width, double height)
    {
        double volume;
        //formula for volume of a rectangular prism
        volume = length * width * height;
        volume = (int)(volume*100.0+.5)/100.0;
        return volume;
    }
     /**
      * Returns the surface area of the cone
      * pre: length, width, height, number of sides
      * post: surface area is returned
      */     
    public static double rectSolver(double length, double width, double height, int side)
    {
        double area;
        //formula for surface area of a rectangle
        area = ((side / 3) * length * width) + ((side / 3) * length * height) + ((side / 3) * width * height);
        area = (int)(area*100.0+.5)/100.0;
        return area;
    }
}
