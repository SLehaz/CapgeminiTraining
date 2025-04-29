class Library {
    private String title;
    private String author;
    private int price;
    private boolean availability;

    public Library(String title, String author, int price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void borrow() {
        if (availability) {
            System.out.println("The book \"" + title + "\" is available. Please proceed with the payment.");
            availability = false;
        } else {
            System.out.println("The book \"" + title + "\" is not available! We will notify you when it is.");
        }
    }

    public static void main(String[] args) {
        Library book1 = new Library("Atomic Habits", "James Clear", 430, true);
        book1.borrow();
        book1.borrow();
    }
}