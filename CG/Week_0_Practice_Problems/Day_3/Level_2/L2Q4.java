import java.util.Scanner;  
class fizzbuzz {  
    public static void main(String[] args) {  
        Scanner scr = new Scanner(System.in);  
        System.out.print("Enter a natural number: ");  
        int i = scr.nextInt(); 
        if((i%3 == 0)&&(i%5 == 0)){
            System.out.print("FizzBuzz");}
        else if(i%3 == 0){
            System.out.print("Fizz");}
        else if(i%5 == 0){
            System.out.print("Buzz");}
        }
        }