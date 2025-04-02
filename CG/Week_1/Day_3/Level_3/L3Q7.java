import java.util.Scanner;

class BMI
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the weight of the person: ");
		double weight = s.nextDouble();
		System.out.println("Enter the height of the person: ");
		double height = s.nextDouble();
		height = height/100.0d;
		
		double bmi = (weight / (height * height));
		
		if (bmi <= 18.4)
		{
			System.out.println("The person is Underweight with BMI of " + bmi);
		}
		else if(bmi >= 18.5 && bmi <= 24.9)
		{
			System.out.println("The person is Normal with BMI of " + bmi);
		}
		else if (bmi >= 25.0 && bmi <= 39.9)
		{
			System.out.println("The person is Overweight with BMI of " + bmi);
		}
		else
		{
			System.out.println("The person is Obese with BMI of " + bmi);
		}
	}
}