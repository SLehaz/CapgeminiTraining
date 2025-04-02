import java.util.Scanner;
class CartItem{
    String itemName;
    int quantity;
    double price;
    public void add(String itemname, int quantity, double price){
        this.itemName=itemname;
        this.price=price;
        this.quantity=quantity;
    }
    public void delete(){
        this.itemName=null;
        this.price=0;
        this.quantity=0;
    }
    public double cost(){
        return this.price*this.quantity;
    }
}
public class L2Q5{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        CartItem[] car = new CartItem[5];
        for(int i=0;i<5;i++){
            car[i] = new CartItem();
            System.out.println("Enter item name : ");
            String name = s.next();
            System.out.println("Enter quantity : ");
            int quantity = s.nextInt();
            System.out.println("Enter price : ");
            double price = s.nextDouble();
            car[i].add(name,quantity,price);
        }
        for(int i=0;i<5;i++){
            System.out.println("Item "+(i+1)+" : ");
            System.out.println("Item name : "+car[i].itemName);
            System.out.println("Quantity : "+car[i].quantity);
            System.out.println("Price : "+car[i].price);
        }
        System.out.print("Enter the item number which u want to delete : ");
        int n = s.nextInt();
        car[n].delete();
        for(int i=0;i<5;i++){
            if(car[i].itemName!=null){
                System.out.println("Item "+(i+1)+" : ");
                System.out.println("Item name : "+car[i].itemName);
                System.out.println("Quantity : "+car[i].quantity);
                System.out.println("Price : "+car[i].price);
            }
        }
        int sum=0;
        for(int i=0;i<5;i++){
            if(car[i].itemName!=null){
                sum+=car[i].cost();
            }
        }
        System.out.println("Total cost = "+sum);
        s.close();
    }
}

//import java.util.ArrayList;
//
//class CartItem {
//    private String itemName;
//    private double price;
//    private int quantity;
//
//    public CartItem(String itemName, double price, int quantity) {
//        this.itemName = itemName;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    public String getItemName() {
//        return itemName;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public double getTotalPrice() {
//        return price * quantity;
//    }
//}
//
//class ShoppingCart {
//    private ArrayList<CartItem> cartItems;
//
//    public ShoppingCart() {
//        this.cartItems = new ArrayList<>();
//    }
//
//    public void addItem(String itemName, double price, int quantity) {
//        cartItems.add(new CartItem(itemName, price, quantity));
//        System.out.println(quantity + " x " + itemName + " added to cart.");
//    }
//
//    public void removeItem(String itemName) {
//        cartItems.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
//        System.out.println(itemName + " removed from cart.");
//    }
//
//    public void displayTotalCost() {
//        double totalCost = 0;
//        for (CartItem item : cartItems) {
//            totalCost += item.getTotalPrice();
//        }
//        System.out.println("Total Cost: $" + totalCost);
//    }
//
//    public void showCartItems() {
//        if (cartItems.isEmpty()) {
//            System.out.println("Your cart is empty.");
//            return;
//        }
//        System.out.println("Shopping Cart Items:");
//        for (CartItem item : cartItems) {
//            System.out.println(item.getQuantity() + " x " + item.getItemName() + " - $" + item.getTotalPrice());
//        }
//    }
//}
//
//public class ShoppingCartApp {
//    public static void main(String[] args) {
//        ShoppingCart cart = new ShoppingCart();
//        cart.addItem("Apple", 0.99, 3);
//        cart.addItem("Banana", 0.59, 2);
//        cart.showCartItems();
//        cart.displayTotalCost();
//        cart.removeItem("Apple");
//        cart.showCartItems();
//        cart.displayTotalCost();
//    }
//}
