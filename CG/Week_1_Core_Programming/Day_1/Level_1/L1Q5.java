import java.util.Scanner;

class MobilePhone {
    private String brand;
    private String model;
    private int price;

    public void get()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Brand of Phone: ");
        this.brand = s.nextLine();
        System.out.println("Enter the Phone's model: ");
        this.model = s.nextLine();
        System.out.println("Enter the Price of Phone: ");
        this.price = s.nextInt();
    }

    public void display()
    {
        System.out.println("The brand of the phone is: " + brand);
        System.out.println("The phone\'s model is: " + model);
        System.out.println("The price of the phone is: " + price);
    }
}

class MainL1_05
{
    public static void main(String[] args)
    {
        MobilePhone m1 = new MobilePhone();
        m1.get();
        m1.display();
    }
}