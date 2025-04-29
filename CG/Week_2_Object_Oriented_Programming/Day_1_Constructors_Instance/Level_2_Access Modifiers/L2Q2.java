class Book{
    public int ISBN;
    protected String title;
    private String author;
    Book(int ISBN, String title, String author){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }
    public void display(){
        System.out.println("ISBN : "+ISBN);
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
    }
    public void getAuthor(String newAuthor){
        this.author=newAuthor;
    }
}
class EBook{
    public static void main(String[] args){
        Book b = new Book(1234,"Harry Potter","J.K.Rowling");
        b.display();
        b.getAuthor("Chetan Bhagat");
        b.ISBN=2341;
        b.title="The Life of a Teen";
        b.display();
    }
}