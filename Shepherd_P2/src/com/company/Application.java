package com.company;

//test program is in a class called application
public class Application {

    public static void main(String[] args) {
        //creating two SavingsAccount objects
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount(2000.00);
        saver2 = new SavingsAccount(3000.00);

        //setting the interest rate to 4 percent
        SavingsAccount.modifyInterestRate(0.04);

        //print the balance for saver 1 using a loop from month 1 to month 12
        System.out.println("Saver 1 Balance: \n");

        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            System.out.print("Month " + (i + 1) + ": ");
            System.out.printf("%.2f\n", saver1.getSavingsBalance());
        }

        //print the balance for saver 2 using a loop from month 1 to month 12
        System.out.println("\nSaver 2 Balance: \n");

        for (int i = 0; i < 12; i++) {
            saver2.calculateMonthlyInterest();
            System.out.print("Month " + (i + 1) + ": ");
            System.out.printf("%.2f\n", saver2.getSavingsBalance());
        }

        //setting the interest rate to 5 percent
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("\nAfter changing the Interest Rate to 5%: \n");

        //print the balance for saver 1 for the month after changing the interest rate to 5 percent
        System.out.println("Saver 1 Balance: \n");

        for (int i = 0; i < 1; i++) {
            saver1.calculateMonthlyInterest();
            System.out.print("Month 13: ");
            System.out.printf("%.2f\n", saver1.getSavingsBalance());
        }

        //print the balance for saver 2 for the month after changing the interest rate to 5 percent
        System.out.println("\nSaver 2 Balance: \n");

        for (int i = 0; i < 1; i++) {
            saver2.calculateMonthlyInterest();
            System.out.print("Month 13: ");
            System.out.printf("%.2f\n", saver2.getSavingsBalance());
        }

    }

}
