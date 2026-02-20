class ms {
    static int x = 10;   // static variable

    void show() {
        this.x = 30;     // accessing static variable using this
        System.out.println(this.x);
    }
}

public class test {
    public static void main(String[] args) {
        ms t = new ms();
        t.show();
    }
}