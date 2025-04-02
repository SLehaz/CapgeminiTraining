import java.util.Scanner;

class Natural
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		
		if (number <= 0)
		{
			System.out.println("The number " + number + " is not a natural number. ");
		}
		else
		{
			System.out.println("The sum of " + number + " Natural numbers is " + ((number * (number + 1) ) / 2));
		}
		s.close();
	}
}