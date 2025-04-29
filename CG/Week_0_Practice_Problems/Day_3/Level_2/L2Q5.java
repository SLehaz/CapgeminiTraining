import java.util.Scanner;  

class FizzBuzz {  
    public static void main(String[] args) {  
        Scanner scr = new Scanner(System.in);  
        System.out.print("Enter a natural number: ");  
        int n = scr.nextInt();   
            int i = 1;  
            while (i <= n) {  
                if (i % 3 == 0 && i % 5 == 0) {  
                    System.out.println("FizzBuzz");  
                } else if (i % 3 == 0) {  
                    System.out.println("Fizz");  
                } else if (i % 5 == 0) {  
                    System.out.println("Buzz");  
                } else {  
                    System.out.println(i);  
                }  
                i++; 
        }  
    }  
}