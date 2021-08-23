import java.util.*;
public class Driver
{
    public static void main (String [] args)
    {
        //all local variables
        Scanner kb = new Scanner(System.in);
        
        int inNumber;
        double inPriceOfOne;
        double inDiscount;
        double finalCost;
        ItemSale mySales;
        
        System.out.println("You will be asked to enter the price of an item, \nthe number of items you are purchasing \nand the discount percent.\n\n");
        System.out.print("Please Enter the price of the item: ");
        inPriceOfOne = kb.nextDouble();
        
        System.out.print("How many items are you buying: ");
        inNumber = kb.nextInt();
        System.out.print("What discouunt percent are you using: ");
        inDiscount = kb.nextDouble();
        
        mySales = new ItemSale();
        mySales.setCost(inPriceOfOne);
        mySales.setNumberOfItems(inNumber);
        mySales.setDiscount(inDiscount);
        
        finalCost = mySales.getFinalCost();
        
        System.out.println("Your final cost is $" + finalCost);
    }
}