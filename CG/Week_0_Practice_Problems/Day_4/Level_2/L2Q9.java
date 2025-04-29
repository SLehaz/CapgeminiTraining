import java.util.Scanner;
class Mark2D{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total no. of students : ");
        int n = s.nextInt();
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for(int i=0;i<n;i++){
            int j=0;
            while(true){
                System.out.print("Enter mark of student "+(i+1)+" in Physics : ");
                marks[i][j]=s.nextInt();
                if(marks[i][j]>0 && marks[i][j]<=100){
                    j++;
                    break;
                }
                else{
                    System.out.println("Please enter valid mark ");
                }
            }
            while(true){
                System.out.print("Enter mark of student "+(i+1)+" in Chemistry : ");
                marks[i][j]=s.nextInt();
                if(marks[i][j]>0 && marks[i][j]<=100){
                    j++;
                    break;
                }
                else{
                    System.out.println("Please enter valid mark ");
                }
            }
            while(true){
                System.out.print("Enter mark of student "+(i+1)+" in Maths : ");
                marks[i][j]=s.nextInt();
                if(marks[i][j]>0 && marks[i][j]<=100){
                    break;
                }
                else{
                    System.out.println("Please enter valid mark ");
                }
            }
            percentage[i] = ((double)(marks[i][0]+marks[i][1]+marks[i][2])/3.0d);
            if (percentage[i] >= 80) {
                grade[i] = "A (Level 4, above agency-normalized standards)";
            } else if (percentage[i] >= 70) {
                grade[i] = "B (Level 3, at agency-normalized standards)";
            } else if (percentage[i] >= 60) {
                grade[i] = "C (Level 2,  below, but approaching agency-normalized standards)";
            } else if (percentage[i] >= 50) {
                grade[i] = "D (Level 1,  well below agency-normalized standards)";
            } else if (percentage[i] >= 40) {
                grade[i] = "E (Level 1-, too below agency-normalized standards)";
            } else {
                grade[i] = "R (Remedial)";
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1)+" results : ");
            System.out.println("    Physics : "+marks[i][0]+"\n    Chemistry : "+marks[i][1]+"\n    Maths : "+marks[i][2]);
            System.out.println("    Percentage : "+percentage[i]+"\n    Grade : "+grade[i]);
        }
        s.close();
    }
}