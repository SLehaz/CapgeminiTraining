import java.util.Scanner;

class TemperatureConversionFahrenheit
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Temperature in Fahrenheit: ");
		float fahrenheit = s.nextFloat();
		s.close();
		System.out.println("The " + fahrenheit + " fahrenheit is " + ((fahrenheit - (float)32) * ((float)5/(float)9)) + " celsius");
	}
}