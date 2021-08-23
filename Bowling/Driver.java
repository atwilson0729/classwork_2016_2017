
/**
 * This driver class runs the bowler class
 * 
 * @author Andrew Wilson 
 * @version 1.0
 */
import java.util.*;
public class Driver
{
    public static void main (String [] args)
    {
        //Scanner obj
        Scanner kb = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        
        //declaration of variables
        Bowler b1;
        Bowler b2;
        String b1Name = new String();
        String b2Name = new String();
        int b1Age;
        int b2Age;
        int b1Score1;
        int b1Score2;
        int b1Score3;
        int b2Score1;
        int b2Score2;
        int b2Score3;
        
        //get user input for bowler 1
        System.out.print("Enter your name: ");
        b1Name = str.nextLine();
        System.out.print("Enter your age: ");
        b1Age = kb.nextInt();
        System.out.print("Enter score 1: ");
        b1Score1 = kb.nextInt();
        System.out.print("Enter score 2: ");
        b1Score2 = kb.nextInt();
        System.out.print("Enter score 3: ");
        b1Score3 = kb.nextInt();
        
        //initialization of bowler 1 object with user's input
        b1 = new Bowler(b1Name, b1Age, b1Score1, b1Score2, b1Score3);
        
        //get user input for bowler 2
        System.out.print("Enter your name: ");
        b2Name = str.nextLine();
        System.out.print("Enter your age: ");
        b2Age = kb.nextInt();
        System.out.print("Enter score 1: ");
        b2Score1 = kb.nextInt();
        System.out.print("Enter score 2: ");
        b2Score2 = kb.nextInt();
        System.out.print("Enter score 3: ");
        b2Score3 = kb.nextInt();
        
        //initialization of bowler 2 object with user's input
        b2 = new Bowler(b2Name, b2Age, b2Score1, b2Score2, b2Score3);
        
        //print out the bowlers and their averages
        System.out.println(b1Name + " has a bowling average of " + b1.calcAverage() + ".");
        System.out.println(b2Name + " has a bowling average of " + b2.calcAverage() + ".");
        
        //set a score for each bowler
        b1.setScore1(299);
        b2.setScore1(0);
        
        if (b1.calcAverage() > b2.calcAverage())
        {//if b1 wins
            System.out.println(b1Name + " has a higher average than " + b2Name + ". Their averages are " + b1. calcAverage() + " and " + b2.calcAverage() + ".");
        }
        else if (b2.calcAverage() > b1.calcAverage())
        {//if b2 wins
            System.out.println(b2Name + " has a higher average than " + b1Name + ". Their averages are " + b2. calcAverage() + " and " + b1.calcAverage() + ".");
        }
        else
        {//if they tie
            System.out.println(b1 + " and " + b2 + " have tied. Their averages are " + b1. calcAverage() + " and " + b2.calcAverage() + ".");
        }
    }
}
