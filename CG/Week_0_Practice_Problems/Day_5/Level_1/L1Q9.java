import java.util.Scanner;
class QandR{
    public static int[] findRemainderAndQuotient(int number, int divisor){
        return new int[] {(number/divisor),(number%divisor)};
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter dividend and divisor : ");
        int number = s.nextInt() , divisor = s.nextInt();
        int[] ans=findRemainderAndQuotient(number,divisor);
        System.out.println("The quotient is "+ans[0]+" and remainder is "+ans[1]);
        s.close();
    }
}