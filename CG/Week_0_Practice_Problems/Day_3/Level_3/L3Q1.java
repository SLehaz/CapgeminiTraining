import java.util.Scanner;  

class FizzBuzz {  
    public static void main(String[] args) {  
        Scanner scr = new Scanner(System.in);  
        System.out.print("Enter the year: ");  
        int n = scr.nextInt();   
        if (n % 400 == 0) {  
                System.out.println(n + " is a Leap Year.");  
            } else if (n % 100 == 0) {  
                System.out.println(n + " is not a Leap Year.");  
            } else if (n % 4 == 0) {  
                System.out.println(n + " is a Leap Year.");  
            } else {  
                System.out.println(n + " is not a Leap Year.");  
            }  
        }  
        }  
