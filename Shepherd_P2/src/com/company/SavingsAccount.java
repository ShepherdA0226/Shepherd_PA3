package com.company;

//class is named SavingsAccount
public class SavingsAccount {
    static private double annualInterestRate; //annualInterestRate is a private class variable
    private double savingsBalance; //savingsBalance is a private instance variable

    //calculateMonthlyInterest is a public instance method
    public void calculateMonthlyInterest() {

        //calculates monthly interest based on the formula given in the project specifications
        double monthlyInterest;
        monthlyInterest = (this.savingsBalance * annualInterestRate / 12);
        this.savingsBalance = this.savingsBalance + monthlyInterest;
    }

    //modifyInterestRate is a public class method
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    //method to get the savings balance, used in application testing program
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    //updates savings balance
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

}