import java.util.Scanner;
class Fact1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int f=s.nextInt();
        int fact = 1 ;
        if(f>0){
            for(int i=1;i<=f;i++){
                fact*=i;
            }
        }
        System.out.println("The factorial of "+f+" is : "+fact);
        s.close();
    }
}