final class College {
    final String college = "SIT";
    final void displayCollege() {
        System.out.println("College Name: " + college);
    }
}
class Student{ 
    void displayStudent() {
        System.out.println("Student Name: Nilesh");
        System.out.println("Course: BTech CSE");
    }
}
public class h4work3 {
    public static void main(String[] args) {
        College c = new College();
        Student s = new Student();
        c.displayCollege();
        s.displayStudent();
    }
}
