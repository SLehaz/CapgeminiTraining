import java.util.Scanner;
class Handshakes{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int n= s.nextInt();
		System.out.println("No. of possible handshakes is "+((n*(n-1))/2));
		s.close();
	}
}