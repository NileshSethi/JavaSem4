/* 
public class d8{
    public static void main(String[] args) {
        try {
            int n[] = new int[5];
            int divisor = 0; 
            for (int i=0; i<n.length ; i++) {
                int res = n[i] / divisor;
                System.out.println(res); 
            }
        } 
        catch (ArithmeticException e) {
            throw new RuntimeException 
                ("Error: Cannot divide by zero. " + e);
        }
    }
}

*/



/*
// NULL pointer exception in java
class d8 {
    public static void main(String[] args) {
        String s = "";
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught");
        }
        
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught");
        }
        //s = "";
        s = null;
        try {
            System.out.println(getLength(s));
        }
         
        catch (IllegalArgumentException e) {
            System.out.println(
                e);
        }
        
    }

    public static int getLength(String s)
    {
        if (s == null)
            throw new IllegalArgumentException(
                "The argument cannot be null");

        return s.length();
    }
}
*/




/*
// Superclass without exception declaration
class SuperClass {
    void method() {
        System.out.println("Superclass method executed");
    }
}
class SubClass extends SuperClass {
    @Override
    void method() throws ArithmeticException {
        System.out.println("SubClass method executed");
        throw new ArithmeticException("Exception in SubClass");
    }
    public static void main(String[] args) {
        SuperClass s = new SubClass();
        try {
            s.method();
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
*/


class d8 {
    static void fun()
    {
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside fun(). ");
            throw e;   // rethrowing the exception
        }
    }

    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (NullPointerException e) {
            System.out.println("Caught in main.");
        }
    }
}