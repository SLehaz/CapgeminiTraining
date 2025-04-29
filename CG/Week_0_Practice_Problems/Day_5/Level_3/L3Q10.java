import java.util.Scanner;
class Collinear{
    public boolean checkFormula(double x1,double y1,double x2,double y2,double x3,double y3){
        double s1=(x2-x1)/(y2-y1),s2=(x3-x3)/(y3-y2),s3=(x3-x1)/(y3-y1);
        if(s1==s2 && s2==s3){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean checkArea(double x1,double y1,double x2,double y2,double x3,double y3){
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1+y2));
        if(area==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Collinear c = new Collinear();
        System.out.println("Enter values for x1 ,y1, x2, y2, x3, y3 : ");
        double x1=s.nextDouble(), y1=s.nextDouble(), x2=s.nextDouble(), y2=s.nextDouble(), x3=s.nextDouble(), y3=s.nextDouble();
        boolean t=c.checkFormula(x1,y1,x2,y2,x3,y3);
        boolean m=c.checkArea(x1,y1,x2,y2,x3,y3);
        if(t==m){
            System.out.println("The points are collinear ");
        }
        else{
            System.out.println("The points are not collinear ");
        }
        s.close();
    }
}