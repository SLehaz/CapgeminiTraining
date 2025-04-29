import java.util.Scanner;

class NumChecker1
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

    public static int sum(int[] arr)
    {
        int sum = 0;
        for (int digit : arr)
        {
            sum += digit;
        }
        System.out.println("The sum of the digits in the number is " + sum);
        return sum;
    }

    public static int sumOfSquares(int[] arr)
    {
        int sumSquares = 0;
        for (int digit : arr)
        {
            sumSquares += Math.pow(digit, 2);
        }

        System.out.println("The sum of the squares of the digits in the number is " + sumSquares);
        return 0;
    }

    public static int harshad(int number, int sum)
    {

        if (number % sum == 0)
        {
            System.out.println("The number is a harshad number.");
        }
        else
        {
            System.out.println("The number is not a harshad number.");
        }

        return 0;
    }

    public static int frequency(int[] arr)
    {
        int[] frequency = new int[10];
        for (int i = 0; i < 10; i++)
        {
            int temp = 0;

            for (int j = 0; j < arr.length; j++)
            {
                if (i == arr[j])
                {
                    temp++;
                }
            }

            frequency[i] = temp;
        }

        System.out.println("The frequency of each digit is:");

        for (int i = 0; i < 10; i++)
        {
            System.out.println(i + " : " + frequency[i]);
        }

        return 0;
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = s.nextInt();

        int count = count(number);
        int[] arr = digits(number, count);
        int sum = sum(arr);
        sumOfSquares(arr);
        harshad(number, sum);
        frequency(arr);

    }
}