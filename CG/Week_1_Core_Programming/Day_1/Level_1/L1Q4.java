import java.util.Scanner;

class Item
{
    private int itemCode;
    private String itemName;
    private int price;


    public Item(int code, String name, int price)
    {
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }

    public void display()
    {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Code: " + itemCode);
        System.out.println("Price of Item: " + price);
    }

    public void cost(int quantity)
    {
        System.out.println("The total cost of " + itemName + " is: " + price * quantity);
    }
}

class MainL1_04
{
    public static void main(String[] args)
    {
        Item item1 = new Item(101, "Pen", 50);
        Item item2 = new Item(102, "Paper", 10);

        item1.display();
        item2.display();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Quantity of Item: ");
        int quantity = s.nextInt();

        item1.cost(quantity);
        item2.cost(quantity);
    }
}