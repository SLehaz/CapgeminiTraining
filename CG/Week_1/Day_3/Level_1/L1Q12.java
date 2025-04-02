import java.util.Scanner;
class Nsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the natural number : ");
        int n= s.nextInt();
        int a=n;
        int sum=0;
        while(n>0){
            sum+=n;
            n--;
        }
        if(sum==((a*(a+1))/2)){
            System.out.println("It is true");
        }
        else{
            System.out.println("It is false");
        }
        s.close();
    }
}
