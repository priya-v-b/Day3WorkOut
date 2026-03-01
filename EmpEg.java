
abstract class Employee {
    protected String name;
    protected int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Common method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
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

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
public class EmpEg{
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee("Alice", 101, 5000);
        Employee emp2 = new PartTimeEmployee("Bob", 102, 20, 80);

        emp1.displayDetails();
        System.out.println("Salary: $" + emp1.calculateSalary());

        System.out.println("----------------------");

        emp2.displayDetails();
        System.out.println("Salary: $" + emp2.calculateSalary());
    }
}
