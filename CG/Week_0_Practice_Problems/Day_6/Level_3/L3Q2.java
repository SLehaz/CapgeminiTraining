import java.util.Scanner;  

class UniqueCharacterFinder {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String input = scanner.nextLine();  

        char[] uniqueChars = findUniqueCharacters(input);  
        System.out.println("Unique characters: ");  
        for (char c : uniqueChars) {  
            if (c != '\0') {  
                System.out.print(c + " ");  
            }  
        }  
        
        scanner.close();  
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

    public static char[] findUniqueCharacters(String text) {  
        int length = getStringLength(text);  
        char[] uniqueChars = new char[length];  
        int uniqueIndex = 0;  

        for (int i = 0; i < length; i++) {  
            char currentChar = text.charAt(i);  
            boolean isUnique = true;  

            for (int j = 0; j < i; j++) {  
                if (text.charAt(j) == currentChar) {  
                    isUnique = false;  
                    break;  
                }  
            }  

            if (isUnique) {  
                uniqueChars[uniqueIndex++] = currentChar;  
            }  
        }  
        return uniqueChars;  
    }  
}  