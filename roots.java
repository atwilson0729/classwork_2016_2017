/*
 * Program: Roots
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: September 15th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program uses the quadratic equation to find the roots of
 *a function whose values of A, B, and C (for Ax^2 + Bx + C). 
 *What I learned: How to write the quadratic formula to fit Java's ways
 *Difficulties: Figuring out how to make the quadratic do the math properly
 */
import java.util.*;
public class roots
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner keyboard = new Scanner(System.in);
        double A, B, C;
        double root1, root2;
        
        //print and input
        System.out.println("Quadratic Equation Solver");
        System.out.print("Enter A, B, and C all on one line: ");
        A = keyboard.nextInt();
        B = keyboard.nextInt();
        C = keyboard.nextInt();

        //calculations
        root1 =(-B + (Math.sqrt((B*B - ((4 * A * C))))))/ (2.0 * A);
        root2 =(-B - (Math.sqrt((B*B - ((4 * A * C))))))/ (2.0 * A);
        
        //print
        System.out.println("The roots are: " + root1 + ", " + root2);
    }
}
/**sample outputs of different values
Quadratic Equation Solver
Enter A, B, and C all on one line: 1 5 6
The roots are: -2.0, -3.0
Quadratic Equation Solver
Enter A, B, and C all on one line: 1 1 -2
The roots are: 1.0, -2.0
Quadratic Equation Solver
Enter A, B, and C all on one line: 1 1 -6
The roots are: 2.0, -3.0
**/  