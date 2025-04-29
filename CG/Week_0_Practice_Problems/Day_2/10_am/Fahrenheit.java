import java.util.Scanner;
class CToF{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter degrees in celcius");
		float c= s.nextFloat();
		float f= ((c*9)/5)+32;
		System.out.println("Fahrenheit = "+ f);
	} 
}