import java.util.Scanner;
class StudentMark{
    public int[][] getScore(int n){
        int[][] mark = new int[n][3];
        for(int i=0;i<n;i++){
            mark[i][0]=(int)(10+Math.random()*(90));
            mark[i][1]=(int)(10+Math.random()*(90));
            mark[i][2]=(int)(10+Math.random()*(90));
        }
        return mark;
    }
    public int[][] roundScore(int[][] mark,int n){
        int[][] result = new int[n][3];
        for(int i=0;i<n;i++){
            result[i][0]=mark[i][0]+mark[i][1]+mark[i][2];
            result[i][1]=(int)Math.round((double)result[i][0]/3.0d);
            result[i][2]=result[i][1];
        }
        return result;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StudentMark m = new StudentMark();
        System.out.println("Enter the number of students : ");
        int n = s.nextInt();
        int[][] mark = m.getScore(n);
        int[][] result = m.roundScore(mark,n);
        for(int i=0;i<n;i++){
            System.out.println("Report of Student "+(i+1));
            System.out.println("Physics" + "    " + "Chemistry" + " \t" + "Maths");
            System.out.println(mark[i][0]+" \t   "+mark[i][1]+" \t        "+mark[i][2]);
            System.out.println("Total \tAverage     Percentage");
            System.out.println(result[i][0]+"\t"+result[i][1]+" \t    "+result[i][2]+"%");
        }
    }
}