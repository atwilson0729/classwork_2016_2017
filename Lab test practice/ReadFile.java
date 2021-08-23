import java.io.*; 
import java.util.*; 
public class ReadFile
{
    public static void main(String [ ] args) throws IOException 
     {
         Scanner input;
         
         input = new Scanner(new File("textytext.txt")); 
         while(input.hasNext( )) 
         {
             System.out.println(input.nextLine( ));
         }   
         input.close( );
      }
}
