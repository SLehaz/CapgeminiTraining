import java.util.Scanner;

class Salary
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Salary: ");
		int salary = s.nextInt();
		System.out.println("Enter the bonus: ");
		int bonus = s.nextInt();
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + (salary + bonus) + " INR");
	}
}