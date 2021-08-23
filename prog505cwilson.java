/*
 * Program: In Between
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: December 1th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program checks if words in a file are between other words
 *What I learned: How to compare strings
 *Difficulties: None
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog505cwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        Scanner inFile = null;
        String animal, walrus, dinosaur;
        walrus = "walrus";
        dinosaur = "dinosaur";
        animal = "";
        int walrusComp, dinoComp;
        walrusComp = 0;
        dinoComp = 0;
        //get file
        try 
        {
            // Create a scanner to read the file, file name is parameter
            inFile = new Scanner (new File("Prog505c.dat"));
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
        //reads the file 
        while(inFile.hasNext()) // returns false at end of file
        {
            //reads the files
            animal = inFile.nextLine();
            System.out.print(animal);
            //compares the two strings and outputs as integers
            walrusComp = animal.compareToIgnoreCase(walrus);
            dinoComp = animal.compareToIgnoreCase(dinosaur);
            //determines if the word is between dino and walrus or not
            if (walrusComp < 0 && dinoComp > 0)
            {
                System.out.print("\t\tBetween\n");
            }
            else
            {
                System.out.print("\t\tNot between\n");
            }
        }
        // close the file
        inFile.close();
    }
    
    
}
/**sample output
Vampire		Between
Monkay			Between
Elephant		Between
Ape		Not between
Lion		Between
Hippopotamus		Between
Ant		Not between
Zebra		Not between
Yak		Not between
Antelope		Not between
Dingo		Not between
Whale		Not between
Donkey		Between
Axolotl		Not between
Chupacabra		Not between
Bigfoot		Not between
Human		Between
**/  
