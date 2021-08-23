
/**
 * This class finds the weight, and also gives the name
 * 
 * @Andrew Wilson 
 * @Version 1.0
 */
public class weightFinder
{
    public static double weight(int planet, int weight)
    {
        double [] factor = {.27, .85, .16, .38, 2.64, 1.17, 1.12, .25};
        double newWeight = 0;
        //calculates the weight
        newWeight = weight * factor[planet - 1];   
        return newWeight;
    }
    public static String planetName(int planet)
    {
        //returns the name of the planet
        String [] planets = {"Mercury", "Venus", "Moon", "Mars", "Jupiter", "Saturn", "Neptune", "Pluto"};
        return planets[planet - 1];
    }
}
