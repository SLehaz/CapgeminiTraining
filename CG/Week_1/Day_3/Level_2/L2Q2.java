import java.util.Scanner;  
class Bonus {  
    public static void main(String[] args) {  
        Scanner scr = new Scanner(System.in);  
        System.out.print("Enter the salary: ");  
        int salary = scr.nextInt(); 
		System.out.print("Enter the Year: ");  
        int n = scr.nextInt(); 
        if (n >= 5) {  
         int bonus = (salary*5/100);
System.out.println("the bonus amount is"+bonus);     }
     else{
	 System.out.println((5-n)+" years to go to get bonus");}		 
}}