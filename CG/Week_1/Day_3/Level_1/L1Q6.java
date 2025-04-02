import java.util.Scanner;

class NumberSign
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		
		if (number == 0)
		{
			System.out.println("The number is zero. ");
		}
		else if (number < 0)
		{
			System.out.println("The number is negative. ");
		}
		else
		{
			System.out.println("The number is positive. ");
		}
		s.close();
	}
}