public class Customer
{
    private String lastName;
    private String firstName;
    private String id;
    
    public Customer()
    {
        lastName = "";
        firstName = "";
        id = "";
    }
    
    public Customer(String last, String first, String ID)
    {
        lastName = new String(last);
        firstName = new String(first);
        id = new String(ID);
    }
    
    public Customer(Customer other)
    {
        lastName = new String(other.lastName);
        firstName = new String(other.firstName);
        id = new String(other.id);
    }
    
    public String toString()
    {
        return ("First Name: " + firstName + "\nLast Name: " + lastName + "\n ID: " + id);
    }
}
