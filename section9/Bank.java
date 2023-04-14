package section9;

public class Bank {


    private int accountNumber;
    private String accountHolder;
    private double balance;


    public Bank(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void depositMoney(double quantity){
        this.balance += quantity;
    }

    public void withdrawMoney(double quantity){
        this.balance -= quantity + 5;
    }

    public String toString(){

        return "Account " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance;
    }
}
