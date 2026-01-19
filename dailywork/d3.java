/* 
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
*/


class Counter{
    static int count = 0;

    Counter(){
        count++;
        System.out.println("Counter value: " + count);
    }
}
public class d3 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}