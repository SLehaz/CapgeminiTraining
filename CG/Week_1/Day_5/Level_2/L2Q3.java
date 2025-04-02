import java.util.Scanner;

class LeapYear
{
    public static boolean check(int year)
    {
        if (year >= 1582)
        {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int number = s.nextInt();
        if(check(number))
        {
            System.out.println("The year is a leap year.");
        }
        else
        {
            System.out.println("The year is a not a leap year.");
        }
    }
}