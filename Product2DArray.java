/**
 * The class manages a 2-D array of Product.
 * @author  Shreya Raj
 * @version 46AisDone!
 */
public class Product2DArray
{
    private Product[][] product2D;

    /**
     * Constructor for class Product2DArray. The constructor
     * initializes the instance variable to the passed in
     * parameter.
     */
    public Product2DArray(Product[][] array)
    {
        product2D = array;
    }

    /**
     * The method computes and returns the average
     * price of all products in the 2-D array.
     */
    public double averagePrice()
    {
        double total = 0;
        double count = 0;
        
        for(Product[] row: product2D)
        {
            for(Product p: row)
            {
                count++;
                total += p.getPrice();
            }
        }
        
        return (total / count);
    }

    /**
     * Gets the count of products in the specified row whose
     * price is less than a given low price limit.
     */
    public int rowCount(int rowIndex, double lowLimit)
    {
        int rowCount = 0;
        for (Product p: product2D[rowIndex])
        {
            if (p.getPrice() < lowLimit)
            {
                rowCount++;
            }
        }
        return rowCount;
    }

    /**
     * Gets the first product with the minimun price 
     * in the specified column.
     */
    public Product colMinProduct(int colIndex)
    {
        int rows = product2D.length;
        double min = 5000;
        Product lowestPrice = null;
        
        for(int r = 0; r < rows; r++)
        {
            Product currentProd = product2D[r][colIndex];
            double price = currentProd.getPrice();
            if(price < min)
            {
                min = price;
                lowestPrice = currentProd;
            }
        }
        
        return lowestPrice;
    }
}
