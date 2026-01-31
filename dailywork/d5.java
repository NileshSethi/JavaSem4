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
