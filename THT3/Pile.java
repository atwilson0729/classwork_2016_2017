
/**
 * This class maintains the pile of cards
 * 
 * @author Andrew Wilson
 * @version 5/6/2017
 */
public class Pile
{
    //private fields
    private boolean [] isFaceDown = new boolean[5];
    private Card [] pile;
    private Card [] temp;
    private int index = 0;
    
    /**
     * This is the default constructor for the pile, initializes the isFaceDown array, and created a new card array
     * 
     */
    public Pile()
    {
        for (int i = 0; i < 5; i++)
        {//for amount of cards
            isFaceDown[i] = true;//initialize to face down
        }
        pile = new Card [5];
    }
    
    /**
     * This adds a card face down into the pile
     * @param Card card - the card being sent in to be added
     * 
     */
    public void addCardFaceDown(Card card)
    {
        for (int i = 0; i < 5; i++)
        {//for amount of cards
            if (pile[i] == null)
            {//if it is an empty card
                pile[i] = card;//set position to new card
                isFaceDown[i] = true;//set to is face down
                break;
            }
        }
    }
    
    /**
     * This adds a card face up into the pile
     * @param Card card - the card being sent in to be added
     * 
     */
    public void addCardFaceUp(Card card)
    {
        for (int i = 0; i < 5; i++)
        {//for amount of cards
            if (pile[i] == null)
            {//if it is empy
                pile[i] = card;//set position to new card
                isFaceDown[i] = false;//set to is face up
                break;
            }
        }
    }
    
    /**
     * This removed the top card from the file
     * @return Card - the card that was removed from the pile
     */
    public Card removeCard()
    {
        Card tempCard;
        for (int i = 0; i < 5; i++)
        {//for amount of cards
            if (isFaceDown[i])
            {//if it's face down
                tempCard = pile[i];//take that card into temp
                pile[i] = null;//set it to null
                isFaceDown[i] = false;//set it to face up
                return tempCard;//return the card
            }
        }
        return null;
    }
    
    /**
     * This calculates the number of face down cards in the pile
     * @return int - the number of face down cards
     */
    public int getNumberOfFaceDown()
    {
        int num = 0;
        for (int i = 0; i < 5; i++)
        {//for num of cards
            if (pile[i] == null)
            {//if is empty
                
            }
            else if (isFaceDown[i] == true)
            {//if not empty
                num++;//iterate the number oof the card
            }
        }
        return num;
    }
    
    /**
     * This calculates the number of face up cards in the pile
     * @return int - the number of face up cards
     */
    public int getNumberOfFaceUp()
    {
        int num = 0;
        for (int i = 0; i < 5; i++)
        {
            if (pile[i] == null)
            {
                
            }
            else if (isFaceDown[i] == false)
            {
                num++;
            }
        }
        return num;
    }
    
    /**
     * This creates a printable string version of the class
     * @return String - the formatted string version of the class
     */
    public String toString()
    {
        String faceDown = new String("Face down: ");
        String faceUp = new String("Face up: ");
        for (int i = 0; i < 5; i++)
        {
            if (pile[i] == null)
            {
                
            }
            else if (isFaceDown[i] == true)
            {
                faceDown += pile[i].toString() + " ";
            }
            else if (isFaceDown[i] == false)
            {
                faceUp += pile[i].toString() + " "; 
            }
        }
        return faceDown + "\n" + faceUp;
    }
}
