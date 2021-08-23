
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
        MoneyConversion money = new MoneyConversion(amount, type);
        while (amount > 0)
        {
            System.out.print("Enter the amount of money: ");
            amount = input.nextDouble();
            System.out.print("Enter the type of currency: ");
            type = input.next();
            money.setMoney(amount, type);
            System.out.print("USD: " + money.getDollars() + "\nPounds: " + money.getPounds() + "\nEuros: " + money.getEuros() + "\nRiyal: " + money.getRiyals() + "\nRupee " + money.getRupees());
        }
        
    }
}
