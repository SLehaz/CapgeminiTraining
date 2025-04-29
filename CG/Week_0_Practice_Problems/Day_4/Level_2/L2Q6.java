import java.util.Scanner;

class BMIArray
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of persons: ");
		int number = s.nextInt();
		
		float[] weight = new float[number];
		float[] height = new float[number];
		float[] bmi= new float[number];
		String[] status = new String[number];
		
		for (int i = 0; i < number; i++)
		{
			while(true)
			{
				System.out.println("Enter the height of Person " + (i + 1) + ":");
				height[i] = s.nextFloat();
				
				if (height[i] > 0)
				{
					height[i] /= 100.0f;
					break;
				}
				else
				{
					System.out.println("Please Enter a valid Height.");
				}
			}
			
			while(true)
			{
				System.out.println("Enter the Weight of Person " + (i + 1) + ":");
				weight[i] = s.nextFloat();
				
				if (weight[i] > 0)
				{
					break;
				}
				else
				{
					System.out.println("Please Enter a valid Weight.");
				}
			}
			
			bmi[i] = weight[i] / (height[i] * height[i]);
			
			if (bmi[i] <= 18.4)
			{
				status[i] = "Underweight";
			}
			else if(bmi[i] <= 24.9)
			{
				status[i] = "Normal";
			}
			else if (bmi[i] <= 39.9)
			{
				status[i] = "Overweight";
			}
			else
			{
				status[i] = "Obese";
			}
		}
		
		for (int i = 0; i < number; i++)
		{
			System.out.println("Person " + (i + 1) + " is " + status[i] + " with a bmi score of " + bmi[i]);
		}
	}
}