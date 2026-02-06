import java.util.Scanner;
public class h2work1 {      //student data
    String name;
    int rollNo;
    long prn;

    h2work1(String n, int r, long p){     //paramiterized constructor
        name = n;
        rollNo = r;
        prn = p;
    }

    void display (){
        System.out.println("name: " + name);
        System.out.println("roll No: " + rollNo);
        System.out.println("prn: " + prn);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = sc.nextLine();
        System.out.print("enter roll number: ");
        int rollNo = sc.nextInt();
        System.out.print("enter prn: ");
        long prn = sc.nextLong();

        h2work1 s = new h2work1(name, rollNo, prn);
        s.display();
        sc.close();
    }
}
