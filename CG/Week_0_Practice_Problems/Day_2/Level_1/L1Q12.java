import java.util.Scanner;

class Area
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base = s.nextInt();
		System.out.println("Enter the height: ");
		int height = s.nextInt();
		s.close();
		System.out.println("The Area of the triangle in sq in is " + (float)(0.155 * 0.5f * (float)base * (float)height) + " and sq.cm is " + (0.5f * (float)base * (float)height));
	}
} 