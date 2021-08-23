
/**
 * This class maintains the cards and holds it's values, suit, face, and everything
 * 
 * @author Andrew Wilson
 * @version 5/6/217
 */
public class Card
{
    //private fields
    private int value;
    private String suit;
    private String face;
    
    /**
     * This is the default constructor for the Card class, initializes everything to nothing
     */
    public Card()
    {
        value = 0;//set all to null or 0 values
        suit = null;
        face = null;
    }
    
    /**
     * This is the overloaded constructor that takes in the 3 characteristics of the card and assigns their proper values
     * @param int val - the value of the card
     * @param String suitStr - the string representation of the suit
     * @param String faceStr - the string representation of the face
     */
    public Card(int val, String suitStr, String faceStr)
    {
        value = val;//set all fields to the parameter values
        suit = suitStr;
        face = faceStr;
    }
    
    /**
     * This getter returns the value of the card
     * @return int - the value of the card
     */
    public int getValue()
    {
        return value;//returns the value
    }
    
    /**
     * This getter returns the suit of the card
     * @return String - the suit of the card
     */
    public String getSuit()
    {
        return suit;//returns the suit
    }
    
    /**
     * This getter returns the face of the card
     * @return String - the face of the card
     */
    public String getFace()
    {
        return face;//returns the face
    }
    
    /**
     * This creates the formatted string representation of the class
     * @return String - the string of the class
     */
    public String toString()
    {
        return face + suit;//return the formatted string
    }
    
    /**
     * This compares one card to another based on value
     * @param Card other - the card to be compared to this instance
     * @return int - the compareTo value of these two cards
     */
    public int compareTo(Card other)
    {
        if (this.value > other.value)
        {//if this has higher value
            return 1;//return pos
        }
        else if (this.value < other.value)
        {//if this has lower val
            return -1;//return neg
        }
        else 
        {//if equal
            return 0;//return 0
        }
    }
    
    /**
     * This checks equality of two cards based on suit and face
     * @param Card other - the card to be checked with equality to this instance
     * @return boolean - the equality
     */
    public boolean equals(Card other)
    {
        return (this.face.equals(other.face) && this.suit.equals(other.suit));//if they're the same, return true else false
    }
}
