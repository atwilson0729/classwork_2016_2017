
/**
 * This ia a driver to illustrate the need for some
 * special methods.
 * 
 * @author L. Lehmann 
 * @version v1
 */
public class BowlerDriver
{
   public static void main(String [ ] args)
   {
       Bowler b1; //declare a reference variable for a Bolwer object
       Bowler b2; //declare a reference variable for a Bowler object
       
       b1 = new Bowler("Harry Merser", 235);//create a Bowler
       b2 = new Bowler("Harry Merser", 235);//create a Bowler
       
       if(b1 == b2) //use the == operator to test equality
       {
           System.out.println(b1.toString( ) + " is the same as \n " +
                              b2.toString( )+ " why??");
       }
       else
       {
           System.out.println(b1.toString( ) + " is different from\n" +
                              b2.toString( ) + " why??" );
       }

      
      
      //assign b1 to b2
      b1 = b2;
      if(b1 == b2)
       {
           System.out.println("\n" + b1.toString( ) + " is now the same as \n" +
                              b2.toString( ) + " why the change??");
       }
       else
       {
           System.out.println(b1.toString( ) + " is different from\n" +
                              b2.toString( ) + " why??" );
       }
       
       //change the b1 high score field to 99
       b1.setHighScore(99);
       //print the state of each Bowler
       System.out.println("\nAfter changing b1's score\nb1's state is: " 
                          +  b1.toString( ) +
                         "\nb2's state is: " + b2.toString( ) +
                         "\nexplain what happened");
                         
      
    }
}
