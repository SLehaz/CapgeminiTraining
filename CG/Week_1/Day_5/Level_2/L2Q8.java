import java.util.Scanner;
class AgeHeight{
	public void height(int height1,int height2, int height3){
	   if(height1 == height2 && height2 == height3)
        {
            System.out.println("All three heights are equal.");
        } 
        else if(height1 >= height2 && height1 >= height3) 
        {
            System.out.println("Amar is the tallest.");
        } 
        else if(height2 >= height1 && height2 >= height3)
        {
            System.out.println("Akbar is the tallest.");
        } 
        else
        {
            System.out.println("Antony is the tallest.");
	}}
	public void age(int age1,int age2, int age3){
		if(age1 == age2 && age2 == age3)
        {
            System.out.println("All three ages are equal.");
        } 
        else if(age1 <= age2 && age1 <= age3) 
        {
            System.out.println("Amar is the youngest.");
        } 
        else if(age2 <= age1 && age2 <= age3)
        {
            System.out.println("Akbar is the youngest.");
        } 
        else
        {
            System.out.println("Antony is the youngest.");
        }}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		AgeHeight obj= new AgeHeight();
        System.out.println("Enter Amar's Age: ");
        int age1 = s.nextInt();
        System.out.println("Enter Akbar's Age: ");
        int age2 = s.nextInt();
        System.out.println("Enter Antony's Age: ");
        int age3 = s.nextInt();
		System.out.println("Enter Amar's Height: ");
        int height1 = s.nextInt();
        System.out.println("Enter Akbar's Height: ");
        int height2 = s.nextInt();
        System.out.println("Enter Antony's Height: ");
        int height3 = s.nextInt();
        s.close(); 
        obj.height(height1,height2,height3);
		obj.age(age1,age2,age3);
}}