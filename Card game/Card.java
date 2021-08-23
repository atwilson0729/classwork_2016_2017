
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    private int value;
    private String suit;
    private String face;
    
    public Card()
    {
        value = 0;
        suit = null;
        face = null;
    }
    
    public Card(int val, String suitStr, String faceStr)
    {
        value = val;
        suit = suitStr;
        face = faceStr;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    public String getFace()
    {
        return face;
    }
    
    public String toString()
    {
        return face + " of " + suit + ". Value: " + value;
    }
    
    public int compareTo(Card other)
    {
        if (this.value > other.value)
        {
            return 1;
        }
        else if (this.value < other.value)
        {
            return -1;
        }
        else 
        {
            return 0;
        }
    }
    
    public boolean equals(Card other)
    {
        return (this.face.equals(other.face) && this.suit.equals(other.suit));
    }
}
