
/**
 * Write a description of class ToWords here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Converter
{
    private StringBuilder orig;
    private String newStr;
    
    public Converter (String line)
    {
        orig = new StringBuilder(line);
        newStr = new String("");
        
        convert();
    }
    
    public void convert()
    {
        for (int i = 0; i < orig.length(); i++)
        {
            if (Character.isDigit(orig.charAt(i)) && i == 0 && !Character.isDigit(orig.charAt(i)))
            {
                switch (orig.charAt(i))
                {
                    case '1':
                    orig.replace(i, i + 1, "one");
                    break;
                    case '2':
                    orig.replace(i, i + 1, "two");
                    break;
                    case '3':
                    orig.replace(i, i + 1, "three");
                    break;
                    case '4':
                    orig.replace(i, i + 1, "four");
                    break;
                    case '5':
                    orig.replace(i, i + 1, "five");
                    break;
                    case '6':
                    orig.replace(i, i + 1, "six");
                    break;
                    case '7':
                    orig.replace(i, i + 1, "seven");
                    break;
                    case '8':
                    orig.replace(i, i + 1, "eight");
                    break;
                    case '9':
                    orig.replace(i, i + 1, "nine");
                    break;
                    case '0':
                    orig.replace(i, i + 1, "zero");
                    break;
                }
            }
            else if (Character.isDigit((orig.charAt(i))) && !Character.isDigit(orig.charAt(i+1)) && !Character.isDigit(orig.charAt(i-1)))
            {
                switch (orig.charAt(i))
                {
                    case '1':
                    orig.replace(i, i + 1, "one");
                    break;
                    case '2':
                    orig.replace(i, i + 1, "two");
                    break;
                    case '3':
                    orig.replace(i, i + 1, "three");
                    break;
                    case '4':
                    orig.replace(i, i + 1, "four");
                    break;
                    case '5':
                    orig.replace(i, i + 1, "five");
                    break;
                    case '6':
                    orig.replace(i, i + 1, "six");
                    break;
                    case '7':
                    orig.replace(i, i + 1, "seven");
                    break;
                    case '8':
                    orig.replace(i, i + 1, "eight");
                    break;
                    case '9':
                    orig.replace(i, i + 1, "nine");
                    break;
                    case '0':
                    orig.replace(i, i + 1, "zero");
                    break;
                }
            }
        }
        newStr = new String(orig.toString());
    }
    
    public String getConverted()
    {
        return newStr;
    }
}
