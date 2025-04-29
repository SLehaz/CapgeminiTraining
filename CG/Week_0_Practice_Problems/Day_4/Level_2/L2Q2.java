import java.util.Scanner;

class AAA
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int[] height = new int[3];
		int[] age = new int[3];
		String[] names = {"Amar", "Akbar", "Antony"};
		int youngest = 0, tallest = 0, maxHeight = 0, minAge = 100;
		
		for (int i = 0; i < height.length; i++)
		{
			while(true)
			{
				System.out.println("Enter the height of " + names[i] + ":");
				height[i] = s.nextInt();
				
				if (height[i] > 0)
				{
					break;
				}
				else
				{
					System.out.println("Please Enter a valid Height.");
				}
			}
			
			if (height[i] > maxHeight)
			{
				maxHeight = height[i];
				tallest = i;
			}
			
			while(true)
			{
				System.out.println("Enter the age of " + names[i] + ":");
				age[i] = s.nextInt();
				
				if (age[i] > 0)
				{
					break;
				}
				else
				{
					System.out.println("Please Enter a valid age.");
				}
			}
			
			if (age[i] < minAge)
			{
				minAge = age[i];
				youngest = i;
			}
		}
		
		System.out.println("The Youngest Person is " + names[youngest] + " with age of " + minAge);
		System.out.println("The Tallest Person is " + names[tallest] + " with age of " + maxHeight);
	}
}