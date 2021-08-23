
/**
 * This class runs the Replacer class
 * 
 * @author Andrew Wilson 
 * @version 2/13
 */
import java.util.*;
public class Driver
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        Scanner kb2 = new Scanner(System.in);
        String str;

        String choice = new String();

        char rep;
        String replacement = new String();
        do 
        {
            System.out.print("Enter a  string: ");
            str = kb2.nextLine();
            Replacer r = new Replacer(str);
            System.out.println("Enter a character: ");
            rep = kb.next().charAt(0);
            System.out.println("Enter a replacement for that character: ");
            replacement = kb2.nextLine();
            r.replace(rep, replacement);
            System.out.println(r.getConverted());
            System.out.print("Would you like to continue? (yes/ no): ");
            choice = kb.next();
        }
        while (choice.equalsIgnoreCase("yes"));
    }
}
