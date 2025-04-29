import java.util.Scanner;
class Frequency{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s.nextInt() , count=0 , a=number ;
        int[] frequency = new int[10];
        while(a>0){
            a/=10;
            count++;
        }   
        a=number;
        int[] arr = new int[count];     
        for(int i=0;i<count;i++){
            arr[i]=a%10;
            a/=10;
        }
        for(int i=0;i<10;i++){
            int temp=0;
            for(int j=0;j<count;j++){
                if(i==arr[j]){
                    temp++;
                }
            }
            frequency[i]=temp;
        }
        System.out.println("The frequency of each digit is: ");
        for(int i=0;i<10;i++){
            System.out.println(i+" : "+frequency[i]);
        }
        s.close();
    }
}