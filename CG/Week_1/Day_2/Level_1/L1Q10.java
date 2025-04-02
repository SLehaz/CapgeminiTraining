import java.util.Scanner;
class Height{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		float height = s.nextFloat();
		System.out.println("Your height in cm is "+height+" while in feet is "+((int)(height/2.54)/12)+" and inches is "+((height/2.54)%12));
	}
}