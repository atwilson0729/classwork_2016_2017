
/**
 * THis is a simple class that will be
 * used to illustrate the need for an equals( )
 * ethod, a compareTo( ) method and a copy contructor.
 * 
 * @author L. Lehmann 
 * @version v1
 */
public class Bowler
{
   private String name; //the full name of a bowler
   private double highScore; //the highest score the bowler has obtained
   
     
   /** No args constructor
    * Create a Bolwler object and sets the name field to the 
    * string "unknown" and
    * the high score of this object to 0.
    */
   public Bowler( )
   {
       name = new String("unknown");
       highScore =  0;
    }
    
    /** Constructs a Bowler object using the values
     * of the arguments. 
     * @param String a name for the Bowler
     * @param a high score for the Bowler. If the
     * argument sent in is less than zero, the field is set to zero.
     */
    public Bowler(String pName, double pHighScore)
    { 
        this.name = new String(pName);
        if(pHighScore < 0)
          this.highScore = 0;
        else
             this.highScore = pHighScore;
    }
    
    /**
     * Sets the Bowler's name field to the String argument.
     * @param a new value for the Bolwer's name
     */
    public void setName(String pName)
    {
        name = new String(pName);
    }
    
    /**
     * Set's the Bolwer object's high score field to the
     * argument.
     * @param the high score field is set to the argument. 
     * If the argument's value is less than zero, the value of the field
     * remains unchanged.
     * 
     */
    public void setHighScore(double pHighScore)
    {
        if(pHighScore >= 0)
          this.highScore = pHighScore;
    }
    
    /** 
     * This method returns the the name of the Bowler
     * @return a reference to a String object that holds the Bowler's name.
     */
    public String getName( )
    {
        return name;
    }
    
    /** 
     * This method returns the value of the Bowler's high score.
     * @return returns the value of the highSocre field.
     */
    public double getHighScore(  )
    {
        return highScore;
    }
    
    /**
     * Returns the textual representation of a Bowler object.
     * @return a reference to a String that concatinates the Bolwer's
     * name and high socre field values.
     */
    public String toString( )
    {
        return "Bowler Name: " + this.name + "  Highest Score: " + highScore;
    }
        
        
        
       
}
