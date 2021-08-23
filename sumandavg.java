/*
 * Andrew Wilson
 * Date: 9/8/2015
 * Weddington High School
 * prog54b program
 *
 * Description:  This program uses 4 given number to find the sum of all four and then the average of all 4
 * Difficulties:  
 * What I Learned:  
 */
public class sumandavg
{
    public static void main (String[] args)
    {
        double num1,num2,num3,num4, average, sum;
        //give the numbers values
        num1 = 475.0;
        num2 = 821.0;
        num3 = 369.0;
        num4 = 562.0;
        //calculates sum
        sum = num1 + num2 + num3 + num4;
        //calculates average
        average = sum / 4;
        //rounds the average to the tenth place (will most likely come out different than what instructions say because they didn't round)
        average = (int)(average*10+.5)/10.0;
        System.out.println("Thank you for entering your four numbers! \n Your results are: \n The sum of the four numbers is " + sum + " and the average is " + average);        
    }
}
/**sample output
Thank you for entering your four numbers! 
 Your results are: 
 The sum of the four numbers is 2227.0 and the average is 556.8
**/  