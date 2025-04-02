import java.util.Scanner;
class Salary{
    public int[][] createSalary(){
        int [][] salary = new int[10][2];
        for (int i=0;i<10;i++){
            salary[i][1]=(int)(Math.random()*10);
            salary[i][0]=10000 + (int)(Math.random() * ((100000 - 10000) + 1));
        }
        return salary;
    }
    public double[][] newSalary(int[][] salary){
        double [][] newsalary = new double[10][2];
        for(int i=0;i<10;i++){
            if(salary[i][1]>=5){
                newsalary[i][1]= (double)salary[i][0]*0.05d;
            }
            else{
                newsalary[i][1]= (double)salary[i][0]*0.02d;
            }
            newsalary[i][0]=salary[i][0]+newsalary[i][1];
        }
        return newsalary;
    }
    public double[] totalSalary(double[][] newsalary, int[][] salary){
        double[] totalsalary = new double[3];
        int sum=0;
        double sum1=0,sum2=0;
        for(int i=0;i<10;i++){
            sum+=salary[i][0];
            sum1+=newsalary[i][0];
            sum2+=newsalary[i][1];
        }
        totalsalary[0]=sum;
        totalsalary[1]=sum1;
        totalsalary[2]=sum2;
        return totalsalary;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Salary a = new Salary();
        int [][] salary = a.createSalary();
        double [][] newsalary = a.newSalary(salary);
        double[] totalsalary = a.totalSalary(newsalary,salary);
        System.out.println("Total old Salary \t Total new Salary \t Total Bonus");
        String output = String.format("%.2f \t \t %.2f \t\t %.2f",totalsalary[0],totalsalary[1],totalsalary[2]);
        System.out.println(output);
        s.close();
    }
}