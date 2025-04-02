import java.util.Scanner;

class StringBoundException
{
    public static char exceptthrow(String sample)
    {
        char result = sample.charAt(sample.length());

        return result;
    }

    public static void exceptcatch(String sample)
    {
        try
        {
            char result = exceptthrow(sample);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Index out of bounds: " + e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String sample = s.next();
        exceptcatch(sample);

    }
}