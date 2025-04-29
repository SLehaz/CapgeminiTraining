import java.util.Scanner;

class StringOperations {
    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();
        
        char[] userDefinedChars = getCharacters(text);
        char[] builtInChars = text.toCharArray();
        boolean isEqual = compareArrays(userDefinedChars, builtInChars);
        
        System.out.println("Arrays are equal: " + isEqual);
    }
}