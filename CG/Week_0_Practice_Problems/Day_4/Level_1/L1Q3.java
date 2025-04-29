import java.util.Scanner;
class Multi{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ans = new int[10];
        System.out.println("Enter a number");
        int n=s.nextInt();
        for(int i=0;i<10;i++){
            ans[i]=n*(i+1);
            System.out.println(n+"*"+(i+1)+"="+ans[i]);
        }
        s.close();
    }
}