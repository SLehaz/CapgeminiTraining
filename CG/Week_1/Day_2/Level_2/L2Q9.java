import java.util.Scanner;

class Rounds
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first side: ");
		float side1 = s.nextFloat();
		System.out.println("Enter the second side: ");
		float side2 = s.nextFloat();
		System.out.println("Enter the third side: ");
		float side3 = s.nextFloat();
		System.out.println("The total number of rounds the athlete will run is " + ((side1 + side2 + side3) / 5.0f) + " to complete 5 km.");
	}
}