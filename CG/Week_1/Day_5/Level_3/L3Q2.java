import java.util.Scanner;

class NumChecker
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
            }
        }
        System.out.println("The number is a duck number.");
        return 0;
    }

    public static int armstrong(int[] arr, int number)
    {
        int sum = 0;
        for (int digit : arr)
        {
            sum += Math.pow(digit, arr.length);
        }

        if (sum == number)
        {
            System.out.println("The number is an armstrong number.");
        }
        else
        {
            System.out.println("The number is an armstrong number.");
        }
        return 0;
    }

    public static int largest(int[] arr)
    {
        int[] lar_arr = new int[2];
        lar_arr[0] = lar_arr[1] = Integer.MIN_VALUE;

        for (int digit : arr)
        {
            if (digit > lar_arr[0])
            {
                if (digit > lar_arr[1])
                {
                    lar_arr[0] = lar_arr[1];
                    lar_arr[1] = digit;
                }
                else
                {
                    lar_arr[0] = digit;
                }
            }
        }

        System.out.println("The largest digit is " + lar_arr[1] + ", and the second largest digit is " + lar_arr[0]);
        return 0;
    }

    public static int smallest(int[] arr)
    {
        int[] sma_arr = new int[2];
        sma_arr[0] = sma_arr[1] = Integer.MAX_VALUE;

        for (int digit : arr)
        {
            if (digit < sma_arr[0])
            {
                if (digit < sma_arr[1])
                {
                    sma_arr[0] = sma_arr[1];
                    sma_arr[1] = digit;
                }
                else
                {
                    sma_arr[0] = digit;
                }
            }
        }

        System.out.println("The smallest digit is " + sma_arr[1] + ", and the second smallest digit is " + sma_arr[0]);
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
        armstrong(arr, number);
        largest(arr);
        smallest(arr);

    }
}