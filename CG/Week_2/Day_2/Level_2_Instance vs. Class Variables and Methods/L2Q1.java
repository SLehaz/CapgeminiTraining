class Product{
    String productName;
    int price;
    static int totalProducts;
    Product(String productName, int price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    public void displayProductDetails(){
        System.out.println("Product name : "+productName+"\nPrice : "+price);
    }
    public static void displayTotalProducts(){
        System.out.println("Total products : "+totalProducts);
    }
    public static void main(String[] args){
        Product p1 = new Product("Apple",50);
        Product p2 = new Product("Coca Cola",100);
        p1.displayProductDetails();
        p2.displayProductDetails();
        displayTotalProducts();
    }
}