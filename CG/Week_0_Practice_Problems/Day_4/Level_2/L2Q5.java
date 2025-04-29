import java.util.Scanner;

class Reverse
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		int temp = number, count = 0, num1 = 0;
		
		while (temp != 0)
		{
			temp /= 10;
			count++;
		}
		
		int[] arr = new int[count];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = number % 10;
			number /=10;
			num1 += arr[i] * Math.pow(10, (arr.length - 1 - i));
		}
		
		System.out.print("The reversed array is: " + num1);
	}
}
