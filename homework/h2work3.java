public class h2work3 {
    int rollno;
    String name;
    static String college = "SIT";  //static variable

    h2work3(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println("name: " + name);
        System.out.println("roll no: " + rollno);
        System.out.println("college: " + college);
    }

    public static void main(String[] args) {
        h2work3 s = new h2work3(121, "nilesh");
        s.display();
    }
}
