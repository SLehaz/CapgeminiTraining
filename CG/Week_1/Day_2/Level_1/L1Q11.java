import java.util.Scanner;

class Calculator
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		float number1 = s.nextFloat();
		System.out.println("Enter the Second Number: ");
		float number2 = s.nextFloat();
		s.close();
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + (number1 + number2) + ", " + (number1 - number2) + ", " + (number1 * number2) + " and " + (number1 / number2));
	}
}