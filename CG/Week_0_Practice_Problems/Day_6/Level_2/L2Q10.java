import java.util.Scanner;
class StudentMark{
    public static int[][] getScore(int n){
        int[][] score = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                score[i][j]=(int)(10 + (Math.random()*90)%91);
            }
        }
        return score;
    }
    public static int[][] getAverage(int[][] score){
        int[][] average = new int[score.length][3];
        for(int i=0;i< score.length;i++){
            int a =score[i][0]+score[i][1]+score[i][2];
            average[i][0]=Math.round(a);
            average[i][1]=Math.round(a/3);
            average[i][2]=Math.round(average[i][1]);
        }
        return average;
    }
    public static String[][] getGrade(int[][] average){
        String[][] grade = new String[average.length][2];
        for(int i=0;i< average.length;i++){
            if(average[i][2]>=80){
                grade[i][0]="A";
                grade[i][1]="Level 4 , above agency-normalized standards";
            }
            else if(average[i][2]>=70){
                grade[i][0]="B";
                grade[i][1]="Level 3 , at agency-normalized standards";
            }
            else if(average[i][2]>=60){
                grade[i][0]="C";
                grade[i][1]="Level 2 , below, but approaching agency-normalized standards";
            }
            else if(average[i][2]>=50){
                grade[i][0]="D";
                grade[i][1]="Level 1 , well below agency-normalized standards";
            }
            else if(average[i][2]>=40){
                grade[i][0]="E";
                grade[i][1]="Level 1- , too below above agency-normalized standards";
            }
            else{
                grade[i][0]="R";
                grade[i][1]="Remedial standards";
            }
        }
        return grade;
    }
    public static void display(int[][] score,int[][] average,String[][] grade){
        for(int i=0;i< score.length;i++){
            System.out.println("Student "+(i+1)+" ScoreCard :");
            System.out.println("Physics "+"\t"+"Chemistry\tMaths");
            System.out.println(score[i][0]+"\t\t"+score[i][1]+"\t\t"+score[i][2]);
            System.out.println("Total \t Average \t Percentage \t Grade");
            System.out.println(average[i][0]+"\t  "+average[i][1]+"\t\t  "+average[i][2]+"%\t\t "+grade[i][0]+" "+grade[i][1]);
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of students :");
        int n = s.nextInt();
        int[][] score = getScore(n);
        int[][] average = getAverage(score);
        String[][] grade=getGrade(average);
        display(score,average,grade);
        s.close();
    }
}