import java.util.Scanner;
class SquareRoot{
    public double[] root(double delta , double a, double b){
        double[] roots = new double[2];
        if(delta>0){
            roots[0]= (-b+Math.sqrt(delta))/(2*a);
            roots[1]= (-b-Math.sqrt(delta))/(2*a);
            return roots;
        }
        else if(delta==0){
            roots[0]= (-b/(2*a));
            return roots;
        }
        else{
            return roots;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        SquareRoot r = new SquareRoot();
        System.out.println("Enter values for a, b and c : ");
        double a=s.nextDouble(),b=s.nextDouble(),c=s.nextDouble();
        double delta = Math.pow(b,2)-(4*a*c);
        double[] roots=r.root(delta,a,b);
        if(delta>0){
            System.out.println("The roots are : "+roots[0]+" "+roots[1]);
        }
        else if(delta==0){
            System.out.println("the root is : "+roots[0]);
        }
        else{
            System.out.println("There are no roots");
        }
    }
}