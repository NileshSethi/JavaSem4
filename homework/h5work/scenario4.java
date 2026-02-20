
import java.util.ArrayList;
import java.util.List;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposited Rs." + amount + " successfully.");
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn Rs." + amount + " successfully.");
    }
    public void transfer(Account targetAccount, double amount) 
            throws InsufficientFundsException {
        if (targetAccount == null) {
            System.out.println("Invalid target account.");
            return;
        }
        this.withdraw(amount);
        targetAccount.deposit(amount);
        System.out.println("Transfer of Rs." + amount + " successful.");
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs." + balance);
        System.out.println(" ");
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }
    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        Account account = new Account(accountNumber, accountHolderName, initialBalance);
        accounts.add(account);
        System.out.println("Account created successfully.");
    }
    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            for (Account account : accounts) {
                account.displayAccountDetails();
            }
        }
    }
}
public class scenario4 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount("101", "Nilesh", 5000);
        bank.createAccount("102", "Om", 3000);
        Account acc1 = bank.getAccount("101");
        Account acc2 = bank.getAccount("102");
        try {
            acc1.deposit(2000);
            acc1.withdraw(1000);
            acc1.transfer(acc2, 2500);
            acc2.withdraw(10000);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("\n All Accounts");
        bank.displayAllAccounts();
    }
}
