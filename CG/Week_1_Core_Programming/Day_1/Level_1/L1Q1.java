class Employee
{
    private String name;
    private int id;
    private int salary;

    public Employee(String name, int id, int salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display()
    {
        System.out.println("Name of Employee: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Salary of Employee: " + salary);
    }
}

class MainL1_01
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Akash", 101,25000);
        Employee emp2 = new Employee("Lehaz", 102, 25000);

        emp1.display();
        emp2.display();
    }
}