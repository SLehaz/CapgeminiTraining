class Student{
    public int rollNumber;
    protected String name;
    private double cgpa;
    Student(int rollNumber,String name,double cgpa){
        this.rollNumber=rollNumber;
        this.name=name;
        this.cgpa=cgpa;
    }
    public void display(){
        System.out.println("Roll Number : "+rollNumber+"\nName : "+name+"\nCGPA : "+cgpa);
    }
    public void modifyCgpa(double newCgpa){
        this.cgpa=newCgpa;
    }
}
class PostGraduateStudent{
    public static void main(String[] args){
        Student s = new Student(41,"Lehaz",9.3);
        s.display();
        s.modifyCgpa(9.4);
        s.name="Akash";
        s.display();
    }
}