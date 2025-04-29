class Movie{
    String title,director;
    int yearOfRelease;
    double rating;
    Movie next,prev;
    Movie(String title,String director,int yearOfRelease,double rating){
        this.title=title;
        this.director=director;
        this.yearOfRelease=yearOfRelease;
        this.rating=rating;
        this.next=null;
        this.prev=null;
    }
}
class MovieDLL{
    Movie head = null;
    Movie tail = null;
    void addAtBeginning(String title,String director,int yearOfRelease,double rating){
        Movie m = new Movie(title,director,yearOfRelease,rating);
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
    void addAtEnd(String title,String director,int yearOfRelease,double rating){
        Movie m = new Movie(title,director,yearOfRelease,rating);
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
    void addAtPosition(String title,String director,int yearOfRelease,double rating,int position){
        Movie m = new Movie(title,director,yearOfRelease,rating);
        if(position<0){
            System.out.println("Invalid position");
        }
        else if(position==1){
            addAtBeginning(title,director,yearOfRelease,rating);
        }
        else{
            Movie temp = head;
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
                addAtEnd(title, director, yearOfRelease, rating);
            }
        }
    }
    void delete(String title){
        Movie temp = head;
        while(temp.title!=title){
            temp=temp.next;
        }
        if(temp.title==title && temp.next!=null){
            Movie temp1=temp.prev;
            temp1.next=temp.next;
            temp.next.prev=temp1;
            temp=null;
            System.out.println("The movie with title \""+title+"\" is deleted\n");
        }
        else if(temp.title==title && temp.next==null){
            Movie temp1=temp;
            temp1=temp1.prev;
            temp1.next=null;
            temp=null;
            tail=temp1;
            System.out.println("The movie with title \""+title+"\" is deleted\n");
        }
        else{
            System.out.println("The movie with title \""+title+"\" is not found\n");
        }
    }
    void searchByRating(double rating){
        Movie temp=head;
        while(temp.rating!=rating){
            temp=temp.next;
        }
        if(temp.rating==rating){
            System.out.println("The movie with rating "+rating+" is found");
        }
        else{
            System.out.println("The movie with rating "+rating+" is not found");
        }
    }
    void searchByDirector(String director){
        Movie temp=head;
        while(!temp.director.equals(director)){
            temp=temp.next;
        }
        if(temp.director.equals(director)){
            System.out.println("The movie with director \""+director+"\" is found");
        }
        else{
            System.out.println("The movie with director \""+director+"\" is not found");
        }
    }
    void updateRating(String title,double newRating){
        Movie temp=head;
        while(!temp.title.equals(title)){
            temp=temp.next;
        }
        if(temp.title.equals(title)){
            temp.rating=newRating;
        }
        else{
            System.out.println("The movie with Title \""+title+"\" is not found");
        }
    }
    void displayListAscending(){
        Movie temp = head;
        System.out.println("\nMovies List Ascending\n-----------");
        while(temp!=null){
            System.out.println("Movie Title     : "+temp.title);
            System.out.println("Movie Director  : "+temp.director);
            System.out.println("Year of Release : "+temp.yearOfRelease);
            System.out.println("Rating          : "+temp.rating+"\n");
            temp=temp.next;
        }
    }
    void displayListDescending(){
        Movie temp = tail;
        System.out.println("\nMovies List Descending\n-----------");
        while(temp!=null){
            System.out.println("Movie Title     : "+temp.title);
            System.out.println("Movie Director  : "+temp.director);
            System.out.println("Year of Release : "+temp.yearOfRelease);
            System.out.println("Rating          : "+temp.rating+"\n");
            temp=temp.prev;
        }
    }
}
class Main1{
    public static void main(String[] a){
        MovieDLL m = new MovieDLL();
        m.addAtBeginning("KGF 2","Prashant Neel",2022,9.5);
        m.addAtEnd("Leo","Lokesh",2023,9.1);
        m.addAtPosition("Vikram","Lokesh",2022,9.2,2);
        m.addAtPosition("Vikram 2","Lokesh",2026,10,4);
        m.displayListAscending();
        m.displayListDescending();
        m.delete("Vikram 2");
        m.displayListAscending();
        m.displayListDescending();
        m.searchByRating(9.2);
        m.searchByDirector("Lokesh");
        m.updateRating("KGF 2",10);
        m.displayListAscending();
    }
}