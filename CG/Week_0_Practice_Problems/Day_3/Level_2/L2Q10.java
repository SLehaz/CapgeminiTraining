import java.util.Scanner;

	class GCDWhile
	{
		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int number = s.nextInt();
			s.close();
			int counter = number - 1;
			
			while (counter >= 1)
			{
				if (number % counter == 0)
				{
					System.out.println("The GCD of the number " + number + " is " + counter);
					break;
				}
				else
				{
					counter = counter - 1;
				}
			}
		}
	}