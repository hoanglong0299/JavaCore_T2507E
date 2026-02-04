package asm5;

public class VipAccount extends BankAccount{
    public VipAccount(String accountNumber, Double accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public void deposit(Double balance) {
        accountBalance = accountBalance + balance * 0.01;
    }

    @Override
    public void withdraw(Double balance) {
        super.withdraw(balance);
    }

    @Override
    public void printBalance() {
        super.printBalance();
    }
}
