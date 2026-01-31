/* class animal {                           // basic  inheritence...
    void eat() {
        System.out.println("eating");
    }
}
class dog extends animal {
    void bark() {
        System.out.println("barking");
    }
}
public class d5 {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.eat();
    }
}
*/




// single level inheritence...
/*
class grandparent{
    void greet(){
        System.out.println("grandparent class");
    }
}
class parent extends grandparent {
    void display(){
        System.out.println("parent class");
    }
}
class child extends parent {
    void show(){
        System.out.println("child class");
    }
}

public class d5 {
    public static void main(String[] args) {
        child c = new child();
        c.display();
        c.show();
        c.greet();
    }
}
*/



//hierarchical inheritence...
/*
class animal{
    void eat(){
        System.out.println("animal eats");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog barks");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("cat meows");
    }
}   
public class d5{
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.eat();

        cat c = new cat();
        c.meow();   
        c.eat();
    }
}
*/



// using the keyword " this "
/*
class student{
    String name;
    
    student(String name){
        this.name = name;
    }

    void display(){
        System.out.println("name: " + this.name);
    }
}
public class d5 {
    public static void main(String[] args) {
        student s = new student("Alice");
        s.display();
    }
}
*/



// constructor chaining using " this "
/* 
class Demo {

    Demo() {
        this("Default Constructor");
    }

    Demo(String message) {
        System.out.println(message);
    }
}

public class d5 {

    public static void main(String[] args) {
        new Demo("hi there");
    }
}
*/



/* same another example
class Student {

    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 18;
        System.out.println("Student created");
    }

    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Student created");
    }
}
*/



//super keyword example
/* 
class parent {

    void display() {
        System.out.println("parent class ");
    }
}
class Child extends parent {
    void display() {
        super.display();
        System.out.println("child class ");
    }
}

public class d5 {

    public static void main(String[] args) {

        Child c = new Child();
        c.display();

    }
}
*/




// calling parent class constructor using super keyword
class parent{
    parent(){
        System.out.println("parent class constructor");
    }
}
class child extends parent{
    child(){
        super();
        System.out.println("child class constructor");
    }
}
public class d5 {
    public static void main(String[] args){
        new child();
        
    }
}