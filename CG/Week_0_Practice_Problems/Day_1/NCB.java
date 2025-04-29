import java.util.Scanner;

class Ncb{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String name = s.nextLine();
		String clg= s.nextLine();
		String dept= s.nextLine();
		System.out.println("Name : "+name);
		System.out.println("College : "+clg);
		System.out.println("Dept : "+dept);
		s.close();
	}
}