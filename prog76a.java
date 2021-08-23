/*
 * Program: Number Manipulation
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: September 21th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program does a trick with numbers by performing math on an integer
 *given by the End User
 *What I learned: You have to use long to make a long integer because the integers limit
 *will mess with answers
 *Difficulties: Lining it up to look hand done
 */
import java.util.*;
public class prog76a
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner keyboard = new Scanner(System.in);
        int userNum;
        //print and input
        System.out.print("Please enter an Integer between 1 and 9 that you dislike: ");
        userNum = keyboard.nextInt();
        
        //calculations
        
        
        //print
        System.out.println("                          " + userNum);
        System.out.println("                          x9");
        System.out.println("                   __________");
        System.out.println("                       " + userNum * 9);
        System.out.println("                    x12345679");
        System.out.println("                   __________");
        System.out.println("Surprise            " +  userNum * 9 * 12345679);
        System.out.println("                    x1000");
        System.out.println("                   __________");
        System.out.println("\"No Surprise\"       " + (long)(((userNum * 9) * 12345679) * 1000.0));
       
        
        
    }
}
/**sample output

**/  