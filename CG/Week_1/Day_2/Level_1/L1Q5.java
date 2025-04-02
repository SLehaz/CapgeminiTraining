class Equal{
	public static void main(String[] args){
		int pens=14 , students=3;
		System.out.println("The pen per student is "+(pens-(pens%students))/students+" and the remaining pens not distrubuted is "+pens%students);
	}
}