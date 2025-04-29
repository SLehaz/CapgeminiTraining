import java.util.Scanner;

class TemperatureConversion
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Temperature in Celsius: ");
		float celsius = s.nextFloat();
		s.close();
		System.out.println("The " + celsius + " celsius is " + ((celsius * ((float)9/(float)5)) + (float)32) + " fahrenheit");
	}
}