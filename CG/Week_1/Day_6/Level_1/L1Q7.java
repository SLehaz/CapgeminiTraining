import java.util.Scanner;

class NFExcept
{

    public static int throwErr(String sample)
    {
        return Integer.parseInt(sample);
    }

    public static void catchErr(String sample)
    {
        try
        {
            throwErr(sample);
        }
        catch (NumberFormatException e)
        {
            System.out.println("String does not contain any number. " + e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String sample = s.next();
        catchErr(sample);
    }


}