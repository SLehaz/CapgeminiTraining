import java.util.Scanner;
class Swap{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int number1 = s.nextInt();
		int number2 = s.nextInt();
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("The swapped numbers are "+number1+" and "+number2);
		s.close();
	}
}