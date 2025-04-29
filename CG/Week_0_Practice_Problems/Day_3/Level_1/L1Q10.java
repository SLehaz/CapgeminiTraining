import java.util.Scanner;
class Zero{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double num = s.nextDouble();
		double sum = 0.0d;
		while(num!=0){
			sum+=num;
			num = s.nextDouble();
		}
		System.out.println("Total value = "+sum);
		s.close();
	}
}
