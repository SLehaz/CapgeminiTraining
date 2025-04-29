import java.util.Scanner;
class Multi69{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int[] arr = new int[4];
        for(int i=6;i<=9;i++){
            arr[i-6]=n*i;
            System.out.println(n+"*"+i+"="+arr[i-6]);
        }
        s.close();
    }
}
