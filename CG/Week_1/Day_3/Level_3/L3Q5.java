import java.util.Scanner;

class Armstrong
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
			sum += Math.pow(rem,3);
			
			originalNumber = originalNumber / 10;
		}
		if (number == sum)
		{
			System.out.println("The number " + number + " is an armstrong number. ");
		}
		else
		{
			System.out.println("The number " + number + " is not an armstrong number. ");
		}
	}
}