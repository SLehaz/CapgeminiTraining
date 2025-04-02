import java.util.Scanner;
class Multi{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();
        for(int i=6;i<10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        s.close();
    }
}