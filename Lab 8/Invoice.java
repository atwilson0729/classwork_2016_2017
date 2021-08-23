
/**
 * Write a description of class Invoice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Invoice
{
    private String invoiceID;
    private String description;
    private double amount;
    private boolean isPaid;
    private Customer cust;
    
    public Invoice()
    {
        invoiceID = "";
        description = "";
        amount = 0;
        isPaid = false;
        cust = null;
    }
    
    public Invoice(String id, String descript, double amt, boolean paid, Customer c)
    {
        invoiceID = new String(id);
        description = new String(descript);
        amount = amt;
        isPaid = paid;
        cust = new Customer(c);
    }
    
    public String toString()
    {
        return ("Invoice ID: " + invoiceID + "\nDescription: " + description + "\nAmount: " + amount + "\nIf is paid: " + isPaid + "\n" + cust.toString());
    }
    
    public int compareTo(Invoice in)
    {
        if (this.amount > in.amount)
        {
            return 1;
        }
        else if (this.amount < in.amount)
        {
            return -1;
        }
        return 0;
    }
    
    public void setIsPaid(boolean paid)
    {
        isPaid = paid;
    }
    
    public void setAmount(double a)
    {
        amount = a;
    }
    
    public boolean equals(Invoice in)
    {
        if (this.invoiceID.equals(in.invoiceID))
        {
            return true;
        }
        return false;
    }
    
    
}
