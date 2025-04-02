import java.util.Scanner;
class Power{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number and power : ");
        int num = s.nextInt() , pow = s.nextInt() ,mul=1;
        for(int i=1;i<=pow;i++){
            mul*=num;
        }
        System.out.println("Result = "+mul);
        s.close();
    }
}