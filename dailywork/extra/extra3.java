abstract class payment {
    private String transactionId;
    private double amount;

    public payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public double getAmount() {
        return amount;
    }
    public abstract double processPayment();
}

class creditcardPayment extends payment{
    public creditcardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }
    public double processPayment() {
        return getAmount() + (getAmount() * 0.02);
    }
}

class UPIpayment extends payment {
    private String upiId;

    public UPIpayment(String transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }
    public double processPayment() {
        if (upiId == null) {
            System.out.println("INVALID UPI ID!!!!");
            return 0;
        }
        return getAmount(); 
    }
}

public class extra3 {
    public static void main(String[] args) {
        payment p1 = new creditcardPayment("T12345", 1000);
        payment p2 = new UPIpayment("T67890", 1000, "USER@UPI");

        System.out.println("credit card Payment: " + p1.processPayment());
        System.out.println("upi payment: " + p2.processPayment());

        payment[] payments = {p1, p2};

        double total = 0;
        for (payment p : payments) {
            total += p.processPayment();
        }

        System.out.println("total processed amount: " + total);
    }
}
