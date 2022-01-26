/**
 * The class manages a partial array of class Product.
 * @author  Shreya Raj
 * @version 46AisDone!
 */
public class ProductArray
{
    private Product[] partialArray;
    private int numOfProducts;
    /**
     * Gets a string representing all products in the array
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
    
    /**
     * Constructs an object of class ProductArray by 
     * creating an array of Product of the specified 
     * length and setting the number of products in 
     * the array to zero. 
     */
    public ProductArray(int size)
    {
        partialArray = new Product[size];
        numOfProducts = 0;
    }

    /**
     * Inserts a product at a specified position and 
     * shifts the element at the position and all  
     * subsequent elements (if any) to right and updates 
     * the number of products. The method does not 
     * do anything if the array is full or the 
     * index is invalid.
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

    /**
     * Gets the last element in the array whose price 
     * is in a given range [lowLimit, hightLimit].
     * 
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
