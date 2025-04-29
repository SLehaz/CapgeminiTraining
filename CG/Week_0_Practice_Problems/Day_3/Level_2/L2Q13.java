import java.util.Scanner;
class NumMulti1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();
        System.out.println("The multiples are : ");
        if(n>0&&n<=100){
            int counter = n-1;
            while(counter>0){
                if(n%counter==0){
                    System.out.println(counter);
                }
                counter--;
            }
        }
        s.close();
    }
}
