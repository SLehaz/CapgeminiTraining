class Student{
    static String universityName;
    public String name;
    public final int rollNumber;
    public char grade;
    public static int count=0;
    Student(String name,int rollNumber,char grade){
        this.name=name;
        this.grade=grade;
        this.rollNumber=rollNumber;
        count++;
    }
    void displayStudents(){
        System.out.println("University name : "+universityName);
        System.out.println("Student name : "+name);
        System.out.println("Roll number : "+rollNumber);
        System.out.println("Grade : "+grade);
    }
    static void displayTotalStudents(){
        System.out.println("Total Students : "+count);
    }
    public static void main(String[] args){
        Student s = new Student("Lehaz",41,'O');
        Student s1 = new Student("Akash",34,'O');
        if(s instanceof Student && s1 instanceof Student){
            System.out.println("The objects "+s+"& "+s1+" is initialized for class Student");
        }
        universityName="SRMIST";
        s.displayStudents();
        s1.displayStudents();
        displayTotalStudents();
    }
}