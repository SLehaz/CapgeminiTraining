import java.util.Scanner;
class NumChecker5{

   public void PrimeNum(int n){
	   int flag=0;
    for(int i=1;i<=n/2;i++){
	  if(n%i==0){
		  flag=1;
	    }
	  }
	  if(flag==1){
		  System.out.println("It is not a prime number");
	  }
	  else{
		  System.out.println("It is a prime number");
	  }
	 }
	 
   public void NeonNum(int n){
    if((n==0)||(n==1)||(n==9)){
	    System.out.println("the Number " +n+ " is a Neon number");
	    }
		else{
		  System.out.println("the Number " +n+ " is not a Neon number");}
	  }
	 
   public void SpyNum(int n){
    {
	int lastdigit=n%10;
	int sum=0;
	sum = sum+lastdigit;
	int prod = 1;
	prod = prod+lastdigit;
	  if(sum==prod){
	    System.out.println("the Number " +n+ " is a Spy number");
	    }
		else{
		  System.out.println("the Number " +n+ " is not a Spy number");}
	  }
	 }
	 
   public void  AutomorphicNum(int n){
    int a = n*n;
	int lastdigit= a%10;
	  if(n==a){
	    System.out.println("the Number " +n+ " is a Automorphic number");
	    }
		else{
		  System.out.println("the Number " +n+ " is not a Automorphic number");}
	  	 }
	 
   public void BuzzNum(int n){
    int lastdigit = n%10;
	  if((n%7==0)||(lastdigit == 7)){
	    System.out.println("the Number " +n+ " is a Buzz number");
	    }
		else{
		  System.out.println("the Number " +n+ " is not a Buzz number");}
	 }
public static void main(String[] agrs){
Scanner scn= new Scanner(System.in);
System.out.println("Please enter a number:");
int n = scn.nextInt();
NumChecker5 obj = new NumChecker5();
obj.PrimeNum(n);
obj.NeonNum(n);
obj.SpyNum(n);
obj.AutomorphicNum(n);
obj.BuzzNum(n);
scn.close();}}