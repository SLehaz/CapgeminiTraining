import java.util.Scanner;

class Triangle
{
    public static float perimeter(float side1, float side2, float side3)
    {
        return ((side1 + side2 + side3) / 5.0f);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Side 1: ");
        float side1 = s.nextFloat();
        System.out.println("Enter Side 2: ");
        float side2 = s.nextFloat();
        System.out.println("Enter Side 3: ");
        float side3 = s.nextFloat();

        float rounds = Triangle.perimeter(side1, side2, side3);

        System.out.println("The number of rounds to complete 5 km around the triangle is " + rounds);
    }
}