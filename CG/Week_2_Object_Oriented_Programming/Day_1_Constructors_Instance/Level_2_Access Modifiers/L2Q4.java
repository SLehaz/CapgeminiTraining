class Employee{
    public int employeeId;
    protected String department;
    private int salary;
    Employee(int employeeId,String department,int salary){
        this.employeeId=employeeId;
        this.department=department;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Employee ID : "+employeeId);
        System.out.println("Department : "+department);
        System.out.println("Salary : "+salary);
    }
    public void changeSalary(int salary){
        this.salary=salary;
    }
}
class Manager{
    public static void main(String[] args){
        Employee e = new Employee(41,"IT",9999999);
        e.display();
        e.changeSalary(4545455);
        e.employeeId=34;
        e.department="DBM";
        e.display();
    }
}