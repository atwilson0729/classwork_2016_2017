
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human
{
    private String lastName;
    private String firstName;
    private String address;
    private int id;
    private int numVisits;
    private double outBal;
    private Pet [] pets;
    
    public Human()
    {
        lastName = "";
        firstName = "";
        address = "";
        id = 0;
        numVisits = 0;
        outBal = 0;
        pets = null;
    }
    
    public Human(String last, String first, String addr, int ID, int visits, double bal, Pet [] petArr)
    {
        lastName = last;
        firstName = first;
        address = new String(addr);
        id = ID;
        numVisits = visits;
        outBal = bal;
        pets = new Pet[petArr.length];
        for (int i = 0; i < pets.length; i++)
        {
            pets[i] = petArr[i];
        }
   }
   
   public String toString()
   {
       String petStr = "";
       
       for (int i = 0; i < pets.length; i++)
       {
           petStr += pets[i].toString();
       }
      
       return ("Last Name: " + lastName + "\nFirst Name: " + firstName + "\nAddress: " + address + "\nID: " + id + "\nNumber of Visits: " + numVisits + "\nOutgoing Balance: " + outBal + "\n" + petStr);
   }
   
   public boolean equals(Human other)
   {
       return this.id == other.id;
   }
}