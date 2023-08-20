package org.BAM;

public class Main {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("123456789", "Tej Punchoye", 2351365, 0.1);
        sa.calcInterestRate(1);
        sa.deposit(1000000);

        CheckingAccount ca = new CheckingAccount("123456789", "Tej Punchoye", 200000, 2000);
        ca.withdrawWithLimit(1000);
        ca.withdraw(133333);

        sa.displayAccountInfo();
        ca.displayAccountInfo();
    }
}