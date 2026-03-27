abstract class plan {
    private String patientName;
    private double baseFee;

    public plan(String patientName, double baseFee) {
        this.patientName = patientName;
        this.baseFee = baseFee;
    }
    public String getpatientName() {
        return patientName;
    }
    public double getbaseFee() {
        return baseFee;
    }
    public abstract double calculateBill();
}

class goldplan extends plan {
    public goldplan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }
    public double calculateBill() {
        double surcharge = getbaseFee() * 0.10;
        return getbaseFee() + surcharge - 20;
    }
}
class silverplan extends plan {

    public silverplan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    public double calculateBill() {
        return getbaseFee() + 15; 
    }
}

public class extra7 {
    public class Main {

    public static void printInvoice(plan p) {
        System.out.println("patient: " + p.getpatientName());
        System.out.println("bill: Rs." + p.calculateBill());
        System.out.println("xxxxxxxxxxxxxxxxxxxx");
    }

    public static void main(String[] args) {

        plan p1 = new silverplan("A", 100);
        plan p2 = new goldplan("B", 200);

        printInvoice(p1);
        printInvoice(p2);
    }
}
}
