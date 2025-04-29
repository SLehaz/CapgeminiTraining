import java.util.Scanner;
class ArrayIndex{
    public static String throwErr(String[] s){

        return s[10];
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter names : ");
        String[] str = new String[2];
        for(int i=0;i<2;i++){
            str[i]=s.next();
        }

        try{
            String n = throwErr(str);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The Array Index cannot be found :"+e.getMessage());
        }
    }
}