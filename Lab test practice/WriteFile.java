import java.util.Scanner;
import java.io.*; 

public class WriteFile
{

    public static void main(String[] args) throws IOException
    {
        String filename;      
        Scanner kb;   
        PrintWriter output; 
        String str = new String();

        kb = new Scanner(System.in);

        System.out.print("Enter the location and name of the file to write to: ");
        filename = kb.nextLine();

        output = new PrintWriter(filename);

        for (int i = 0; i < 7; i++)
        {
            System.out.print("Enter a line of text to be written to the file: ");
            str = kb.nextLine();
            output.println(str);
        }

        output.close();

        System.out.println("Input written to the file.");
    }
}
