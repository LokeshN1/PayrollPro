import java.util.ArrayList;

// Interface for salary calculation
interface Payable {
    double calculateSalary();
}

// Abstract class Employee
abstract class Employee implements Payable {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + name + ", Salary: $" + calculateSalary() + "]";
    }
}

// Full-time employee class
class FullTimeEmployee extends Employee {
    private double monthlySalary;
    private double bonus;

    public FullTimeEmployee(String name, int id, double monthlySalary, double bonus) {
        super(name, id);
        this.monthlySalary = Math.max(monthlySalary, 0);
        this.bonus = Math.max(bonus, 0);
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " [Full-Time, Bonus: $" + bonus + "]";
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    private int overtimeHours;
    private double overtimeRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate, int overtimeHours, double overtimeRate) {
        super(name, id);
        this.hoursWorked = Math.max(hoursWorked, 0);
        this.hourlyRate = Math.max(hourlyRate, 0);
        this.overtimeHours = Math.max(overtimeHours, 0);
        this.overtimeRate = Math.max(overtimeRate, hourlyRate * 1.5);
    }

    @Override
    public double calculateSalary() {
        return (hoursWorked * hourlyRate) + (overtimeHours * overtimeRate);
    }

    @Override
    public String toString() {
        return super.toString() + " [Part-Time, Overtime Pay: $" + (overtimeHours * overtimeRate) + "]";
    }
}

// Payroll System Class
class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = findEmployeeById(id);
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
            System.out.println("Removed Employee: " + employeeToRemove.getName());
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public Employee findEmployeeById(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees in the system.");
        } else {
            System.out.println("Employee List:");
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }

    public double calculateTotalPayroll() {
        double total = 0;
        for (Employee emp : employeeList) {
            total += emp.calculateSalary();
        }
        return total;
    }

}

// Main Class
public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        // Adding Employees
        FullTimeEmployee emp1 = new FullTimeEmployee("Lokesh", 1, 100000, 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Lucky", 2, 9, 5000, 2, 6000);
        FullTimeEmployee emp3 = new FullTimeEmployee("Alex", 3, 300000, 10000);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);

        // Display Employees
        System.out.println("\nInitial Employee List:");
        payrollSystem.displayEmployees();

        // Calculate Total Payroll Expense
        System.out.println("\nTotal Payroll Cost: $" + payrollSystem.calculateTotalPayroll());


        // Removing an Employee
        System.out.println("\nRemoving Employee with ID 3...");
        payrollSystem.removeEmployee(3);
        payrollSystem.displayEmployees();
    }
}
