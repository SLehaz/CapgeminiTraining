import java.util.Scanner;

class Factors
{
    public static int[] fact(int number)
    {
        int count = 0, j = 0;

        for (int i = 1; i < number / 2; i++)
        {
            if (number % i == 0)
            {
                count++;
            }
        }
        int[] factors = new int[count];

        for (int i = 1; i < number / 2; i++)
        {
            if (number % i == 0) {
                factors[j] = i;
                j++;
            }
        }

        return factors;
    }

    public static int sumfactors(int[] factors)
    {
        int sum = 0;
        for (int factor : factors)
        {
            sum += factor;
        }
        return sum;
    }

    public static long productfactors(int[] factors)
    {
        long product = 1;
        for (int factor : factors)
        {
            product *= factor;
        }
        return product;
    }

    public static int productsumfactors(int[] factors)
    {
        int productsum = 0;
        for (int factor : factors) {
            productsum += (int) Math.pow(factor, 2);
        }
        return productsum;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = s.nextInt();
        int[] factors = fact(number);
        int sum = sumfactors(factors);
        long product = productfactors(factors);
        int productsum = productsumfactors(factors);
        System.out.print("The factors of the number " + number +  " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("The sum of factors are " + sum + ", the product of factors are " + product + ", and the sum of products are " + productsum);
    }
}