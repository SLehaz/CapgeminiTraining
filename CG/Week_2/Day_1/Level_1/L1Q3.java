import java.util.Scanner;

class Book
{
    private String title;
    private String author;
    private int price;

    public Book(String name, String author, int price)
    {
        this.title = name;
        this.author = author;
        this.price = price;
    }

    public void display()
    {
        System.out.println("Name of Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price of Book: " + price);
    }
}

class MainL1_03
{
    public static void main(String[] args)
    {
        Book book1 = new Book("Diary of a Wimpy Kid", "Greg",500);
        Book book2 = new Book("Hands on ML", "O\'Reilly", 4000);

        book1.display();
        book2.display();
    }
}