public class Product
{
    private String name;
    private double price;

    public Product(String nameParam, double priceParam)
    {
        name = nameParam;
        price = priceParam;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
    
    public String toString()
    {
        String s = "Product(Name=" + name + ",Price=" + price + ")";
        return s;
    }
}
