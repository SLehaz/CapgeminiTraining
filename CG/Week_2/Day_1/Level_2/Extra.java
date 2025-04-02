class School {
    String studentName;        // Instance Variable
    static int totalStudents;  // Class Variable

    // Constructor
    School(String studentName) {
        this.studentName = studentName;
        totalStudents++;       // Increment total students
    }

    // Instance Method
    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }

    // Class Method
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}

class Main {
    public static void main(String[] args) {
        School student1 = new School("Alice");
        School student2 = new School("Bob");

        student1.displayStudent();
        student2.displayStudent();

        School.displayTotalStudents();  // Accessing class method
    }
}
