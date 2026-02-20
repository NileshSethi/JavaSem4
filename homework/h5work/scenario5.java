import java.util.ArrayList;
class Employee {
    private String employeeId;
    private String name;
    private String role;
    private double baseSalary;
    private double finalSalary;
    public Employee(String employeeId, String name, String role, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
        this.finalSalary = 0;
    }
    public void calculateSalary() {

        switch(role.toLowerCase()) {

            case "manager":
                finalSalary = baseSalary + (baseSalary * 0.20);
                break;

            case "developer":
                finalSalary = baseSalary + (baseSalary * 0.10);
                break;

            case "designer":
                finalSalary = baseSalary + (baseSalary * 0.05);
                break;

            case "intern":
                finalSalary = 1000;
                break;

            default:
                finalSalary = baseSalary;
                System.out.println("Invalid Role for Employee ID: " + employeeId);
        }
    }
    public void applyDeduction(double amount) {
        finalSalary -= amount;

        if(finalSalary < 0) {
            finalSalary = 0;
        }
    }
    public void displayEmployeeDetails() {
        System.out.println("");
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Role        : " + role);
        System.out.println("Base Salary : $" + baseSalary);
        System.out.println("Final Salary: $" + finalSalary);
        System.out.println("");
    }
    public String getEmployeeId() {
        return employeeId;
    }
}
class Payroll {

    private ArrayList<Employee> employees;

    // Constructor
    public Payroll() {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void calculateAllSalaries() {
        for(Employee emp : employees) {
            emp.calculateSalary();
            emp.displayEmployeeDetails();
        }
    }
    public Employee findEmployeeById(String employeeId) {

        for(Employee emp : employees) {
            if(emp.getEmployeeId().equals(employeeId)) {
                return emp;
            }
        }
        return null;
    }
}
public class scenario5 {

    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        // Adding Employees
        Employee e1 = new Employee("E101", "Ravi", "Manager", 5000);
        Employee e2 = new Employee("E102", "Sneha", "Developer", 4000);
        Employee e3 = new Employee("E103", "Kiran", "Designer", 3500);
        Employee e4 = new Employee("E104", "Amit", "Intern", 2000);

        payroll.addEmployee(e1);
        payroll.addEmployee(e2);
        payroll.addEmployee(e3);
        payroll.addEmployee(e4);

        System.out.println("Initial Salary Calculation:");
        payroll.calculateAllSalaries();

        // Applying deduction
        System.out.println("\nApplying Deduction to Employee E102...");
        Employee emp = payroll.findEmployeeById("E102");

        if(emp != null) {
            emp.applyDeduction(300);
            emp.displayEmployeeDetails();
        }
        else {
            System.out.println("Employee not found!");
        }
    }
}