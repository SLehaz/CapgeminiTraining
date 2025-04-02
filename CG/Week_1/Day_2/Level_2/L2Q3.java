import java.util.Scanner;

class DoubleOperation
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number (a): ");
		Double a = s.nextDouble();
		System.out.println("Enter the second number (b): ");
		Double b = s.nextDouble();
		System.out.println("Enter the third number (c): ");
		Double c = s.nextDouble();
		s.close();
		Double firstResult = a + b * c;
		Double secondResult = a * b + c;
		Double thirdResult = c + a / b;
		Double fourthResult = a % b + c;
		System.out.println("The results of Double Operations are " + (firstResult) + ", " + secondResult + ", " + thirdResult + " and " + fourthResult);
	}
}