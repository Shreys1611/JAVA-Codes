class Employee 
{
    private String name;
    private double salary;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public void work()
    {
        System.out.println(name + " is working.");
    }

    public double getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
}

class HRManager extends Employee
{
    public HRManager(String name, double salary)
    {
        super(name, salary);
    }

    public void work()
    {
        System.out.println("HR Manager " + super.getName() + " is managing HR operations.");
    }

    public void addEmployee(Employee employee)
    {
        System.out.println("HR Manager " + super.getName() + " is adding employee " + employee.getName() + ".");
    }
    public static void main(String[] args)
    {
        Employee employee = new Employee("Shrey Sharma", 10010);
        HRManager hrManager = new HRManager("Yogesh Sharma", 60000);

        employee.work();
        hrManager.work();

        System.out.println("Employee's Salary: Rs " + employee.getSalary());
        System.out.println("HR Manager's Salary: Rs " + hrManager.getSalary());

        hrManager.addEmployee(new Employee("Amogh Paaji", 10041));
    }
}