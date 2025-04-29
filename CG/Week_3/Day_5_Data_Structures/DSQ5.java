class LMS{
    String title,author,genre;
    int bookID;
    boolean availabilityStatus;
    LMS next,prev;
    LMS(int bookID,String title,String author,String genre,boolean availabilityStatus){
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.availabilityStatus=availabilityStatus;
        this.next=null;
        this.prev=null;
    }
}
class LmsDLL{
    LMS head = null;
    LMS tail = null;
    void addAtBeginning(int bookID,String title,String author,String genre,boolean availabilityStatus){
        LMS m = new LMS(bookID,title,author,genre,availabilityStatus);
        if(head==null){
            head = m;
            tail = m ;
        }
        else{
            m.next=head;
            head.prev=m;
            head=m;
        }
    }
    void addAtEnd(int bookID,String title,String author,String genre,boolean availabilityStatus){
        LMS m = new LMS(bookID,title,author,genre,availabilityStatus);
        if(tail==null){
            head=m;
            tail=m;
        }
        else{
            tail.next=m;
            m.prev=tail;
            tail=m;
        }
    }
    void addAtPosition(int bookID,String title,String author,String genre,boolean availabilityStatus,int position){
        LMS m = new LMS(bookID,title,author,genre,availabilityStatus);
        if(position<0){
            System.out.println("Invalid position");
        }
        else if(position==1){
            addAtBeginning(bookID,title,author,genre,availabilityStatus);
        }
        else{
            LMS temp = head;
            for(int i=1;i<position-1;i++){
                temp=temp.next;
            }
            if(temp.next!=null) {
                m.next = temp.next;
                temp.next.prev = m;
                m.prev = temp;
                temp.next = m;
            }
            else {
                addAtEnd(bookID,title,author,genre,availabilityStatus);
            }
        }
    }
    void delete(int bookID){
        LMS temp = head;
        while(temp.bookID!=bookID){
            temp=temp.next;
        }
        if(temp.bookID==bookID && temp.next!=null){
            LMS temp1=temp.prev;
            temp1.next=temp.next;
            temp.next.prev=temp1;
            temp=null;
            System.out.println("The movie with title \""+bookID+"\" is deleted\n");
        }
        else if(temp.bookID==bookID && temp.next==null){
            LMS temp1=temp;
            temp1=temp1.prev;
            temp1.next=null;
            temp=null;
            tail=temp1;
            System.out.println("The book with book ID \""+bookID+"\" is deleted\n");
        }
        else{
            System.out.println("The book with book ID \""+bookID+"\" is not found\n");
        }
    }
    void searchByTitle(String title){
        LMS temp=head;
        while(temp.title!=title && temp.next!=null){
            temp=temp.next;
        }
        if(temp.title==title){
            System.out.println("The book with title \""+title+"\" is found");
        }
        else{
            System.out.println("The book with title \""+title+"\" is not found");
        }
    }
    void searchByAuthor(String author){
        LMS temp=head;
        while(!temp.author.equals(author) && temp.next!=null){
            temp=temp.next;
        }
        if(temp.author.equals(author)){
            System.out.println("The book with author \""+author+"\" is found");
        }
        else{
            System.out.println("The book with author \""+author+"\" is not found");
        }
    }
    void updateAvailabilityStatus(int bookID,boolean availabilityStatus){
        LMS temp=head;
        while(temp.bookID!=bookID){
            temp=temp.next;
        }
        if(temp.bookID==bookID){
            temp.availabilityStatus=availabilityStatus;
        }
        else{
            System.out.println("The book with book ID \""+bookID+"\" is not found");
        }
    }
    void displayListAscending(){
        LMS temp = head;
        System.out.println("\nMovies List Ascending\n-----------");
        while(temp!=null){
            System.out.println("Book ID             : "+temp.bookID);
            System.out.println("Book Title          : "+temp.title);
            System.out.println("Author of the book  : "+temp.author);
            System.out.println("Genre               : "+temp.genre);
            System.out.println("Availability Status : "+temp.availabilityStatus+"\n");
            temp=temp.next;
        }
    }
    void displayListDescending(){
        LMS temp = tail;
        System.out.println("\nMovies List Descending\n-----------");
        while(temp!=null){
            System.out.println("Book ID             : "+temp.bookID);
            System.out.println("Book Title          : "+temp.title);
            System.out.println("Author of the book  : "+temp.author);
            System.out.println("Genre               : "+temp.genre);
            System.out.println("Availability Status : "+temp.availabilityStatus+"\n");
            temp=temp.prev;
        }
    }
}
class Main4{
    public static void main(String[] a){
        LmsDLL m = new LmsDLL();
        m.addAtBeginning(1,"KGF","Prashant Neel","Violence",true);
        m.addAtEnd(2,"Vikram","Lokesh","Action",true);
        m.addAtPosition(3,"Life of PI","Chatterjee","Adventure",false,2);
        m.addAtPosition(4,"Killing spree","Agastha Christine","Mystery",true,4);
        m.displayListAscending();
        m.displayListDescending();
        m.delete(2);
        m.displayListAscending();
        m.displayListDescending();
        m.searchByTitle("KGF");
        m.searchByAuthor("Lokesh");
        m.updateAvailabilityStatus(1,false);
        m.displayListAscending();
    }
}