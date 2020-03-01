package cs.isu.edu;

import java.util.HashMap;

public class Bank {
    HashMap<String, Double> accountNumbers=new HashMap<>();

    public void deposit(String accountHolderName, double amountToDeposit){
        accountNumbers.put(accountHolderName,amountToDeposit);
    }

    public void withdraw(String accountHolderName, double amountToWithdraw){
        double amountBeforeWithdrawl=accountNumbers.get(accountHolderName);
        accountNumbers.put(accountHolderName,amountBeforeWithdrawl-amountToWithdraw);
    }
    public double getBalance(String accountHolderName){
        return accountNumbers.get(accountHolderName);
    }

    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.deposit("Deepson",2000);
        bank.withdraw("Deepson",20);
        bank.deposit("Deepson",300);
        System.out.println(bank.getBalance("Deepson"));
    }

}
