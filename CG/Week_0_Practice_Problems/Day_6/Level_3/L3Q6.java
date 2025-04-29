import java.util.Scanner;

class frequency
{
    public static char[] arrcreate(String text)
    {
        return text.toCharArray();
    }

    public static int[] freqarr(char[] charray)
    {
        int[] freq = new int[charray.length];
        freq[0] = 1;

        for (int i = 1; i < charray.length; i++)
        {
            freq[i] = 1;

            for (int j = 0; j < i; j++)
            {
                if(charray[j] == charray[i])
                {
                    freq[i] += freq[j];
                    freq[j] = 0;
                    charray[j] = '0';
                }
            }
        }

        return freq;

    }

    public static String[][] array2d(int[] freq, char[] arr)
    {
        String[][] arr2d = new String[2][freq.length]
;        for (int i = 0; i < freq.length; i++)
        {
            if (freq[i] != 0)
            {
                arr2d[0][i] = String.valueOf(arr[i]);
                arr2d[1][i] = String.valueOf(freq[i]);
            }
            else
            {
                continue;
            }
        }

        return arr2d;
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String text = s.nextLine();
        char[] arr = arrcreate(text);
        int[] freq = freqarr(arr);
        String[][] arr2d = array2d(freq, arr);

        for (int i = 0; i < arr2d[0].length; i++)
        {
            System.out.println("Character " + (i + 1) + ": " + arr2d[0][i]);
            System.out.println("Frequency: " + arr2d[1][i]);
        }
    }
}