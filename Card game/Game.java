
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    public static void main (String [] args)
    {
        int max = 0;
        Deck deck = new Deck();
        deck.shuffle();

        Card [] player1 = new Card[26];
        Card [] player2 = new Card[26];

        for (int i = 0; i < 26; i++)
        {
            player1[i] = deck.getCardAt(i);
        }
        for (int i = 26; i < 52; i++)
        {
            player2[i - 26] = deck.getCardAt(i);
        }        

        System.out.println("Player 1 draw: " + player1[0]);
        System.out.println("Player 2 draw: " + player2[0]);

        if (player1[0].compareTo(player2[0]) == 1)
        {
            System.out.println("Player 1 wins");
        }
        else if (player1[0].compareTo(player2[0]) == -1)
        {
            System.out.println("Player 2 wins");
        }
        else
        {
            System.out.println("\n\nIt's a war!");
            System.out.println("Player one's stakes: " + "\n" + player1[1] + "\n" + player1[2] + "\n" + player1[3]);
            System.out.println("Player two's stakes: " + "\n" + player2[1] + "\n" + player2[2] + "\n" + player2[3]);

            System.out.println("Player one's draw: " + player1[4]);
            System.out.println("Player two's draw: " + player2[4]);
            if (player1[5].compareTo(player2[5]) == 1)
            {
                System.out.println("Player 1 wins");
            }
            else if (player1[5].compareTo(player2[5]) == -1)
            {
                System.out.println("Player 2 wins");
            }
            else
            {
                System.out.println("\n\nIt's a war!");
                System.out.println("Player one's stakes: " + "\n" + player1[6] + "\n" + player1[7] + "\n" + player1[8]);
                System.out.println("Player two's stakes: " + "\n" + player2[6] + "\n" + player2[7] + "\n" + player2[8]);

                System.out.println("Player one's draw: " + player1[9]);
                System.out.println("Player two's draw: " + player2[9]);
                if (player1[10].compareTo(player2[10]) == 1)
                {
                    System.out.println("Player 1 wins");
                }
                else if (player1[10].compareTo(player2[10]) == -1)
                {
                    System.out.println("Player 2 wins");
                }
                else
                {
                    System.out.println("\n\nIt's a war!");
                    System.out.println("Player one's stakes: " + "\n" + player1[11] + "\n" + player1[12] + "\n" + player1[13]);
                    System.out.println("Player two's stakes: " + "\n" + player2[11] + "\n" + player2[12] + "\n" + player2[13]);

                    System.out.println("Player one's draw: " + player1[14]);
                    System.out.println("Player two's draw: " + player2[14]);
                }
            }
        }
    }
}
