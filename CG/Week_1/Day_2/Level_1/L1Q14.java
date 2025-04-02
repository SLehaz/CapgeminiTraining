import java.util.Scanner;

class Distance{
	public static void main(String[] args){
		int feet;
		
		Scanner input = new Scanner(System.in);
		feet = input.nextInt();
		
		System.out.println("The distance in yards is " + ((float) (feet / 3)) + " while the distance in miles is " + ((float) ((float)feet / (1760 * 3))));
		input.close();
	}
}