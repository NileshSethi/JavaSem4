package d3;
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


// static variable example
/* class Counter{
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
*/


/* 
//instance variable example
class d3{
    String name;
    int id;
    public static void main(String[] args) {
        d3 s1 = new d3();  
        d3 s2 = new d3();                        // d3 = Student 
        s1.name = "Nilesh";
        s1.id = 121;
        s2.id = 122;
        s2.name = "Amit";
        System.out.println("Name: " + s1.name);
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s2.name);
        System.out.println("ID: " + s2.id);
    }
}
*/


//instance method example
class d3{
    String name;

    void display(){
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        d3 p = new d3();
        p.name = "Nilesh";
        p.display();
    }
}