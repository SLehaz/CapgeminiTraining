import java.util.Scanner;
class RandNum{
    public int[] generate4DigitRandomArray(int size){
        int[] rand= new int[size];
        for(int i =0;i<size;i++){
            rand[i]=(int)(1000+Math.random()*(9999-1000+1));
        }
        return rand;
    }
    public double[] findAverageMinMax(int[] numbers){
        double avg;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,sum=0;
        double[] num=new double[3];
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        avg=(double)sum/(double)numbers.length;
        num[0]=avg;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>(double)max){
                max=numbers[i];
            }
            if(numbers[i]<(double)min){
                min=numbers[i];
            }
        }
        num[1]=max;
        num[2]=min;
        return num;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        RandNum n = new RandNum();
        System.out.println("Enter the size : ");
        int size = s.nextInt();
        int[] randnum=n.generate4DigitRandomArray(size);
        double[] num=n.findAverageMinMax(randnum);
        System.out.println("Avg : "+num[0]+"\nMax : "+num[1]+"\nMin : "+num[2]);
    }
}