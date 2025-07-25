class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private float balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, float balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getter for account Number
    public int getAccNumber() {
        return accountNumber;
    }

    // getter for Account holder name
    public String getAccHolderName() {
        return accountHolderName;
    }

    public void depositMoney(float amount) {
        System.out.println("deposit money");
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdrawMoney(float amount) {
        System.out.println("withdraw Money!");
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("insufficient balance");
            }
        } else {
            System.out.println("invalid amount");
        }
    }

    public float getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount {
    private final float MINIMUM_BALANCE = 100f;
    private float annualInterestRate;

    // Constructor for SavingAccount
    public SavingAccount(String name, int accNum, float balance, float interestRate) {
        super(name, accNum, balance); // Call parent constructor
        this.annualInterestRate = interestRate;
    }

    @Override
    public void withdrawMoney(float amount) {
        System.out.println("withdraw Money!");
        if (amount > 0) {
            if (getBalance() - amount >= MINIMUM_BALANCE) {
                super.withdrawMoney(amount);
            } else {
                System.out.println("cannot go below minimum balance");
            }
        } else {
            System.out.println("invalid amount");
        }
    }

    public void applyMonthlynterest() {
        System.out.println("calculate interest");
        float monthlyInterest = getBalance() * (annualInterestRate / 100) / 12;
        depositMoney(monthlyInterest);
        System.out.printf("Interest of $%.2f applied%n", monthlyInterest);
    }

    public float calculateAnnualInterest() {
        return getBalance() * (annualInterestRate / 100);
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(float rate) {
        if (rate >= 0) {
            annualInterestRate = rate;
        } else {
            System.out.println("Interest rate cannot be negative");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("Alice", 12345, 1000f, 3.5f);

        System.out.println("Initial balance: $" + sa.getBalance());
        sa.applyMonthlynterest();
        System.out.println("After 1 month: $" + sa.getBalance());

        System.out.println("Projected annual interest: $" + sa.calculateAnnualInterest());
    }
}