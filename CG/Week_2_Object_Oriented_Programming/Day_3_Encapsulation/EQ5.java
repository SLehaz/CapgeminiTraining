interface Reservable{
    String reserveItem();
    boolean checkAvailability();
}
abstract class LibraryItem implements Reservable{
    private int itemId;
    private String title,author;
    abstract int getLoanDuration();
    LibraryItem(int itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }
    void getItemDetails(){
        System.out.println("\nItem ID : "+itemId);
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Loan duration : "+getLoanDuration());
        System.out.println("Item reservable? : "+reserveItem());
        if(checkAvailability()){
            System.out.println("Availability : Yes");
        }
        else{
            System.out.println("Availability : No");
        }
    }
}
class Book extends LibraryItem{
    Book(int itemId,String title,String author){
        super(itemId,title,author);
    }
    int getLoanDuration() {
        return 6;
    }
    public String reserveItem(){
        return "Yes";
    }
    public boolean checkAvailability(){
        return true;
    }
}
class Magazine extends LibraryItem{
    Magazine(int itemId,String title,String author){
        super(itemId,title,author);
    }
    int getLoanDuration() {
        return 7;
    }
    public String reserveItem(){
        return "No";
    }
    public boolean checkAvailability(){
        return false;
    }
}
class DVD extends LibraryItem{
    DVD(int itemId,String title,String author){
        super(itemId,title,author);
    }
    int getLoanDuration() {
        return 8;
    }
    public String reserveItem(){
        return "Yes";
    }
    public boolean checkAvailability(){
        return true;
    }
}
class Main4{
    public static void main(String[] a){
        LibraryItem b = new Book(1,"Jungle Book","J.K.Rowling");
        LibraryItem m = new Magazine(2,"Today Times","The Hindu");
        LibraryItem d = new DVD(3,"Praise the Lord","Jesus");
        b.getItemDetails();
        m.getItemDetails();
        d.getItemDetails();
    }
}