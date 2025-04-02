import java.util.Scanner;
class Chocolates{
    public static int[] findRemainderAndQuotient(int number, int divisor){
        return new int[] {(number/divisor),(number%divisor)};
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of chocolates and no. of children : ");
        int numberOfchocolates = s.nextInt() , numberOfchildren = s.nextInt();
        int[] ans=findRemainderAndQuotient(numberOfchocolates,numberOfchildren);
        System.out.println("The quotient is "+ans[0]+" and remainder is "+ans[1]);
        s.close();
    }
}