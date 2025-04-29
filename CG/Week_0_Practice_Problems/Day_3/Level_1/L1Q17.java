import java.util.Scanner;
class Salary{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Salary and no. of years of service : ");
        float salary = s.nextFloat();
        int year = s.nextInt();
        if(year>=5){
            System.out.println("Bonus = "+((salary*5)/100));
        }
        else{
            System.out.println("No Bonus");
        }
        s.close();
    }
}