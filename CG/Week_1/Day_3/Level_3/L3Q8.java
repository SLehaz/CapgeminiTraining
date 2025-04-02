import java.util.Scanner;

class Harshad
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		int sum = 0, originalNumber = number;
		
		while (originalNumber != 0)
		{
			int rem = originalNumber % 10;
			sum += rem;
			
			originalNumber = originalNumber / 10;
		}
		if (number % sum == 0)
		{
			System.out.println("The number " + number + " is an harshad number. ");
		}
		else
		{
			System.out.println("The number " + number + " is not an harshad number. ");
		}
	}
}