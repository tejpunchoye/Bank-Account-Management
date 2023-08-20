package org.BAM;

import org.w3c.dom.ls.LSOutput;

public class CheckingAccount extends BankAccount{

    private double transactionLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double initialBalance, double transactionLimit){
        super(accountNumber, accountHolder, initialBalance);
        this.transactionLimit = transactionLimit;
    }
    public void withdrawWithLimit(double amount) {
        if (amount <= transactionLimit && amount <= balance) {
            balance -= amount;
            System.out.println("Transaction Successful. Current Balance: " + balance);
        }else {
            System.out.println("Exceeds limit.");
        }
    }
//    public void withdrawWithLimit(double withdrawAmount){
//        System.out.println(super.getBalance());
//        double currentBalance = Double.parseDouble(super.getBalance());
//        System.out.println("Current Balance: " +currentBalance);
//        if (withdrawAmount > transactionLimit){
//            System.out.println("Amount exceed transaction limit");
//        } else{
//
//
//
//            System.out.println("Withdraw Amount: " + withdrawAmount);
//            super.setBalance(currentBalance - withdrawAmount);
//            System.out.println("Transaction Successful.");
//        }
//    }
}
