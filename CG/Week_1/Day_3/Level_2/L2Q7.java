import java.util.Scanner;  
class Factor
{  
    public static void main(String[] args)
	{  
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter a natural number: ");  
        int number = s.nextInt(); 
		s.close();
		if ( number > 0)
		{
			for (int i = 1; i < number; i++)
			{
				if ( number % i == 0)
				{
					System.out.println(" The number " + i + " is a factor of " + number);
				}
				else
				{
					System.out.println(" The number " + i + " is not a factor of " + number);
				}
			}
		}
		else
		{
			System.out.println("The number " + number + " is not a positive number. ");
		}
	}
}