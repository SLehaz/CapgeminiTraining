import java.util.Scanner;
class Calender{
    public static String monthName(int n){
        switch(n){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return null;
        }
    }
    public static int monthNumber(String name,int n){
        if(name=="January" || name=="March" || name=="May" || name=="July" || name=="August" || name=="October" || name=="December"){
            return 31;
        }
        else if(name == "February"){
            if((n%4==0 && n%100!=0) || n%400==0){
                return 29;
            }
            else{
                return 28;
            }
        }
        else{
            return 30;
        }
    }

    public static int firstDay(int[] month){
        int y=month[1] , m=month[0];
        int y0=y-(14-m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12*((14-m)/12)-2;
        int d0 = (1 + x + m0*31/12)%7;
        return d0;
    }
    public static void display(int days,int n,String name,int y){
        System.out.println(name+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<n;i++){
            System.out.print("    ");
        }
        int j=1,k=0;
        for(int i=n;i<=6;i++){
            System.out.format("%3d ",j++);
        }
        System.out.println();
//        System.out.format("%3d",j);
//        k++;
        for(int i=j;i<=days;i++ ){
            if(k<7){
                System.out.format("%3d ",i);
                k++;
            }
            else{
                System.out.println();
                k=0;
                i--;
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] month = new int[2];
        System.out.println("Enter the month and year in numbers : ");
        month[0]=s.nextInt();
        month[1]=s.nextInt();
        String name = monthName(month[0]);
        int days = monthNumber(name,month[1]);
        int n = firstDay(month);
        display(days,n,name,month[1]);
        s.close();
    }
}