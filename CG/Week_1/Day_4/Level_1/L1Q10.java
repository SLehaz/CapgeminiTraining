import java.util.Scanner;

class FizzBuzzArr
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int number = s.nextInt();
		
		if (number <= 0)
		{
			System.err.print("Please Enter a positive integer.");
			System.exit(0);
		}
		
		String[] arr = new String[number];
		
		for (int i = 0; i < arr.length; i++)
		{
			if ((i % 3 == 0) && (i % 5 == 0))
			{
				arr[i] = "FizzBuzz";
			}
			else if (i % 3 == 0)
			{
				arr[i] = "Fizz";
			}
			else if (i % 5 == 0)
			{
				arr[i] = "Buzz";
			}
			else
			{
				arr[i] = String.valueOf(i);
			}
		}
		
		System.out.print("The output of the array is: ");
		for (int j = 0; j < arr.length; j++)
		{
			System.out.print(arr[j] + " ");
		}
	}
}