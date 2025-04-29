import java.util.Scanner;
class Nsum1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the natural number : ");
        int n= s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        if(sum==((n*(n+1))/2)){
            System.out.println("It is true");
        }
        else{
            System.out.println("It is false");
        }
        s.close();
    }
}
