
/**
 * This class plays with the string builder class
 * 
 * @author Lukas Newman, Andrew Wilson, Kaleb Wainright, Branden Miller
 * @version 2/9
 */
import java.util.*;
public class StringTesting
{
    public static void main (String [] args)
    {
       
        Scanner kb = new Scanner(System.in);
        int uni;
        System.out.print("Enter a string: ");
        String str = new String(kb.nextLine());
        StringBuilder strBuild = new StringBuilder(str);
        
        for (int i = 0; i < strBuild.length(); i++)
        {
            uni = str.charAt(i);
            strBuild.setCharAt(i, (char)(uni + 1));
        }
        System.out.println(str);
        System.out.println(strBuild);
    }
}
