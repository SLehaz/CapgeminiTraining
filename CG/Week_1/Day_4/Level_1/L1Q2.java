import java.util.Scanner;
class OddEven{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] n = new int[5];
    System.out.println("Enter 5 numbers");
    for(int i=0;i<5;i++){
        n[i]=s.nextInt();
    }
    for(int i=0;i<n.length;i++){
        if(n[i]>0){
            if((n[i]%2)==0){
                System.out.println("It is positive and even");
            }
            else{
                System.out.println("It is positive and odd");
            }
        }
        else{
            if(n[i]<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Zero");
            }
        }
    }
    s.close();
}
}
