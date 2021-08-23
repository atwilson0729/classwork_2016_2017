public class Driver
{
    public static void main(String [] args)
    {
        Customer cust1 = new Customer("Wayne", "Jeff", "90210");
        Customer cust2 = new Customer("Dog", "Bad", "12345");
        Customer cust3 = new Customer("Last", "First", "90852");
        
        Invoice invoice1 = new Invoice("1982357", "He broke", 123.14, false, cust1);
        Invoice invoice2 = new Invoice("0982039", "Good boye", 1590.02, true, cust2);
        Invoice invoice3 = new Invoice("1982357", "kinda boring guy", 11920.11, false, cust3);
        
        
        System.out.println(invoice1.toString());
        System.out.println(invoice2.toString());
        System.out.println(invoice3.toString());
        if (invoice1.compareTo(invoice2) == 1)
        {
            System.out.println("Invoice 1 is greater than invoice 2");
        }
        else if (invoice1.compareTo(invoice2) == -1)
        {
            System.out.println("Invoice 2 is greater than invoice 1");
        }
        else if (invoice1.compareTo(invoice2) == 0)
        {
            System.out.println("Invoice 1 is equal to invoice 2 in amount");
        }
        
        
        if (invoice1.equals(invoice2))
        {
            System.out.println("Invoice 1 and 2 are equal");
        }
        else
        {
            System.out.println("Invoice 1 and 2 are not equal");            
        }
        
        if (invoice2.equals(invoice3))
        {
            System.out.println("Invoice 2 and 3 are equal");
        }
        else
        {
            System.out.println("Invoice 2 and 3 are not equal");            
        }
   }
}
