interface Department{
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
abstract class Employee implements Department{
    private int employeeId;
    private String name,departmentName;
    private double baseSalary;
    Employee(int employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void assignDepartment(String departmentName){
        this.departmentName=departmentName;
    }
    public String getDepartmentDetails(){
        return "Department Name : "+departmentName;
    }
    abstract double calculateSalary();
    void displayDetails(){
        System.out.println("Employee ID : "+getEmployeeId());
        System.out.println("Name : "+getName());
        System.out.println(getDepartmentDetails());
        System.out.println("Base Salary : "+baseSalary);
        System.out.println("Total Salary : "+calculateSalary()+"\n");
    }
}
class FullTimeEmployees extends Employee{
    int bonus;
    FullTimeEmployees(int employeeId,String name,double baseSalary,int bonus){
        super(employeeId,name,baseSalary);
        this.bonus=bonus;
    }
    public double calculateSalary(){
        return getBaseSalary()+bonus;
    }
}
class PartTimeEmployees extends Employee{
    double hourlyWage;
    int days;
    PartTimeEmployees(int employeeId,String name,double hourlyWage,int days){
        super(employeeId,name,hourlyWage*days);
        this.hourlyWage=hourlyWage;
        this.days=days;
    }
    public double calculateSalary(){
        return hourlyWage*days;
    }
}
class Main{
    public static void main(String[] a){
        Employee e1 = new FullTimeEmployees(101, "Lehaz", 50000, 10000);
        Employee e2 = new PartTimeEmployees(401, "Akash", 200, 25);
        e1.assignDepartment("Human Resources");
        e2.assignDepartment("Backend Developer");
        Employee[] e = {e1,e2};
        for(Employee emp:e){
            emp.displayDetails();
        }
    }
}