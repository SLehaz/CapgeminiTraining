class Book
{
    private String title;
    private String author;
    private int price;
    private static int totalPrice = 0;

    Book()
    {
        title = "Default Book";
        author = "Default Author";
        price = 100;
        totalPrice +=  price;
    }

    Book(String bookName, String bookAuthor, int bookPrice)
    {
        this.title = bookName;
        this.author = bookAuthor;
        this.price = bookPrice;
        totalPrice += price;
    }

    void displayBookDetails() {
        System.out.println("Book Name: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    static void displayTotalPrice()
    {
        System.out.println("The total price is: $" + totalPrice);
    }

}

class MainL1_01
{
    public static void main(String[] args)
    {
        Book book1 = new Book();
        Book book2 = new Book("Sample book 1", "Sample Author 1", 250);
        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayTotalPrice();

    }
}