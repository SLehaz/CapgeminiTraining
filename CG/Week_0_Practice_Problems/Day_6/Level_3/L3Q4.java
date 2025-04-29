import java.util.Scanner;

class Frequency2D

{

    public static int[] freqarr(String text)
    {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length();i++)
        {
            int x = (int) (text.charAt(i));

            frequency[x] += 1;
        }

        return frequency;
    }

    public static String[][] freq2d(int[] frequency, String text)
    {
        String[][] arr2d = new String[2][frequency.length];

        for (int i = 0; i < frequency.length; i++)
        {
            if (frequency[i] != 0)
            {
                arr2d[0][i] = Character.toString((char) i);
                arr2d[1][i] = String.valueOf(frequency[i]);
            }
        }

        return arr2d;

    }

    public static String[][] freq2d01(int[] frequency, String text)
    {
        String[][] arr2d = new String[2][text.length()];

        for (int i = 0; i < text.length(); i++)
        {
            if (frequency[(int) (text.charAt(i))] != 0)
            {
                arr2d[0][i] = Character.toString(text.charAt(i));
                arr2d[1][i] = String.valueOf(frequency[(int) (text.charAt(i))]);
            }
        }

        return arr2d;

    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String text = s.nextLine();
        int[] frequency = freqarr(text);
        String[][] freqarr2d = freq2d01(frequency, text);

        for (int i = 0; i < freqarr2d[0].length; i++)
        {
            System.out.println("Character " + (i + 1) + ": " + freqarr2d[0][i]);
            System.out.println("Frequency: " + freqarr2d[1][i]);
        }
    }
}