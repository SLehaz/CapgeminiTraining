import java.util.Scanner;
class Nine{
    public void isPositive(int num) {
        if (num >= 0) {
            isEven(num);
        }
        else{
            System.out.println("Negative");
        }
    }
    public void isEven(int num){
        if(num%2==0){
            System.out.println("Positive and even");
        }
        else{
            System.out.println("Positive and odd");
        }
    }
    public int compare(int a,int b){
        if(a>b){
            return 1;
        }
        else if(a==b){
            return 0;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Nine n = new Nine();
        int[] number = new int[5];
        System.out.println("Enter 5 numbers : ");
        for(int i=0;i<5;i++){
            number[i] = s.nextInt();
        }
        for(int i=0;i<5;i++){
            n.isPositive(number[i]);
        }
        int ans = n.compare(number[0],number[4]);
        if(ans==1){
            System.out.println(number[0]+" Greater than "+number[4]);
        }
        else if(ans ==0){
            System.out.println(number[0]+" Equal to "+number[4]);
        }
        else{
            System.out.println(number[0]+" Lesser than "+number[4]);
        }
        s.close();
    }
}