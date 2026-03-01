// Base Class
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor 1
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Constructor 2 (Overloaded)
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Savings Account: Insufficient funds. No overdraft allowed.");
        }
    }
}
class CurrentAccount extends BankAccount {
    private final double overdraftLimit = 500;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            double newBalance = getBalance() - amount;
            System.out.println("Withdrawn: $" + amount);
            
            // Updating balance manually using deposit/withdraw logic workaround
            super.deposit(-amount); // adjust balance
        } else {
            System.out.println("Current Account: Overdraft limit exceeded.");
        }
    }
}
public class BankAccSys{
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("SA123", 1000);
        BankAccount current = new CurrentAccount("CA456", 1000);

        savings.withdraw(1200);  // Should fail
        savings.withdraw(500);   // Should succeed

        current.withdraw(1300);  // Allowed (Overdraft)
        current.withdraw(3000);  // Should fail

        System.out.println("Savings Balance: $" + savings.getBalance());
        System.out.println("Current Balance: $" + current.getBalance());
    }
}
