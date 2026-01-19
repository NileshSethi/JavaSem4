/*public class h1work {
    public static void main(String[] args) {
        System.out.println("Name: Nilesh Sethi");
        System.out.println("PRN: 24070122121");
        System.out.println("Address: Faridabad, Haryana, India");
    }
}
*/




/* 
import java.util.Scanner;
public class h1work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
        } else {
            int result = a / b;
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}

*/



/* 
public class h1work {
    static float add(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        double x = 10.5;
        double y = 20.8;
        float result = add((float)x, (float)y);
        System.out.println("Addition = " + result);
    }
}
*/



/* 
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
public class h1work {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited from animal
        d.bark();  //dog's attribute
    }
}
*/


/* 
public class h1work {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println("sum of 2 numbers: " + add(10, 20));
        System.out.println("sum of 3 numbers: " + add(10, 20, 30));
    }
}
*/

/* 
public class h1work {
    public static void main(String[] args) {
        String str = "hehehaha";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed String: " + sb);
    }
}
*/

public class h1work {
    public static void main(String[] args) {
        String str = "hehehoho";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed String: " + rev);
    }
}
