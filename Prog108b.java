
/**
 * Lukas Newman
 * 9/28/2015
 * version 1.0
 * 
 */

import java.io.*;
import java.util.*;

public class Prog108b
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        
        double price, salVal, years, depreciation;
        
        for (int i = 1; i<=4; i++)
        {
            System.out.print("Run #" + i + "\nEnter Price ");
            price = kb.nextDouble();
            System.out.print("Enter Salvage Value ");
            salVal = kb.nextDouble();
            System.out.print("Esitmated Life in years ");
            years = kb.nextDouble();
            
            depreciation = (price - salVal)/years;
            depreciation = (int)(depreciation*100 + .5)/100.0;
            System.out.print("Annual Depreciation = " + depreciation + "\n\n");
            
        }
    }
}

/**
 * Sample Output
Run #1
Enter Price 250.00
Enter Salvage Value 35.00
Esitmated Life in years 8
Annual Depreciation = 26.88

Run #2
Enter Price 2425.00
Enter Salvage Value 470.00
Esitmated Life in years 6
Annual Depreciation = 325.83

Run #3
Enter Price 1162.00
Enter Salvage Value 625.00
Esitmated Life in years 5
Annual Depreciation = 107.4

Run #4
Enter Price 9654.33
Enter Salvage Value 100.00
Esitmated Life in years 12
Annual Depreciation = 796.19
 */
