import java.util.Scanner;
class Main {
    void NegativeNum(){
        System.out.println("-1");
    }
    void NullNum(){
        System.out.println("0");
    }
    void PositiveNum(){
        System.out.println("1");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int a= s.nextInt();
        if (a>=1)
        {
            obj.PositiveNum();
        }else if(a<0){
            obj.NegativeNum();
        }else if(a==0){
            obj.NullNum();
        }
    }
}