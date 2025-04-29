import java.util.Scanner;
class Area{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius: ");
		float r = s.nextFloat();
		float a = 22*r*r/7;
		System.out.println("Area = "+a);
	}
}