import java.util.Scanner;

class GradeSystem {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = scr.nextInt();


        int[] mathMarks = new int[numStudents];
        int[] chemMarks = new int[numStudents];
        int[] physMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];


        for (int j = 0; j < numStudents; j++) {
            System.out.println("Entering marks for Student " + (j + 1) + ":");
            mathMarks[j] = getValidMark(scr, "mathematics");
            chemMarks[j] = getValidMark(scr, "chemistry");
            physMarks[j] = getValidMark(scr, "physics");


            int sum = mathMarks[j] + chemMarks[j] + physMarks[j];
            percentages[j] = (sum / 3.0);
            double percentage = (sum / 300.0) * 100;

            if (percentage >= 80) {
                grades[j] = "A (Level 4, above agency-normalized standards)";
            } else if (percentage >= 70) {
                grades[j] = "B (Level 3, at agency-normalized standards)";
            } else if (percentage >= 60) {
                grades[j] = "C (Level 2,  below, but approaching agencynormalized standards)";
            } else if (percentage >= 50) {
                grades[j] = "D (Level 1),  well below agency-normalized standards";
            } else if (percentage >= 40) {
                grades[j] = "E (Level 1-), too below agency-normalized standards";
            } else {
                grades[j] = "R , Remedial standards";
            }
        }


        System.out.println("\nStudent Results:");
        for (int j = 0; j < numStudents; j++) {
            System.out.printf("Student %d: Math: %d, Chemistry: %d, Physics: %d, Percentage: %.2f%%, Grade: %s%n",
                    (j + 1), mathMarks[j], chemMarks[j], physMarks[j], percentages[j], grades[j]);
        }

        scr.close();
    }


    private static int getValidMark(Scanner scr, String subject) {
        int mark;
        do {
            System.out.printf("Enter %s mark: ", subject);
            mark = scr.nextInt();
            if (mark < 0) {
                System.out.println("Please enter a positive value.");
            }
        } while (mark < 0);
        return mark;
    }
}