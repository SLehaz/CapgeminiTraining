import java.util.Scanner;

class VowelsCons {
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

    public static int[] vowconscount(String text) {
        int vowcount = 0, conscount = 0;

        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) < 'a') || (text.charAt(i) > 'z')) {
                continue;
            } else if ((text.charAt(i) == 'a') || (text.charAt(i) == 'e') || (text.charAt(i) == 'i') || (text.charAt(i) == 'o') || (text.charAt(i) == 'u')) {
                vowcount += 1;
            } else {
                conscount += 1;
            }
        }

        return new int[]{vowcount, conscount};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String text = s.nextLine();

        String text1 = tolower(text);

        for (int i = 0; i < text1.length(); i++) {
            System.out.println("Character " + (i + 1) + ": " + vowelorcons(text1.charAt(i)));
        }

        int[] countarr = vowconscount(text1);

        System.out.println("Number of Vowels: " + countarr[0]);
        System.out.println("Number of Consonants: " + countarr[1]);
    }
}


