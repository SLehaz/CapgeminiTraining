import java.util.Scanner;


class L204
{
    public static String[] SplitWords(String text, String[] arr)
    {
        int count = 0;
        String adder = "";

        for (int i = 0; i < text.length();i++)
        {
            if (text.charAt(i) == ' ')
            {
                if (adder.length() > 0)
                {
                    arr[count++] = adder;
                    adder = "";
                }
            }
            else
            {
                adder = adder + text.charAt(i);
            }
        }

        if (adder.length() > 0 && count < arr.length)
        {
            arr[count] = adder;
        }

        return arr;
    }


    public static int findlength(String text)
    {
        String adder = "";
        int count = 0;

        while ( !adder.equals(text))
        {
            adder = adder + (text.charAt(count));
            count += 1;
        }

        return count;
    }

    public static String[][] arrconvert(String[] arr, int count)
    {
        String[][] arr2d = new String[2][count];

        for (int i = 0; i < arr.length; i++)
        {
            arr2d[0][i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++)
        {
            arr2d[1][i] = String.valueOf(arr[i].length());
        }

        return arr2d;
    }

    public static int[] shortAndLong(String[][] arr2d)
    {
        int[] arrlen = new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE};

        for (int i = 0; i < arr2d[0].length; i++)
        {
            if (Integer.parseInt(arr2d[1][i]) < arrlen[0])
            {
                arrlen[0] = Integer.parseInt(arr2d[1][i]);
            }

            if (Integer.parseInt(arr2d[1][i]) > arrlen[1])
            {
                arrlen[1] = Integer.parseInt(arr2d[1][i]);
            }
        }

        return arrlen;
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of words: ");
        int number = s.nextInt();
        s. nextLine();
        String[] arr = new String[number];
        System.out.println("Enter the text: ");
        String text = s.nextLine();
        String[] arr1 = SplitWords(text, arr);

        for (int i = 0; i < arr1.length; i++)
        {
            System.out.println("Word " + (i+1) + ": " + arr1[i]);
        }
        System.out.println("The length of the text is: " + findlength(text));

        String[][] arr2d = arrconvert(arr, arr1.length);

        for (int i = 0; i < arr1.length; i++)
        {
            System.out.println("Word " + (i+1) + ": " + arr2d[0][i]);
            System.out.println("Length: " + arr2d[1][i]);
        }

        int[] countarr = shortAndLong(arr2d);

        System.out.println("The shortest length is: " + countarr[0]);
        System.out.println("The longest length is: " + countarr[1]);

    }
}