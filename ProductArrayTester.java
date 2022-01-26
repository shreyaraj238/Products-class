/**
 * A Java tester program for class ProductArray.
 *
 * @author  Qi Yang
 * @version 2021-12-10
 */
public class ProductArrayTester
{
    public static void main(String[] args)
    {
        ProductArray array0 = new ProductArray(5);
        ProductArray array1 = new ProductArray(10);
        ProductArray array2 = new ProductArray(100);

        System.out.println(array0.toString());
        System.out.println("Expected: []");
        System.out.println(array1.toString());
        System.out.println("Expected: []");
        System.out.println(array2.toString());
        System.out.println("Expected: []");

        // Testing method lastProductInRange()
        System.out.println(array0.lastProductInRange(400, 500));
        System.out.println("Expected: null");
        System.out.println(array1.lastProductInRange(400, 500));
        System.out.println("Expected: null");
        System.out.println(array2.lastProductInRange(400, 500));
        System.out.println("Expected: null");
        
        // Testing method insert()
        array0.insert(0, new Product("iPad Pro 11-inch display", 799.9));
        array1.insert(0, new Product("PH", 499.90));
        array1.insert(1, new Product("iPad 11", 499.90));
        array1.insert(2, new Product("TV", 599.90)); 
        array2.insert(0, new Product("apple X", 499.90));
        array2.insert(0, new Product("PH", 499.90));
        array2.insert(0, new Product("TV", 599.90));     
        
        System.out.println(array0.toString());
        System.out.println("Expected: [Product(Name=iPad Pro 11-inch display,Price=799.9)]");
        System.out.println(array1.toString());
        System.out.println("Expected: [Product(Name=PH,Price=499.9), " +
                                      "Product(Name=iPad 11,Price=499.9), " +
                                      "Product(Name=TV,Price=599.9)]");
        System.out.println(array2.toString());
        System.out.println("Expected: [Product(Name=TV,Price=599.9), " +
                                      "Product(Name=PH,Price=499.9), " +
                                      "Product(Name=apple X,Price=499.9)]");
                
        // Testing method insert()
        array0.insert(1, new Product("PH", 499.90));
        array0.insert(1, new Product("iPad 11", 499.90));
        array0.insert(2, new Product("TV", 599.90)); 
        array0.insert(1, new Product("apple X", 499.90));
        
        System.out.println(array0.toString());
        System.out.println("Expected: [Product(Name=iPad Pro 11-inch display,Price=799.9), " +
                                      "Product(Name=apple X,Price=499.9), " +
                                      "Product(Name=iPad 11,Price=499.9), " +
                                      "Product(Name=TV,Price=599.9), " +
                                      "Product(Name=PH,Price=499.9)]");

        // Testing method lastProductInRange()
        System.out.println(array0.lastProductInRange(400, 499.9));
        System.out.println("Expected: Product(Name=PH,Price=499.9)");
        System.out.println(array0.lastProductInRange(700, 800));
        System.out.println("Expected: Product(Name=iPad Pro 11-inch display,Price=799.9)");
        System.out.println(array0.lastProductInRange(400, 499.89));
        System.out.println("Expected: null");

        // Testing method insert() when the array is full
        array0.insert(0, new Product("iPhone 13", 1299.90));
        // Testing method insert() with invalid index
        array1.insert(-1, new Product("iPhone 13", 1299.90));
        array2.insert(4, new Product("iPhone 13", 1299.90));

        System.out.println(array0.toString());
        System.out.println("Expected: [Product(Name=iPad Pro 11-inch display,Price=799.9), " +
                                      "Product(Name=apple X,Price=499.9), " +
                                      "Product(Name=iPad 11,Price=499.9), " +
                                      "Product(Name=TV,Price=599.9), " +
                                      "Product(Name=PH,Price=499.9)]");
        System.out.println(array1.toString());
        System.out.println("Expected: [Product(Name=PH,Price=499.9), " +
                                      "Product(Name=iPad 11,Price=499.9), " +
                                      "Product(Name=TV,Price=599.9)]");
        System.out.println(array2.toString());
        System.out.println("Expected: [Product(Name=TV,Price=599.9), " +
                                      "Product(Name=PH,Price=499.9), " +
                                      "Product(Name=apple X,Price=499.9)]");
    }
}