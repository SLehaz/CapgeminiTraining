import java.util.Scanner;

class VowelsCons1 {
    public static String tolower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                result += (char) (str.charAt(i) + 32);
            }
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                result += str.charAt(i);
            }

            if (str.charAt(i) == ' ') {
                result += ' ';
            }
        }
        return result;
    }

    public static String vowelorcons(char c) {
        if ((c < 'a') || (c > 'z')) {
            return "Not a Letter";
        } else if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }

    public static String[][] vowconscount(String text) {
        String[][] chararr = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) < 'a') || (text.charAt(i) > 'z')) {
                continue;
            } else if ((text.charAt(i) == 'a') || (text.charAt(i) == 'e') || (text.charAt(i) == 'i') || (text.charAt(i) == 'o') || (text.charAt(i) == 'u')) {
                chararr[i][0] = String.valueOf(text.charAt(i));
                chararr[i][1] = "Vowel";
            } else {
                chararr[i][0] = String.valueOf(text.charAt(i));
                chararr[i][1] = "Consonant";
            }
        }

        return chararr;
    }

    public static void display(String[][] arr)
    {
        System.out.println("Character \t Type");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i][0] + " \t " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String text = s.nextLine();

        String text1 = tolower(text);

        String[][] countarr = vowconscount(text1);
        display(countarr);
    }
}


