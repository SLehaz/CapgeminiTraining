import java.util.Scanner;
class Euclidean{
    public double distance(double x1, double y1, double x2, double y2){
        return (Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2))));
    }
    public double[] slope(double x1, double y1, double x2, double y2){
        double[] ans = new double[2];
        ans[0]=(y2-y1)/(x2-x1);
        ans[1]=y1-ans[0]*x1;
        return ans;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Euclidean e = new Euclidean();
        System.out.println("Enter the values for x1 , y1 , x2 and y2 : ");
        double x1=s.nextDouble(),y1=s.nextDouble(),x2=s.nextDouble(),y2=s.nextDouble();
        double distance = e.distance(x1,y1,x2,y2);
        System.out.println("The distance between the two points is : "+distance);
        double[] ans=e.slope(x1,y1,x2,y2);
        System.out.println("The equation of the line is : y = "+ans[0]+"x + "+ans[1]);
        s.close();
    }
}