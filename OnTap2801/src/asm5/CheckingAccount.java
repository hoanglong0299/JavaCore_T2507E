package asm5;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, Double accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public void withdraw(Double balance) {
        if(getBalance() == 0){
            if(balance > 5000000){
                System.out.println("Can not withdraw");
            }else {
                accountBalance = accountBalance - balance;
            }
        }
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
