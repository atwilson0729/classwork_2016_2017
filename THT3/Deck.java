
/**
 * This class manages the main deck of cards
 * 
 * @author Andrew Wilson 
 * @version 5/6/2017
 */
import java.util.Random;
public class Deck
{
    //fields that are private
    private int index;
    private int num;
    private Card [] deck; 

    /**
     * This is the constructor, makes the deck and initializes the cards in it
     * 
     */
    public Deck()
    {
        //declare variables in deck
        deck = new Card[52];
        int suit = 0;
        int face = 0;
        num = 0;

        int [] vals = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1};//array of values
        String [] suits = {"C", "H", "D", "S"};//array of suits
        String [] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};//array of faces
        for (int i = 0; i < 52; i++)
        {//for amount of cards
            deck[i] = new Card(vals[i%13], suits[i%4], faces[i%13]);//create new card with proper variables
        }
    }

    /**
     * this deals the card to a new card 
     * @return Card - the dealt card
     * 
     */
    public Card dealCard()
    {
        return deck[num++];//return new card
    }

    /**
     * this gets the top card off the deck
     * @return Card - the top card
     * 
     */
    public Card getTopCard()
    {
        return deck[0];
    }

    /**
     * this gets the specified card off the deck
     * @return Card - the specified card
     * @param int i - the index of the card
     * 
     */
    public Card getCardAt(int i)
    {
        return deck[i];//return card at i
    }

    /**
     * this returns the number of cards left
     * @return int - the number of cards left
     * 
     */
    public int cardsLeft()
    {
        return num;
    }

    /**
     * this shuffles the deck by swapping two random cards
     * 
     * 
     */
    public void shuffle()
    {
        //declaration of variables
        Random rand = new Random();
        Card temp;
        int r1;
        int r2;

        for (int i = 0; i < 1000; i++)
        {//shuffles 1000 times
            //generate two random nums
            r1 = rand.nextInt(52);
            r2 = rand.nextInt(52);

            //swap cards at those nums
            temp = deck[r1];
            deck[r1] = deck[r2];
            deck[r2] = temp;
        }
    }

    /**
     * this creates a formatted string of the class
     * @return String - the formatted string
     * 
     */
    public String toString()
    {
        String str = new String();
        for (int i = num; i < 52; i++)
        {//for amount of cards
            str += deck[i].toString() + " ";//print card
        }
        return str;
    }
}
