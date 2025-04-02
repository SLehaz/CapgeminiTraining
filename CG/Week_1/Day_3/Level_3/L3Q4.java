import java.util.Scanner;  

class PrimeNumber {  
    public static void main(String[] args) {  
        Scanner scr = new Scanner(System.in);  
        
        System.out.print("Enter a number: ");  
        int n = scr.nextInt();  
        
        if (n < 1) {  
            System.out.println("Enter a positive number");  
        } else {  
            boolean isPrime = true; 
            
            for (int i = 2; i <= Math.sqrt(n); i++) {  
                if (n % i == 0) {  
                    isPrime = false;    
                    break;    
                }  
            }  

             
            if (n == 1) {  
                System.out.println("1 is neither prime nor composite.");  
            } else {  
                if (isPrime) {  
                    System.out.println(n + " is a prime number.");  
                } else {  
                    System.out.println(n + " is not a prime number.");  
                }  
            }  
        }  
    }  
}  