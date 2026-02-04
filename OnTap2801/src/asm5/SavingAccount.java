package asm5;

public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, Double accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public void withdraw(Double balance) {
        accountBalance = accountBalance - balance * 0.02;

    }

    @Override
    public void deposit(Double balance) {
        super.deposit(balance);
    }

    @Override
    public void printBalance() {
        super.printBalance();
    }
}
