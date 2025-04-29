import java.util.Scanner;
class LargeAndSmall {
    void Largest(int a,int b,int c){
		 if (a >= b && a >= c) {  
            System.out.println(a+" is the largest number");  
        }
		else if (b >= a && b >= c) {  
            System.out.println(b+" is the smallest"); 
        } 
		else {  
            System.out.println(c+" is the largest number"); 

	}}
		void Smallest(int a,int b,int c){
			 if (a <= b && a <= c) {  
           	System.out.println(a+ "is the smallest number");  
        } else if (b <= a && b <= c) {  
            System.out.println(b+"is the smallest number"); 
        } else {  
            System.out.println(c+"is the smallest number");}  
					
		}
    
    public static void main(String[] args) {
        LargeAndSmall obj = new LargeAndSmall();
        Scanner s= new Scanner(System.in);
        System.out.println("enter the numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        obj.Largest(a,b,c);
		obj.Smallest(a,b,c);
        }
    }
