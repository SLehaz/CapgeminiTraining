import java.util.Scanner;
import java.io.*;
class Name{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name:");
		String n = s.next();
		System.out.println("Name is "+n);
		s.close();
	}
}