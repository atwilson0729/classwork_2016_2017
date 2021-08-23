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
            rupee = amount * TO_RUPEE;
            break;
        }
    }
    public void setMoney (double money, String scale)
    {
        
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
}