import java.util.Scanner;

class GCD
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		s.close();
		
		for (int i = number - 1; i >= 1; i -- )
		{
			if (number % i == 0)
			{
				System.out.println("The GCD of the number " + number + " is " + i);
				break;
			}
		}
	}
}