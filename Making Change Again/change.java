
/**
 * This class calculates the amount of coins the cashier must give to the customer
 * 
 * @Andrew Wilson 
 * @Version 1.0
 */
public class change
{
    public static int [] coinage(double difference)
    {//returns the array of the amount of each type of coin the cashier must give
        int [] coinCount = {0, 0, 0, 0, 0};//the amount of each type of coin given
        double [] coins = {1, .25, .1, .05, .01};//how much the given coins are worth
        double change = difference;//movable number
        int count = 0;
        while (change > 0 && count < 5)
        {//keeps it within array bounds
            if (change > 1)
            {//gives the ones to the customer
                coinCount[count] = (int)change / 1;
                change = change - ((int)change);
                count++;                
            }
            else if (change % coins[count] < coins[count] && coins[count] > .01)
            {//gives each coin in order of where it fits
                coinCount[count] = (int)((change / coins[count]) - (change % coins[count]));
                change = change - (coins[count] * coinCount[count]);
                count++;
            }
            else if (coins[count] == .01)
            {//pennies needed their own thing
                coinCount[count] = (int)(change / coins[count]);
                change = 0;
            }
            //rounds change after each loop because subtracting in java is really weird sometimes
            change = (int)(change*100.0+.5)/100.0;
        }
        return coinCount;
    }
}
