/*
 * Program: Power and Light
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: September 22th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program calculates multiple costs on an electricity bill
 *based off of the number of KWH used.
 *What I learned: First time using the formatter thingy and it workd pretty well
 *Difficulties: making sure my calculations were in order so that they computed
 *correctly
 */
import java.util.*;
import java.text.*;
public class prog93a
{
    public static final double costPerhour = .0475;
    public static final double surcharge = .1;
    public static final double cityTax = .03;
    public static final double latePen = .04;
    public static void main (String[] args)
    {
        NumberFormat formatter = new DecimalFormat("#0.00");     
        //declaration of variables
        Scanner keyboard = new Scanner(System.in);
        int hoursUsed;
        double cost, costTotal, surchargeFee, taxFee, lateFee;
        //print and input
        System.out.print("Enter KWH used: ");
        hoursUsed = keyboard.nextInt();     
        //calculations
        cost = hoursUsed * costPerhour;
        surchargeFee = cost * surcharge;
        taxFee = cost * cityTax;
        //round these before they are actually used
        cost = (int)(cost*100.0+.5)/100.0;
        surchargeFee = (int)(surchargeFee*100.0+.5)/100.0;
        taxFee = (int)(taxFee*100.0+.5)/100.0;       
        //calculate final costs
        costTotal = cost + taxFee + surchargeFee;
        lateFee = costTotal * latePen;
        lateFee = (int)(lateFee*100.0+.5)/100.0; 
        lateFee = lateFee + costTotal;
        //print
        System.out.println(" \t C O M P S C I  Electric");
        System.out.println("----------------------------------------");
        System.out.println("Kilowatts Used \t" + hoursUsed + " @ $" + costPerhour);
        System.out.println("----------------------------------------");
        System.out.println("Base Charge \t \t \t $" + formatter.format(cost));
        System.out.println("Surcharge   \t \t \t $" + formatter.format(surchargeFee));
        System.out.println("City Tax    \t \t \t $" + formatter.format(taxFee));
        System.out.println("\t \t \t \t ______");
        System.out.println("Pay this amount \t \t $" + formatter.format(costTotal));
        System.out.println("After May 20th pay \t \t $" + formatter.format(lateFee));
    }
}
/**sample output
Enter KWH used: 993
 	 C O M P S C I  Electric
----------------------------------------
Kilowatts Used 	993 @ $0.0475
----------------------------------------
Base Charge 	 	 	 $47.17
Surcharge   	 	 	 $4.72
City Tax    	 	 	 $1.42
	 	 	 	 ______
Pay this amount 	 	 $53.31
After May 20th pay 	 	 $55.44
**/  