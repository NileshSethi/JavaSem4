class y {
    String uni = "sit";
    void showuni() {
        System.out.println("College: " + uni);
    }
}
class x extends y {
    String uni = "AdminCorp";
    void display() {
        System.out.println("Parent College: " + super.uni);
        System.out.println("Child College: " + uni);
        super.showuni();
    }
}
public class h4work2 {
    public static void main(String[] args) {
        x m = new x();
        m.display();
    }
}
