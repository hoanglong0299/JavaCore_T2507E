package asm5;

public class Main {
    public static void main(String [] args){
        BankAccount[] bankAccounts = new BankAccount[3];
        bankAccounts[0] = new VipAccount("56789",1000000.0);
        bankAccounts[1] = new SavingAccount("56789",1000000.0);
        bankAccounts[2] = new CheckingAccount("56789",0.0);

        System.out.println();

        for(BankAccount i  : bankAccounts){
            i.deposit(20000.0);
            i.withdraw(200000.0);

            System.out.println("Balance: "+ i.getBalance());

        }
    }
}
