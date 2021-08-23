import java.io.*; 
import java.util.*; 
import java.lang.*;
public class ReadFile
{
    public static void main(String [ ] args) throws IOException 
    {
        Scanner input;
        String str = new String();
        String vowels = "aeiouAEIOU";
        
        
        int eCount = 0;
        int letterCount = 0;
        int vowelCount = 0;
        int spaceBeforeCount = 0;
        input = new Scanner(new File("textytext.txt")); 
        
        while(input.hasNext()) 
        {
            str = input.nextLine();
            System.out.println(str.toUpperCase());
            letterCount += str.length();
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == 'e' || str.charAt(i) == 'E')
                {
                    eCount++;
                }
                if (vowels.contains(str.substring(i, i+1)))
                {
                    vowelCount++;
                }

                if (i > 0 && !Character.isSpaceChar(str.charAt(i)) && Character.isSpaceChar(str.charAt(i - 1)))
                {
                    spaceBeforeCount++;
                }

            }

        }   
        System.out.println("Num of e's: " + eCount);
        System.out.println("Num of vowels: " + vowelCount);
        System.out.println("Num of characters: " + letterCount);
        System.out.println("Num of character preceeded by spaces: " + spaceBeforeCount);

        
        input.close( );
    }
}
