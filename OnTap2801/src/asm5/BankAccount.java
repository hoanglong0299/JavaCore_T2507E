package asm5;

public class BankAccount {
    protected String accountNumber;
    protected Double accountBalance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, Double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return accountBalance;
    }

    public void setBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    public void deposit(Double balance){
        accountBalance = accountBalance + balance;
    }

    public void withdraw (Double balance){
        accountBalance = accountBalance - balance;
    }

    public void printBalance(){
        System.out.println("Account Balance:"+ getBalance());
    }
}

