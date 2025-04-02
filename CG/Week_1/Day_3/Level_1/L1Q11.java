import java.util.Scanner;
class ZeroNeg{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double sum = 0.0d;
		while(true){
			double num = s.nextDouble();
			if(num>0){
				sum+=num;
			}
			else{	
				break;
			}
		}
		System.out.println("Total value = "+sum);
		s.close();
	}
}
