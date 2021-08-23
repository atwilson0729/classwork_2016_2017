import java.util.Scanner;
public class LoopPattern
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        int limit;
        System.out.print("Enter an integer to be a limit of the pattern:");
        limit = input.nextInt();
        System.out.println("Pattern A:");
        for (int i = 1; i <= limit; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");            
            } 
            System.out.print("\n");               
        }       
        System.out.print("\n");    
        System.out.println("Pattern B:");
        for (int i = limit; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");            
            } 
            System.out.print("\n");               
        }  
        System.out.print("\n");   
        System.out.println("Pattern C:");
        for (int i = 1; i <= limit; i++)
        {
            for (int j = i; j > 0; j--)
            {
                System.out.print(j + " ");            
            } 
            System.out.print("\n");               
        }             
        System.out.print("\n");                            System.out.println("Pattern D:");
        for (int i = limit; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");            
            } 
            System.out.print("\n");               
        }                                             
    }
}