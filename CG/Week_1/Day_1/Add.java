import java.util.Scanner;
import java.io.*;
class Add{
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int n1= n.nextInt();
		System.out.println("Enter number 2:");
		int n2= n.nextInt();
		int ans=n1+n2;
		System.out.println("Answer = "+ans);
		
	}
}
