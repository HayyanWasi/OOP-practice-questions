class Withdraw{
    double balance;
    Withdraw(double balance){
        this.balance=balance;
    }

    public double withdraw(double money)throws IllegalArgumentException{
        if(balance < money){
            throw new IllegalArgumentException("insufficient balance");
        }
        else{
            balance-=money;
        }
        return balance;
    }
}

public class Test{
    public static void main(String[] args) {
        Withdraw account = new Withdraw(5000);
        try{
            System.out.println(account.withdraw(4000));
            System.out.println("withdrawl sucesfully");
            
        }
        catch (Exception e){
            System.out.println("Exception"+ e.getMessage());
        }
    }
}
