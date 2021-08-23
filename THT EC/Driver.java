/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
import java.lang.*;
public class Driver
{
    public static void main(String [] args) throws IOException
    {

        Scanner input;
        PrintWriter output;
        Converter convert;
        String str;
        
        input = new Scanner(new File("inSentences.txt"));
        output = new PrintWriter(new File("outSentences.txt"));
        while(input.hasNext())
        {
            str = input.nextLine();
            System.out.println(str);
            convert = new Converter(str);
            System.out.println(convert.getConverted());
            output.println(convert.getConverted());
        }

        input.close();
        output.close();
    }
}
