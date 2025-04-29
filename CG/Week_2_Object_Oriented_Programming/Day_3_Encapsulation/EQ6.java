interface Discountable{
    double applyDiscount();
    String getDiscountDetails();
}
abstract class FoodItem implements Discountable{
    private String itemName;
    private double price;
    private int quantity;
    abstract double getTotalPrice();
    FoodItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    double getPrice(){
        return price;
    }
    int getQuantity(){
        return quantity;
    }
    void getItemDetails(){
        System.out.println("Item Name : "+itemName);
        System.out.println("Price : "+price);
        System.out.println("Quantity : "+quantity);
        System.out.println(getDiscountDetails()+" : "+applyDiscount());
        System.out.println("Total price : "+getTotalPrice());
    }
}
class VegItem extends FoodItem{
    VegItem(String itemName,double price,int quantity){
        super(itemName,price,quantity);
    }
    double additionalCharges=100;
    double getTotalPrice(){
        double price = getPrice();
        return (price-applyDiscount()+additionalCharges)*getQuantity();
    }
    public double applyDiscount(){
        return getPrice()/10;
    }
    public String getDiscountDetails() {
        return "Discount percent : 10%";
    }
}
class NonVegItem extends FoodItem{
    NonVegItem(String itemName,double price,int quantity){
        super(itemName,price,quantity);
    }
    double getTotalPrice(){
        double price = getPrice();
        return (price-applyDiscount())*getQuantity();
    }
    public double applyDiscount(){
        return getPrice()/10;
    }
    public String getDiscountDetails() {
        return "Discount percent : 10%";
    }
}
class Main5{
    public static void main(String[] a){
        FoodItem f1 = new VegItem("Sambar Rice",150,2);
        FoodItem f2 = new NonVegItem("Chicken Fried Rice",120,1);
        f1.getItemDetails();
        f2.getItemDetails();
    }
}