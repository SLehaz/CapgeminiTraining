class Book{
    String title;
    int publicationYear;
    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
}
class Author extends Book{
    String name;
    String bio;
    Author(String name,String bio,String title,int publicationYear){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    void displayInfo(){
        System.out.println("Author : "+name);
        System.out.println("Bio : "+bio);
        System.out.println("Title : "+title);
        System.out.println("Publication Year : "+publicationYear);
    }
}
class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Chetan Bhagat","An IITian","The Life of Pi",2011);
        Author a2 = new Author("Badoni","Sci-fi writer","Hanu-man",2010);
        a1.displayInfo();
        a2.displayInfo();
    }
}