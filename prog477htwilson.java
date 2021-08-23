/*
 * Program: Bean Counter
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: March 25th, 2016
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program counts beans and wastes food
 *What I learned: how to use array lists
 *Difficulties: Everything

 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class prog477htwilson
{
    public static void main (String[] args)
    {
        //declaration of variables
        Scanner kb = new Scanner(System.in);
        String [] beans = {"Black", "White"};
        List <Integer> bag = new ArrayList<Integer>();
        Random rand;
        int bean = -1;
        int bean2 = -1;
        System.out.println("Beans\tBlack\tWhite\tLast");
        for (int i = 0; i <= 50; i++)
        {//for each simulation
            List<Integer> toRemove = new ArrayList<Integer>();
            for (int j = 0; j < 10 + i; j++)
            {//fills the list with random beans
                rand = new Random();
                bag.add(rand.nextInt(2));
            }
            System.out.print(bag.size() + "\t");
            int blacks = 0;
            int whites = 0;
            for (int j = 0; j < bag.size(); j++)
            {//for the bags size counts the color of the beans
                if (bag.get(j) == 0)
                {//if it's black
                    blacks++;
                }
                else
                {//if it's white
                    whites++;
                }
            }
            System.out.print(blacks + "\t" + whites + "\t");
            while (bag.size() > 1)
            {//until there's one bean left
                rand = new Random();
                bean = rand.nextInt(bag.size());
                rand = new Random();
                bean2 = rand.nextInt(bag.size());
                if (bag.get(bean) == 0 && bag.get(bean2) == 0 && bean != bean2)
                {//if both are black
                    bag.remove(bean);
                }
                else if ((bag.get(bean) == 0 && bag.get(bean2) == 1) || (bag.get(bean) == 1 && bag.get(bean2) == 0) && bean != bean2)
                {//if one is black or one is white
                    if (bag.get(bean) == 0)
                    {//chooses the black bean
                        bag.remove(bean);
                    }
                    else
                    {
                        bag.remove(bean2);
                    }
                }
                else if (bag.get(bean) == 1 && bag.get(bean2) == 1 && bean != bean2)
                {//if they're both white beans
                    if (bean < bean2)
                    {//because the second bean's index shifts
                        bag.remove(bean);
                        bag.remove(bean2 - 1);
                        bag.add(0);
                    }
                    else
                    {//if it doesn't shift
                        bag.remove(bean);
                        bag.remove(bean2);
                        bag.add(0);
                    }
                }
                else
                {//idk, the program worked when I had this in so I'm not gonna take it out and let it break
                    
                }
            }
            System.out.print(beans[bag.get(0)] + "\n");
            bag.clear();
        }
    }   
}
/**sample output
Beans	Black	White	Last
10	7	3	White
11	7	4	Black
12	7	5	White
13	5	8	Black
14	4	10	Black
15	9	6	Black
16	8	8	Black
17	8	9	White
18	10	8	Black
19	6	13	White
20	10	10	Black
21	13	8	Black
22	9	13	White
23	12	11	White
24	13	11	White
25	13	12	Black
26	13	13	White
27	14	13	White
28	16	12	Black
29	16	13	White
30	16	14	Black
31	14	17	White
32	16	16	Black
33	17	16	Black
34	20	14	Black
35	17	18	Black
36	15	21	White
37	19	18	Black
38	19	19	White
39	22	17	White
40	16	24	Black
41	21	20	Black
42	19	23	White
43	22	21	White
44	19	25	White
45	22	23	White
46	24	22	Black
47	22	25	White
48	20	28	Black
49	24	25	White
50	23	27	White
51	26	25	White
52	23	29	White
53	31	22	Black
54	27	27	White
55	28	27	White
56	22	34	Black
57	29	28	Black
58	27	31	White
59	32	27	White
60	31	29	White
**/  
