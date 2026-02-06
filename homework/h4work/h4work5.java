interface A {
    void show();
}
interface B extends A {
    default void show() {
        System.out.println("show from B");
    }
}
interface C extends A {
    default void show() {
        System.out.println("show from C");
    }
}
class D implements B, C {
    public void show() {
        B.super.show();
        C.super.show();
        System.out.println("show from D");
    }
}
public class h4work5 {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
