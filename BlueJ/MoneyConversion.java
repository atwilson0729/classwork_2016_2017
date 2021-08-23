/**
 * 
 * @Andrew Wilson
 * @July 2, 2013
 */
public class MoneyConversion
{
    private double dollars;
    private double pounds;
    private double euros;
    private double riyal;
    private double rupee;
    
    
    private final double TO_EURO = .929651;
    private final double TO_BP = .798750;
    private final double TO_RIYAL = 3.64090;
    private final double TO_RUPEE = 68.0637;
    public MoneyConversion()
    {
        dollars = 0;
        pounds = 0;
        euros = 0;
        riyal = 0;
        rupee = 0;
        
    }
    public MoneyConversion(double amount, String scale)
    {
        setMoney(amount, scale);
    }
    public void setMoney (double amount, String scale)
    {
        switch (scale)
        {
            case "dollar":
            dollars = amount;
            pounds = amount * TO_BP;
            euros = amount * TO_EURO;
            riyal = amount * TO_RIYAL;
            rupee = amount * TO_RUPEE;
            break;
            case "pound":
            dollars = amount / TO_BP;
            pounds = amount;
            euros = amount / TO_BP * TO_EURO;
            riyal = amount / TO_BP * TO_RIYAL;
            rupee = amount / TO_BP * TO_RUPEE;
            case "euro":
            dollars = amount / TO_EURO;
            pounds = amount / TO_EURO * TO_BP;
            euros = amount;
            riyal = amount / TO_EURO * TO_RIYAL;
            rupee = amount / TO_EURO * TO_RUPEE;
            case "riyal":
            dollars = amount / TO_RIYAL;
            pounds = amount / TO_RIYAL * TO_BP;
            euros = amount / TO_RIYAL * TO_EURO;
            riyal = amount;
            rupee = amount / TO_RIYAL * TO_RUPEE;
            case "rupee":
            dollars = amount / TO_RUPEE;
            pounds = amount / TO_RUPEE * TO_BP;
            euros = amount / TO_RUPEE * TO_EURO;
            riyal = amount / TO_RUPEE * TO_RIYAL;
            rupee = amount;
            break;
            default:
            System.out.println("Sorry, not one of our set currencies.");
            break;
        }
    }
    public double getDollars()
    {
        return dollars;
    }
    public double getPounds()
    {
        return pounds;
    }
    
    public double getEuros()
    {
        return euros;
    }
    public double getRiyals()
    {
        return riyal;
    }
    public double getRupees()
    {
        return rupee;
    }
    public void moneyToString()
    {
        System.out.print("USD: " + dollars + "\nPounds: " + pounds + "\nEuros: " + euros + "\nRiyal: " + riyal + "\nRupee " + rupee + "\n\n");
    }
}