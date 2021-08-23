
/**
 * this class will work as a string manipulator
 * 
 * @author Andrew Wilson
 * @author Lukas Newman
 * @version 2/13
 */
public class Replacer
{
    private String str;
    private StringBuilder strBuild;
    
    public Replacer (String s)
    {
        str = new String(s);
        strBuild = new StringBuilder(s);
        
    }
    
    public String replace(char c, String s)
    {
        for (int i = 0; i < strBuild.length(); i++)
        {
            if (strBuild.charAt(i) == c)
            {
                strBuild.deleteCharAt(i);
                strBuild.insert(i, s);
            }
        }
        return strBuild.toString();
    }
    
    public String getOriginal()
    {
        return str;
    }
    
    public String getConverted()
    {
        return strBuild.toString();
    }
    
    public void setString(String s)
    {
        str = new String(s);
        strBuild = new StringBuilder(s);
    }
}
