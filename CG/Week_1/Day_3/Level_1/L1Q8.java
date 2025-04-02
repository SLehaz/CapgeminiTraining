import java.util.Scanner;

class Countdown
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		s.close();
		
		while(number > 0)
		{
			System.out.println("Counting down: " + number);
			number = number - 1;
		}
		
		System.out.println("The counter is " + number);
	}
}