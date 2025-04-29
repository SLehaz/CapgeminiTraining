import java.util.Scanner;
class Operator{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two (type - double) numbers and an operator : ");
        double first=s.nextDouble(),second=s.nextDouble();
        String op = s.next();
        switch (op) {
            case "+":
                System.out.println(first+"+"+second+"="+(first+second));
                break;
            case "-":
                System.out.println(first+"-"+second+"="+(first-second));
                break;
            case "*":
                System.out.println(first+"*"+second+"="+(first*second));
                break;
            case "/":
                System.out.println(first+"/"+second+"="+(first/second));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        s.close();
    }
}