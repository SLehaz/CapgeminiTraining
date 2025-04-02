import java.util.Scanner;  

class StringCompare2 {  
    public static void main(String[] args) {  
        Scanner scn = new Scanner(System.in);  
        System.out.println("Enter the string:");  
        String original = scn.nextLine();  
        System.out.println("Enter the starting index:");  
        int start = scn.nextInt();  
        System.out.println("Enter the ending index:");  
        int end = scn.nextInt();  

        String substringWithCharAt = createSubstringWithCharAt(original, start, end);  
        String substringWithBuiltIn = original.substring(start, end);  

        boolean areSame = compareStringsUsingCharAt(substringWithCharAt, substringWithBuiltIn);  
        
        System.out.println("Substring using charAt(): " + substringWithCharAt);  
        System.out.println("Substring using built-in method: " + substringWithBuiltIn);  

        if (areSame) {  
            System.out.println("The substrings are the same.");  
        } else {  
            System.out.println("The substrings are not the same.");  
        }  

        scn.close();  
    }  

    static String createSubstringWithCharAt(String str, int start, int end) {  
        StringBuilder substring = new StringBuilder();  
        for (int i = start; i < end; i++) {  
            substring.append(str.charAt(i));  
        }  
        return substring.toString();  
    }  

    static boolean compareStringsUsingCharAt(String str1, String str2) {  
        if (str1.length() != str2.length()) {  
            return false;  
        }  
        
        for (int i = 0; i < str1.length(); i++) {  
            if (str1.charAt(i) != str2.charAt(i)) {  
                return false;  
            }  
        }  
        return true;  
    }  
}  