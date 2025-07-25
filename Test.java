abstract class Account{
    int accountNumber;
    double balance;
    String AccountHolderName;

    Account(int accountNumber,double balance,String AccountHolderName){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.AccountHolderName=AccountHolderName;

    }

    abstract void deposit(double amount);
    abstract void withDraw(double amount);
    abstract void displayDetails();

}
class SavingsAccount extends Account{

    double minimumBalance = 500;

     SavingsAccount(int accountNumber,double balance ,String accountHolderName ) {
        super(accountNumber,balance ,accountHolderName);
    }
    void deposit(double amount){
        balance+=amount;
    }

    void withDraw(double amount){
        if(balance - amount >= minimumBalance){
            balance -=amount;
        }
        else{
            System.out.println("insufficient balance");
        }
    }

    @Override
    void displayDetails() {
        System.out.println("Saving Account - "+ accountNumber + "Balance "+ balance);
    }
}

class CurrentAccount extends Account{

    double overdraftLimit = 1000;
    CurrentAccount(int accountNumber,double balance ,String accountHolderName){
         super(accountNumber,balance ,accountHolderName);
    }

    void withDraw(double amount){
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        }
        else{
            System.out.println("you have reached the limit");
        }
    }

    @Override
    void displayDetails() {
        System.out.println("Current Account - "+ accountNumber + "  balance : " + balance );

    }

    @Override
    void deposit(double amount) {
        balance += amount;  
    }

}


public class Test {
public static void main(String[] args) {
    Account current = new CurrentAccount(204, 35000, "Hayyan");
    current.withDraw(1000);
    current.displayDetails();
    current.deposit(50000);
    current.displayDetails();
    
    }
    
}
