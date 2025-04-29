import java.util.Scanner;

class StudentInfo {
	public static double Average(int[] arr, int num) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (sum * 1.0) / num; // Corrected percentage calculation
	}

	public static String grade(double percentage) {
		if (percentage >= 90) {
			return "Grade: A+";
		} else if (percentage >= 80) {
			return "Grade: A";
		} else if (percentage >= 70) {
			return "Grade: B+";
		} else if (percentage >= 60) {
			return "Grade: B";
		} else if (percentage >= 50) {
			return "Grade: C+";
		} else if (percentage >= 40) {
			return "Grade: C";
		} else {
			return "Grade: F";
		}
	}

	public static void results(String name, int rollno, double percentage) {
		System.out.println("Name of the student: " + name);
		System.out.println("Roll Number of the student: " + rollno);
		System.out.println("Percentage: " + percentage + "%");
		System.out.println(grade(percentage)); // Corrected grade method call
	}



	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// Input: Name
		System.out.println("Enter the student name:");
		String name = scn.nextLine();

		// Input: Roll number
		System.out.println("Enter the Roll number:");
		int rollno = scn.nextInt();

		// Input: Number of subjects
		System.out.println("Enter the number of subjects:");
		int num = scn.nextInt();

		// Input of marks
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the mark for subject " + (i + 1) + ":");
			arr[i] = scn.nextInt();
		}

		double percentage = StudentInfo.Average(arr, num);
		StudentInfo.results(name, rollno, percentage);
		scn.close();
	}
}