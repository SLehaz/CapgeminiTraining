import java.util.Scanner;
class UnitPrice{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		float unitprice = s.nextFloat();
		int quantity = s.nextInt();
		System.out.println("The total purchase price is INR "+(quantity*unitprice)+" if the quantity "+quantity+" and unit price is INR "+unitprice); 
		s.close();
	}
}