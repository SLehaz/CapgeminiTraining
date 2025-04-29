import java.util.Scanner;

class CountDigits
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		int count = 0, temp = number;
		
		while (temp != 0)
		{
			temp = temp / 10;
			count += 1;
		}
		System.out.println("The number of digits in the number " + number + " is " + count);
	}
}