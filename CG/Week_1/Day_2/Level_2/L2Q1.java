import java.util.Scanner;

class Number
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int number1 = s.nextInt();
		System.out.println("Enter the second number: ");
		int number2 = s.nextInt();
		int c,d;
		if(number1 >= number2)
		{
			c = number1;
			d = number2;
		}
		else
		{
			c = number2;
			d = number1;
		}
		System.out.println("The Quotient is " + (c / d) + " and Reminder is " + (c % d) + " of two number " + c + " and " + d);
	}
}