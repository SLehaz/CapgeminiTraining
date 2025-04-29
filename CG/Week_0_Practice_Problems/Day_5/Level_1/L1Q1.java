import java.util.Scanner;

class SI
{
    public static float simpleInterest(float principal, float rate, float year)
    {
        return (principal * rate * year) / 100.0f;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        float principal = s.nextFloat();
        System.out.println("Enter the rate of interest: ");
        float rate = s.nextFloat();
        System.out.println("Enter the number of years: ");
        float year = s.nextFloat();

        float interest = SI.simpleInterest(principal, rate, year);
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + year);
    }
}