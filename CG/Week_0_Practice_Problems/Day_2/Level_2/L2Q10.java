import java.util.Scanner;
class Divide{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total no. of. chocolates : ");
		int numberOfchocolates = s.nextInt();
		System.out.println("Enter total no. of. children : ");
		int numberOfchildren = s.nextInt();
		System.out.println("The number of chocolates each child gets is "+(numberOfchocolates/numberOfchildren)+" and the number of remaining chocolates are "+(numberOfchocolates%numberOfchildren));
		s.close();
	}
}
