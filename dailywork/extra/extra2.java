/* class employee{
    String name;
    double basesalary;
    double empgross; 

    void calculateSalary(){
        double hra = basesalary * 0.05;
        empgross = basesalary + hra;
    }
    void display(){
        System.out.println("Emp Name: " + name);
        System.out.println("base Salary: " + basesalary);
        System.out.println("Gross salary: " + empgross);
    }
}
class manager extends employee{
    @Override
    void calculateSalary(){
        super.calculateSalary();
        empgross = empgross + 2000;
    }
}

class executive extends manager{
    @Override
    void calculateSalary(){
        super.calculateSalary();
        empgross = empgross + (0.10 * basesalary);
    }
}
public class extra2 {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.name = "A";
        emp.basesalary = 50000;
        emp.calculateSalary();
        emp.display();

        manager mgr = new manager();
        mgr.name = "B";
        mgr.basesalary = 60000;
        mgr.calculateSalary();
        mgr.display();

        executive exec = new executive();
        exec.name = "C";
        exec.basesalary = 70000;
        exec.calculateSalary();
        exec.display();
    }
}
*/

class employee {
    String name;
    double basesalary;

    employee(String name, double basesalary) {
        this.name = name;
        this.basesalary = basesalary;
    }

  
    double calculateSalary() {
        double hra = basesalary * 0.05;
        return basesalary + hra;
    }               
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.printf("Total Salary: %.2f\n", calculateSalary());
    }
}

class manager extends employee {
    manager(String name, double basesalary) {
        super(name, basesalary);
    }
    double calculateSalary() {
        double empsalary = super.calculateSalary();
        return empsalary + 2000;
    }
}

class executive extends manager {
    executive(String name, double basesalary) {
        super(name, basesalary);
    }
    double calculateSalary() {
        double mgrsalary = super.calculateSalary();
        double incentive = 0.10 * basesalary;
        return mgrsalary + incentive;
    }
}

public class extra2 {
    public static void main(String[] args) {

        employee emp = new employee("A", 10000);
        System.out.printf("%.2f\n", emp.calculateSalary());

        manager mgr = new manager("B", 10000);
        System.out.printf("%.2f\n", mgr.calculateSalary());

        executive exec = new executive("C", 10000);
        System.out.printf("%.2f\n", exec.calculateSalary());
    }
}