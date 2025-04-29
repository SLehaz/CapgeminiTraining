import java.util.Scanner;

class Zara
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		double[] oldSalary = new double[10];
		double[] experience = new double[10];
		double[] newSalary = new double[10];
		double[] bonus = new double[10];
		double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
		
		for (int i = 0; i < oldSalary.length; i++)
		{
            while (true) 
			{
                System.out.println("Enter the salary of person " + (i + 1) + ":");
                oldSalary[i] = s.nextDouble();
                if (oldSalary[i] > 0) 
				{
                    break;
                }
                System.out.println("Please enter a valid salary.");
            }
            totalOldSalary += oldSalary[i];

            while (true) 
			{
                System.out.println("Enter the experience of person " + (i + 1) + ":");
                experience[i] = s.nextDouble();
                if (experience[i] >= 1) 
				{
                    break;
                }
                System.out.println("Please enter a valid experience.");
            }
		}
		
		for (int i = 0; i < bonus.length; i++)
		{
			if (experience[i] >= 5)
			{
				bonus[i] = oldSalary[i] * 0.05d;
			}
			else
			{
				bonus[i] = oldSalary[i] * 0.02d;
			}
			
			newSalary[i] = oldSalary[i] + bonus[i];
			totalBonus += bonus[i];
			totalNewSalary += newSalary[i];
		}
		
		System.out.println("The total Bonus amount is " + totalBonus + ", total old salary is " + totalOldSalary + ", and the total new salary is " + totalNewSalary);
	}
}
		
		
		