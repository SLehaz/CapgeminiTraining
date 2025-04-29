import java.util.Scanner;  

class StringCompare {  
    public static void main(String[] args) {  
        Scanner scn = new Scanner(System.in);  
        System.out.println("Enter string 1:");  
        String a = scn.nextLine();   
        System.out.println("Enter string 2:");  
        String b = scn.nextLine();   

       
        if (a.length() == b.length()) {  
            boolean areSame = true;  
            
            
            for (int i = 0; i < a.length(); i++) {  
                if (a.charAt(i) != b.charAt(i)) {  
                    areSame = false; 
                    break;   
                }  
            }  
            
        
            if (areSame) {  
                System.out.println("The words are the same.");  
            } else {  
                System.out.println("The words are not the same.");  
            }  
        } else {  
            System.out.println("The words are not the same (different lengths).");  
        }  
        
        scn.close();
    }  
}  