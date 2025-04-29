import java.util.Scanner;
class NumMulti{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();
        System.out.println("The multiples are : ");
        if(n>0&&n<=100){
            for(int i=100;i>0;i--){
                if(i%n==0){
                    System.out.println(i);
                }
            }
        }
        s.close();
    }
}
