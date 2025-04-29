class Employee{
    String name;
    int id;
    int salary;
    Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Salary : "+salary);
    }
}
class Manager extends Employee{
    int teamSize;
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size : "+teamSize);
    }
    Manager(String name,int id,int salary){
        super(name,id,salary);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language : "+programmingLanguage);
    }
    Developer(String name,int id,int salary){
        super(name,id,salary);
    }
}
class Intern extends Employee{
    int tenure;
    void displayDetails(){
        super.displayDetails();
        System.out.println("Tenure : "+tenure);
    }
    Intern(String name,int id,int salary){
        super(name,id,salary);
    }
}
class Main1{
    public static void main(String[] args){
        Manager m = new Manager("Lavanya",11,1234256);
        Developer d = new Developer("Lehaz",41,6543211);
        Intern i = new Intern("Akash",34,65434321);
        m.teamSize=15;
        d.programmingLanguage="Java";
        i.tenure=7;
        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}