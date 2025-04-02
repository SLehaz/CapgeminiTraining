import java.util.Scanner;

class DoubleOperation
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number (a): ");
		double a = s.nextDouble();
		System.out.println("Enter the second number (b): ");
		double b = s.nextDouble();
		System.out.println("Enter the third number (c): ");
		double c = s.nextDouble();
		s.close();
		double firstResult = a + b * c;
		double secondResult = a * b + c;
		double thirdResult = c + a / b;
		double fourthResult = a % b + c;
		System.out.println("The results of Double Operations are " + (firstResult) + ", " + secondResult + ", " + thirdResult + " and " + fourthResult);
	}
}