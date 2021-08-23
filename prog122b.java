/*
 * Program: Hourly pay
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: September 28th, 2015
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: Program calculates the pay for $4.00 an hour for each hour up to 40
 *What I learned: How to use a for loop better
 *Difficulties: none
 */
import java.util.*;
import java.text.*;
public class prog122b
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner keyboard = new Scanner(System.in);
        int hours, pay, rate;

        rate = 4;
        //print and loop
        System.out.println("Hours\tPay");
        for (int i = 0; i < 40; i++)
        {
            hours = i + 1;
            //calc
            pay = hours * rate;            
            //print
            System.out.println(hours + "\t" + pay);
        }


    }
}
/**sample output
Hours	Pay
1	4
2	8
3	12
4	16
5	20
6	24
7	28
8	32
9	36
10	40
11	44
12	48
13	52
14	56
15	60
16	64
17	68
18	72
19	76
20	80
21	84
22	88
23	92
24	96
25	100
26	104
27	108
28	112
29	116
30	120
31	124
32	128
33	132
34	136
35	140
36	144
37	148
38	152
39	156
40	160

**/  