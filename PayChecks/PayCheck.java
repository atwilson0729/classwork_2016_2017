
/**
 * Calculates paycheck
 * 
 * @Andrew Wilson, Lukas Newman
 * @version 1.0
 */
public class PayCheck
{
    //declaration of fields
    private String name;
    private double rateOfPay;
    private double hoursWorked;
    private double grossPay;
    
    public PayCheck ()
    {//no args constructor
        //set all to null values
        name = "unknown";
        rateOfPay = 0;
        hoursWorked = 0;
        grossPay = 0;
    }
    public PayCheck(String empName, double pay, double hours)
    {//3 fields constructor
        //set fields to input
        name = empName;
        rateOfPay = pay;
        hoursWorked = hours;
        if (hours > 40)
        {//for overtime
            grossPay = (40 * pay) + ((hours - 40) * (pay * 1.5));
        }
        else
        {//no overtime
            grossPay = pay * hours;
        }
    }
    public void setHours(double hours)
    {//sets hours
        hoursWorked = hours;//set hours
        //recalc pay
        if (hours > 40)
        {
            grossPay = (40 * rateOfPay) + ((hoursWorked - 40) * (rateOfPay * 1.5));
        }
        else
        {
            grossPay = rateOfPay * hoursWorked;
        }
    }
    public void setPay (double pay)
    {//sets pay
        rateOfPay = pay;//sets pay
        //recalc pay
        if (hoursWorked > 40)
        {
            grossPay = (40 * rateOfPay) + ((hoursWorked - 40) * (rateOfPay * 1.5));
        }
        else
        {
            grossPay = rateOfPay * hoursWorked;
        }
    }
    public String getName()
    {//getter returns name
        return name;
    }
    public double getPay()
    {//getter returns pay
        return rateOfPay;
    }
    public double getHours()
    {//getter returns hours
        return hoursWorked;
    }
    public double getGross()
    {//getter returns gross
        return grossPay;
    }
}
