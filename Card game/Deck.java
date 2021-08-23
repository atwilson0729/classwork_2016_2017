
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class Deck
{
    private int index;
    private Card [] deck; 
    
    public Deck()
    {
        deck = new Card[52];
        int suit = 0;
        int face = 0;
        
        int [] vals = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String [] suits = {"clubs", "hearts", "diamonds", "spades"};
        String [] faces = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        for (int i = 0; i < 52; i++)
        {
            deck[i] = new Card(vals[i%13], suits[i%4], faces[i%13]);
//             suit++;
//             if (suit > 3)
//             {
//                 suit = 0; 
//                 face++;
//             }
        }
    }
    
    public Card getTopCard()
    {
        return deck[index > 51 ? index = 0 : index++];
    }
    
    public Card getCardAt(int i)
    {
        return deck[i];
    }
    
    public void shuffle()
    {
        Random rand = new Random();
        Card temp;
        int r1;
        int r2;
        
        for (int i = 0; i < 1000; i++)
        {
            r1 = rand.nextInt(52);
            r2 = rand.nextInt(52);
            
            temp = deck[r1];
            deck[r1] = deck[r2];
            deck[r2] = temp;
        }
    }
}
