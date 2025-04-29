class Volume{
	public static void main(String[] args){
		int r = 6378;	
		float pi=3.14f;
		System.out.println("The volume of earth in cubic kilometers is "+((float)(4/3)*pi*r*r*r)+" and cubic miles is "+((float)(4/3)*pi*r*r*r*1.6*1.6*1.6));
	}
}
