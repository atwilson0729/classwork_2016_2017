/*
 * Program: Digit Extractor
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: January 25th, 2016
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: 
 *What I learned: 
 *Difficulties: 
 */
import java.util.*;
import java.text.*;
public class prog321ewilson
{
    public static void main (String [] args)
    {
        //declare variables and get input
        int num;
        int option;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number (0 to 999): ");
        DigitExtractor.getNum();
        System.out.println("Options:");
        System.out.println("1) Units \n2) Tens \n3) Hundreds \n4) Thousands \n5) Quit");
        
        System.out.print("Which digit? ");
        option = DigitExtractor.getOption();
        
        switch (option)
        {
            case 1: 
                DigitExtractor.getNum();
                break;
            
            default:
                System.out.println("Invalid. Retry a number 1 - 5");
                break;
        }
    }
}