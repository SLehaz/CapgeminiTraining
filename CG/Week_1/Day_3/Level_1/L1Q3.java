import java.util.Scanner;

class Largest 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = s.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = s.nextInt();
        s.close(); 

        if(number1 == number2 && number2 == number3)
        {
            System.out.println("All three numbers are equal.");
        } 
        else if(number1 >= number2 && number1 >= number3) 
        {
            System.out.println("The first number is the largest.");
        } 
        else if(number2 >= number1 && number2 >= number3)
        {
            System.out.println("The second number is the largest.");
        } 
        else
        {
            System.out.println("The third number is the largest.");
        }
    }
}