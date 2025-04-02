import java.util.Scanner;

class Handshakes1
{
    public static int handcal(int numberOfStudents)
    {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int numberOfStudents = s.nextInt();

        int combinations = handcal(numberOfStudents);

        System.out.println("The number of possible handshakes is " + combinations);
    }
}