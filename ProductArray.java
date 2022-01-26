/**
 * The class manages a partial array of class Product.
 *
 * Step 1: Enter your name for @author and the password for @version
 * @author  Shreya Raj
 * @version 46AisDone!
 */
public class ProductArray
{
    // Step 2: Declare two instance variables (use the same names as below)
    //            partialArray: an array of class Product
    //            numOfProducts: number of products in the array
    private Product[] partialArray;
    private int numOfProducts;
    /**
     * Gets a string representing all products in the array
     *      
     * @return A string containing all products in the array
     *         in the following format, where each Producti()
     *         is the string returned by the toString() method
     *         on an element of the array:
     *         [Product1(), Product2(), ..., Productn()]
     */
    @Override
    public String toString()
    {
        String s = "[";
        if (numOfProducts > 0)
            s += partialArray[0].toString();
            
        for (int i = 1; i < numOfProducts; i ++)
        {
            s += ", " + partialArray[i].toString();
        }
        return s + "]";
    }
    
    // Step 3: Complete the constructor
    /**
     * Constructs an object of class ProductArray by 
     * creating an array of Product of the specified 
     * length and setting the number of products in 
     * the array to zero. 
     * 
     * @param size the length of the array
     */
    public ProductArray(int size)
    {
        partialArray = new Product[size];
        numOfProducts = 0;
    }

    // Step 4: Complete method insert()
    /**
     * Inserts a product at a specified position and 
     * shifts the element at the position and all  
     * subsequent elements (if any) to right and updates 
     * the number of products. The method does not 
     * do anything if the array is full or the 
     * index is invalid.
     *
     * @param  index the position to insert 
     * @param  product the product to insert
     */
    public void insert(int index, Product product)
    {
        if(numOfProducts < partialArray.length && index >= 0 && index <= numOfProducts)
        {
            for(int i = numOfProducts; i > index; i--)
            {
                partialArray[i] = partialArray[i - 1];
            }
            partialArray[index] = product;
            numOfProducts++;
        }
    }

    // Step 5: Complete method lastProductInRange()
    //         You should exit the loop after finding the
    //         last element satisfying the condition.
    /**
     * Gets the last element in the array whose price 
     * is in a given range [lowLimit, hightLimit].
     * 
     * @param  lowLimit the low limit of the price range, inclusive
     * @param  highLimit the high limit of the price range, inclusive
     * @return the last element in the array whole price is in the range
     *         null if no such elements in the array
     */
    public Product lastProductInRange(double lowLimit, double highLimit)
    {
        Product correct = null;
        for(int i = numOfProducts - 1; i >= 0; i--)
        {
            double price = partialArray[i].getPrice();
            if(price >= lowLimit && price <= highLimit)
            {
                correct = partialArray[i];
                break;
            }
        }
        return correct;
    }
}