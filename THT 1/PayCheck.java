
/**
 * PayCheck class
 * This Class contains and calculates the paycheck for an employee
 * 
 * @author Andrew Wilson
 * @version 2/7/2017
 */
import java.text.*;
public class PayCheck
{
    
    // declaration of fields
    private double hourlyRate;
    private int hoursWorked;
    private double grossPay;
    private double netPay;
    private double federalTaxAmount;
    private double stateTaxAmount;
    private double FICAAmount;
    private String firstName;
    private String lastName;
    private final double FEDERAL_TAX_RATE;//constants
    private final double STATE_TAX_RATE;
    private final double FICA_RATE;
    
    /**
     * Default constructor for objects of class PayCheck
     * @param none
     * @return none
     */
    public PayCheck()
    {
        //initialize all variables to 0 and strings to a null, and sets the constants to their values
        hourlyRate = 0;
        hoursWorked = 0;
        grossPay = 0;
        netPay = 0;
        federalTaxAmount = 0;
        stateTaxAmount = 0;
        FICAAmount = 0;
        firstName =  new String("unknown");
        lastName = new String("unknown");
        FEDERAL_TAX_RATE = 0.15;
        STATE_TAX_RATE = 0.09;
        FICA_RATE = 0.07;
    }

    /**
     * Overloaded constructor for objects of class PayCheck
     * @param double hourlyRate
     * @param int hoursWorked
     * @param String first
     * @param String last
     * @param double fedRate
     * @param double stateRate
     * @param double FICARate
     * @return none
     */
    public PayCheck(double hourRate, int hourWorked, String first, String last, double fedRate, double stateRate, double FICARate)
    {
        //initialize all variables to values sent over, and set constants to their proper values
        hourlyRate = hourRate;
        hoursWorked = hourWorked;
        firstName = new String(first);
        lastName = new String(last);
        FEDERAL_TAX_RATE = fedRate;
        STATE_TAX_RATE = stateRate;
        FICA_RATE = FICARate;
        calcPay();
    }
    

    /**
     * Private void calculations method that calculates grossPay, federalTaxAmount, and stateTaxAmount
     * 
     * @param none
     * @return none
     */
    private void calcPay()
    {
        grossPay = hoursWorked * hourlyRate;//calculate gross pay
        federalTaxAmount = grossPay * FEDERAL_TAX_RATE;//calculate federal tax amount
        stateTaxAmount = grossPay * STATE_TAX_RATE;//calculate state tax amount
        FICAAmount = grossPay * FICA_RATE;//calculate FICA amount
        netPay = grossPay - federalTaxAmount - stateTaxAmount - FICAAmount;//calculate net pay
    }
    
    /**
     * Setter method to change last name 
     * @param last name String
     * @return none
     */
    public void setLastName(String last)
    {
        lastName = last;
    }
    
    /**
     * Setter method to change first name 
     * @param first name String
     * @return none
     */
    public void setFirstName(String first)
    {
        firstName = first;
    }
    
    /**
     * Setter method to change employees hourly rate 
     * @param double hourly rate of pay
     * @return none
     */
    public void setHourlyRate(double hourly)
    {
        if (hourly >= 5 || hourly <= 100)
        {//data validation
            hourlyRate = hourly;
        }
        calcPay();//recalculate pay
    }
    
    /**
     * Setter method to change hours worked 
     * @param integer hours worked
     * @return none
     */
    public void setHoursWorked(int hours)
    {
        if (hours >= 0 || hours <= 80)
        {//data validation
            hoursWorked = hours;
        }
        calcPay();//recalculate pay
    }
    
    /**
     * to string method that returns the formatted string to print
     * @param none
     * @return formatted string
     */
    public String toString()
    {//prints formatted
        DecimalFormat money = new DecimalFormat("$#.00");
        return ("First name: " + firstName + "\nLast name: " + lastName + "\nGross pay: " + money.format(grossPay) + "\nFederal tax: " + money.format(federalTaxAmount) + "\nState tax: " + money.format(stateTaxAmount) + "\nFICA: " + money.format(FICAAmount) + "\nNet pay: " + money.format(netPay)); 
    }

    /**
     * Getter method to retrieve hourly rate
     * @param none
     * @return double hourlyRate
     */
    public double getHourlyRate()
    {
        return hourlyRate;
    }

    /**
     * Getter method to retrieve hours worked
     * @param none
     * @return integers hoursWorked
     */
    public int getHoursWorked()
    {
        return hoursWorked;
    }

    /**
     * Getter method to retrieve gross pay
     * @param none
     * @return double grossPay
     */
    public double getGrossPay()
    {
        return grossPay;
    }

    /**
     * Getter method to retrieve net pay
     * @param none
     * @return double netPay
     */
    public double getNetPay()
    {
        return netPay;
    }

    /**
     * Getter method to retrieve federalTaxAmount
     * @param none
     * @return double federalTaxAmount
     */
    public double getFederalTaxAmount()
    {
        return federalTaxAmount;
    }

    /**
     * Getter method to retrieve stateTaxAmount
     * @param none
     * @return double stateTaxAmount
     */
    public double getStateTaxAmount()
    {
        return stateTaxAmount;
    }

    /**
     * Getter method to retrieve FICAAmount
     * @param none
     * @return double FICAAmount
     */
    public double getFICAAmount()
    {
        return FICAAmount;
    }

    /**
     * Getter method to retrieve the first name
     * @param none
     * @return String firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Getter method to retrieve last name 
     * @param none
     * @return String lastName
     */
    public String getLastName()
    {
        return lastName;
    }
}
