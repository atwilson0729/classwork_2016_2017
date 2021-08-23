/*
 * Program: mRNA
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: December 3th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program prints out all of the combinations of the 3 mRNA base pairs
 *What I learned: I realized that after the first bracket of a loop is a great place to put comments
 *Difficulties: For some reason I couldn't use a character array instead of a string array
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.io.*;
public class prog520awilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        //array of letters for the loops to pull from
        String bases[] = {"A","U","C","G"};
		for(int x = 0; x < 4; x++) 
		{ //for the first letter of each set of three letters
			for(int y = 0; y < 4; y++) 
			{ //for the second letter of each set of three letters
				for(int z = 0; z < 4; z++) 
				{ //for the third letter of each set of three letters, the the print thing prints each letter 4 times across to achieve the 4 rows
					System.out.print(bases[x] + bases[y] + bases[z] + "  ");
				}
				//makes it go to a new line
				System.out.print("\n");
			}
		}
    }
    
    
}
/**sample output
AAA  AAU  AAC  AAG  
AUA  AUU  AUC  AUG  
ACA  ACU  ACC  ACG  
AGA  AGU  AGC  AGG  
UAA  UAU  UAC  UAG  
UUA  UUU  UUC  UUG  
UCA  UCU  UCC  UCG  
UGA  UGU  UGC  UGG  
CAA  CAU  CAC  CAG  
CUA  CUU  CUC  CUG  
CCA  CCU  CCC  CCG  
CGA  CGU  CGC  CGG  
GAA  GAU  GAC  GAG  
GUA  GUU  GUC  GUG  
GCA  GCU  GCC  GCG  
GGA  GGU  GGC  GGG  
**/  
