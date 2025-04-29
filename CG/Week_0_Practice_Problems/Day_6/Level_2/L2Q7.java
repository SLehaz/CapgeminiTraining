import java.util.Scanner;

class Trim
{
    public static String trimmer(String text)
    {
        int count = 0;

        while (text.charAt(count) == ' ')
        {
            count++;
        }

        String str = text.substring(count);

        int i = str.length() - 1;

        while (str.charAt(i) == ' ')
        {
            i--;
        }

        String str1 = str.substring(0, i + 1);

        return str1;
    }

    public static String sub(String text, int start, int end)
    {
        String str = "";

        for (int i = start; i < end + 1; i++)
        {
            str += text.charAt(i);
        }

        return str;
    }

    public static boolean compare(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string 1: ");
        String text1 = s.nextLine();
        System.out.println("Enter String 2: ");
        String text2 = s.nextLine();

        String text1trim = trimmer(text1);
        String text2trim = trimmer(text2);
        
        
        System.out.println("Trimmed String 1: " + text1trim);
        System.out.println("Trimmed String 2: " + text2trim);


        System.out.println("Enter start index for substring: ");
        int start = s.nextInt();
        System.out.println("Enter end index for substring: ");
        int end = s.nextInt();

        String subtext1 = sub(text1, start, end);
        String subtext2 = sub(text2, start, end);

        boolean flag = compare(subtext1, subtext2);

        if (flag)
        {
            System.out.println("The Strings are equal");
        }
        else
        {
            System.out.println("The strings are not equal");
        }
    }
}