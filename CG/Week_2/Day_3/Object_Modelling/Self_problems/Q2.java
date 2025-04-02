import java.util.ArrayList;

class University{
    String universityName;
    ArrayList<Department> departments;
    ArrayList<Faculty> faculties;

    University(String universityName){
        this.universityName=universityName;
        this.departments=new ArrayList<>();
        this.faculties=new ArrayList<>();
    }
    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    public void displayUniversity() {
        System.out.println("\nUniversity: " + universityName);
        System.out.println("Departments:");
        for (Department dept : departments) {
            dept.displayDepartment();
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : faculties) {
            faculty.displayFaculty();
        }
    }
}
class Faculty{
    String facultyName,expertise;
    Faculty(String facultyName,String expertise){
        this.facultyName=facultyName;
        this.expertise=expertise;
    }
    void displayFaculty(){
        System.out.println("Faculty : "+facultyName);
        System.out.println("Expertise : "+expertise);
    }
}
class Department{
    String departmentName;
    Department(String departmentName){
        this.departmentName=departmentName;
    }
    void displayDepartment(){
        System.out.println("Department : "+departmentName);
    }
}
class Main{
    public static void main(String[] args){
        Faculty faculty1 = new Faculty("Dr.Prasanna Devi","Artificial Intelligence");
        Faculty faculty2 = new Faculty("Dr. Bharathi","Data Analytics");
        University university = new University("SRMIST");
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.displayUniversity();

        university=null;
        System.out.println("\nDisplaying the faculties alone: ");
        faculty1.displayFaculty();
        faculty2.displayFaculty();
    }
}