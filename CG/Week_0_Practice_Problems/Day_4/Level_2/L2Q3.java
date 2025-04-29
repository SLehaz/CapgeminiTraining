import java.util.Scanner;

class LargestDigit
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long number = s.nextLong();
		int maxDigit = 10, index = 0;
		int[] digits = new int[maxDigit];
		
		while (number > 0)
		{
			if (index < maxDigit)
			{
				int digit = (int)(number % 10);
				digits[index] = digit;
				index++;
				number /= 10;
			}
			else
			{
				break;
			}
		}
		
		for (int i = 0; i < (digits.length - 1); i++)
		{
			for (int j = i + 1;j < digits.length; j++)
			{
				if (digits[i] < digits[j])
				{
					int temp = digits[i];
					digits[i] = digits[j];
					digits[j] = temp;
				}
			}
		}
		System.out.println("The largest element in the array is " + digits[0] + " and the second largest element is " + digits[1]);
	}
}
				