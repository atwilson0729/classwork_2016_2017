
/**
 * Write a description of class Craps here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Craps
{
    public static void main (String [] args)
    {
        Scanner kb = new Scanner(System.in);
        Die die1 = new Die();
        Die die2 = new Die();
        String cont = new String();
        int sum = 0;
        int point = 0;
        boolean hasWon = false;

        do
        {
            die1.roll();
            die2.roll();
            sum = die1.getFace() + die2.getFace();
            System.out.println("Sum = " + sum);
            System.out.println(die1.toString());
            System.out.println(die2.toString()); 

            if (sum == 7 || sum == 11)
            {
                hasWon = true;
            }
            else if (sum == 2 || sum == 3 || sum == 12)
            {
                hasWon = false;
            }
            else
            {
                point = sum;
                do
                {
                    die1.roll();
                    die2.roll();
                    sum = die1.getFace() + die2.getFace();
                    System.out.println("Sum = " + sum);
                    System.out.println(die1.toString());
                    System.out.println(die2.toString()); 

                    if (sum == 7)
                    {
                        hasWon = false;
                        break;
                    }
                    else if (sum == point)
                    {
                        hasWon = true;
                    }
                }
                while (sum != point);
            }

            if (hasWon)
            {
                System.out.println("You won!!!!");
            }
            else
            {
                System.out.println("You lost.");
            }

            System.out.println("Would you like to play another game? (yes / no)");
            cont = kb.next();
        }
        while (cont.equalsIgnoreCase("yes"));

    }
}
