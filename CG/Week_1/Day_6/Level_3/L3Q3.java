import java.util.Scanner;  

class FirstNonRepeatingCharacter {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String input = scanner.nextLine();  

        char result = findFirstNonRepeatingCharacter(input);  
        if (result != '\0') {  
            System.out.println("First non-repeating character is: " + result);  
        } else {  
            System.out.println("No non-repeating character found.");  
        }  
        
        scanner.close();  
    }  

    public static char findFirstNonRepeatingCharacter(String text) {  
        int[] charFrequency = new int[256];  

        for (int i = 0; i < getStringLength(text); i++) {  
            charFrequency[text.charAt(i)]++;  
        }  

        for (int i = 0; i < getStringLength(text); i++) {  
            if (charFrequency[text.charAt(i)] == 1) {  
                return text.charAt(i);  
            }  
        }  
        return '\0'; // Return null character if none found  
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
}  