import java.util.Scanner;
class Number{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c,d;
		if(a>=b){
			c=a;
			d=b;
		}
		else{
			c=b;
			d=a;
		}
		System.out.println("The Quotient is "+(c/d)+" and Reminder is "+(c%d)+" of two number "+c+" and "+d);
	}
}