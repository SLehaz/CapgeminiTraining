import java.util.Scanner;

class CountdownFor
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		s.close();
		
		for(int i = number; i > 0; i--)
		{
			System.out.println("Counting down: " + i);
		}
		
		System.out.println("The counter is 0" );
	}
}