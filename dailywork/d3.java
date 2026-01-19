class Student{
    String name;
    int age;

    Student(){
        name = "Nilesh";
        age = 19;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
} 
public class d3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
    }
}
