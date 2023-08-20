package org.BAM;

import java.text.DecimalFormat;

public class SavingAccount extends BankAccount{

    private double interestRate = 1.1;

    public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate){
        super(accountNumber, accountHolder, balance);
        System.out.println("Current Balance " + balance);
        this.interestRate = interestRate;
    }
    public void calcInterestRate(int year){
      double interest = balance * interestRate;
      balance += interest;
        System.out.println("Account after interest rate: " + balance  );
    }

}
