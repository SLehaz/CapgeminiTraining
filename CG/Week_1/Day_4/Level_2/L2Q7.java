import java.util.Scanner;

class BMI2D

{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of persons: ");
		int number = s.nextInt();
		
		double[][] personData = new double[number][3];
		String[] status = new String[number];
		
		for (int i = 0; i < number; i++)
		{
			int j = 0;
			
			while(true)
			{
				System.out.println("Enter the Height of person " + (i + 1) + ":");
				personData[i][j] = s.nextDouble();
				
				if (personData[i][j] > 0)
				{
					personData[i][j] = personData[i][j] / 100.0d;
					j++;
					break;
				}
				else
				{
					System.out.println("Please Enter a valid height.");
				}
			}
			
			while(true)
			{
				System.out.println("Enter the Weight of person " + (i + 1) + ":");
				personData[i][j] = s.nextDouble();
				
				if (personData[i][j] > 0)
				{
					j++;
					break;
				}
				else
				{
					System.out.println("Please Enter a valid Weight.");
				}
			}
			
			personData[i][j] = personData[i][1] / (personData[i][0] * personData[i][0]);
			
			if (personData[i][j] <= 18.4)
			{
				status[i] = "Underweight";
			}
			else if(personData[i][j] <= 24.9)
			{
				status[i] = "Normal";
			}
			else if (personData[i][j] <= 39.9)
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
			System.out.println("Person " + (i + 1) + " Is " + status[i] + " With a height of " + personData[i][0] + " cm and weight of " + personData[i][1] + " Kg and a BMI score of " + personData[i][2]);
		}
	}
}