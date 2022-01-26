/**
 * The class manages a 2-D array of Product.
 *
 * Step 1: Enter your name for @author and the password for @version
 * @author  Shreya Raj
 * @version 46AisDone!
 */
public class Product2DArray
{
    // Step 2: Declare one instance variable for the 2-D array of Product
    private Product[][] product2D;

    // Step 3: Complete the constructor
    /**
     * Constructor for class Product2DArray. The constructor
     * initializes the instance variable to the passed in
     * parameter.
     *         
     * @param array the 2-D array to be managed
     *        the 2-D array has more than one row and
     *        more than one column, and has no null 
     *        values for its elements.
     */
    public Product2DArray(Product[][] array)
    {
        product2D = array;
    }

    // Step 4: Complete method averagePrice().
    //         You should use nested enhanced for loops
    /**
     * The method computes and returns the average
     * price of all products in the 2-D array.
     *
     * @return  the average price of all products in the 2-D array
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

    // Step 5: Complete method rowCount().
    //         You should use the enhanced for loop
    /**
     * Gets the count of products in the specified row whose
     * price is less than a given low price limit.
     *         
     * @param rowIndex the row index of the specified row
     * @param lowLimit the given low price limit
     * @return the count of products in the specified row whose
     *         price is less than the given lowLimit
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

    // Step 6: Complete method colMinProduct().
    /**
     * Gets the first product with the minimun price 
     * in the specified column.
     *         
     * @param colIndex the index of the specified column
     * @return the first product with the minimun price
     *         in the specified column
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