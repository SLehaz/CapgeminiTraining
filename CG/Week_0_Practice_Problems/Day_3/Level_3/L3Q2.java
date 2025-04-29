import java.util.Scanner;  

class FizzBuzz {  
    public static void main(String[] args) {  
        Scanner scr = new Scanner(System.in);  
        System.out.print("Enter the year: ");  
        int n = scr.nextInt();   
        if(((n % 4 == 0)&&(n % 100 != 0))|| (n % 400 ==0)){
            System.out.println("it is a leap year");
        }else { System.out.println("it is not a leap year");}
        }  
    }