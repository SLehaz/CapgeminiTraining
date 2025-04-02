import java.util.Scanner;

class IllegalException
{
    public static String throwError(String sample, int start, int end)
    {
        if (start > end)
        {
            throw new IllegalArgumentException("Start index is greater than end index.");
        }

        return sample.substring(start, end);
    }

    public static void catchError(String sample)
    {
        try
        {
            String result = throwError(sample, sample.length(), 1);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Illegal Argument Provided. " + e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String sample = s.next();
        catchError(sample);
    }
}