import java.util.*;
public class Driver
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        double amount = input.nextDouble();
        System.out.print("Enter the type of currency: ");
        String type = input.next();
        MoneyConversion money = new MoneyConversion();
        money.setMoney(amount, type);
        String choice = "yes";
        while (choice.equalsIgnoreCase("yes"))
        {
            money.moneyToString();
            System.out.print("Would you like to calculate another?");
            choice = input.next();
            if (choice.equalsIgnoreCase("yes"))
            {
                System.out.print("Enter the amount of money: ");
                amount = input.nextDouble();
                System.out.print("Enter the type of currency: ");
                type = input.next();
                money.setMoney(amount, type);
            }            
        }
        System.out.println("Goodbye!");
    }
}
