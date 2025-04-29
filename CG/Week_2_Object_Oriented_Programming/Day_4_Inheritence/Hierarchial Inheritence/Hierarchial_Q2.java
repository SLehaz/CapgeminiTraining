class Person{
    String name;
    int age;
    Person(){}
}
class Teacher extends Person{
    String subject;
    Teacher(String subject,String name,int age){
        this.subject=subject;
        this.name=name;
        this.age=age;
    }
    void displayRole(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Subject : "+subject);
        System.out.println();
    }
}
class Student extends Person{
    char grade;
    Student(char grade,String name,int age){
        this.grade=grade;
        this.name=name;
        this.age=age;
    }
    void displayRole(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Grade : "+grade);
        System.out.println();
    }
}
class Staff extends Person{
    String level;
    Staff(String level,String name,int age){
        this.level=level;
        this.name=name;
        this.age=age;
    }
    void displayRole(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Level : "+level);
        System.out.println();
    }
}
class Main1{
    public static void main(String[] args){
        Teacher t = new Teacher("Maths","Lily",45);
        Student s = new Student('A',"Lehaz",22);
        Staff st = new Staff("Janitor","Devi",50);
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}