import java.util.Scanner;
class BMI{
    public double calBMI(double w,double h){
        return w/(h*h);
    }
    public String[] statusBMI(int n,double[][] bmi){
        String[] status = new String[n];
        for(int i=0;i<n;i++){
            if(bmi[i][2]<=18.4){
                status[i]="Underweight";
            }
            else if(bmi[i][2]<=24.9){
                status[i]="Normal";
            }
            else if(bmi[i][2]<=39.9){
                status[i]="Overweight";
            }
            else{
                status[i]="Obese";
            }
        }
        return status;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        BMI b = new BMI();
        System.out.println("Enter no. of people: ");
        int n = s.nextInt();
        double[][] bmi = new double[n][3];
        for(int i=0;i<n;i++){
            System.out.println("Enter weight of person "+(i+1)+": ");
            bmi[i][0]=s.nextDouble();
            System.out.println("Enter height of person "+(i+1)+": ");
            bmi[i][1]=s.nextDouble()/100.0d;
        }
        for(int i=0;i<n;i++){
            bmi[i][2]=b.calBMI(bmi[i][0],bmi[i][1]);
        }
        String[] status = b.statusBMI(n,bmi);
        for(int i=0;i<n;i++){
            System.out.println("Person "+(i+1)+": ");
            System.out.println("BMI : "+bmi[i][2]+"\nStatus : "+status[i]);
        }
        s.close();
    }
}