abstract class BankAccount {

    private String accountNumber;
    protected double balance;

    public BankAccount(
            String accountNumber,
            double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {

        balance += amount;

        System.out.println(
                "Deposited: PHP " + amount
        );
    }

    public void displayAccount() {

        System.out.println(
                "Account Number: " + accountNumber
        );

        System.out.println(
                "Balance: PHP " + balance
        );
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(
            String accountNumber,
            double balance,
            double interestRate) {

        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {

        double interest =
                balance * interestRate;

        balance += interest;

        System.out.println(
                "Savings interest: PHP "
                + interest
        );
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(
            String accountNumber,
            double balance) {

        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {

        System.out.println(
                "Current accounts do not earn interest."
        );
    }
}

public class AbstractionBankExample {

    public static void main(String[] args) {

        BankAccount savings =
                new SavingsAccount(
                        "SA-1001",
                        10000,
                        0.05
                );

        BankAccount current =
                new CurrentAccount(
                        "CA-2001",
                        15000
                );

        System.out.println("SAVINGS ACCOUNT");

        savings.displayAccount();
        savings.calculateInterest();
        savings.displayAccount();

        System.out.println("\nCURRENT ACCOUNT");

        current.displayAccount();
        current.calculateInterest();
    }
}
