/*
 * Program: Summing some numbers
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: October 1st, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program prints out numbers between to numbers given by the user,
 *then gives the sum and averages of those numbers
 *What I learned: How to use a do while loop
 *Difficulties: You have to put a semicolon after the condition in a Do While
 */
import java.util.*;
import java.text.*;
public class prog122q
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        int startVal, endVal, sum, numbers;
        double average;
        //input
        System.out.print("Enter starting value: ");
        startVal = kb.nextInt();
        System.out.print("Enter ending value: ");
        endVal = kb.nextInt();
        //first loop
        numbers = startVal;
        sum = 0;
        do
        {
            System.out.println(numbers);
            sum += numbers;            
            numbers++;
        }
        while(numbers <= endVal); 
        average = (double)sum / (endVal - startVal + 1);
        System.out.println("Sum of the numbers " + startVal + "..." + endVal + " is " + sum);
        System.out.println("The average of the numbers " + startVal + "..." + endVal + " is " + average);
    }
}
/**sample output
Enter starting value: 5
Enter ending value: 8
5
6
7
8
Sum of the numbers 5...8 is 26
The average of the numbers 5...8 is 6.5
Enter starting value: -1
Enter ending value: 5
-1
0
1
2
3
4
5
Sum of the numbers -1...5 is 14
The average of the numbers -1...5 is 2.0
Enter starting value: 2
Enter ending value: 6
2
3
4
5
6
Sum of the numbers 2...6 is 20
The average of the numbers 2...6 is 4.0
Enter starting value: 2
Enter ending value: 9
2
3
4
5
6
7
8
9
Sum of the numbers 2...9 is 44
The average of the numbers 2...9 is 5.5
Enter starting value: 1
Enter ending value: 4
1
2
3
4
Sum of the numbers 1...4 is 10
The average of the numbers 1...4 is 2.5

**/  
