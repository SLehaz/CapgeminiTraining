import java.util.Scanner;

class Vote
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the person's age: ");
		int age = s.nextInt();
		
		if (age >= 18)
		{
			System.out.println("The person can vote. ");
		}
		else
		{
			System.out.println("The person cannot vote. ");
		}
		s.close();
	}
}