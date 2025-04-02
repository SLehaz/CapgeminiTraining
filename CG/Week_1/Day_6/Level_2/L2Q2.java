import java.util.Scanner;

class TextSplitter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] customSplitWords = customSplit(input);
        String[] builtInSplitWords = input.split(" ");

        boolean areEqual = compareArrays(customSplitWords, builtInSplitWords);
        System.out.println("Are the results equal? " + areEqual);

        scanner.close();
    }

    public static String[] customSplit(String text) {
        int wordCount = 0;
        int[] spaceIndexes = new int[countSpaces(text)];

        for (int i = 0; i < getStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[wordCount++] = i;
            }
        }

        String[] words = new String[wordCount + 1];
        int startIndex = 0;
        int wordIndex = 0;

        for (int index : spaceIndexes) {
            words[wordIndex++] = text.substring(startIndex, index);
            startIndex = index + 1;
        }
        words[wordIndex] = text.substring(startIndex); // Last word

        return words;
    }

    public static int countSpaces(String text) {
        int count = 0;
        for (int i = 0; i < getStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int getStringLength(String str) {
        int length = 0;
        while (true) {
            try {
                str.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}