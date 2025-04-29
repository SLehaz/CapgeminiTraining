import java.util.Scanner;

class IntOperation
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number (a): ");
		int a = s.nextInt();
		System.out.println("Enter the second number (b): ");
		int b = s.nextInt();
		System.out.println("Enter the third number (c): ");
		int c = s.nextInt();
		s.close();
		int firstResult = a + b * c;
		int secondResult = a * b + c;
		int thirdResult = c + a / b;
		int fourthResult = a % b + c;
		System.out.println("The results of Int Operations are " + (firstResult) + ", " + secondResult + ", " + thirdResult + " and " + fourthResult);
	}
}