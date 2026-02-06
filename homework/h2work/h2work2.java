
import java.util.Scanner;

public class h2work2 {      //calculator 
    int a,b;

    h2work2(int x, int y){     //paramiterized constructor
        a = x;
        b = y;
    }

    void calculate (int choice){
        switch(choice){
            case 1:
                System.out.println("sum: " + (a + b));
                break;
            case 2:
                System.out.println("sub: " + (a - b));
                break;
            case 3:
                System.out.println("multi: " + (a * b));
                break;
            case 4:
                if(b != 0){
                    System.out.println("div: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int x = sc.nextInt();

        System.out.print("enter second number: ");
        int y = sc.nextInt();

        h2work2 c = new h2work2(x, y);

        System.out.println("1. SUM");
        System.out.println("2. SUB");
        System.out.println("3. MULTI");
        System.out.println("4. DIV");
        System.out.print("enter choice: ");
        int choice = sc.nextInt();

        c.calculate(choice);
        sc.close();
    }
}
