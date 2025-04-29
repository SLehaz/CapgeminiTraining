import java.util.Scanner;
class Trigonometry{
    public double[] calculateTrigonometricFunctions(double angle){
        return new double[] {Math.sin(angle),Math.cos(angle),Math.tan(angle)};
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Trigonometry t = new Trigonometry();
        System.out.println("Enter the angle in radians : ");
        double radians = s.nextDouble() , degrees = Math.toDegrees(radians);
        double[] ans = t.calculateTrigonometricFunctions(degrees);
        System.out.println("Sin value : "+ans[0]+"\nCos value : "+ans[1]+"\nTan value : "+ans[2]);
        s.close();
    }
}