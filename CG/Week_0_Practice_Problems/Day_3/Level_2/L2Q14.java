import java.util.Scanner;
class Power1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number and power : ");
        int num = s.nextInt() , pow = s.nextInt() ,result=1,counter=0;
        while(counter<=pow){
            result*=num;
            counter++;
        }
        System.out.println("Result = "+result);
        s.close();
    }
}