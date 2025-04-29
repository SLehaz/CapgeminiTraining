import java.util.Scanner;

class Divisible
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		s.close();
		if (number % 5 == 0)
		{
			System.out.println("The number " + number + " is divisible by 5.");
		}
		else
		{
			System.out.println("The number " + number + " is not divisible by 5.");
		}
	}
}