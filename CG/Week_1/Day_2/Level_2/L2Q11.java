import java.util.Scanner;

class SimpleInterest
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Principal Amount: ");
		int principal = s.nextInt();
		System.out.println("Enter the Rate of Interest: ");
		float rate = s.nextFloat();
		System.out.println("Enter the Time: ");
		Float time = s.nextFloat();
		System.out.println("The Simple Interest is " + (((float)principal * rate * time) / 100.0f) + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	}
}