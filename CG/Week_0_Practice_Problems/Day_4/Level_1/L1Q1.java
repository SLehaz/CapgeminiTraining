import java.util.Scanner;
class Age{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[] age = new int[10];
		System.out.println("Enter the age of 10 students");
		for(int i=0;i<10;i++){
			age[i]=s.nextInt();
		}
		for(int i=0;i<age.length;i++){
			if(age[i]<0){
				System.err.println("Invalid number");
			}
			else{
				if(age[i]>=18){
					System.out.println("The student with age "+age[i]+" can vote.");
				}
				else{
					System.out.println("The student with age "+age[i]+" cannot vote.");
				}
			}
		}
		s.close();
	}
}