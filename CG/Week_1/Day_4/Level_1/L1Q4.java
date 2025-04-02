import java.util.Scanner;
class PosSum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] n = new double[10];
        int i=0;
        double sum = 0.0d;
        System.out.println("Enter the numbers");
        while(true){
            if(i==10)
                break;
            else{
                double a = s.nextDouble();
                if(a<=0)
                    break;
                else{
                    n[i]=a;
                    i++;
                }
            }
        }
        s.close();
        for(i=0;i<n.length;i++){
            sum+=n[i];
        }
        System.out.println("Total = "+sum);
    }
}