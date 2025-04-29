import java.util.Scanner;

class frequniq
{
    public static String[] arrcreate(String text)
    {
        String unique = Character.toString(text.charAt(0));
        for (int i = 1; i < text.length(); i++)
        {
            boolean flag = true;

            for (int j = 0; j < i; j++)
            {
                if(text.charAt(j) == text.charAt(i))
                {
                    flag = false;
                    break;
                }
            }

            if (flag)
            {
                unique += text.charAt(i);
            }
        }

        return unique.split("");
    }


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

    public static String[][] freq2d(int[] frequency, String[] arr)
    {
        String[][] arr2d = new String[2][arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            char ch = arr[i].charAt(0);
            int j = (int) ch;
            if ( frequency[j] != 0)
            {
                arr2d[0][i] = arr[i];
                arr2d[1][i] = String.valueOf(frequency[j]);
            }
        }

        return arr2d;

    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String text = s.nextLine();
        String[] arr = arrcreate(text);
        for (String ch : arr)
        {
            System.out.println(ch);
        }

        int[] freq = freqarr(text);

        String[][] arr2d = freq2d(freq, arr);

        for (int i = 0; i < arr2d[0].length; i++)
        {
            System.out.println("Character " + (i + 1) + ": " + arr2d[0][i]);
            System.out.println("Frequency: " + arr2d[1][i]);
        }
    }
}