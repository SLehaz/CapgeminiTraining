import java.util.Scanner;  
class FactorWhile
{  
    public static void main(String[] args)
	{  
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter a natural number: ");  
        int number = s.nextInt(); 
		s.close();
		if ( number > 0)
		{	
			int i = 1;
			while (i < number)
			{
				if ( number % i == 0)
				{
					System.out.println("The number " + i + " is a factor of " + number);
				}
				else
				{
					System.out.println("The number " + i + " is not a factor of " + number);
				}
				i = i + 1;
			}
		}
		else
		{
			System.out.println("The number " + number + " is not a positive number. ");
		}
	}
}