import java.util.Scanner;
class StringL201 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scn.nextLine();

        int count = 0; 
       
        for (int i = 0; i < str.length(); i++) {
            count++; 
        }

        System.out.println("The length of the string is: " + count);
        scn.close(); 
    }
}
