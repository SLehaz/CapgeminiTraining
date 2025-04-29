import java.util.Scanner;  

class TextLengthSplitter {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter a sentence: ");  
        String input = scanner.nextLine();  

        String[] words = customSplit(input);  
        String[][] wordsWithLengths = getWordsWithLengths(words);  

        displayWordsWithLengths(wordsWithLengths);  

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
        words[wordIndex] = text.substring(startIndex);  

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

    public static String[][] getWordsWithLengths(String[] words) {  
        String[][] wordsWithLengths = new String[words.length][2];  
        for (int i = 0; i < words.length; i++) {  
            wordsWithLengths[i][0] = words[i]; // Word  
            wordsWithLengths[i][1] = String.valueOf(getStringLength(words[i])); // Length  
        }  
        return wordsWithLengths;  
    }  

    public static void displayWordsWithLengths(String[][] wordsWithLengths) {  
        System.out.println("\nWord\t\tLength");  
        System.out.println("-----------------------");  
        for (String[] wordInfo : wordsWithLengths) {  
            String word = wordInfo[0];  
            int length = Integer.parseInt(wordInfo[1]);  
            System.out.printf("%s\t\t%d\n", word, length);  
        }  
    }  
}  