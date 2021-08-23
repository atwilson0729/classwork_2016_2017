
/**
 * Write a description of class CmdLineArgs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class CmdLineArgs
{
    public static void main (String [] args) throws IOException
    {
        Scanner inFile;
        String line;
        PrintWriter outFile;

        if (args.length != 2)
        {
            System.out.println("Proper usage is CountOcc filename character");
        }
        else
        {
            inFile = new Scanner(new File(args[0]));
            outFile = new PrintWriter(new File(args[1]));
            while (inFile.hasNextLine())
            {
                line = inFile.nextLine();
                outFile.println(line);
            }
            outFile.close();
        }
        System.out.println("File copied.");
    }
}
