import java.util.Scanner;  
class OddEvenChecker {  
    public static void main(String[] args) {  
        Scanner scr = new Scanner(System.in);  
        System.out.print("Enter a natural number: ");  
        int n = scr.nextInt();  

        
        if (n < 1) {  
            System.out.println("Please enter a positive integer greater than 0.");  
            return;  
        }  

    
        for (int i = 1; i <= n; i++) {  
            if (i % 2 == 0) {  
                System.out.println(i+"is an even number.");  
            } else {  
                System.out.println(i+" is an odd number.");  
            }  
        }  
    }  
}