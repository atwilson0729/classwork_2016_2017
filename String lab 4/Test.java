
/**
 * This class runs the main method
 * 
 * @author Andrew Wilson
 * @auther Lukas Newman
 * @version 2/13
 */
import java.util.*;
public class Test
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        String str;

        System.out.print("Enter a string: ");
        str = new String(kb.nextLine());

        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.contains("e"));
        System.out.println(str.contains("ay"));
        int num = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'e')
            {
                num++;
            }
        }
        System.out.println(num);
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.indexOf("e", str.indexOf("e")));
        num = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if ((str.charAt(i) == ' '))
            {
                num++;
            }
        }
        System.out.println(str.length() - num);
        System.out.println(str + " you know");
        System.out.println(str.toUpperCase());
        String subStr = new String(str.substring(0, 5));
        System.out.println(subStr);
        System.out.print(str.replace('a', 'x'));
    }
}
