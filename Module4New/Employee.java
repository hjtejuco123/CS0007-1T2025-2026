abstract class Employee {

    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public abstract double calculateSalary();

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: PHP " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(
            String name,
            int employeeId,
            double monthlySalary) {

        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(
            String name,
            int employeeId,
            double hourlyRate,
            int hoursWorked) {

        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class AbstractionEmployeeExample {

    public static void main(String[] args) {

        Employee employee1 =
                new FullTimeEmployee(
                        "Ana Santos",
                        101,
                        35000
                );

        Employee employee2 =
                new PartTimeEmployee(
                        "Marco Reyes",
                        102,
                        250,
                        80
                );

        System.out.println("FULL-TIME EMPLOYEE");
        employee1.displayEmployee();

        System.out.println("\nPART-TIME EMPLOYEE");
        employee2.displayEmployee();
    }
}
