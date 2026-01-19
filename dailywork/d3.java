class Student{
    String name;
    int age;

    // Student(){                  [default constructor]
    //     name = "Unknown";
    //     age = 0;
    // }

    Student(String s , int a){     // parameterized constructor
        name = s;
        age = a;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
} 
public class d3 {
    public static void main(String[] args) {
        Student student1 = new Student("Nilesh", 19);
        student1.display();
    }
}
