import java.util.Scanner;

class Factors
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		
		int maxIndex = 10, currIndex = 0, i = 1;
		int[] factors = new int[maxIndex];
		
		while (i <= number)
		{
			if (currIndex < maxIndex)
			{
				if (number % i == 0)
				{
					factors[currIndex++] = i;
					i++;
					
				}
				else
				{
					i++;
				}
			}
			else
			{
				maxIndex *= 2;
				int[] temp = new int[maxIndex];
				
				for (int j = 0; j < factors.length; j++)
				{
					temp[j] = factors[j];
				}
				factors = temp;
			}
		}
		
		System.out.print("The factors of the number " + number + " are: ");
		for (int j = 0; j < factors.length; j++)
		{
			System.out.print(factors[j] + " ");
		}
	}
}
