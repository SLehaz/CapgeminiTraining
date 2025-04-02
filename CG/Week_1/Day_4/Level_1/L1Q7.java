import java.util.Scanner;
class EvenOdd{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a natural number : ");
        int number = s.nextInt();
        if(number<=0){
            System.err.println("Not a natural number");
        }
        else{
            int size = number/2+1;
            int[] even=new int [size],odd = new int[size];
            int a=0,b=0;
            for(int i=1;i<=number;i++){
                if(i%2==0){
                    even[a++]=i;
                }
                else{
                    odd[b++]=i;
                }
            }
            for(int i=0;i<size;i++){
                System.out.println("Odd number : "+odd[i]);
                System.out.println("Even number : "+even[i]);
            }
        }
        s.close();
    }
}