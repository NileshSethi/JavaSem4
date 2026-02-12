import java.util.ArrayList;
import java.util.List;
class Student {
    private String name;
    private List<Double> grades;
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addGrade(double grade) {
        grades.add(grade);
    }
    public double calculateavg() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    public void displaystudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + calculateavg());
        System.out.println(" ");
    }
}
class GradeManager {
    private List<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }
    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                student.displaystudentDetails();
            }
        }
    }
}
public class scenario2 {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();
        Student s1 = new Student("Nilesh");
        Student s2 = new Student("Om");
        manager.addStudent(s1);
        manager.addStudent(s2);
        s1.addGrade(85);
        s1.addGrade(90);
        s1.addGrade(78);
        s2.addGrade(88);
        s2.addGrade(92);
        s2.addGrade(80);
        System.out.println("\nAll Students ");
        manager.displayAllStudents();
        System.out.println("\n Searching for Student ");
        Student found = manager.findStudentByName("Nilesh");
        if (found != null) {
            found.displaystudentDetails();
        } else {
            System.out.println("Student not found.");
        }
    }
}
