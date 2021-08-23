/*
 * Program: Population Growth
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: October 6th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: Calculates the year that the population will double using a loop
 *What I learned: How to better use a while loop
 *Difficulties: Getting the numbers to not be weird, also the numbers get off halfway through but 
 *that makes no sense so idk
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog162bwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        int year;
        DecimalFormat twoDigits = new DecimalFormat("000.");
        double rate, population;
        population = 236;        
        year = 2010;
        //input from user
        System.out.print("Enter the annual growth rate without '%': ");
        rate = kb.nextDouble();
        rate = rate / 100.0;
        System.out.println();
        //format stuff
        System.out.println("--------Growth Rate " + (rate * 100.0) + "% annually--------");
        System.out.println("Year\tPopulation (in millions)");    
        //calculations
        while (population <= 472)
        {
            year++;
            population = population + (population * rate);
            population = (int)(population/1.0+.5)/1.0;
            System.out.println(year + "\t" + twoDigits.format(population));
        }
        System.out.println("The population will double by the year " + year);
        
    }
    
    
}
/**sample output
Enter the annual growth rate without '%': 2.9

--------Growth Rate 2.9% annually--------
Year	Population (in millions)
2011	243.
2012	250.
2013	257.
2014	264.
2015	272.
2016	280.
2017	288.
2018	296.
2019	305.
2020	314.
2021	323.
2022	332.
2023	342.
2024	352.
2025	362.
2026	372.
2027	383.
2028	394.
2029	405.
2030	417.
2031	429.
2032	441.
2033	454.
2034	467.
2035	481.
The population will double by the year 2035
Enter the annual growth rate without '%': 3

--------Growth Rate 3.0% annually--------
Year	Population (in millions)
2011	243.
2012	250.
2013	258.
2014	266.
2015	274.
2016	282.
2017	290.
2018	299.
2019	308.
2020	317.
2021	327.
2022	337.
2023	347.
2024	357.
2025	368.
2026	379.
2027	390.
2028	402.
2029	414.
2030	426.
2031	439.
2032	452.
2033	466.
2034	480.
The population will double by the year 2034
--------Growth Rate 10.0% annually--------
Year	Population (in millions)
2011	260.
2012	286.
2013	315.
2014	347.
2015	382.
2016	420.
2017	462.
2018	508.
The population will double by the year 2018

**/  
