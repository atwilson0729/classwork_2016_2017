
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Driver
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        Game game1;
        String cont = new String();
        
        do 
        {
            game1 = new Game();
            while (game1.checkEnd() == 0)
            {
                game1.move();
                System.out.println("Player score: " + game1.getPlayerScore());
                System.out.println("Computer score: " + game1.getCompScore());
            }
            
            if (game1.checkEnd() == 1)
            {
                System.out.println("Player wins!");
            }
            else
            {
                System.out.println("Computer wins.");
            }
            
            System.out.print("Would you like to continue? (yes/no): ");
            cont = kb.next();
        }
        while (cont.equalsIgnoreCase("yes"));
    }
}
