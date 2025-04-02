class Employee
{
    private static String companyName = "Witch";
    private final int empId;
    private static int totalEmployees = 0;

    Employee()
    {
        empId = totalEmployees + 1;
        totalEmployees++;
    }

    Employee(int id)
    {
        this.empId = id;
        totalEmployees++;
    }

    static void companyDetails()
    {
        System.out.println("The company name is: " + companyName);
        System.out.println("The total employees are: " + totalEmployees);
    }

    void employeeDetails()
    {
        System.out.println("Id of employee: " + empId);
    }
}

class MainL1_03
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(42);

        Employee.companyDetails();

        if (emp1 instanceof Employee)
        {
            emp1.employeeDetails();
        }
    }
}