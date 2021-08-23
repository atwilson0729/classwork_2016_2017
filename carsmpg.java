/*
 * Andrew Wilson
 * Date: 9/8/2015
 * Weddington High School
 * prog54a program
 *
 * Description:  This calculates the miles per gallon rounded to the nearest tenth, given the miles driven and the gallons of gas used.
 * Difficulties:  I had to play around with numbers to figure out how to get it to round to the tenth place. 
 * What I Learned:  Since you're rounding to the tenth place, when you use the rounding algorithm you must use 10 instead of 100
 */
public class carsmpg
{
    public static void main (String[] args)
    {
        double vwmiles,vwgallons,vwmpg,firemiles,firegallons,firempg,submiles,subgallons,submpg,cutmiles,cutgallons, cutmpg;
        //miles
        vwmiles = 286.0;
        firemiles = 412.0;
        submiles = 361.0;
        cutmiles = 161.0;
        //gallons
        vwgallons = 9.0;
        firegallons = 40.0;
        subgallons = 18.0;
        cutgallons = 11.0;
        //mpg
        vwmpg = vwmiles / vwgallons;
        firempg = firemiles / firegallons;
        submpg = submiles / subgallons;
        cutmpg = cutmiles / cutgallons;
        
        //rounding
        vwmpg = (int)(vwmpg*10+.5)/10.0;
        firempg = (int)(firempg*10+.5)/10.0;
        submpg = (int)(submpg*10+.5)/10.0;
        cutmpg = (int)(cutmpg*10+.5)/10.0;
        
        
        //print
        System.out.println("1970 VW Bug averaged: " + vwmpg + " mpg");
        System.out.println("1979 Firebird averaged: " + firempg + " mpg");
        System.out.println("1980 Subaru averaged: "  + submpg + " mpg");
        System.out.println("1975 Cutlass averaged: " + cutmpg + " mpg");
    }
}
/**sample output
1970 VW Bug averaged: 31.8 mpg
1979 Firebird averaged: 10.3 mpg
1980 Subaru averaged: 20.1 mpg
1975 Cutlass averaged: 14.6 mpg
**/  