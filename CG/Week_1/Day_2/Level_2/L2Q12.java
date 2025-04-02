import java.util.Scanner;
class Weight{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Weight in pounds : ");
		float weight = s.nextFloat();
		System.out.println("The weight of the person in pound is "+weight+" and in kg is "+(weight/2.2));
	}
}