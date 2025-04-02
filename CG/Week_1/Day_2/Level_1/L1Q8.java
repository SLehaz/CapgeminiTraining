import java.util.Scanner;
class Miles{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double km = s.nextDouble();
		System.out.println("The total miles is "+(km*1.6)+" mile for the given "+km+" km");
	}
}