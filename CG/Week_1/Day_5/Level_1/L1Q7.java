import java.util.Scanner;
class L01_07M {
    int sum(int a){
        return (a*(a-1))/2;
    }
    public static void main(String[] args) {
        L01_07M obj = new L01_07M();
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int a= s.nextInt();
       if (a<0){
           System.out.println("Enter a natural number");
       }
       int b=obj.sum(a);
       System.out.println(b);
        }
    }
