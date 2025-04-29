import java.util.Scanner;
class Fact{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int f=s.nextInt();
        int fact = 1 , a=f;
        if(f>0)
        while(f>0){
            fact*=f;
            f--;
        }
        System.out.println("The factorial of "+a+" is : "+fact);
        s.close();
    }
}