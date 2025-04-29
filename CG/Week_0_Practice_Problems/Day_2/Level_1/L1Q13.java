import java.util.Scanner;

class Side{

	public static void main(String[] args){
		int perimeter;
		
		Scanner input = new Scanner(System.in);
		
		perimeter = input.nextInt();
		
		System.out.println( "The length of the side is " + ((float) (float)perimeter/4) + " whose perimeter is " + perimeter);
		input.close();
	}
}


