import java.util.Scanner;

class Natural
{
    public static int recursive(int number)
    {
        if (number == 1)
        {
            return 1;
        }
        else
        {
            return (number + recursive(number - 1));
        }
    }

    public static int formula(int number)
    {
        return (number * (number + 1) / 2);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int number;
        while(true)
        {
            System.out.print("Enter the number: ");
            number = s.nextInt();

            if (number > 0)
            {
                break;
            }
            else
            {
                System.out.println("Please enter a valid number. ");
            }
        }

        int recResult = recursive(number);
        int formResult = formula(number);

        if (recResult == formResult)
        {
            System.out.println("Both the results are same with sum being " + recResult);
        }
        else
        {
            System.err.println("Both results are not equal. Check code.");
            System.err.println("Recursive Result: " + recResult);
            System.err.println("Formula Result: " + formResult);
        }

    }
}