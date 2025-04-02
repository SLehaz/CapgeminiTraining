import java.util.Scanner;

class NumChecker2
{
    public static int count(int number)
    {
        int count = 0;

        while (number > 0)
        {
            number = number / 10;
            count++;
        }

        System.out.println("The number of digits in the number is: " + count);
        return count;
    }

    public static int[] digits(int number, int count)
    {
        int[] arr = new int[count];
        int i = 0;
        while (number > 0)
        {
            arr[i++] = number % 10;
            number /= 10;
        }

        return arr;
    }

    public static int duck(int[] arr)
    {
        for (int digit : arr)
        {
            if (digit == 0)
            {
                System.out.println("The number is not a duck number. ");
                return 0;
            }
        }
        System.out.println("The number is a duck number.");
        return 0;
    }

    public static int[] reverse(int[] arr)
    {
        int[] rev_arr = new int[arr.length];
        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++)
        {
            rev_arr[i] = arr[j--];
        }

        System.out.print("The reversed array is: " );
        for (int i = 0; i < rev_arr.length; i++ )
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return rev_arr;
    }

    public static int pali(int[] arr, int[] rev_arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != rev_arr[i])
            {
                System.out.println("The number is not a palindrome. ");
                return 0;
            }
        }
        System.out.println("The number is a palindrome.");
        return 0;
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = s.nextInt();

        int count = count(number);
        int[] arr = digits(number, count);
        duck(arr);
        int[] rev_arr = reverse(arr);
        pali(arr, rev_arr);

    }
}