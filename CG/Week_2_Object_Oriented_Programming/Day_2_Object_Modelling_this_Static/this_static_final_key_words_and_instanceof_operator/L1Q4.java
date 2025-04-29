import java.util.Scanner;

class Product
{
    private String productName;
    static int discount = 10;
    private int price;
    private int quantity;
    private final int productId;


    Product(String name, int price, int quantity, int productId)
    {
        this.productName = name;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    static void updateDiscount()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the updated discount amount: ");
        discount = s.nextInt();
    }

    void productDetails()
    {
        System.out.println("Product Name: " + productName);
        System.out.println("Price of Product: " + price);
        System.out.println("Discounted Price: " + (price - (price * (discount/100.0))));
        System.out.println("Quantity of Product: " + quantity);
        System.out.println("Total Price: " + (price - (price * (discount/100.0))) * quantity);
    }

}

class MainL1_04
{
    public static void main(String[] args)
    {
        Product p1 = new Product("Pen", 20, 10, 101);
        if (p1 instanceof Product)
        {
            p1.productDetails();
        }

        Product.updateDiscount();

        Product p2 = new Product("Paper", 10, 10, 102);

        if (p2 instanceof Product)
        {
            p2.productDetails();
        }
    }
}