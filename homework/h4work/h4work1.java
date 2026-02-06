class person {
    String name;
    person(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Name: " + name);
    }
}
class student extends person {
    int rollNo;
    student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }
    void show() {
        super.display();
        this.printRoll();
    }
    void printRoll() {
        System.out.println("Roll No: " + rollNo);
    }
}
public class h4work1 {
    public static void main(String[] args) {
        student s1 = new student("Nilesh", 121);
        s1.show();
    }
}
