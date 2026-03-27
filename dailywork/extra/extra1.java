class Account{
    double balance;
    
    void deposit(double amount){
        balance += amount;
    }
    
    void calculateInterest(){
        balance += balance * 2 / 100;
    }
    
    void display(){
        System.out.println("Account Balance: " + balance);
    }
}

class SavingsAccount extends Account{
    void calculateInterest(){
        if(balance > 50000){
           balance += 500;
        }
        balance += balance * 4 / 100;
    }
}

class FixedDeposit extends SavingsAccount{
    void calculateInterest(){
        double p = balance;
        super.calculateInterest();
        balance += p * 2 / 100;
    }
}

public class extra1 {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(10000);
        acc.calculateInterest();
        acc.display();

        SavingsAccount savacc = new SavingsAccount();
        savacc.deposit(60000);
        savacc.calculateInterest();
        savacc.display();

        FixedDeposit fdacc = new FixedDeposit();
        fdacc.deposit(70000);
        fdacc.calculateInterest();
        fdacc.display();
    }
}
