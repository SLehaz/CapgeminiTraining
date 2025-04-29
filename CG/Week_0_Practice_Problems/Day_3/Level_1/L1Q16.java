import java.util.Scanner;
class OddEven{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a natural number : ");
        int n = s.nextInt();
        if(n>0)
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println("Odd");
            }
            else{
                System.out.println("Even");
            }
        }
        s.close();
    }
}