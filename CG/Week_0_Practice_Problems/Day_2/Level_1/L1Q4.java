class PandL{
	public static void main(String[] args){
		int costprice = 129, sellprice = 191;
		int profit = sellprice - costprice;
		System.out.println("The Cost Price is INR "+costprice+" and Selling Price is INR "+sellprice+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+ (float)((float)(profit*100)/(float)costprice));
	}
}