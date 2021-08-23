/**
 * This class holds data for a sales slip after a discount is applied.
 * 
 * @Andrew Wilson
 * @version 1.0
 */
public class ItemSale
{
    private double costOfOneItem;
    private int numberOfItems;
    private double discountRate;
    /**
     * This is no args constructor that sets up init values
     */
    public ItemSale()
    {
        costOfOneItem  = 0;
        numberOfItems = 0;
        discountRate = 0;
    }
    /**
     * This method allows user to set values for cost
     * @param double - value to change
     */
    public void setCost(double inCost)
    {
        if (inCost < 0)
        {
            costOfOneItem = 0;
        }
        else 
        {
            costOfOneItem = inCost;
        }
    }
    /** 
     * This method allows user to set value for # of items
     * @param int - value to change
     */
    public void setNumberOfItems (int inNumber)
    {
        numberOfItems = inNumber < 0? 0: inNumber;
    }
    /**
     * This method lets user set discount
     * @param - double, percent discount
     */
    public void setDiscount (double inDiscountRate)
    {
        discountRate = inDiscountRate < 0? 0: inDiscountRate;
    }
    /**
     *     this method returns private of sales based on num of item and price per
     *     @return double representing total
     */
    public double getFinalCost()
    {
        double finalCost;
        finalCost = numberOfItems * (costOfOneItem * (1-discountRate));
        return finalCost;
    }
    
}