
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry
{
    public static final double pi = 3.14159;
    public static double areaCircle(double radius)
    {
        if (radius < 0)
        {
            printError();
            return 0;
        }
        else
        {
            return (pi * (radius * radius));
        }
    }
    public static double areaRect(double length, double width)
    {
        if (length < 0 || width < 0)
        {
            printError();
            return 0;
        }
        else
        {
            return length * width;
        }
    }
    public static double areaTri(double base, double height)
    {
        if (base < 0 || height < 0)
        {
            printError();
            return 0;
        }
        else
        {
            return ((base * height) / 2);
        }
        
    }
    
    public static void printError()
    {
        System.out.println("Error, nonpositive value.");
    }
}
