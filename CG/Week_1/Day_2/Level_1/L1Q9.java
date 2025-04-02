import java.util.Scanner;
class DiscountPrice{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int fee = s.nextInt();
		int discountPercent = s.nextInt();
		float discount = (float)fee/(float)discountPercent;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+((float)fee-discount));
	}
}






