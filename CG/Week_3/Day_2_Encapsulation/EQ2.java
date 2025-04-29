interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
abstract class Product{
    private String name;
    private int productId;
    private double price;
    abstract double calculateDiscount();
    Product(String name,int productId,double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }
    double getPrice(){
        return price;
    }
    void displayDetails(Product p){
        System.out.println("Product ID : "+productId);
        System.out.println("Product Name : "+name);
        System.out.println("Product Price : "+price);
        if(p instanceof Taxable){
            System.out.println(((Taxable) p).getTaxDetails());
            System.out.println("Discount : "+calculateDiscount());
            System.out.println("Final price : "+(price+((Taxable)p).calculateTax()-calculateDiscount()));
        }
        else{
            System.out.println("Discount : "+calculateDiscount());
            System.out.println("Final price : "+(price-calculateDiscount()));
        }
        System.out.println();
    }
}
class Electronics extends Product implements Taxable{
    Electronics(String name,int productId,double price){
        super(name,productId,price);
    }
    public double calculateTax(){
        return getPrice()*0.1;
    }
    double calculateDiscount(){
        return getPrice()*0.05;
    }
    public String getTaxDetails(){
        return "Tax percent : 10%";
    }
}
class Clothing extends Product{
    Clothing(String name,int productId,double price){
        super(name,productId,price);
    }
    double calculateDiscount(){
        return getPrice()*0.2;
    }
}
class Groceries extends Product implements Taxable{
    Groceries(String name,int productId,double price){
        super(name,productId,price);
    }
    public double calculateTax(){
        return getPrice()*0.03;
    }
    double calculateDiscount(){
        return getPrice()*0.05;
    }
    public String getTaxDetails(){
        return "Tax percent : 3%";
    }
}
class Main1{
    public static void main(String[] a){
        Product p1 = new Electronics("Smartphone", 1, 100000);
        Product p2 = new Clothing("Shirt", 2, 500);
        Product p3 = new Groceries("Rice", 3, 300);
        Product[] products = {p1, p2, p3};
        for (Product p : products) {
            p.displayDetails(p);
        }
    }
}