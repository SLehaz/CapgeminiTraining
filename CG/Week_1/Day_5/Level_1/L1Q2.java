import java.util.Scanner;

class Handshakes
{
    public static int hscal(int number)
    {
        return (number * (number - 1)) / 2;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int number = s.nextInt();

        int combinations = Handshakes.hscal(number);

        System.out.println("The number of possible handshakes is " + combinations);
    }
}