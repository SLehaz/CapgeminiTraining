import java.util.Scanner;

class SpringSeason
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Month: ");
		String month = s.nextLine();
		System.out.println("Enter the Date: ");
		int date = s.nextInt();
		
		if (month.equals("april") || month.equals("may") || (month.equals("march") && date >= 20) || (month.equals("june") && date <= 20))
		{
			System.out.println("It is spring season. ");
		}
		else
		{
			System.out.println("It is not spring season. ");
		}
		s.close();
	}
}