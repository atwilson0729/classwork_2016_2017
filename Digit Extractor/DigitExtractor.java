import java.util.*;
import java.text.*;
public class DigitExtractor
{
    public static int getNum()
    {
        int number;
        Scanner kb = new Scanner(System.in);
        number = kb.nextInt();
        return number;
    }
    public static int getOption()
    {
        int option;
        Scanner kb = new Scanner(System.in);
        option = kb.nextInt();
        return option;
    }
}