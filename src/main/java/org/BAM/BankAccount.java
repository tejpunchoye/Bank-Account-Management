package org.BAM;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit successful. Current Balance: " + getBalance());
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawal successful. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Please recharge ");
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public void displayAccountInfo(){
        System.out.println("Account Information:");
        System.out.println("\tAccount Number: " + this.accountNumber + "\n" +
                "\tAccount Holder: " + this.accountHolder + "\n" +
                "\tCurrent balance: " + this.balance);
    }
    public String printLargeValue(double number){
        //Get only 2dp of the balance
        DecimalFormat df = new DecimalFormat("#.00");
        //Getting the number without scientific notation
        BigDecimal bd = new BigDecimal(df.format(number));
        //Print raw data
        return df.format(bd);
    }
}


/* Parsing data to private properties through constructor are better for scenarios when the properties are considered mandatory and parsing data to
private properties through setter method provides more flexibility - the data can be updated at a later stage of the code.
* */