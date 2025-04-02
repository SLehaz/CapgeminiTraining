import java.util.Scanner;
class Height{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter height of 11 players : ");
        int[] height= new int[11];
        int sum=0;
        for(int i=0;i<11;i++){
            height[i]=s.nextInt();
            sum+=height[i];
        }
        System.out.println("The avg height of players is = "+(double)((double)sum/(double)11));
        s.close();
    }
}