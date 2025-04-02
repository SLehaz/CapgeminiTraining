import java.util.Scanner;
class Election2 {
    public static void election(int[] age) {
        for (int i = 0; i < age.length; i++) {
            while (age[i] <= 0) {
                System.out.println("Enter a valid age:");
                Scanner scn = new Scanner(System.in);  
                age[i] = scn.nextInt();
            }
            if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote.");
            } else {
                System.out.println("The student " + (i + 1) + " with the age " + age[i] + " cannot vote.");
            }
        }
    }

    public static void main(String[] args) {
        Election2 obj = new Election2();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the age of the students: ");
        int[] age = new int[10];

        for (int i = 0; i < age.length; i++) {
            age[i] = scn.nextInt();
        }

        obj.election(age);
        scn.close(); 
    }
}
