/**
 * The class models products with a name and a price.
 *
 * @author  Qi Yang
 * @version 2021-12-10
 */
public class Product
{
    private String name;
    private double price;

    /**
     * Constructor for objects of class OurProduct
     * 
     * @param nameParam the name of this product
     * @param priceParam the price of this product
     */
    public Product(String nameParam, double priceParam)
    {
        name = nameParam;
        price = priceParam;
    }

    /**
     * Gets the name of this product
     * 
     * @return the name of this product
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the price of this product
     * 
     * @return the price of this product
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * Sets the price of this product
     * 
     * @param newPrice the new price of this product
     */
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
    
    /**
     * Gets a string representing this product
     *
     * @return a string representing this product
     */
    public String toString()
    {
        String s = "Product(Name=" + name + ",Price=" + price + ")";
        return s;
    }
}
