import java.util.Scanner;
class Abundant{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt(),sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum>num){
            System.out.println("Abundant number");
        }
        else{
            System.out.println("Not an Abundant number");
        }
        s.close();
    }
}