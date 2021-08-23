import java.util.*;
public class Driver
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        int num1, num2, den1, den2;
        System.out.print("Enter a numerator: ");
        num1 = kb.nextInt();
        System.out.print("Enter a denominator: ");
        den1 = kb.nextInt();
        System.out.print("Enter another numerator: ");
        num2 = kb.nextInt();
        System.out.print("Enter another denominator: ");
        den2 = kb.nextInt();
        
        Fraction frac1 = new Fraction(num1, den1);
        Fraction frac2 = new Fraction(num2, den2);
        
        System.out.println("added: " + frac1.add(frac2).simplify().toString());
        System.out.println("subtracted: " + frac1.subtract(frac2).simplify().toString());
        System.out.println("fraction one simplified: " + frac1.simplify().toString());
        System.out.println("fraction two simplified: " + frac2.simplify().toString());
        System.out.println("fraction one as a decimal: " + frac1.toDec());
        System.out.println("fraction two as a decimal: " + frac2.toDec());
        System.out.println("multiplied: " + frac1.multiply(frac2).toString());
        System.out.println("divided: " + frac1.divide(frac2).toString());
        
        if (frac1.compare(frac2) == 1)
        {
            System.out.println(frac1.toString() + " is greater than " +  frac2.toString());
        }
        else 
        {
            System.out.println(frac2.toString() + " is greater than " +  frac1.toString());
        }
        
        if (frac1.equals(frac2))
        {
            System.out.println("The fractions are equal.");
        }
        else
        {
            System.out.println("The fractions are not equal.");
        }
        
        System.out.println("Random fraction: " + frac1.randomFrac());
    }
}
